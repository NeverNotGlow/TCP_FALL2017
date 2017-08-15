public class Fish implements Creature
{
    public int streak;

    public String getName()
    {
        return "Fish";
    }

    public int getHealth()
    {
        return 3;
    }

    public int getDamage()
    {
        return 2;
    }

    public void move(String where)
    {
        System.out.println("The " + this.getName() +" swims to " + where);
    }

    public void talk()
    {
        System.out.println("Gurgle Bubble!");
    }

    public void breatheWater()
    {
        System.out.println("The fish inhales water");
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