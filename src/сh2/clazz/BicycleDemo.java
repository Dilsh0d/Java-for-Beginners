package сh2.clazz;

public class BicycleDemo {

    public static void main(String[] args) {
        // Иккита бошка объект яратилмолда
        // Bicycle объектлари
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Уларнинг методлари чакириляпти
        // тепадига объектларинг
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
