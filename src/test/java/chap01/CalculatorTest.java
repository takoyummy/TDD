package chap01;

import chap02.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void plus() {
        int result = Calculator.plus(1, 2);
        // 첫 번째 인자는 기대한 값
        // 두 번째 인자는 실제 값
        assertEquals(3,result);
    }
}
