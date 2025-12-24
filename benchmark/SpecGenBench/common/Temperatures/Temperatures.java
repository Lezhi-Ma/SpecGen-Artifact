class Temperatures {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius, celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
