import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void sumRange() {
        Assertions.assertEquals(4 + 5 + 6 + 7, Main.sumRange(4, 7));
        Assertions.assertEquals(15, Main.sumRange(15, 15));
        Assertions.assertEquals(2 + 1 + (-1) + (-2), Main.sumRange(2, -2));
    }

    @Test
    void findMax() throws Exception {
        Assertions.assertEquals(7, Main.findMax(new int[]{1, 4, 7, 0}));
        Assertions.assertThrowsExactly(Exception.class, () -> { Main.findMax(new int[]{}); });
    }

    @Test
    public void add() {
        Assertions.assertEquals(4 + 7, Main.add(4, 7));

        String str1 ="First and ", str2 = "Second";
        Assertions.assertEquals(str1 + str2, Main.add(str1, str2));
    }

    @Test
    public void factorial() throws Exception {
        Assertions.assertEquals(2 * 3 * 4 * 5 * 6 * 7, Main.factorial(7));
        Assertions.assertThrowsExactly(Exception.class, () -> { Main.factorial(-2); });
    }

    @Test
    public void calculateArea() throws Exception {
        double radius = 6.0;
        Assertions.assertEquals( Math.PI * radius * radius, Main.calculateArea(radius));

        Assertions.assertThrowsExactly(Exception.class, () -> { Main.calculateArea(-2.0); });

        double length = 5.0, width = 2.0;
        Assertions.assertEquals( length * width, Main.calculateArea(length, width));

        Assertions.assertThrowsExactly(Exception.class, () -> { Main.calculateArea(-2.0, 5.0); });
        Assertions.assertThrowsExactly(Exception.class, () -> { Main.calculateArea(4.0, -1.0); });
    }

    @Test
    public void average() {
        Assertions.assertEquals((1.0 + 2.0 + 3.0) / 3.0, Main.average(1.0, 2.0, 3.0));
    }

    @Test
    public void hypotenuse() throws Exception {
        double leg1 = 5.0, leg2 = 2.0;
        Assertions.assertEquals( Math.sqrt(leg1 * leg1 + leg2 * leg2), Main.hypotenuse(leg1, leg2));

        Assertions.assertThrowsExactly(Exception.class, () -> { Main.hypotenuse(-3.0, 7.0); });
        Assertions.assertThrowsExactly(Exception.class, () -> { Main.hypotenuse(1.0, -5.0); });
    }
}