public class MyRange {
    public String of(String input) {
        int firstNum = getFirstNumber(input);
        int lastNum = getLastNumber(input);
        String result = "";
        for (int i = firstNum;i<=lastNum;i++){
            result += i;
        }
        return result;
    }

    public int getLastNumber(String input) {
        if (isก้ามปูปิด(input))
            return Character.getNumericValue(input.charAt(3));
        return Character.getNumericValue(input.charAt(3))-1;
    }

    public boolean isก้ามปูปิด(String input) {
        if (input.charAt(4)==']')
            return true;
        return false;
    }

    public int getFirstNumber(String input) {
        if (isก้ามปูเปิด(input))
            return Character.getNumericValue(input.charAt(1));
        return Character.getNumericValue(input.charAt(1))+1;
    }

    public boolean isก้ามปูเปิด(String input) {

        if(input.charAt(0)=='[')
            return true;

        return false;
    }
}
