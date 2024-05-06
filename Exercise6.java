public class Exercise6 {
    public static void main(String[] args){
        int input = 25;
        System.out.println(countDigits(input));

    }

    public static int countDigits(int number){
        int sum = 0;

        String test = String.valueOf(number);

        for (int i = 0; i < test.length(); i++) {
            int digit = Character.getNumericValue(test.charAt(i));
            sum += digit;
        }
        return sum;
    }

//    6. Write a Java method to compute the sum of digits in an integer.
//    Test Data:
//    Input an integer: 25
//    Expected Output:
//
//    The sum is 7
}
