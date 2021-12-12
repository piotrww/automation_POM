package chaining;

public class SkiAthlete {
    String name;
    int age;

    public SkiAthlete setName(String name) {
        this.name = name;
        return this;
    }

    public SkiAthlete setAge(int age) {
        this.age = age;
        return this;

    }

    public void printPersonDetails() {
        System.out.println("Name of athlete: " + name + ", age: " + age);
    }


}
