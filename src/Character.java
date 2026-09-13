public abstract class Character implements SpecialAbility{

    String name;
    int level;
    double health;
    double attackPower;

    Character(String name, int level, double health, double attackPower)
    {
        this.name=name;
        this.level=level;
        this.health=health;
        this.attackPower=attackPower;}

    void displayStats()
    {
        System.out.println(name);
        System.out.println(level);
        System.out.println(health);
        System.out.println(attackPower);
    }
    void schimbareStats()
    {
        name= Main.scanner.nextLine();
    }
    @Override
    public void SpecialAttack()
    {
        System.out.println("special attack!");
    }


    abstract void attack();


}
