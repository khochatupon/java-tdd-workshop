public class FizzBuzz {
    public String say(int input) {
        if (input <= 2)
            return Integer.toString(input);
        else if (input == 3)
            return "Fizz";
        return null;
    }
}
