package basics;

import java.util.Date;

public interface Artist {
    int LIFESPAN = 100;
    String getSchool();
    void setSchool(String school);

    default boolean isCreative(){
        explain();
        return true;
    };

    private void explain() {
        log();
        System.out.println("A true artist has a creative nature");;
    }

    private static void log() {
        IO.println("[LOG] checked creativity on: " + new Date());
    }

    public static String capitalize(String name) {
        char c = name.charAt(0);

        if (Character.isLowerCase(c)) {
            return Character.toUpperCase(c) + name.substring(1);
        }
        return name;
    }
}
