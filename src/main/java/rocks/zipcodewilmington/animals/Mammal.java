package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public abstract class Mammal implements Animal {
    private final Integer id;
    private static ArrayList<Food> eatenMeals;
    private static String name;
    private static Date birthDate;

    public Mammal(String name, Date birthDate, Integer id) {
        this.name = name;
        this.birthDate = birthDate;
        this.eatenMeals = new ArrayList<>();
        this.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Mammal.name = name;
    }

    public static Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    public Integer getNumberOfMealsEaten() {
        return eatenMeals.size();
    }

    public void eat(Food food) {
        eatenMeals.add(food);
    }

    @Override
    public Integer getId() {
        return id;
    }
}
