package factoryMethod.phone;

public class Galaxy extends Phone {

    private static int producedNumber = 0;

    private int id;
    private int guaranteeYear;

    public Galaxy(String color, int capacity, int guaranteeYear) {
        super(color, capacity);
        id = ++producedNumber;
        this.guaranteeYear = guaranteeYear;
    }

    @Override
    public void test() {
        if (id > 0 && color != null && capacity > 0 && guaranteeYear > 0)
            disFunctional = false;
        else
            disFunctional = true;
    }

    @Override
    public String toString() {
        return "Galaxy{" +
                "id=" + id +
                ", guaranteeYear=" + guaranteeYear +
                ", color='" + color + '\'' +
                ", capacity=" + capacity +
                ", disFunctional=" + disFunctional +
                '}';
    }

}
