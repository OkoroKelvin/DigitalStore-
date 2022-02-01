package SetVsMap;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> marvel_movies = new LinkedHashSet<String>();
        marvel_movies.add("Captain Marvel");
        marvel_movies.add("Thor Ragnarok");
        marvel_movies.add("Captain America, the winter soldier");
        marvel_movies.add("Ant-Man and the Wasp");

        System.out.println(marvel_movies);
    }
}
