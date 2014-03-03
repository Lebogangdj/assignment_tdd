package Livhuwani.Rambuda.TDD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* File: TestDrivenImplementation.java
 * This file will override the methods to be tested
 * Author: Livhuwani Lucky Rambuda (208224262)
 * Date created: 03 March 2014
 * Email : Rambudalucky.saho@gmail.com
 * Cell: 076 380 8106
 */

public class TestDrivenImplementation implements TestDrivenInterface 
{
    @Override
    public float getFloat()
    {
        return (float)0.14;
    }
    
    @Override
    public int getInteger()
    {
        return 1;
    }
    
    @Override
    public Object checkObject()
    {
        Object myName = "Lucky";
        
        return myName;
    }
    
    @Override
    public Object checkIdentity()
    {
        Object herName = "Rudzani";
        return herName;
    }
    
    @Override
    public boolean checkTruth()
    {
        String otherName = "Livhuwani";
        return otherName.equals("Livhuwani");
    }
    
    @Override
    public boolean checkFalsity()
    {
       String lastName = "Rambuda";
        return lastName.equalsIgnoreCase("");
    }
     
    @Override
    public String isNull() 
     {
            String string = null;
            return string;
    }
    
    @Override
    public String getString() 
    {
        return ("Hello Livhuwani");
    }

   @Override
   public int divide(int val1, int val2) 
   {
        return val1/val2;
   }

    @Override
    public Object checkArray() 
    {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 7, 4, 1, 5, 8));
        return arr;
    }
}
