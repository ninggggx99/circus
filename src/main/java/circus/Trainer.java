package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting --> taking a subclass object to become a superclass object
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting --> taking a subclass object to become a superclass object
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting --> taking a superclass object to become a childclass object
        train(new Duck());
        train(new Parrot());
//        circus.animal.Animal a2 = new circus.animal.Animal();
//        circus.animal.Bird b2 = new circus.animal.Bird();
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck){
            Duck d = (Duck) bird;
            d.swim();
        }

    }
}
