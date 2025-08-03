package programs.patterns.decorator;

public class DecoratorFarmHousePizza extends DecoratorBasePizza {

    private double pizzaCost;

    public DecoratorFarmHousePizza() {
        this.pizzaCost = super.baseCost;
    }

    @Override
    public void updateCost(double newCost) {
        pizzaCost = super.baseCost + newCost;
    }

    public double getPizzaCost() {
        return pizzaCost;
    }

    public void updateBaseCost(double updatedCost) {
        super.baseCost = updatedCost;
    }
}
