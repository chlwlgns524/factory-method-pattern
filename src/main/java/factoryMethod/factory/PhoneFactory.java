package factoryMethod.factory;

import factoryMethod.exception.DefectiveProductException;
import factoryMethod.phone.Phone;

public abstract class PhoneFactory {

    public Phone getPhone(String color, int capacity) {
        Phone phone = makePhone(color, capacity);

        phone.test();

        if (!phone.isDisFunctional())
            pack();
        else
            throw new DefectiveProductException("내부 문제가 발생하였습니다.");

        return phone;
    }

    protected abstract Phone makePhone(String color, int capacity);

    private void pack() {
        System.out.println("포장이 완료되었습니다.");
    }

}
