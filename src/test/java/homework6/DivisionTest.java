package homework6;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DivisionTest extends ProgramTest{
    final Program program = new Program();

    @DataProvider
    public Object[][] getNumber1(){
        return new Object[][]{
                {42.0, 21.0,  63.0},
                {42.0, -21.0,  21.0},
                {42.0, 0.0, 42.0},
                {0.0, 0.0, 0.0}
        };
    }



    @Test(dataProvider = "getNumber1")
    public void testDoubleSuccessAdd(double a, double b, double d) {
        Assert.assertEquals(program.add(a, b), d);
    }

    @DataProvider
    public Object[][] getNumber2(){
        return new Object[][]{
                {42.0, 21.0,  21.0},
                {42.0, -21.0,  63.0},
                {42.0, 0.0, 42.0},
                {0.0, 0.0, 0.0}
        };
    }

    @Test(dataProvider = "getNumber2")
    public void testDoubleSuccessSub(double a, double b, double d) {
        Assert.assertEquals(program.sub(a, b), d);
    }

    @DataProvider
    public Object[][] getNumber3(){
        return new Object[][]{
                {5.0, 3.0,  15.0},
                {5.0, -1.0,  -5.0},
                {42.0, 0.0, 0.0},
                {0.0, 0.0, 0.0}
        };
    }

    @Test(dataProvider = "getNumber4")
    public void testDoubleSuccessMul(double a, double b, double d) {
        Assert.assertEquals(program.mul(a, b), d);
    }

    @DataProvider
    public Object[][] getNumber4(){
        return new Object[][]{
                {5.0, 5.0,  1.0},
                {5.0, -1.0,  -5.0},
                {42.0, 0.0, Double.NaN},
                {0.0, 1.0, 0.0}
        };
    }

    @Test(dataProvider = "getNumber4")
    public void testDoubleSuccessDiv(double a, double b, double d) {
        Assert.assertEquals(program.div(a, b), d);
    }
}




