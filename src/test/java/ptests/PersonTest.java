package ptests;

import org.junit.Assert;
import org.junit.Test;
import people.Person;

public class PersonTest {

    @Test
    public void personConstructorTest(){
        Person person = new Person(23);
        Assert.assertEquals("Person age set in constructor is not correct!",23,person.getAge());
    }

    @Test
    public void personSetterTest(){
        Person person = new Person(23);
        person.setAge(32);
        Assert.assertEquals("Person age set in setter is not correct!",32,person.getAge());
    }
}
