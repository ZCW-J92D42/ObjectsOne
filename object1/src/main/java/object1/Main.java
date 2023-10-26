package object1;
import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Person person1 = new Person("John", 30, 150);
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info (person1.name + "'s Height is "+ person1.height);

        //car
        Car car1 = new Car("Audi", "Q8", 2023, 50 );
        logger.info("My car: " + car1.getMake() + " "+ car1.getModel()+ " " + car1.getYear()+ " " + car1.getMileage());

        // Chair
        Chair chair1 = new Chair("Wood", "brown", 4);
        logger.info("My chair is made of "+ chair1.getMaterial()+ " and its " + chair1.getColor()+ " in color and has "+ chair1.getLegs()+ " legs.");

        //Dog
        Dog dog1 = new Dog("Jimmy", 3, "German Shephard");
        logger.info("My dog's name is " + dog1.getName()+ " and its age is "+ dog1.getAge()+ ". It is a "+ dog1.getBreed());

        ArrayClass[] people = new ArrayClass[10];
        ArrayClass person2 = new ArrayClass("Alice", 25);
        ArrayClass person3 = new ArrayClass("Bob", 30);

        people[0] = person2;
        people[1] = person3;

        ArrayClass person = people[1];
        logger.info("Name is " + person.getName()+ " and the age is "+ person.getAge());

        Car[] cars= new Car[10];
        Car car2 = new Car("Toyota", "Camry", 2012, 60);
        Car car3 = new Car("BMW", "X5", 2020, 55);

        cars[0]= car2;
        cars[1]= car3;

        Car car = cars[1];
        logger.info("My car: " + car.getMake() + " "+ car.getModel()+ " " + car.getYear()+ " " + car.getMileage());

        Chair[] chairs= new Chair[10];
        Chair chair2 = new Chair("Metal", "Steel", 4);
        Chair chair3 = new Chair ("Bamboo", "brown", 4);

        chairs[0]= chair2;
        chairs[1]= chair3;
        Chair chair = chairs[0];
        logger.info("My chair is made of "+ chair.getMaterial()+ " and its " + chair.getColor()+ " in color and has "+ chair.getLegs()+ " legs.");

        Dog[] dogs = new Dog[10];
        Dog dog2 = new Dog("Alex", 1, "Bulldog");
        Dog dog3 = new Dog("Cutie", 3, "Poodle");


        dogs[0]= dog2;
        dogs[1]= dog3;

        Dog dog = dogs[0];
        logger.info("My dog's name is " + dog.getName()+ " and its age is "+ dog.getAge()+ ". It is a "+ dog.getBreed());

    }
}
