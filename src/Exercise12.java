public class Exercise12 {
    public static void main(String[] args) {
        int n = 10;

        matrix(n);
    }

    public static int matrix(int n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print((i * n + j + 1) + "\t");
                }
                System.out.println();
            }
        return n;
    }
}
//12. Write a Java method (takes n as input) to display an n-by-n matrix.
//
//Expected Output:
//
//Input a number: 10
//        1 0 0 1 1 0 0 0 1 1
//        0 0 1 0 1 0 1 0 0 0
//        0 1 0 1 0 0 0 0 0 1
//        1 1 1 0 0 0 0 1 1 1
//        1 1 0 1 1 1 0 1 0 0
//        1 0 0 0 1 1 0 0 0 0
//        0 0 1 0 0 0 0 1 1 1
//        1 1 0 1 0 1 0 0 1 0
//        0 0 1 0 0 0 0 1 1 0
//        1 1 1 0 0 1 1 1 1 0