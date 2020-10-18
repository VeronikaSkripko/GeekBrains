public class Cat {
	private String name;
	private int appetite;
	private boolean condition = false;

	public Cat(String name, int appetite){
		this.name = name;
		this.appetite = appetite;
	}

	//кот должен уменьшить еду на значение своего аппетита
	//проверяем смог ли кот поесть
	public boolean isNotHungry(Plate plate){
		if(plate.decreaseFood(appetite)){
			condition = true;
			System.out.println(name + " поел");
		}
		else{
			System.out.println("В тарелке мало еды!");
			System.out.println(name + " голодный");
			condition = false;
		}
		return condition;
	}
}
