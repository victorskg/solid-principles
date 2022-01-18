package main.java.com.github.victorskg.dependency_inversion_principle.good;

import main.java.com.github.victorskg.dependency_inversion_principle.ShippingProduct;

public class GoodShippingService {

    private final ShippingService shippingService;

    // Na maneira correta de se implementar, dependemos de uma abstração de interface, invés da implementação em sí.
    // Desta forma, quem está utilizando o serviço é responsável por fornecer uma implementação concreta para a interface
    // de envio, que serve como um contrato. Além disso, para adicionarmos um novo tipo de envio, não precisamos modificar
    // nenhum código existente, sendo necessária apenas a codificação da nova implementação
    public GoodShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void send(final ShippingProduct shippingProduct) {
        shippingService.send(shippingProduct);
    }

}
