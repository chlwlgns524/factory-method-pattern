package factoryMethod.phone;

public abstract class Phone {

    protected String color;
    protected int capacity;
    protected boolean disFunctional;

    public Phone(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
    }

    public abstract void test();

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isDisFunctional() {
        return disFunctional;
    }

}
