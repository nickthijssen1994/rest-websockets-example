package nl.fhict.se3.services.rest.client;

public class MyCalculator implements ICalculator {

    @Override
    public int abs(int value) {
        return (value < 0)? -value : value;
    }
}
