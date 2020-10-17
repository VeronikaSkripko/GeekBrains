public class Main {
	public static void main(String[] args) {
		Person employee = new Person("Brown",
				"Joe",
				"assistant",
				"brown@google.com",
				"89265874510",
				45000,
				35);
		employee.printInfo();
		Person[] personArray = new Person[5];
		personArray[0] = new Person("Smith", "John", "water", "john@google.com",
				"89054512013", 30000, 20);
		personArray[1] = new Person("Jackson", "Mike", "director",
				"mike@google.com", "89158647595", 80000, 55);
		personArray[2] = new Person("Niclson", "Graham", "manager",
				"gram@google.com", "89104512361", 50000, 41);
		personArray[3] = new Person("Krasilov", "Ivan", "CEO",
				"ceo@google.com", "89168749549", 75000, 46);
		personArray[4] = new Person ("Mironov", "Rastislav", "accounter",
				"ac@google.com", "89647596423", 65000, 37);
		for(int i = 0; i < personArray.length; i++){
			personArray[i].printInfo();
			System.out.println();
		}
	}
}
