import java.util.Scanner;

public class ComputeTheVolumeOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a double for the length of the sides in an equilateral triangle
        System.out.print("define the length of the triangle sides in cm: ");
        double length = input.nextDouble();

        // calculate the area and volume of the triangle
        double unargumentedArea = (Math.sqrt(3) / 4) * Math.pow(length, 2);

        // Convert the area number to a number with only 2 digits
        double var1 = unargumentedArea % 1;
        double var2 = var1 * 100;
        double var3 = (int)var2;
        double decimalsArea = var3 / 100;
        double integerArea = (int)unargumentedArea;
        double argumentedArea = integerArea + decimalsArea;

        // Print the area to screen
        System.out.println("the area of the triangle is: " + argumentedArea +"cm");

        // Calculate the volume of a triangle, in squarecentimeters, with only 2 decimals
        double unargumentedVolume = unargumentedArea * length;
        double var5 = unargumentedVolume % 1;
        double var6 = var5 * 100;
        double var7 = (int)var6;
        double decimalsVolume = var7 / 100;
        double integerVolume = (int)unargumentedVolume;
        double argumentedVolume = integerVolume + decimalsVolume;

        //Print out the volume to screen
        System.out.println("The volume of the triangle is: " + argumentedVolume + "cm^2");


    }
}
