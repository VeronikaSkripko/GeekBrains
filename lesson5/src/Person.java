public class Person {
	String surname;
	String name;
	String position;
	String email;
	String phoneNumber;
	int salary;
	int age;
	public Person(String surname, String name, String position, String email, String phoneNumber, int salary, int age)
	{
		this.surname = surname;
		this.name = name;
		this.position = position;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.age = age;
	}
	void printInfo()
	{
		if (age > 40)
		{
			System.out.println("Фамилия сотрудника: " + this.surname);
			System.out.println("Имя сотрудника: " + this.name);
			System.out.println("Должность сотрудника: " + this.position);
			System.out.println("Email сотрудника: " + this.email);
			System.out.println("Телефон сотрудника: " + this.phoneNumber);
			System.out.println("Зарплата сотрудника: " + this.salary);
			System.out.println("Возраст сотрудника: " + this.age);
		}
	}
}
//printinfo вычисляется в main, это не задача класса
