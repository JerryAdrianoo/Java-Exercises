public class Exercise14 {
    public static void main(String[] args) {
        int numberOfSides = 5;
        double sideLength = 6;
        double area = calculatePentagonArea(sideLength);

        System.out.println("The area of the pentagon is " + area);
    }

    public static double calculatePentagonArea(double side) {
        return (1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(side, 2);
    }
}
//14. Write a Java method to create a pentagon's area.
//
//Expected Output:
//
//Input the number of sides: 5
//Input the side: 6
//The area of the pentagon is 61.93718642120281