package main.java.com.github.victorskg.dependency_inversion_principle.bad;

import main.java.com.github.victorskg.dependency_inversion_principle.ShippingProduct;

public class SedexShippingService {

    public void send(ShippingProduct shippingProduct) {
        // Método com regras de negócio referente ao envio do produto a partir do serviço de envio Sedex
        System.out.println("Enviado por Sedex!");
    }
}
