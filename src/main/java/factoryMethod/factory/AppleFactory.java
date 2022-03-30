package factoryMethod.factory;

import factoryMethod.phone.IPhone;
import factoryMethod.phone.Phone;

public class AppleFactory extends PhoneFactory {

    @Override
    protected Phone makePhone(String color, int capacity) {
        IPhone iPhone;

        if (capacity >= 64)
            iPhone = new IPhone(color, capacity, true);
        else
            iPhone = new IPhone(color, capacity, false);

        return iPhone;
    }

}
