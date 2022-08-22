import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SumTest {
    private Calculator calc;

    @BeforeClass(groups = {"sum"})
    public  void init(){
        System.out.println("Test started...");
        calc = new Calculator();
    }

    @Test(groups = "sum")
    public void testCosDouble(){
        double d = Math.toRadians(0);
        Assert.assertEquals(calc.sum(1,2),3,"The result is 3 ");
    }

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}
}
