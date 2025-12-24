class ConvertTemperature {
    //@ ensures \result.length == 2;
    //@ ensures \result[0] == celsius + 273.15;
    //@ ensures \result[1] == celsius * 1.80 + 32.00;
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
