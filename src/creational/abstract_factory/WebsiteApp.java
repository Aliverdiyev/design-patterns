package creational.abstract_factory;

import creational.abstract_factory.website.WebsiteTeamFactory;

public class WebsiteApp {
    static void main() {
        var projectTeamFactory = new WebsiteTeamFactory();
        var developer = projectTeamFactory.getDeveloper();
        var tester = projectTeamFactory.getTester();
        var po = projectTeamFactory.getProductOwner();

        System.out.println("Build website");
        developer.writeCode();
        tester.testCode();
        po.manageProduct();
    }
}