package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarNameTest {

    @Test
    public void 자동차_이름은_5자_이하여야_한다() {
        int carNameLength = CarName.of("name1").get().length();
        assertThat(carNameLength).isEqualTo(5);
    }

    @Test
    public void 자동차_이름이_5자를_초과하면_예외를_던진다() {
        assertThatThrownBy(() -> CarName.of("abcde6"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 5자 이하의 자동차 이름을 입력해주세요.");
    }

}
