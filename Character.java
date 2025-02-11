public class Character
{
    private Strategy strategy;

    public Character(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public String AttackStrategy()
    {
        return strategy.AttackStrategy();
    }

    public String DefendStrategy()
    {
        return strategy.DefendStrategy();
    }

}