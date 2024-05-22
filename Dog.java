public class Dog {
    public void dog_name(String name) {
        System.out.printf("Hi i'm %s \n", name);
    }

    public void bark() {
        System.out.println("""
                I am Barking!""");
    }

    public static void eat() {
        System.out.println("I am eating");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.dog_name("Max");
        d1.bark();
        Dog.eat();
    }
}
