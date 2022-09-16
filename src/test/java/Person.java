import org.testng.annotations.Test;

@Test
public class Person {

    int Age;
    String Name;


    public Person() {
        Age = 33;
        Name = "Dima";
    }

    public static void main(String[] args) {
        Person myObj1 = new Person();
        Person myObj2 = new Person();
        Person myObj3 = new Person();
        System.out.println(myObj1.Age);
        System.out.println(myObj2.Name);
        System.out.println(myObj1.Age + myObj2.Name);
    }
}


