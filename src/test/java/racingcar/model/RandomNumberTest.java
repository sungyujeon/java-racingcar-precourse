package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RandomNumberTest {

    @Test
    public void 랜덤_정수_0_9_생성() {
        RandomNumber randomNumber = new RandomNumber();
        int number = randomNumber.nextInt(0, 9);

        assertThat(number).isGreaterThanOrEqualTo(0)
                .isLessThan(10);
    }
}
