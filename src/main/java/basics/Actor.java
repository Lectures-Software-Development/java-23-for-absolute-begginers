package basics;

import java.util.List;

interface Actor extends Artist {
    String getSchool();
    void setSchool(String actingSchool);

    List<String> getFilms();
    void setFilms(List<String> films);

    void addFilm(String filmName);
}
