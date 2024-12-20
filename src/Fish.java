public class Fish implements Swimmable{
	String name;
	int speed;
	int deep;

	public Fish(String name, int speed, int deep) {
		this.name = name;
		this.speed = speed;
		this.deep = deep;
	}

	@Override
	public void swim() {
		System.out.println("Рыба " + name + " плавает со скоростью " + speed + " км/ч на глубину до " + deep + " метров.");
	}
}
