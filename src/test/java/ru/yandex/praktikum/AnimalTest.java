package ru.yandex.praktikum;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    private static final String exceptionMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
    private Animal animal;


    @Before
    public void createNewInstance() {
        animal = new Animal();
    }



    @Test
    public void getFamily() {
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        assertEquals(expected, actual);
    }

}
