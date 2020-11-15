package cn.wbw.flux.config;

import cn.wbw.flux.service.RouterHandler;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;


/**
 * @author wbw
 * @date 2020/10/1410:27
 */
@Configuration
@AllArgsConstructor
public class RouterConfig {

    private final RouterHandler routerHandler;
    private final RouterFilter routerFilter;

    @Bean
    public RouterFunction<ServerResponse> helloConfig() {
        return RouterFunctions
                .route(RequestPredicates.GET("/helloWebflux"), routerHandler::helloFlux)
                .filter(routerFilter);
    }
}
