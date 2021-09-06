package homework.matematik;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {
    private int a;
    private int b;
    private int ans;
    private Operation operation;

}
