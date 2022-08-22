import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultTest {
    private Calculator calc;

    @BeforeClass(groups = {"mult"})
    public  void init(){
        System.out.println("Test started...");
        calc = new Calculator();
    }

    @Test(groups = "mult")
    public void testCosDouble(){
        double d = Math.toRadians(0);
        Assert.assertEquals(calc.mult(1,3),3,"The result is 3");
    }

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}
}
