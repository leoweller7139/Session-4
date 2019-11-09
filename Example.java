public class Example{

    public static void main(String[] args){

        Person student1 = new Person("Marlene", 21);
        Person student2 = new Person("Leo", 21);
        Person student3 = new Person("Manning", 21);
        Person student4 = new Person("Brown", 24);
        Animal animal1 = new Animal("Manisours ", " Hybrid Creature");

        animal1.attacks(student1.getName());
        student1.printP();
        student2.printP();
        student3.printP();
        student4.printP();

        student1.sayHello(student2.getName());
        student2.sayYo(student4.getName());


    }
}