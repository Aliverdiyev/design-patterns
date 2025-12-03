package creational.abstract_factory.website;

import design_patterns.abstract_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester test code");
    }
}
