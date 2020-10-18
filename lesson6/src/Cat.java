public class Cat extends Animal{

	Cat(String name){
		super(name);
	}
	@Override
	void run(int len){
		if(len > 201){
			System.out.print(name + " не пробежит " + len + "м ");
			System.out.println("Максимум 200 метров!");
		}
		else{
			System.out.println(name + " пробежал " + len + "м");
		}
	}
	@Override
	void swim(int len){
		System.out.println(name + " не умеет плавать.");
	}
	@Override
	void jump(double height){
		if(height >= 2.0){
			System.out.print(name + " не прыгнет на " + len + "м ");
			System.out.println("Максимум 2 метра!");
		}
		else{
			System.out.println(name + " прыгнул на " + len + "м");
		}
	}
}
