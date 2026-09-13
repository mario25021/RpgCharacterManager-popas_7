import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Warrior warrior = new Warrior("RAZBOINIC", 10, 2, 4, 10);
        Mage mage= new Mage("magician", 20, 4, 8, 20);
        Archer archer= new Archer("Archer", 30, 10, 10,10);
        Character[] characters=new Character[10];
        characters[0]=warrior;
        characters[1]=mage;
        characters[2]=archer;
        int numarPersonaje=3;


        String iesi="nu";

        while(iesi.equals("nu")) {
            meniu();
            int alegere = scanner.nextInt();
            switch (alegere) {
                case 1 -> afisare(characters,numarPersonaje);

                case 2 -> numarPersonaje=personajNou(characters,numarPersonaje);


                case 3 -> {
                    System.out.println("Cu ce personaj vrei sa ataci?\n 1.Warrior\n 2.Mage\n 3.Archer");
                    int alegeAtacantul = scanner.nextInt();
                    attack(alegeAtacantul, characters,numarPersonaje);
                }

                case 4 -> {
                    System.out.println("Ale carui statistici vrei sa le vezi?");
                    int alegeAtacantul = scanner.nextInt();
                    characters[alegeAtacantul-1].displayStats();

                }

                case 5->{
                    System.out.println("A carui special attack vrei sa folosesti?");
                    int alegere3=scanner.nextInt();
                    characters[alegere3-1].SpecialAttack();
                }

                case 6 -> {
                    System.out.println("Ce caracter cauti?");
                    scanner.nextLine();
                    String caracter = scanner.nextLine();
                    gasit(caracter, characters,numarPersonaje);
                }

                case 7->{
                    iesi="da";
                    System.out.println("La revedere");
                }

            }
        }

    }

    static void afisare(Character[] characters,int numarPersonaje)
    {
        for(int i=0;i<numarPersonaje;i++)
        {
            characters[i].displayStats();
        }
    }


    static void meniu()
    {
        System.out.println("===== RPG CHARACTER MANAGER =====\n"+

        "1. Afiseaza personajele\n"+
        "2. Creeaza personaj\n"+
        "3. Ataca\n"+
        "4. Afiseaza statisticile\n"+
        "5. Foloseste abilitatea speciala\n"+
        "6. Cauta personaj\n"+
        "7. Exit\n"+

        "Alege o optiune:");
    }

    static void attack(int alegeAtacantul,Character[] characters,int numarPersonaje)
    {
        for(int i=0;i<numarPersonaje;i++) {
            if (alegeAtacantul == 1) {
                characters[0].attack();
                break;
            } else if (alegeAtacantul==2) {
                characters[1].attack();
                break;
            } else if (alegeAtacantul==3)
            {
                characters[2].attack();
                break;
            }
            else
            {
                System.out.println("nu e valabil");
            }
        }
    }

    static void gasit(String caracter,Character[] characters,int numarPersonaje)
    {
        for(int i=0;i< numarPersonaje;i++)
        {
            if(caracter.equalsIgnoreCase(characters[i].name))
            {
                System.out.println("Gasit");
                return;
            }

        }
        System.out.println("Personajul nu exista");
    }

    static int personajNou(Character[] characters,int numarPersonaje)
    {
        System.out.println("ce tip de personaj vrei sa faci?\n 1.Warrior\n 2.Mage\n 3.Archer\n");
        int alegere2=scanner.nextInt();
        System.out.println();
        switch (alegere2) {

            case 1 -> {
                System.out.println("Nume:");
            scanner.nextLine();

            String name = scanner.nextLine();

            System.out.println("Level:");
            int level = scanner.nextInt();

            System.out.println("Health:");
            double health = scanner.nextDouble();

            System.out.println("Attack power:");
            double attackPower = scanner.nextDouble();

            System.out.println("Armor:");
            int armor = scanner.nextInt();

            characters[numarPersonaje]=new Warrior(name,level,health,attackPower,armor);
                numarPersonaje++;
            }

            case 2->{
                System.out.println("Nume:");
                scanner.nextLine();

                String name = scanner.nextLine();

                System.out.println("Level:");
                int level = scanner.nextInt();

                System.out.println("Health:");
                double health = scanner.nextDouble();

                System.out.println("Attack power:");
                double attackPower = scanner.nextDouble();

                System.out.println("Mana:");
                int armor = scanner.nextInt();

                characters[numarPersonaje]=new Mage(name,level,health,attackPower,armor);
                numarPersonaje++;
            }

            case 3->{
                System.out.println("Nume:");
                scanner.nextLine();

                String name = scanner.nextLine();

                System.out.println("Level:");
                int level = scanner.nextInt();

                System.out.println("Health:");
                double health = scanner.nextDouble();

                System.out.println("Attack power:");
                double attackPower = scanner.nextDouble();

                System.out.println("Mana:");
                int armor = scanner.nextInt();

                characters[numarPersonaje]=new Archer(name,level,health,attackPower,armor);
                numarPersonaje++;
            }
            default -> System.out.println("nu exista clasa");
        }

        return numarPersonaje;
    }

}
