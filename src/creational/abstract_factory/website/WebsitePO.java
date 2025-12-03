package creational.abstract_factory.website;

import design_patterns.abstract_factory.ProductOwner;

public class WebsitePO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Website PO manage product");
    }
}
