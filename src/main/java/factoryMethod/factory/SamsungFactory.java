package factoryMethod.factory;

import factoryMethod.phone.Galaxy;
import factoryMethod.phone.Phone;

public class SamsungFactory extends PhoneFactory {

    @Override
    protected Phone makePhone(String color, int capacity) {
        Galaxy galaxy;

        if (capacity >= 32)
            galaxy = new Galaxy(color, capacity, 2);
        else
            galaxy = new Galaxy(color, capacity, 1);

        return galaxy;
    }

}
