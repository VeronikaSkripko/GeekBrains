import java.util.Scanner;

public class Plate {
	private int food;

	public Plate(int food){
		this.food = food;
	}
	//уменьшаем еду в тарелке и отслеживаем состояние
	public boolean decreaseFood(int val){
		if(this.food >= val) {
			this.food -= val;
			return (true);
		}
		else{
			return (false);
		}
	}
	public void info(){
		System.out.println("plate: " + food);
	}
	public void addFood() {
		System.out.println("Сколько еды добавить в тарелку?");
		Scanner scan = new Scanner(System.in);
		int quantity = scan.nextInt();
		this.food += quantity;
	}
}

