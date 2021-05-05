package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.AddMovie;

@NoArgsConstructor
public class MovieManager {
    private int feedLimit = 10;
    private AddMovie[] movies = new AddMovie[0];

    public MovieManager(int feedLimit) {
        this.feedLimit = feedLimit;
    }

    public void addToList(AddMovie movie) {
        int length = movies.length + 1;
        AddMovie[] tmp = new AddMovie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public AddMovie[] MoviesFeed() {
        int length = feedLimit;
        if (feedLimit > movies.length) {
            length = movies.length;

        }

        AddMovie[] result = new AddMovie[length];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}

