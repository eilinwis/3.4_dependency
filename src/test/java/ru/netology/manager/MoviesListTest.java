package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.AddMovie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviesListTest {
    private MovieManager manager = new MovieManager();
    private AddMovie first = new AddMovie(1, "Film", "url", 1 / 1 / 2000, "Other");
    private AddMovie second = new AddMovie(2, "Film", "url", 1 / 1 / 2000, "Other");
    private AddMovie third = new AddMovie(3, "Film", "url", 1 / 1 / 2000, "Other");
    private AddMovie fourth = new AddMovie(4, "Film", "url", 1 / 1 / 2000, "Other");
    private AddMovie fifth = new AddMovie(5, "Film", "url", 1 / 1 / 2000, "Other");
    private AddMovie sixth = new AddMovie(6, "Film", "url", 1 / 1 / 2000, "Other");
    private AddMovie seventh = new AddMovie(7, "Film", "url", 1 / 1 / 2000, "Other");
    private AddMovie eighth = new AddMovie(8, "Film", "url", 1 / 1 / 2000, "Other");
    private AddMovie ninth = new AddMovie(9, "Film", "url", 1 / 1 / 2000, "Other");
    private AddMovie tenth = new AddMovie(10, "Film", "url", 1 / 1 / 2000, "Other");
    private AddMovie eleventh = new AddMovie(11, "Film", "url", 1 / 1 / 2000, "Other");

    @Test
    void shouldAddMovie() {
        AddMovie[] expected = new AddMovie[]{first};
        manager.addToList(first);

        assertArrayEquals(expected, manager.MoviesFeed());
    }

    @Test
    void AddToListTest() {
        AddMovie[] expected = new AddMovie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        manager.addToList(first);
        manager.addToList(second);
        manager.addToList(third);
        manager.addToList(fourth);
        manager.addToList(fifth);
        manager.addToList(sixth);
        manager.addToList(seventh);
        manager.addToList(eighth);
        manager.addToList(ninth);
        manager.addToList(tenth);

        assertArrayEquals(expected, manager.MoviesFeed());
    }

    @Test
    public void moviesListLess10() {
        manager.addToList(first);
        manager.addToList(second);
        manager.addToList(third);
        manager.addToList(fourth);
        manager.addToList(fifth);
        manager.addToList(sixth);
        manager.addToList(seventh);
        manager.addToList(eighth);
        manager.addToList(ninth);
        AddMovie[] actual = manager.MoviesFeed();
        AddMovie[] expected = new AddMovie[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void AddToListTestMoreThen10() {
        AddMovie[] expected = new AddMovie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        manager.addToList(first);
        manager.addToList(second);
        manager.addToList(third);
        manager.addToList(fourth);
        manager.addToList(fifth);
        manager.addToList(sixth);
        manager.addToList(seventh);
        manager.addToList(eighth);
        manager.addToList(ninth);
        manager.addToList(tenth);
        manager.addToList(eleventh);

        assertArrayEquals(expected, manager.MoviesFeed());
    }

    @Test
    void shouldShowMoviesInConstructor() {
        MovieManager manager = new MovieManager(4);
        AddMovie[] expected = new AddMovie[]{fourth, third, second, first};
        manager.addToList(first);
        manager.addToList(second);
        manager.addToList(third);
        manager.addToList(fourth);

        assertArrayEquals(expected, manager.MoviesFeed());
    }

    @Test
    void shouldReturnZeroMovies() {
        MovieManager manager = new MovieManager(0);
        AddMovie[] expected = new AddMovie[0];
        manager.addToList(first);
        manager.addToList(second);

        assertArrayEquals(expected, manager.MoviesFeed());
    }

}