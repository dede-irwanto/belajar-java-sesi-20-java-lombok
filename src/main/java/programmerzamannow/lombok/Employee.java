package programmerzamannow.lombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Employee {
    private String id;
    private String name;
}
