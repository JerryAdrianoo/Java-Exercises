public class Exercise5 {
    public static void main(String[] args){
        String text = "test 34 4324 1 2 3 4 5";
        test(text);
    }

    public static void test(String words){
        String[] result = words.split(" ");
        int test = result.length;
        System.out.println(test);
    }
//    5. Write a Java method to count all the words in a string.
//    Test Data:
//    Input the string: The quick brown fox jumps over the lazy dog.
//    Expected Output:
//
//    Number of words in the string: 9
}
