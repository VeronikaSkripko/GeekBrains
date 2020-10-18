public abstract class Animal {
	protected String name;
	protected int len;
	protected double height;

	Animal(String name) {
		this.name = name;
	}
	abstract void run(int len);
	abstract void swim(int len);
	abstract void jump(double height);
}
