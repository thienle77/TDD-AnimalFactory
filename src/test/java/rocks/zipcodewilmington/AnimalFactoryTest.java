package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        //Given
        Integer expected = 1;
        Date birthDate = null;
        Dog dog = AnimalFactory.createDog("Doggo", null);
        String expectedName = "Doggo";
        birthDate = new Date(2022, 4, 7);
        //When
        DogHouse.add(dog);
        //Then
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);

    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    public void createCatTest() {
        //Given
        Integer expected = 1;
        Cat cat = AnimalFactory.createCat("Tiara", null);
        String expectedName = "Tiara";
        Date birthdate = new Date(2022, 1, 1);
        //When
        CatHouse.add(cat);
        //Then
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);

    }

}