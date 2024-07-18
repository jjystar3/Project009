package abstractex.quiz;

import java.util.ArrayList;

public class Quiz04 {

	public static void main(String[] args) {

		ArrayList<Car2> list = new ArrayList<>();

		list.add(new Bus());
		list.add(new AutoCar());

		for (Car2 car : list) {
			car.run();
			car.refuel();
			if (car instanceof Bus) {
				Bus bus = (Bus) car;
				bus.takePassenger();
			}
			if (car instanceof AutoCar) {
				AutoCar autoCar = (AutoCar) car;
				autoCar.load();
			}
		}

	}

}
