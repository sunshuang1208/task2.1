import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SubTest {
    private Calculator calc;

    @BeforeClass(groups = {"sub"})
    public  void init(){
        System.out.println("Test started...");
        calc = new Calculator();
    }

    @Test(groups = "sub")
    public void testCosDouble(){
        double d = Math.toRadians(0);
        Assert.assertEquals(calc.sub(2,1),1,"The result is 1");
    }

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}
}
