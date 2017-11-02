import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println();

		ArrayList<Car> cars = new ArrayList<>();
		int numOfCars = Validator.getInt(scan, "How many cars are you entering: ", 1, Integer.MAX_VALUE);

		// Get car details
		for (int i = 0; i < numOfCars; i++) {
			String make = Validator.getString(scan, "Enter Car # " + (i + 1) + " Make: ");
			String model = Validator.getString(scan, "Enter Car # " + (i + 1) + " Model: ");
			int year = Validator.getInt(scan, "Enter Car # " + (i + 1) + " Year: ", 1900, 2017);
			double price = Validator.getDouble(scan, "Enter Car # " + (i + 1) + " Price: ", 0, Double.MAX_VALUE);
			System.out.println();

			cars.add(new Car(make, model, year, price));
		}

		// Print car list
		System.out.println("Current Inventory: ");
		for (Car c : cars) {
			System.out.printf("%-10s %-10s %-10d $%,10.2f\n", c.getMake(), c.getModel(), c.getYear(), c.getPrice());
		}
	}
}
