package Livhuwani.Rambuda.Tests;

/* File: TestDrivenDevTesting.java
 * This is the test file to execute the test cases
 * Author: Livhuwani Lucky Rambuda (208224262)
 * Date created: 03 March 2014
 * Email : Rambudalucky.saho@gmail.com
 * Cell: 076 380 8106
 */


import Livhuwani.Rambuda.TDD.TestDrivenImplementation;
import Livhuwani.Rambuda.TDD.TestDrivenInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author E939964
 */
public class TestDrivenDevTesting 
{
    private static TestDrivenInterface assignOne;
    List<Integer> testArray;
    
    public TestDrivenDevTesting() 
    {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        assignOne = new TestDrivenImplementation();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception 
    {
        testArray = new ArrayList<>(Arrays.asList(2, 7, 4, 1, 5));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception 
    {
    }
    
    @Test
     public void hello() 
     {
         String hello = assignOne.getString();
         Assert.assertEquals(hello, "Hello Livhuwani");
     }
    
    @Test
    public void getFloatVal() 
    {
        float val = assignOne.getFloat();
        Assert.assertEquals(val,0.14, 23.2);
    }
     
    @Test
    public void getIntegerVal() 
    {
        int val = assignOne.getInteger();
        Assert.assertEquals(val, 1); // get the number from function, and it should be
    }
    
    @Test
    public void checkObjectVal()
    {
        Object obj = assignOne.checkObject();
        Assert.assertEquals(obj, "Lucky");
    }
    
    @Test
    public void checkIdentityVal()
    {
        Object idObj = assignOne.checkIdentity();
        Assert.assertSame(idObj, "Rudzani", "This is not the required Identity");
        Assert.assertNotSame(idObj, "Lucky", "The entry matches - please change entry");
    }
    @Test
    public void checkTruthVal()
    {
        boolean truthVal = assignOne.checkTruth();
        Assert.assertTrue(truthVal, "Livhuwani the Man");
    }
    
    @Test
    public void checkFalsityVal() 
    {
        boolean falseVal = assignOne.checkFalsity();
        Assert.assertFalse(falseVal, "Wrong value");
    }
    
    @Test
    public void checkNullVal() 
    {
        Object nullVal = assignOne.isNull();
        Assert.assertNull(nullVal, "Isn't a NULL Value");
    }
    
    //@Ignore()
    @Test (expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() 
    {
        Assert.assertEquals(4, assignOne.divide(25, 0));
    }
    
    //Adds a value to the array and verifies the add was successfull
    @Test(timeOut=0)
    public void testArrayAdd() 
    {
        testArray = (List<Integer>) assignOne.checkArray();
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(7);
        expected.add(4);
        expected.add(1);
        expected.add(5);
        expected.add(8);
        Assert.assertEquals(assignOne.checkArray(), expected);
    }
    
}
