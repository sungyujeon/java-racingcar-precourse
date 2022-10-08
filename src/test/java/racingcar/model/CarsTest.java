package racingcar.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CarsTest {

    Cars cars;

    @BeforeEach
    void init() {
        List<String> carNames = Arrays.asList("car1", "car2", "car3");
        cars = Cars.of(carNames);
    }

    @Test
    void cars_수_n대() {
        assertThat(cars.get().size()).isEqualTo(3);
    }

    @Test
    void 쉼표_구분() {
        String input = "car1,car2,car3";
        Cars cars = Cars.of(input);
        assertThat(cars.get().size()).isEqualTo(3);
    }

}
