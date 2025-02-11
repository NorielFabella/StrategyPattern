public class Archer implements Strategy
{
    @Override
    public String AttackStrategy() 
    {
        return "Archer shoots an arrow!";
    }

    public String DefendStrategy()
    {
        return "Dodging to avoid an attack!";
    }
}