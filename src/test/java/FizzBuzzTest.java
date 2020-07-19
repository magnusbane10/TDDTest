import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    /**
     * 6 Create a methode called setup annotated with
     *
     * @Before to run befor each and every test
     */
    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();   /**  7 This way we can rewrite the same obj */
    }

    /**
     * 8  we can delete the creation of the objects fizzBuzz
     */
    @Test
    public void testNumber() {
        //FizzBuzz fizzBuzz= new FizzBuzz();                  /**  1 create a class*/
        int number = 1;                                     /**  3 Pass the variable Number the value of 1*/
        String numberReturn = fizzBuzz.play(number);        /**   2 create a Play methode*/
        Assert.assertEquals("1", numberReturn);     /** 4 expected "1" */
    }

    @Test
    public void testFizz() {
        //FizzBuzz fizzBuzz = new FizzBuzz();   /** 5 Create again the obj. fizzBuzz thats way we will go an
        // create a private variable outside of tests*/
        int number = 3;
        String numberReturn = fizzBuzz.play(number);
        Assert.assertEquals("Fizz", numberReturn); /**It will fail , than we go in our class to create a methode*/
    }

    @Test
    public void testFizzDivisibleBy3() {
        int number = 6;
        String numberReturn = fizzBuzz.play(number);
        Assert.assertEquals("Fizz", numberReturn);
    }

    @Test
    public void testBuzz() {
        int number = 5;
        String numberReturn = fizzBuzz.play(number);
        Assert.assertEquals("Buzz", numberReturn);
    }

    @Test
    public void testBuzzDivisibleBy5() {
        int number = 10;
        String numberReturn = fizzBuzz.play(number);
        Assert.assertEquals("Buzz", numberReturn);
    }
    @Test
    public void testFizzBuzzDivisibleWith3And5(){
        int number =150;
        String numberReturn = fizzBuzz.play(number);
        Assert.assertEquals("FizzBuzz",numberReturn);
    }
}