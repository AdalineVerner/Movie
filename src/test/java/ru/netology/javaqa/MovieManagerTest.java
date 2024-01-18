package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    Movie mov1 = new Movie("Бладшот", "imageUrl", "боевик",
            "март", 2023, 12);
    Movie mov2 = new Movie("Джентельмены", "imageUrl", "боевик",
            "февраль", 2023, 13);
    Movie mov3 = new Movie("Вперед", "imageUrl", "мультфильм",
            "март", 2023, 5);
    Movie mov4 = new Movie("Тролли.Мировой тур", "imageUrl", "мультфильм",
            "март", 2023, 19);
    Movie mov5 = new Movie("Человек-невидимка", "imageUrl", "ужасы",
            "март", 2023, 5);
    Movie mov6 = new Movie("Отель Белград", "imageUrl", "комедия",
            "март", 2023, 5);


    @Test

    public void shouldAddMovie() {
        MovieManager manager = new MovieManager();
        manager.add(mov1);
        manager.add(mov2);
        manager.add(mov3);

        Movie[] expected = {mov1, mov2, mov3};
        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastIfDegreeLimit() {
        MovieManager manager = new MovieManager(7);
        manager.add(mov1);
        manager.add(mov2);
        manager.add(mov3);
        manager.add(mov4);
        manager.add(mov5);
        manager.add(mov6);
        Movie[] expected = {mov6, mov5, mov4, mov3, mov2, mov1};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfUnderLimit() {
        MovieManager manager = new MovieManager(3);
        manager.add(mov1);
        manager.add(mov2);
        manager.add(mov3);
        manager.add(mov4);
        manager.add(mov5);
        manager.add(mov6);

        Movie[] expected = {mov6, mov5, mov4};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfEqualsLimit() {
        MovieManager manager = new MovieManager(5);
        manager.add(mov1);
        manager.add(mov2);
        manager.add(mov3);
        manager.add(mov4);
        manager.add(mov5);
        manager.add(mov6);

        Movie[] expected = {mov6, mov5, mov4, mov3, mov2};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
