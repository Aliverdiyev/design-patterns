package creational.abstract_factory.banking;

import design_patterns.abstract_factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write code");
    }
}
