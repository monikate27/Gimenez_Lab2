import java.util.Scanner; // to input radius and height of the cylinder

// Base class for Cylinder
class Cylinder {
    protected double radius;
    protected double height;
    protected double area;

    // Method to calculate the area of the cylinder
    public void calculateArea() {
        area = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    // Method to input the radius and height
    public void inputDimensions() {
        Scanner scanner = new Scanner(System.in);
    // Asking the user for the value of radius
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
    // Asking the user for the value of height
        System.out.print("Enter the height: ");
        height = scanner.nextDouble();
        scanner.close();
    }

    // Method to display the area
    public void displayArea() {
        System.out.println("The computed area of the cylinder is: " + area);
    }
}

// Derived class for Cylinder Volume
class CylinderVol extends Cylinder {

    private double volume;

    // Method to calculate the volume of the cylinder
    public void calculateVolume() {
        volume = Math.PI * radius * radius * height;
    }

    // Method to display the volume
    public void displayVolume() {
        System.out.println("The computed volume of the cylinder is: " + volume);
    }
}

// Main class to execute the program
public class CylinderCalculation {
    public static void main(String[] args) {
        CylinderVol cylinderVol = new CylinderVol();

        // Input dimensions
        cylinderVol.inputDimensions();

        // Calculate area and volume
        cylinderVol.calculateArea();
        cylinderVol.calculateVolume();

        // Display the results
        cylinderVol.displayArea();
        cylinderVol.displayVolume();
    }
}
