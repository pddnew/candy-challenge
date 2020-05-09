package br.com.dsasoft.challenge;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionImplTest {

    private Solution solution = new SolutionImpl();

    @DisplayName("Should pass")
    @ParameterizedTest
    @MethodSource(value = "provideCandiesAmounts")
    public void shouldHandleCandiesAmounts(int expected,  Integer[] ratings) {
        int result = solution.candy(ratings);
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> provideCandiesAmounts(){
        return  Stream.of(
                Arguments.of(7, new Integer[]{ 9, 6, 8, 6 }),
                Arguments.of(1, new Integer[]{ 9 }),
                Arguments.of(10, new Integer[]{ 9, 3, 7, 5 })
        );
    }
}