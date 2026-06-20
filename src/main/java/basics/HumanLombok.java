package basics;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class HumanLombok {
    @NonNull
    private String name;

    @NonNull
    private int age;

    @NonNull
    private float height;

    @NonNull
    private Gender gender;
}
