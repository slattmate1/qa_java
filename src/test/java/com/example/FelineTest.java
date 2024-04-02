package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    Feline feline;

    @Test
    public void eatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void testGetFamily() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Mockito.verify(feline, Mockito.times(1)).getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittens() {
        int actual = feline.getKittens();
        int expectedKittenCountForMock = 1;
        assertEquals(expectedKittenCountForMock,actual);
    }

    @Test
    public void testGetKittens() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
}
