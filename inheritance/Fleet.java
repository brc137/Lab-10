import java.util.*;
public class Fleet{

	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
		System.out.println("How many vehicles do you intend to enter?");
		int count = kbd.nextInt();

		while(count>0){
			System.out.println("What type of vehicle are you entering? (1: Car, 2: Truck, 3: Motorcycle)");
			int type = kbd.nextInt();
		if (type == 1){
			Car Car = new Car();

			System.out.println("What is the vehicle's model name?");
			Car.setModel(input.next());

			System.out.println("What is the vehicle's model year?");
			Car.setYear(input.nextInt());

			System.out.println("What is the vehicle's weight?");
			Car.setWeight(input.nextInt());

			System.out.println("What is the vehicle's color?");
			Car.setColor(input.next());

			System.out.println("What is the MPG of the vehicle?");
			Car.setMPG(input.nextInt());

			System.out.println("What is the seating capacity of the vehicle?");
			Car.setSeating(input.nextInt());

			System.out.println("What is the make of the vehicle?");
			Car.setMake(input.next());

			cars.add(Car);
		}
		else if (type == 2){
			Truck Truck = new Truck();

			System.out.println("What is the vehicle's model name?");
			Truck.setModel(input.next());

			System.out.println("What is the vehicle's model year?");
			Truck.setYear(input.nextInt());

			System.out.println("What is the vehicle's weight?");
			Truck.setWeight(input.nextInt());

			System.out.println("What is the vehicle's color?");
			Truck.setColor(input.next());

			System.out.println("What is the MPG of the vehicle?");
			Truck.setMPG(input.nextInt());

			System.out.println("What is the seating capacity of the vehicle?");
			Truck.setSeating(input.nextInt());

			System.out.println("What is the hauling capacity of the vehicle?");
			Truck.setHauling(input.nextInt());

			System.out.println("What is the vehicle's make?");
			Truck.setMake(input.next());

			cars.add(Truck);
		}

		else if (type == 3){
			Motorcycle Motorcycle = new Motorcycle();

			System.out.println("What is the vehicle's model name?");
			Motorcycle.setModel(input.next());

			System.out.println("What is the vehicle's model year?");
			Motorcycle.setYear(input.nextInt());

			System.out.println("What is the vehicle's weight?");
			Motorcycle.setWeight(input.nextInt());

			System.out.println("What is the vehicle's color?");
			Motorcycle.setColor(input.next());

			System.out.println("What is the MPG of the vehicle?");
			Motorcycle.setMPG(input.nextInt());

			System.out.println("What is the vehicle's make?");
			Motorcycle.setMake(input.next());

			cars.add(Motorcycle);
		}

		count--;
}
		System.out.println("Now we will go through all objects created from the superclass Vehicle");

// create an arraylist of our objects we create from the Vehicle class
		// Each vehicle with ALL of its methods and datafields will be stored in each element of our arraylist. Remember an ArrayList stores every value as an object instead of a primitive like a normal array
//We can add an object created by the subclass(Car) of the superclass(Vehicle) to an Arraylist of Vehicle because Car is a child of the parent Vehicle class.
		for(Vehicle car : cars)
		{
			car.stats();
		}


		// You can see how 2 constructors work to do the same thing but in 2 different ways



		}
	}
