package ru.yandex.praktikum;

import ru.yandex.praktikum.Cat;
import ru.yandex.praktikum.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;
    @Mock
    private Feline feline;

    @Before
    public void createNewInstance() {
        cat = new Cat(feline);
    }

    @Test
    public void getSound() {
        String actual = cat.getSound();
        String expected = "Мяу";

        assertEquals(expected, actual);
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected, actual);
    }
}

