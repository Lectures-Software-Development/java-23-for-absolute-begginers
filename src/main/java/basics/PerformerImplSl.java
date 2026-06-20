package basics;

import java.util.List;

public final class PerformerImplSl extends HumanSealed implements Actor, Musician {
    private String actingSchool;
    private String musicSchool;
    private String genre;

    public PerformerImplSl(String name, int age, float height, Gender gender) {
        super(name, age,height,gender);
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
}
