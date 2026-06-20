package data_types.strings;

import basics.Gender;
import basics.Musician;
import basics.MusicianImpl;

import java.text.MessageFormat;
import java.util.List;



public class PsuedoTemplatesDemo {
    public static void runPsuedoTemplatesDemo() {
        var bryce = new MusicianImpl(
            "Bryce",
            38,
            1.72f,
            Gender.MALE,
            "High School Rock",
            "Rock",
            List.of("Song 1", "Song 2", "Song 3")
        );

        // hard to read
        // concatenation  using +
        var introduction = "My name is " + bryce.getName() + " and I am a " + bryce.getGenre() + " musician. I have been playing music for " + bryce.getAge() + " years and I have a height of " + bryce.getHeight() + " meters.";
        IO.println(introduction);

        /**\
         * Verbose, hard to read as well
         * concatenaytion using StringBuilder
         * similar approach to using StringBuffer
         **/

        introduction = new StringBuilder("My name is ")
            .append(bryce.getName())
            .append(" and I am a ")
            .append(bryce.getGenre())
            .append(" musician. I have been playing music for ")
            .append(bryce.getAge())
            .append(" years and I have a height of ")
            .append(bryce.getHeight())
            .append(" meters.")
            .toString();

        IO.println(introduction);

        // number of arguments mismatch
        // Concatenation using String.format
        introduction = String.format("My name is %s and I am a %s musician. I have been playing music for %d years and I have a height of %.2f meters.", bryce.getName(), bryce.getGenre(), bryce.getAge(), bryce.getHeight());
        IO.println(introduction);

        // number of arguments mismatch
        // concatenation using MessageFormat.format
        introduction = MessageFormat.format("My name is {0} and I am a {1} musician. I have been playing music for {2} years and I have a height of {3} meters.", bryce.getName(), bryce.getGenre(), bryce.getAge(), bryce.getHeight());
        IO.println(introduction);

        // Java 15
        //concatenation using String#formated
        introduction = introduction.formatted(bryce.getName(), bryce.getAge());
        IO.println("[using 'String#formatted(...)']: ->" + introduction);

        String name = "Alice";
        int age = 30;
    }
}
