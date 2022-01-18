package main.java.com.github.victorskg.dependency_inversion_principle.good;

import main.java.com.github.victorskg.dependency_inversion_principle.ShippingProduct;

public interface ShippingService {
    void send(final ShippingProduct shippingProduct);
}
