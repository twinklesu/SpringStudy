package ReactiveStream;

import reactor.core.publisher.Flux;


public class KitchenService {
    Flux<Dish> getDishes() {
        return Flux.just(
                new Dish("chicken"),
                new Dish("salad"),
                new Dish("ice cream"));
    }
}
