package creational.abstract_factory;

import creational.abstract_factory.banking.BankingTeamFactory;

public class BankingApp {
    static void main() {
        var projectTeamFactory = new BankingTeamFactory();
        var developer = projectTeamFactory.getDeveloper();
        var tester = projectTeamFactory.getTester();
        var po = projectTeamFactory.getProductOwner();

        System.out.println("Building banking app");
        developer.writeCode();
        tester.testCode();
        po.manageProduct();
    }
}