import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void ShouldTestThreeFilm() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");


        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldTestOneFilm() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");


        String[] actual = manager.findAll();
        String[] expected = {"Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldTestZero() {
        MovieManager manager = new MovieManager();


        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldTestFiveFilm() {
        MovieManager manager = new MovieManager();


        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] actual = manager.findLast();
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldTestTwoFilm() {
        MovieManager manager = new MovieManager();


        manager.addMovie("Film 1");
        manager.addMovie("Film 2");


        String[] actual = manager.findLast();
        String[] expected = {"Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldTestOneLastFilm() {
        MovieManager manager = new MovieManager();


        manager.addMovie("Film 1");



        String[] actual = manager.findLast();
        String[] expected = {"Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

}
