class ConvertToKelvin {
    //@ ensures \result == celsius + 273.15;
    public double convertTemperature(double celsius) {
        return celsius + 273.15;
    }
}
