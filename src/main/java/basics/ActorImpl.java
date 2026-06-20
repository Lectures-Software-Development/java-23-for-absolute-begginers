package basics;

import java.util.List;

public class ActorImpl extends Human implements Actor {
    private String actingSchool;
    private List<String> films;

    public ActorImpl(String name, int age, float height, Gender gender, List<String> films, String actingSchool) {
        super(name, age, height, gender);
        this.films = films;
        this.actingSchool = actingSchool;
    }

    @Override
    public int getTimeToLive() {
        return (LIFESPAN - getAge()) / 2;
    }


    public void setFilms(List<String> films) {
        this.films = films;
    }

    @Override
    public List<String> getFilms() {
        return films;
    }

    @Override
    public void addFilm(String filmName) {
        films.add(filmName);
    }

    public String getSchool() {
        return actingSchool;
    }

    public void setSchool(String actingSchool) {
        this.actingSchool = actingSchool;
    }
}
