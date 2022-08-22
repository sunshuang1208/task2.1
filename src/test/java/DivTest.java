import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DivTest {
    private Calculator calc;

    @BeforeClass(groups = {"divide"})
    public  void init(){
        System.out.println("Test started...");
        calc = new Calculator();
    }

    @Test(groups = "divide")
    public void testCosDouble(){
        double d = Math.toRadians(0);
        Assert.assertEquals(calc.div(2,1),2,"The result is 2");
    }

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}
}
