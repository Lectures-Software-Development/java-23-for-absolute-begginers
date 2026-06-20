package basics;

import java.util.List;

public class MusicianImpl extends Human implements Musician {
    private String school;
    private String genre;
    private List<String> songs;

    public MusicianImpl(
        String name,
        int age,
        float height,
        Gender gender,
        String school,
        String genre,
        List<String> songs
    ) {
        super(name, age, height, gender);
        this.genre = genre;
        this.school = school;
        this.songs = songs;
    }

    @Override
    public int getTimeToLive() {
        return (LIFESPAN - getAge()) / 2;
    }

    public String getCapitalizedName() {
        return Artist.capitalize(this.getName());
    }

    @Override
    public String getSchool() {
        return this.school;
    }

    @Override
    public void setSchool(String musicSchool) {
        this.school = musicSchool;
    }

    @Override
    public List<String> getSongs() {
        return this.songs;
    }

    @Override
    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    @Override
    public String getGenre() {
        return this.genre;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
