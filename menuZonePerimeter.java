import java.util.Scanner;

public class Exercise {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Menu");
System.out.println("Choose one of the options below:");
System.out.println("1 – Calculate the area of ​​the square");
System.out.println("2 – Calculate the area of ​​the rectangle");
System.out.println("3 – Calculate the area of ​​the right triangle");
System.out.println("4 – Calculate the area of ​​the circle");
System.out.println("5 – Calculate the area of ​​the trapezoid");
System.out.println("6 – Calculate the perimeter of the square");
System.out.println("7 – Calculate the perimeter of the rectangle");
System.out.println("8 – Calculate the perimeter of the circle");

int option = sc.nextInt();

if (option == 1) {
System.out.println("Enter the side of the square:");
double side = sc.nextDouble();
System.out.println("Area: " + (side * side));
} else if (option == 2) {
System.out.println("Enter the base and height of the rectangle:");
double base = sc.nextDouble();
double height = sc.nextDouble();
System.out.println("Area: " + (base * height));
} else if (option == 3) {
System.out.println("Enter the base and height of the triangle:"); double base = sc.nextDouble();
double height = sc.nextDouble();
System.out.println("Area: " + ((base * height) / 2));
} else if (option == 4) {
System.out.println("Enter the radius of the circle:");
double radius = sc.nextDouble();
System.out.println("Area: " + (Math.PI * radius * radius));
} else if (option == 5) {
System.out.println("Enter the larger and smaller bases and height of the trapezoid:");
double bMaior = sc.nextDouble();
double bSinho = sc.nextDouble();
double height = sc.nextDouble(); System.out.println("Area: " + (((bLargest + bSmallest) * height) / 2));
} else if (option == 6) {
System.out.println("Enter the side of the square:");
double side = sc.nextDouble();
System.out.println("Perimeter: " + (4 * side));
} else if (option == 7) {
System.out.println("Enter the base and height of the rectangle:");
double base = sc.nextDouble();
double height = sc.nextDouble();
System.out.println("Perimeter: " + (2 * (base + height)));
} else if (option == 8) {
System.out.println("Enter the radius of the circle:");
double radius = sc.nextDouble();
System.out.println("Perimeter: " + (2 * Math.PI * radius));
} else {
System.out.println("Invalid option.");
}

sc.close();
}
}
