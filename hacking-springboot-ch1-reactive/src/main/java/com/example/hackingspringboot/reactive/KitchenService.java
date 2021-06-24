package com.example.hackingspringboot.reactive;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class KitchenService {

    // 요리 스트림 생성
    Flux<Dish> getDishes() {
        return Flux.<Dish> generate(sink -> sink.next(randomDish()))
                .delayElements(Duration.ofMillis(250));
    }

    // 요리 무작위 선택
    private Dish randomDish() {
        return menu.get(picker.nextInt(menu.size()));
    }

    private List<Dish> menu = Arrays.asList(
            new Dish("chicken"),
            new Dish("noodles"),
            new Dish("ice cream"));

    private Random picker = new Random();
}
