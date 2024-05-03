import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            System.out.println("Type an Number ");
            int output = scanner.nextInt();
            number.add(output);
        }
        findNumber(number);
    }
    public static void findNumber(ArrayList<Integer> test){
        test.sort(null);
        System.out.println("\n" + test.get(0));
    }

//    1. Write a Java method to find the smallest number among three numbers.
//    Test Data:
//    Input the first number: 25
//    Input the Second number: 37
//    Input the third number: 29
//    Expected Output:
//
//    The smallest value is 25.0
}
