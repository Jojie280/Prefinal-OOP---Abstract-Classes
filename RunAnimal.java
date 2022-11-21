import java.util.Scanner;
public class RunAnimal{
	public static void main (String []args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Choose an animal.Press B for Bird, C for Cat, or D for Dog: ");
	    String animals = scan.nextLine();
		
		if(animals.equalsIgnoreCase("B")){
			Bird bd = new Bird();
			bd.eat();
			bd.sleep();
			bd.makeSound();
		}
		else if(animals.equalsIgnoreCase("C")){
			Cat ct = new Cat();
			ct.eat();
			ct.sleep();
			ct.makeSound();
		}
		else if(animals.equalsIgnoreCase("D")){
			Dog dg = new Dog();
			dg.eat();
			dg.sleep();
			dg.makeSound();
		}
		scan.close();
		
	}
}