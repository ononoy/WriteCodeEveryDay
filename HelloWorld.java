/**
 *
 */

/**
 * @author y
 *
 */
import java.util.Scanner;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Hello World!!");

		///////////////////

	    Scanner scanner = new Scanner(System.in);

	    System.out.print("名前：");
	    String firstName = scanner.next();

	    System.out.print("名字：");
	    String lastName = scanner.next();

	    System.out.print("年齢：");
	    int age = scanner.nextInt();

	    System.out.print("身長(m)：");
	    double height = scanner.nextDouble();

	    System.out.print("体重(kg)：");
	    double weight = scanner.nextDouble();

	    Person.printData(firstName, lastName, age, height, weight);





	}

}


