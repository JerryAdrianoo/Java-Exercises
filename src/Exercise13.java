import java.lang.Math;
public class Exercise13 {
    public static void main(String[] args) {
        double input1 = 10;
        double input2 = 15;
        double input3 = 20;

        System.out.println("The area of the triangle is " + calculateArea(input1, input2, input3));
    }

    public static double calculateArea(double base1, double base2, double base3){
        double s = (base1 + base2 + base3) / 2.0;

        return Math.sqrt(s * (s - base1) * (s - base2) * (s - base3));
    }
}

//13. Write Java methods to calculate triangle area.
//
//Expected Output:
//
//Input Side-1: 10
//Input Side-2: 15
//Input Side-3: 20
//The area of the triangle is 72.6184377413890