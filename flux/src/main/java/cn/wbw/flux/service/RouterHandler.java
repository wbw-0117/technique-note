package cn.wbw.flux.service;

import cn.wbw.flux.entity.MyMessages;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author wbw
 * @date 2020/10/1410:20
 */
@Service
public class RouterHandler {

    public Mono<ServerResponse> helloFlux(ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(new MyMessages("200", "sasasa")), MyMessages.class);
    }
}
