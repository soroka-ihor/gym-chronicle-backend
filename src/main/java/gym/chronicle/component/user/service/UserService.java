package gym.chronicle.component.user.service;

import gym.chronicle.component.user.model.User;

public interface UserService {

    boolean save(User user);

    boolean exists(String username);

    boolean update(User user);

    boolean invalidate(User user);

    User fetchById(Long id);
}
