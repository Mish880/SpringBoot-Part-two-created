package lk.project.spring.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
/*This is 404 Error Validation method*/
public class ResponseUtil {
    private int code;
    private String message;
    private Object data;
}
