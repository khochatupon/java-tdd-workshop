public class FizzBuzz {
    public String say(int input) {
        if (input%3 == 0)
            return "Fizz";
        else if (input == 5)
            return "Buzz";
        return Integer.toString(input);
    }
}
