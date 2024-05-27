package gym.chronicle.component.approach.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class SetDto {
    Integer repeats;
    String unit;
    Integer amount;
}
