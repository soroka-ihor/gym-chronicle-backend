package gym.chronicle.component.user.service.impl;

import gym.chronicle.component.user.model.User;
import gym.chronicle.component.user.repo.UserRepository;
import gym.chronicle.component.user.service.UserService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class UserServiceImpl implements UserService {

    UserRepository repo;

    @Override
    @Transactional
    public boolean save(User user) {
        return repo.save(user) != null;
    }

    @Override
    @Transactional
    public User fetchById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public boolean exists(String username) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean invalidate(User user) {
        return false;
    }
}
