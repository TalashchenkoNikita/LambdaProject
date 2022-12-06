package homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FunctionalInterfacesClassTest {
    FunctionalInterfacesClass example = new FunctionalInterfacesClass();

    @Test
    void shouldCheckOnSimpleNumber() {
        assertThat(example.simpleNumber.test(5)).isTrue();
    }

    @Test
    void shouldGenerateRandomNumber() {
        example.randomInt.accept(10);
    }

    @Test
    void shouldReturnDayOfTheWeek() {
        List<String> listDaysOfWeek = List.of("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
                "FRIDAY", "SATURDAY", "SUNDAY");
        assertThat(listDaysOfWeek.contains(example.getDayOfWeek.get())).isTrue();
    }

    @Test
    void shouldConvertDoubleToLongByMathRules() {
        assertThat(example.doubleToLong.apply(5.5)).isEqualTo(6);
    }

    @Test
    void shouldFindFibonacciNumberByIndex() {
        assertThat(example.findFibonacciNumber.apply(5)).isEqualTo(5);
    }


}