package decorator;

import service.Component;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.print("A ");
        super.operation();
    }
}
