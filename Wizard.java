public class Wizard implements Strategy
{
    public String AttackStrategy()
    {
        return "Wizard casts a spell!";
    }

    public String DefendStrategy()
    {
        return "Creating a magic barrier for defense!";
    }
}