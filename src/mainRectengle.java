package rectangle;
import java.util.Scanner;

public class mainRectengle {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("please enter width and length for rectangle number 1");
		rectengle rec1 = new rectengle(reader.nextInt(), reader.nextInt());
		System.out.println("please enter width and length for rectangle number 2");
		rectengle rec2 = new rectengle(reader.nextInt(), reader.nextInt());

		rec1.draw();
		System.out.println();
		rec2.draw();
		System.out.println();
		System.out.println("the areas are: " + (rec1.calcArea() + rec2.calcArea()));
		System.out.println("the Perimeters are: " + (rec1.calcPerimeter() + rec2.calcPerimeter()));
		rec1.scale(2);
		System.out.println();
		rec1.draw();


	}

}
