package overRiding;

public class SubClass extends SuperClass {

    String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
