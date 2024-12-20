//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
        Human human = new Human("Человек", "самолёте", 900);
		Human humans = new Human("Человек", "кролем", 2);
		Bird bird = new Bird("лебедь", 6);
		Bird birds = new Bird("воробей", 40);
		Fish fish = new Fish("щука", 11, 10);
		human.fly();
		humans.swim();
		bird.swim();
		birds.fly();
		fish.swim();

	}
}