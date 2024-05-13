public class Exercise10 {
    public static void main(String[] args) {
        int year = 2024;

        calcularAno(year);
    }

    public static boolean calcularAno(int year) {
        boolean bi = false;

        if ((year % 4 != 0 || year % 100 == 0)){
            System.out.println("Esse não é um ano bissexto!\n" + bi);

        }
        else if (year % 4 == 0 || year % 400 == 0) {
            bi = true;
            System.out.println("esse é um ano bissexto!\n" + bi);
        }

        return bi;
    }
}

//10. Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
//
//Expected Output:
//
//Input a year: 2017
//false
