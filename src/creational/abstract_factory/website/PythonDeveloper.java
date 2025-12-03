package creational.abstract_factory.website;

import design_patterns.abstract_factory.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Python developer write code");
    }
}
