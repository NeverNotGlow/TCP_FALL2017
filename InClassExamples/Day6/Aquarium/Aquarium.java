import java.lang.Exception;

public class Aquarium
{
    public static void main(String[] args)
    {
        Creature a = getRandomCreature();
        Creature b = getRandomCreature();

        while(true)
        {
            Creature winner = fight(a, b);
            
            System.out.println("--------------\n");
            delay();

            a = winner;
            b = getRandomCreature();
        }
    }

    public static Creature getRandomCreature()
    {
        int x = (int)(5 * Math.random());

        if(x == 0)
        {
            return new Fish();
        }
        else if(x == 1)
        {
            return new Octo();
        }
        else if(x == 2)
        {
            return new SwordFish();
        }
        else if(x == 3)
        {
            return new TrainedSwordFish();
        }
        else
        {
            return new Whale();
        }
    }

    public static Creature fight(Creature a, Creature b)
    {
        System.out.println(a.getName() + " vs " + b.getName());

        delay();
        a.move("Volcano");
        a.talk();

        delay();
        b.move("Volcano");
        b.talk();

        delay();

        int aHealth = a.getHealth();
        int bHealth = b.getHealth();

        while(aHealth > 0 && bHealth > 0)
        {
            int aAttck = (int)(a.getDamage() * Math.random() + 1);
            int bAttck = (int)(b.getDamage() * Math.random() + 1);

            aHealth = aHealth - bAttck;
            bHealth = bHealth - aAttck;

            System.out.println(a.getName() + " does " + aAttck + " damage to " + b.getName() + ". Now it has " +  bHealth + " health!");
            delay();
            
            if(bHealth <= 0)
            {
                break;
            }

            System.out.println(b.getName() + " does " + bAttck + " damage to " + a.getName() + ". Now it has " +  aHealth + " health!");
            delay();
        }

        Creature winner, loser;

        if(bHealth <= 0) //b has died
        {
            winner = a;
            loser = b;
        }
        else
        {
            winner = b;
            loser = a;
        }
         
        System.out.println(loser.getName() + " has fainted! " + winner.getName() + " wins!");
        winner.addToWinStreak();

        delay();

        System.out.println(winner.getName() + " is on a " + winner.getWinStreak() + " win streak!");
        return winner;
    }


    public static void delay()
    {
        try
        {
            Thread.sleep(3000);
        }
        catch(Exception e)
        {}
    }
}