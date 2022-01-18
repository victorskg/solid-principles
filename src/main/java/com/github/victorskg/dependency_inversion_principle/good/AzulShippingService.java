package main.java.com.github.victorskg.dependency_inversion_principle.good;

import main.java.com.github.victorskg.dependency_inversion_principle.ShippingProduct;

public class AzulShippingService implements ShippingService {

    @Override
    public void send(final ShippingProduct shippingProduct) {
        // Método com regras de negócio referente ao envio do produto a partir do serviço de envio da Azul Express
        System.out.println("Enviado por Azul Express!");
    }

}
