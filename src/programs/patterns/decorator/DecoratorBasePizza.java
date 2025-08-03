package programs.patterns.decorator;


public abstract class DecoratorBasePizza {
    protected double baseCost = 20;

    abstract void updateCost(double newCost);
}
