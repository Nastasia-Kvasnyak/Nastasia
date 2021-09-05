package homework.design_patterns;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MailInfo {
    private int mailType;
    private String content;
}
