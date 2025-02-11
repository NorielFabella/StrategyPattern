public class GameApp
{
    public static void main(String[] args)
    {

    Character character = new Character(new Knight());
    System.out.println(character.AttackStrategy());
    System.out.println(character.DefendStrategy());

    Character character2 = new Character(new Archer());
    System.out.println(character2.AttackStrategy());
    System.out.println(character2.DefendStrategy());

    Character character3 = new Character(new Wizard());
    System.out.println(character3.AttackStrategy());
    System.out.println(character3.DefendStrategy());


}
}