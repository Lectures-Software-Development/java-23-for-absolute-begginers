package basics;

public sealed class HumanSealed permits PerformerImplSl {

    protected String name;
    protected int age;
    protected float height;
    protected Gender gender;

    public HumanSealed(String name, int age, float height, Gender gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }
}
