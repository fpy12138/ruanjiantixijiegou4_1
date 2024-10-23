package service.test;

import service.TaxCalculator;

import javax.xml.ws.Endpoint;

public class TaxServiceTestServer {
    public static void main(String[] args) {
        Object implementor = new TaxCalculator();
        String address = "http://localhost:9090/webservice2_war/tax";
        Endpoint.publish(address, implementor);
    }
}

