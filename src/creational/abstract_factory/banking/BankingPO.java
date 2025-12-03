package creational.abstract_factory.banking;


import design_patterns.abstract_factory.ProductOwner;

public class BankingPO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Banking PO manage product");
    }
}
