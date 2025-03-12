package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String ex = "1,2";
        String[] split = ex.split(",");
        assertThat(split).contains("1","2");

        String ex2 = "1";
        String[] split2 = ex2.split(",");
        assertThat(split2).containsExactly("1");
    }


    @Test
    void subString(){
        String ex = "(1,2)";
        String substring = ex.substring(1, 4);
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    void charAt(){
        String ex = "abc";

        assertThatThrownBy(()->ex.charAt(3))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("index");


    }

}
