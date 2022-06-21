public class Context {
    private Strategy strategy;

    public Context() {}

    // Set new strategy
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void cookStrategy() {
        strategy.cook();
    }
}

