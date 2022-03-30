package factoryMethod;

import factoryMethod.factory.AppleFactory;
import factoryMethod.factory.PhoneFactory;
import factoryMethod.factory.SamsungFactory;
import factoryMethod.phone.Phone;

public class Main {

    public static void main(String[] args) {
        PhoneFactory factory = new AppleFactory();

        Phone iPhone1 = factory.getPhone("green", 64);
        Phone iPhone2 = factory.getPhone("red", 32);

        System.out.println(iPhone1);
        System.out.println(iPhone2);

        factory = new SamsungFactory();

        Phone galaxy1 = factory.getPhone("white", 16);
        Phone galaxy2 = factory.getPhone("black", 32);

        System.out.println(galaxy1);
        System.out.println(galaxy2);

        Phone defectiveGalaxy = factory.getPhone("white", -1);

    }

}
