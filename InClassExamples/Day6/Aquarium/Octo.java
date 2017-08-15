public class Octo implements Creature
{
    public int streak = 0;

    public String getName()
    {
        return "Octopus";
    }

    public int getHealth()
    {
        return 8;
    }

    public int getDamage()
    {
        return 1;
    }

    public void move(String where)
    {
        System.out.println("The Octopus swishes to " + where);
    }

    public void talk()
    {
        System.out.println("Blub!");
    }

    public int getWinStreak()
    {
        return this.streak;
    }

    public void addToWinStreak()
    {
        this.streak++;
    }
}