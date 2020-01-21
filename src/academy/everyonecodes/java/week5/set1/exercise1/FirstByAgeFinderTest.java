package academy.everyonecodes.java.week5.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class FirstByAgeFinderTest {

    FirstByAgeFinder firstByAgeFinder = new FirstByAgeFinder();

    @Test
    void find() {
        Person person1 = new Person("gina", 33);
        Person person2 = new Person("sercan", 27);
        Person person3 = new Person("oana", 35);

        List<Person> input = List.of(person1, person2, person3);

        int age = 27;

        Optional<Person> oResult = firstByAgeFinder.find(input, age);
       if(oResult.isPresent()){
           Person result = oResult.get();
           Assertions.assertEquals(person2.getAge(), result.getAge());
       }



    }

    @Test
    void find2() {
        Person person1 = new Person("gina", 33);
        Person person2 = new Person("sercan", 26);
        Person person3 = new Person("oana", 35);
        List<Person> input = List.of(person1, person2, person3);

        int age = 27;

        Optional<Person> oPerson = firstByAgeFinder.find(input, age);

        Assertions.assertTrue(oPerson.isEmpty());
    }
    @Test
    void find3() {
        Person person1 = new Person("gina", 23);
        Person person2 = new Person("sercan", 35);
        Person person3 = new Person("oana", 18);
        List<Person> input = List.of(person1, person2, person3);

        int age = 23;

        Optional<Person> oResult = firstByAgeFinder.find(input, age);

        Assertions.assertTrue(oResult.isPresent());
        Person result = oResult.get();



        Assertions.assertEquals(person1.getAge(), result.getAge());

    }
}
