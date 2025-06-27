package parte9.strategy;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        decoy.display();
        decoy.performFly();
        decoy.performQuack();

        // Cambiar comportamiento en tiempo de ejecución
        System.out.println("\nChanging rubber duck's fly behavior at runtime:");
        rubber.setFlyBehavior(new FlyWithWings());
        rubber.performFly();
    }
}