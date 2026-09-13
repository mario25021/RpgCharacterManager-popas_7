public class Warrior extends Character implements SpecialAbility{
    int armor;


    Warrior(String name, int level, double health, double attackPower, int armor)
    {
        super(name,level,health,attackPower);
        this.armor=armor;
    }

    @Override
    void attack()
    {
        System.out.println("Warrior attacks with a sword");
    }

    @Override
    void displayStats()
    {
        super.displayStats();
        System.out.println(armor);
    }

    @Override
    public void SpecialAttack()
    {
        System.out.println("Warrior foloseste Berserker rage!");
    }



}
