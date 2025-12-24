class Temperatures {
    //@ ensures \result.length == 3;
    //@ ensures \result[0] == celsius;
    //@ ensures \result[1] == celsius + 273.15;
    //@ ensures \result[2] == celsius * 1.80 + 32.00;
    public /*@ pure @*/ double[] convertTemperature(double celsius) {
        return new double[]{celsius, celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
