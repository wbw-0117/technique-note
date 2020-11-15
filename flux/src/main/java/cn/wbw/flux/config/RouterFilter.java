package cn.wbw.flux.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.server.HandlerFilterFunction;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author wbw
 * @date 2020/10/1410:35
 */
@Configuration
public class RouterFilter implements HandlerFilterFunction<ServerResponse, ServerResponse> {
    @Override
    public Mono<ServerResponse> filter(ServerRequest serverRequest, HandlerFunction<ServerResponse> handlerFunction) {
        //  拦截判断处理 通过使用 return next.handle(request);
        return ServerResponse.status(HttpStatus.UNAUTHORIZED).body(Mono.just("被拦截了"), String.class);
    }
}