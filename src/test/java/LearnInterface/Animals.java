package LearnInterface;

import org.testng.annotations.Test;

import java.util.Collection;

public interface Animals {
         void animalSound();

         void sleep();
}

class Dog implements Animals {
    public void animalSound() {
        System.out.println("The dog says: Gav gav");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Main {
    public static void main(String[] args) {
        Animals myDog = new Dog();
        Animals myCats = new Cats();
        myDog.animalSound();
        myDog.sleep();
        myCats.animalSound();
        myCats.sleep();
    }
}

class Cats implements Animals {

    public void animalSound() {
        System.out.println("The cats says: May may");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}



