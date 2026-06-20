package basics;

import java.util.List;

public interface Musician extends Artist {
    List<String> getSongs();
    void setSongs(List<String> songs);

    String getGenre();
    void setGenre(String genre);
}
