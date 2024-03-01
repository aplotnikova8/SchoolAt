package secondLesson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyFirstTest {

    @BeforeAll
    public static void before() {
        System.out.println("!!!");
    }

    @Test
    public void myFirstJunitTest() {
        Assertions.assertTrue(checkMod(6,2));
    }

    @Test
    public void mySecondJunitTest() {
        Assertions.assertTrue(checkMod(5,2));
    }

    private static boolean checkMod(int a1, int a2) {
        return a1 % a2 == 0;
    }

}
