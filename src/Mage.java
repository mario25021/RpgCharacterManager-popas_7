public class Mage extends Character implements SpecialAbility{
    int mana;

    Mage(String name, int level, double health, double attackPower, int mana)
    {
        super(name,level,health,attackPower);
        this.mana=mana;
    }

    @Override
    void attack()
    {
        System.out.println("Mage attacks with a magic stick");
    }
    @Override
    void displayStats()
    {
        super.displayStats();
        System.out.println(mana);
    }

    @Override
    public void SpecialAttack()
    {
        System.out.println("Mage foloseste Giant Meteor");
    }

}
