/* File: TestDrivenInterface.java
 * This is the interface file that holds all methods to be tested
 * Author: Livhuwani Lucky Rambuda (208224262)
 * Date created: 03 March 2014
 * Email : Rambudalucky.saho@gmail.com
 * Cell: 076 380 8106
 */

package Livhuwani.Rambuda.TDD;


public interface TestDrivenInterface 
{
    //1. Demonstrate Floating points assertions
    float getFloat();
    
    //2. Demonstrate Integer assertions
    int getInteger();

    //3. Object comparisons: asserting object equality
    Object checkObject();
    
    //4. Object comparisons: asserting object identity
    Object checkIdentity();
    
    //5. Demonstrate Asserting Truth
    boolean checkTruth();
    
    //6. Demonstrate Asserting Falsity
    boolean checkFalsity();
    
    //7. Testing for the presence of Null Values
    String isNull();
    
    //8. Demonstrate Testing Strings
    String getString();
    
    //9. Demonstrate Ignoring tests
    int divide(int val1, int val2);
    
    //10.Demonstrate Assert Arrays Content & with timeouts
    Object checkArray();
}
