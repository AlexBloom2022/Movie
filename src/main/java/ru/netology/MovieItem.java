package ru.netology;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieItem {

    private int id;
    private String movieName;
    private String summary;
    private int count;

    public MovieItem(int id, String movieName, String summary, int count) {
        this.id = id;
        this.movieName = movieName;
        this.summary = summary;
        this.count = count;
    }

}