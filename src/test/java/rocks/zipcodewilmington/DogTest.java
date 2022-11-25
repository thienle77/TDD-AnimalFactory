package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    Dog dog = new Dog (null, null, null);
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest() {
        //Given
        String expected = "bark!";
        //When
        String actual = dog.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate() {
        //Given
        Date expected = new Date(1996, 4, 7);
        //When
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest () {
        //Given
        Integer eat = 1;
        Food food  = new Food();
        //When
        dog.eat(food);
        Integer meals = dog.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(eat, meals);
    }

    @Test
    public void getIdTest() {
        //Given
        Dog dog = new Dog(null, null, 456);
        Integer id = 456;
        //When
        Integer actual = dog.getId();
        //Then
        Assert.assertEquals(id, actual);
    }

    @Test
    public void animalInheritance() {
        Assert.assertTrue( dog instanceof Animal);
    }

    @Test
    public void mammalInheritance() {
        Assert.assertTrue (dog instanceof Mammal);
    }
}
