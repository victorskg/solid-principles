package main.java.com.github.victorskg.dependency_inversion_principle.good;

import main.java.com.github.victorskg.dependency_inversion_principle.ShippingProduct;

public class SedexShippingService implements ShippingService {

    @Override
    public void send(final ShippingProduct shippingProduct) {
        // Método com regras de negócio referente ao envio do produto a partir do serviço de envio Sedex
        System.out.println("Enviado por Sedex!");
    }

}
