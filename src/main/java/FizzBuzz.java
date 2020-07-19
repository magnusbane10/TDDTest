public class FizzBuzz {
    public String play(int number) {
        /**First we have the return Empty String and the test will fail*/
        //return "";
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }else if(number % 5 == 0){
            return "Buzz";
        }else if(number % 3 == 0){
            return "Fizz";
        }else {
            System.out.println("Wrong number");
        }
        /**Now we make the return to give as the value of the variable Number*/
        return String.valueOf(number);
    }
}

