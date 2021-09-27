package Employee;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void TestGetArea() {
        Rectangle rectangleUnderTest = new Rectangle(3,4);

        Assert.assertTrue(rectangleUnderTest.getArea() == (3 * 4));

    }
    @Test
    public void TestGetPerimeter() {
        Rectangle rectangleUnderTest = new Rectangle(6,9);

        Assert.assertTrue(rectangleUnderTest.getPerimeter() == (2 * 6 + 9));
    }
}
