public class Dog extends Animal{

	Dog(String name){
		super(name);
	}
	@Override
	void run(int len){
		if(len > 501){
			System.out.print(name + " не пробежит " + len + "м ");
			System.out.println("Максимум 500 метров!");
		}
		else {
			System.out.println(name + " пробежал " + len + "м");
		}
	}
	@Override
	void swim(int len){
		if(len > 11){
			System.out.print(name + " не проплывет " + len + "м ");
			System.out.println("Максимум 10 метров!");
		}
		else{
			System.out.println(name + " проплыл " + len + "м");
		}
	}
	@Override
	void jump(double height){
		if(height >= 0.5){
			System.out.print(name + " не прыгнет на " + len + "м ");
			System.out.println("Максимум 0.5 метра!");
		}
		else{
			System.out.println(name + " прыгнул на " + len + "м");
		}
	}
}
