package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public final class RandomNumber {

    public static int nextInt(int startInclusive, int endInclusive) {
        return Randoms.pickNumberInRange(startInclusive, endInclusive);
    }
}
