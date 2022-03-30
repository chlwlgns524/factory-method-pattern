package factoryMethod.phone;

public class IPhone extends Phone {

    private static int producedNumber = 0;

    private int id;
    private boolean hasAirPod;

    public IPhone(String color, int capacity, boolean hasAirPod) {
        super(color, capacity);
        this.hasAirPod = hasAirPod;
        id = ++producedNumber;
    }

    @Override
    public void test() {
        if (id > 0 && color != null && capacity > 0)
            disFunctional = false;
        else
            disFunctional = true;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "id=" + id +
                ", hasAirPod=" + hasAirPod +
                ", color='" + color + '\'' +
                ", capacity=" + capacity +
                ", disFunctional=" + disFunctional +
                '}';
    }

}
