package basics;

import java.util.List;

public class PerformerImpl extends Human implements Actor, Musician {
    private String actingSchool;
    private String genre;

    public PerformerImpl(String name, int age, float height, Gender gender) {
        super(name, age,height,gender);
    }

    public PerformerImpl(String name, int age, Gender gender, String actingSchool, String genre) {
        super(name, age, gender);
        this.actingSchool = actingSchool;
        this.genre = genre;
    }

    public PerformerImpl(String name, int age, float height, Gender gender, String actingSchool, String genre) {
        super(name, age, height, gender);
        this.actingSchool = actingSchool;
        this.genre = genre;
    }

    @Override
    public int getTimeToLive() {
        return (LIFESPAN - getAge()) / 2;
    }

    @Override
    public String getSchool() {
        return actingSchool;
    }

    @Override
    public void setSchool(String actingSchool) {
        this.actingSchool = actingSchool;
    }

    @Override
    public List<String> getFilms() {
        return List.of();
    }

    @Override
    public void setFilms(List<String> films) {

    }

    @Override
    public void addFilm(String filmName) {

    }

    @Override
    public List<String> getSongs() {
        return List.of();
    }

    @Override
    public void setSongs(List<String> songs) {

    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "PerformerImpl{" +
            "actingSchool='" + actingSchool + '\'' +
            ", genre='" + genre + '\'' +
            '}';
    }
}
