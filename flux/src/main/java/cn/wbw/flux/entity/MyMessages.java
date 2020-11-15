package cn.wbw.flux.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wbw
 * @date 2020/10/1410:17
 */
@Data
@NoArgsConstructor
public class MyMessages {
    private String status;
    private String message;

    public MyMessages(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
