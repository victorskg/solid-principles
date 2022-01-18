package main.java.com.github.victorskg.dependency_inversion_principle;

import main.java.com.github.victorskg.dependency_inversion_principle.bad.AzulShippingService;
import main.java.com.github.victorskg.dependency_inversion_principle.bad.BadShippingService;
import main.java.com.github.victorskg.dependency_inversion_principle.bad.SedexShippingService;
import main.java.com.github.victorskg.dependency_inversion_principle.good.GoodShippingService;

public class DependencyInversionPrinciple {

    public static void main(String[] args) throws IllegalAccessException {
        var azulServuce = new AzulShippingService();
        var sedexService = new SedexShippingService();
        var shippingProduct = new ShippingProduct("PS5", 1, "João Victor", "Rua Teodoro de Castro");

        // Bad Code
        var badShippingService = new BadShippingService(azulServuce, sedexService);
        badShippingService.send(shippingProduct, "Azul Express");
        badShippingService.send(shippingProduct, "SEDEX");

        // Exception
        // badShippingService.send(shippingProduct, "TNT Express");

        // Good Code (Só preciso passar como parâmetro o tipo de serviço que irei utilizar)
        var goodShippingService = new GoodShippingService(new main.java.com.github.victorskg.dependency_inversion_principle.good.SedexShippingService());
        goodShippingService.send(shippingProduct);
    }

}
