public class Human implements Swimmable, Flyable{
	String name;
	String technic;
	int speed;

	public Human(String name, String technic, int speed) {
		this.name = name;
		this.technic = technic;
		this.speed = speed;
	}

	@Override
	public void fly() {
		System.out.println(name + " умеет летать на " + technic + " со скоростью до " + speed + " км/ч.");
	}

	@Override
	public void swim() {
		System.out.println(name + " умеет плавать " + technic + " со скоростью до " + speed + " м/с.");
	}
}
