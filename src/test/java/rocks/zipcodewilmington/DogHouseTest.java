package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addTest() {
        //Given
        String expected = "Bingo";
        Dog dog = new Dog("Bingo", new Date(), 22);
        //When
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(22);
        //Then
        Assert.assertEquals(expected, actual.getName());
    }

    @Test
    public void removeIdTest() {
        //Given
        Dog dog = new Dog("Clifford", null, 10);
        DogHouse.add(dog);
        //When
        DogHouse.remove(10);
        Dog actual = DogHouse.getDogById(10);
        //Then
        Assert.assertNull(actual);
    }

    @Test
    public void removeDogTest() {
        //Given
        Dog dog = new Dog("Buddy", null, 33);
        Integer expected = null;
        DogHouse.add(dog);
        //When
        DogHouse.remove(dog);
        Dog actual = DogHouse.getDogById(33);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogById() {
        //Given
        Dog dog = new Dog("Comet", null, 1989);
        String expected = "Comet";
        DogHouse.add(dog);
        //When
        Dog actual = DogHouse.getDogById(1989);
        //Then
        Assert.assertEquals(expected, actual.getName());
    }

    @Test
    public void getNumberOfDogsTest() {
        //Given
        DogHouse.clear();
        Dog dog = new Dog("Cosmo", null, 2018);
        Dog dog2 = new Dog("Orbit", null, 2019);
        DogHouse.add(dog);
        DogHouse.add(dog2);
        //When
        Integer actual = DogHouse.getNumberOfDogs();
        //Then
        System.out.println(DogHouse.getNumberOfDogs());
        Assert.assertNotNull(actual);
    }
}
