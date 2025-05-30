package ru.netology.javaqa.javaqamvn.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void shouldFindAll() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        String[] expected = {"Film 1", "Film 2", "Film 3" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        String[] expected = {"Film 3", "Film 2", "Film 1" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLimit() {
        FilmManager manager = new FilmManager(6);
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        String[] expected = {"Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
