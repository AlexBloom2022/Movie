package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    MovieManager property = new MovieManager();
    MovieItem first = new MovieItem(1, "Alf", "comedy", 7);
    MovieItem second = new MovieItem(2, "Red", "action", 5);
    MovieItem third = new MovieItem(3, "Terminator", "fantastic", 4);
    MovieItem fourth = new MovieItem(4, "Hobbit", "Fantasy", 1);
    MovieItem fifth = new MovieItem(5, "X-files", "Horror", 2);
    MovieItem sixth = new MovieItem(6, "Riddik", "Fantastic", 2);
    MovieItem seventh = new MovieItem(7, "Lion king", "cartoon", 9);
    MovieItem eighth = new MovieItem(8, "Walking dead", "horror", 3);
    MovieItem ninth = new MovieItem(9, "Die Hard", "action", 8);
    MovieItem tenth = new MovieItem(10, "Rush hour", "action", 10);

    @Test
    void save() {
        property.save(first);
        property.save(second);
        property.save(third);
        property.save(fourth);
        property.save(fifth);
        property.save(sixth);
        property.save(seventh);
        property.save(eighth);
        property.save(ninth);
        property.save(tenth);
        MovieItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        MovieItem[] actual = property.getItems();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {
        property.save(third);
        property.save(fourth);

        MovieItem[] expected = {third, fourth};
        MovieItem[] actual = property.FindAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void FindLast() {
        property.save(first);
        property.save(second);
        property.save(third);
        MovieItem[] expected = {third, second, first};
        MovieItem[] actual = property.FindLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    void fourMovieLimitTest() {
        MovieManager property = new MovieManager(4);
        property.save(first);
        property.save(second);
        property.save(third);
        property.save(fourth);
        property.save(fifth);
        property.save(sixth);
        property.save(seventh);
        property.save(eighth);
        property.save(ninth);
        property.save(tenth);
        MovieItem[] expected = {tenth, ninth, eighth, seventh};
        MovieItem[] actual = property.FindLast();
        assertArrayEquals(expected, actual);
    }

}

