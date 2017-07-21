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
        String strNumber = removeNonDigit(input);
        int strNumberLen = strNumber.length();
        String result = "";
        for (int i=0,j=0;i<strNumber.length();i++){
            result += strNumber.charAt(i);
            if (strNumberLen%3==1 && i==strNumberLen-4){
                j++;
            }
            if (j==2 && i!=strNumberLen-1){
                result += '-';
                j = -1;
            }
            j++;
        }
        return result;
    }

}
