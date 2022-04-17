package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.netology.MovieItem;

@AllArgsConstructor
@Data
public class MovieManager {
    MovieItem[] items = new MovieItem[0];
    int newItemsLength = 10;

    public MovieManager(int newItemsLength) {
        this.newItemsLength = newItemsLength;
    }
    public MovieManager() {
    }
    public void save(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }
    public MovieItem[] showAll() {
        return items;
    }
    public MovieItem[] showAllReverse() {
        int resultLength = items.length;
        if (resultLength > newItemsLength) {
            resultLength = newItemsLength;
        } else {
            resultLength = items.length;
        }
        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
