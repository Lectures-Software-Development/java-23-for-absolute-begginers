package basics;


public record HumanRecord(String name, int age, float height, Gender gender) {
    public static final int LIFESPAN = 100;

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
