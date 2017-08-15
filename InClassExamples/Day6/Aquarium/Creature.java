public interface Creature
{
    public String getName();

    public void talk();
    public void move(String where);

    public int getHealth();
    public int getDamage();

    public int getWinStreak();
    public void addToWinStreak();
}