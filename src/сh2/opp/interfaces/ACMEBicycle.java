package сh2.opp.interfaces;

class ACMEBicycle implements Bicycle{
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // Копидятор сиздан, хамма методлани
    // changeCadence, changeGear, speedUp, and applyBrakes
    // шу классда реализация килишни талаб килади. Компиляцида хатолик беради
    // агар хамма методлар шу классда реализация килинмаган булса

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
