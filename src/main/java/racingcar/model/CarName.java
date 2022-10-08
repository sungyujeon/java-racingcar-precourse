package racingcar.model;

import racingcar.exception.RacingGameIllegalArgumentException;

public class CarName {

    private String name;

    private CarName() {}

    private CarName(String name) {
        this.name = name;
    }

    public static CarName of(String carName) {
        validate(carName);
        return new CarName(carName);
    }

    private static void validate(String carName) {
        if (carName.length() > 5) {
            throw new RacingGameIllegalArgumentException("5자 이하의 자동차 이름을 입력해주세요.");
        }
    }

    public String get() {
        return this.name;
    }

}
