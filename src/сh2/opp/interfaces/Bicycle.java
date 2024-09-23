package сh2.opp.interfaces;

interface Bicycle {
    //  пидалнинг айланиш частатаси
    void changeCadence(int newValue);

    // скрост муривати
    void changeGear(int newValue);

    // тезлик
    void speedUp(int increment);

    // тормоз
    void applyBrakes(int decrement);
}
