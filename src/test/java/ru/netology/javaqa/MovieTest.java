package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test
    public void shouldInitMovie() {
        Movie mov1 = new Movie("Бладшот", "imageUrl", "боевик",
                "март", 2023, 12);
        Assertions.assertEquals("Бладшот", mov1.getTitle());
        Assertions.assertEquals("imageUrl", mov1.getImageUrl());
        Assertions.assertEquals("боевик", mov1.getGenre());
        Assertions.assertEquals("март", mov1.getReleaseMonth());
        Assertions.assertEquals(2023, mov1.getReleaseYear());
        Assertions.assertEquals(12, mov1.getReleaseDate());

    }
    @Test
    public void shouldSetMovie(){
        Movie mov = new Movie("Бладшот", "imageUrl", "боевик",
                "март", 2023, 12);
        mov.setTitle("Номер один");
        mov.setImageUrl("imageUrl");
        mov.setGenre("комедия");
        mov.setReleaseMonth("март");
        mov.setReleaseYear(2023);
        mov.setReleaseDate(19);
        Assertions.assertEquals("Номер один",mov.getTitle());
        Assertions.assertEquals("imageUrl", mov.getImageUrl());
        Assertions.assertEquals("комедия", mov.getGenre());
        Assertions.assertEquals("март", mov.getReleaseMonth());
        Assertions.assertEquals(2023, mov.getReleaseYear());
        Assertions.assertEquals(19, mov.getReleaseDate());

    }
}
