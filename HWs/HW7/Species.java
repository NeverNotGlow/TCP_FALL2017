public class Species
{
    public String genes;
    
    private int fitness;

    public Species()
    {
        fitness = -1;
    }

    public Species(String inital)
    {
        fitness = -1;
        genes = inital;
    }

    public Species copy()
    {
        Species copiedSpecies = new Species(genes);
        copiedSpecies.fitness = fitness;
        return copiedSpecies;
    }

    //Two children!
    public Species[] breed(Species other)
    {
        Species[] children = new Species[2];
        children[0] = new Species(genes.substring(0, genes.length() / 2) + other.genes.substring(other.genes.length() / 2));
        children[1] = new Species(other.genes.substring(0, other.genes.length() / 2) + genes.substring(genes.length() / 2));
        return children;
    }

    public void pointMutation()
    {
        fitness = -1;
        char[] charArray = genes.toCharArray();
        int point = (char)(Math.random() * charArray.length);
        char change = (char)(Math.random() * 26 + 'A');
        charArray[point] = change;

        genes = new String(charArray);
    }

    public void additionMutation()
    {
        fitness = -1;

        int location = (int)(Math.random() * genes.length());
        char mutation = (char)(Math.random() * 26 + 'A');

        genes = genes.substring(0, location) 
                + mutation 
                + genes.substring(location, genes.length());
    }

    public void deletionMutation()
    {
        fitness = -1;

        int location = (int)(Math.random() * genes.length() + 1);

        if(genes.length() > 1)
        {
            genes = genes.substring(0, location - 1) + genes.substring(location, genes.length());
        }
    }

    public int getFitness(String goal)
    {
        if(fitness != -1)
        {
            return fitness;
        }
        else
        {
            //http://www.programcreek.com/2013/12/edit-distance-in-java/
            String word1 = genes;
            String word2 = goal;
            int len1 = word1.length();
            int len2 = word2.length();

            // len1+1, len2+1, because finally return dp[len1][len2]
            int[][] dp = new int[len1 + 1][len2 + 1];
        
            for (int i = 0; i <= len1; i++) {
                dp[i][0] = i;
            }
        
            for (int j = 0; j <= len2; j++) {
                dp[0][j] = j;
            }
        
            //iterate though, and check last char
            for (int i = 0; i < len1; i++) {
                char c1 = word1.charAt(i);
                for (int j = 0; j < len2; j++) {
                    char c2 = word2.charAt(j);

                    //if last two chars equal
                    if (c1 == c2) {
                        //update dp value for +1 length
                        dp[i + 1][j + 1] = dp[i][j];
                    } else {
                        int replace = dp[i][j] + 1;
                        int insert = dp[i][j + 1] + 1;
                        int delete = dp[i + 1][j] + 1;

                        int min = replace > insert ? insert : replace;
                        min = delete > min ? min : delete;
                        dp[i + 1][j + 1] = min;
                    }
                }
            }

            fitness = dp[len1][len2];
	        return fitness;
        }
    }
}