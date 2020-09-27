package nl.nickthijssen.rest.client;

public class CalculatorClientExample {

    public static void main(String[] args) {

        //ICalculator c = new MyCalculator();
        //ICalculator c = new RESTNewtonAPICalculator();
        ICalculator c = new RESTLocalCalculator();

        System.out.println(c.abs(-123));
        System.out.println(c.abs(1));

    }

}
