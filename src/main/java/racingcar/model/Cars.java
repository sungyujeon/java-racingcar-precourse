package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cars {

    private static final String DELIMITER = ",";

    private List<Car> cars;

    private Cars() {}

    public static Cars of(String input) {
        return Cars.of(Arrays.asList(separate(input)));
    }

    public static Cars of(List<String> userCars) {
        Cars cars = new Cars();
        cars.cars = Collections.unmodifiableList(makeCars(userCars));
        return cars;
    }

    public List<Car> get() {
        return this.cars;
    }

    private static String[] separate(String input) {
        return input.trim().split(DELIMITER);
    }

    private static List<Car> makeCars(List<String> userCars) {
        List<Car> cars = new ArrayList<>();
        for (String userCar : userCars) {
            Car car = new Car(Name.valueOf(userCar));
            cars.add(car);
        }
        return cars;
    }
}
