package net.chandol.lotto.domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static java.util.Arrays.asList;
import static net.chandol.lotto.domain.LottoPrize._2;
import static net.chandol.lotto.domain.LottoPrize._3;
import static net.chandol.lotto.domain.LottoPrize._4;

public class LottoGameResultTest {

    @Test
    public void 합계구하기() {
        LottoGameResult result= new LottoGameResult(asList(_2, _3, _3), 0);
        Integer totalPrize = result.getTotalPrize();
        Assertions.assertThat(totalPrize).isEqualTo(1_700_000);
    }

    @Test
    public void 이익률구하기() {
        LottoGameResult result= new LottoGameResult(asList(_3, _4), 10_000);
        Double profitRate = result.getProfitRate();
        Assertions.assertThat(profitRate).isEqualTo(5.5d);
    }

}