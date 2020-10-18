public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("Дуся", 5);
		Plate plate = new Plate(20);

		Cat[]catArray = new Cat[3];
		catArray[0] = new Cat("Васька", 6);
		catArray[1] = new Cat("Барсик", 7);
		catArray[2] = new Cat("Серый", 9);

		catArray[0].isNotHungry(plate);
		plate.info();
		System.out.println(" ");

		catArray[1].isNotHungry(plate);
		plate.info();
		System.out.println(" ");

		catArray[2].isNotHungry(plate);
		plate.info();
		System.out.println(" ");

		plate.addFood();
		plate.info();
	}
}
