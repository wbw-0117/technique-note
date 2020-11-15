package cn.wbw.flux.service;

import cn.wbw.flux.entity.MyMessages;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 * @author wbw
 * @date 2020/10/1410:40
 */
@Service
public class WebFluxService {

    public Flux<MyMessages> list() {
        MyMessages[] myMessages = new MyMessages[2];
        // TODO 查询数据库，MySQL 等 SQL 数据库暂不支持 Reactive，
        // 操作数据的方式参考 Spring Data JPA 部分，只不过将结果使用 Mono、Flux封装
        myMessages[0] = new MyMessages("ok", "Message 1");
        myMessages[1] = new MyMessages("ok", "Message 2");
        // 多条数据使用 Flux 封装
        return Flux.fromArray(myMessages);
    }
}
