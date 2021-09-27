package Employee;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void TestGetAnnualSalary() {
        Employee employeeUnderTest = new Employee(1, "Alex", "Bristow", 100);

        Assert.assertTrue(employeeUnderTest.getAnnualSalary() == (100 * 12));
    }

    @Test
    public void TestRaiseSalary() {
        Employee employeeUnderTest1 = new Employee(1, "Alex", "Bristow", 5000);
        Employee employeeUnderTest2 = new Employee(2, "Alex", "Bristow", 4000);

        employeeUnderTest1.raiseSalary(20);
        employeeUnderTest2.raiseSalary(20);

        Assert.assertTrue(employeeUnderTest1.getSalary() == 5000 * 1.20);
        Assert.assertTrue(employeeUnderTest2.getSalary() == 4000 * 1.20);
    }
}
