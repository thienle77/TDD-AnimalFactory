package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addTest () {
        //Given
        Cat cat = new Cat("Tiara", new Date(), 99);
        String expected = "Tiara";
        //When
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(99);
        //Then
        Assert.assertEquals(expected, actual.getName());
    }
    @Test
    public void removeIdTest () {
        //Given
        Cat cat = new Cat("Orange", null, 11);
        CatHouse.add(cat);
        //When
        CatHouse.remove(11);
        Cat actual = CatHouse.getCatById(11);
        //Then
        Assert.assertNull(actual);
    }
    @Test
    public void getCatByIDTest () {
        //Given
        Cat cat = new Cat("Garfield", null, 2020);
        String expected = "Garfield";
        CatHouse.add(cat);
        //When
        Cat actual = CatHouse.getCatById(2020);
        //Then
        Assert.assertEquals(expected, actual.getName());
    }
    @Test
    public void getNumberOfCatsTest () {
        //Given
        CatHouse.clear();
        Cat cat1 = new Cat("Curly", null, 123);
        Cat cat2 = new Cat("Mufasa", null, 321);
        Integer expected = 2;
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        //When
        Integer actual = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
