public class Archer extends Character implements SpecialAbility{

    int arrows;

    Archer(String name, int level, double health, double attackPower, int arrows)
    {
        super(name,level,health,attackPower);
        this.arrows=arrows;
    }
    @Override
    void attack()
    {
        System.out.println("Archer attacks with a bow");
    }
    @Override
    void displayStats()
    {
        super.displayStats();
        System.out.println(arrows);
    }


    @Override
    public void SpecialAttack()
    {
        System.out.println("Archer foloseste Golden arrow");
    }
}
