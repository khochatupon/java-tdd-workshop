public class FizzBuzz {
    public String say(int input) {
        if (input%3 == 0) {
            if (input % 5 == 0)
                return "FizzBuzz";
            return "Fizz";
        }
        else if (input%5 == 0)
            return "Buzz";
        return Integer.toString(input);
    }
}
