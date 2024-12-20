public class Bird implements Swimmable, Flyable{
	String name;
	int speed;

	public Bird(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	@Override
	public void fly() {
		System.out.println("Птитца " + name + " летает со скоростью до " + speed + " км/ч.");
	}

	@Override
	public void swim() {
		System.out.println("Водоплавающая птица "+ name + " плавает со скоростью до " + speed + " км/ч.");
	}
}
