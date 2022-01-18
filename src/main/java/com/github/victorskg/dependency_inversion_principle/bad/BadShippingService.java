package main.java.com.github.victorskg.dependency_inversion_principle.bad;

import main.java.com.github.victorskg.dependency_inversion_principle.ShippingProduct;

public class BadShippingService {

    private final String SEDEX ;
    private final String AZUL_EXPRESS;
    private final AzulShippingService azulService;
    private final SedexShippingService sedexService;

    // No BadShippingService temos como dependência todos os tipos de envio, mesmo que durante toda a vida do sistema
    // só utilizemos um tipo de serviço. Além disso, para adicionarmos um novo serviço de envio, por exemplo o TNT
    // Express, precisamos modificar o método de send adicionando uma nova condicional e ainda corremos o risco de
    // recebermos como parâmetro um método de envio que não está mapeado, forçando o nosso if a tratar no else este caso
    public BadShippingService(AzulShippingService azulService, SedexShippingService sedexService) {
        this.SEDEX = "SEDEX";
        this.AZUL_EXPRESS = "Azul Express";
        this.azulService = azulService;
        this.sedexService = sedexService;
    }

    public void send(ShippingProduct shippingProduct, String selectedShippingService) throws IllegalAccessException {
        if (SEDEX.equals(selectedShippingService)) {
            sedexService.send(shippingProduct);
        } else if (AZUL_EXPRESS.equals(selectedShippingService)) {
            azulService.send(shippingProduct);
        } else {
            throw new IllegalAccessException("O método de envio selecionado é inválido.");
        }
    }

}
