public class Whale implements Creature
{
    public int whaleStreak = 0;

    public String getName()
    {
        return "Whale";
    }

    public void talk()
    {
        System.out.println("Heeeeeeeeeeeeeellllllllllllllloooooooo");
    }

    public void move(String where)
    {
        System.out.println("The " + this.getName() + " charges to " + where);
    }

    public int getHealth()
    {
        return 10;
    }

    public int getDamage()
    {
        return 2;
    }

    public int getWinStreak()
    {
        return this.whaleStreak;
    }

    public void addToWinStreak()
    {
        this.whaleStreak++;
    }
}