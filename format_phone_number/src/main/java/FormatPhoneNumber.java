public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        String strNumber = "";
        for (int i=0;i<input.length();i++) {
            int num = Character.getNumericValue(input.charAt(i));
            if (num >= 0) {
                strNumber += num;
            }
        }
        return strNumber;
    }

    public String solution(String input) {

        return null;
    }

}
