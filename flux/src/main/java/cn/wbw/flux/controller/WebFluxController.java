package cn.wbw.flux.controller;

import cn.wbw.flux.entity.MyMessages;
import cn.wbw.flux.service.WebFluxService;
import lombok.AllArgsConstructor;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuples;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author wbw
 * @date 2020/10/1410:39
 */
@RestController
@AllArgsConstructor
public class WebFluxController {

    private final WebFluxService service;

    @GetMapping(value = "/hello")
    public Mono<String> hello() {
        return Mono.just("Hello WebFlux By Controller");
    }

    @GetMapping("/getList")
    public Flux<MyMessages> getList() {
        return service.list();
    }

    @GetMapping("/randomNumbers")
    public Flux<ServerSentEvent<Integer>> randomNumbers() {
        // 每次间隔时间 1s
        return Flux.interval(Duration.ofMinutes(1))
                // ThreadLocalRandom.current().nextInt() 产生随机数
                .map(seq -> Tuples.of(seq, ThreadLocalRandom.current().nextInt()))
                .map(data -> ServerSentEvent.<Integer>builder()
                        .event("随机发送信息")
                        .id(Long.toString(data.getT1()))
                        .data(data.getT2())
                        .build()
                );
    }
}