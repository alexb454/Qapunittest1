package Employee;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceTest {
    @Test
    public void TestGetTotal() {
        Invoice invoiceUnderTest = new Invoice("1", "Box", 3, 5.00);

        Assert.assertTrue(invoiceUnderTest.getTotal() == 5.00 * 3);
    }
}
