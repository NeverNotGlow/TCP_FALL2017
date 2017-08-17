import java.util.*;

/*  
    Assignment: HW7 - Evolution
    Author: [YOUR NAME]

    Note: To make this file easier to read, you can turn on/off wordwrap in VSCode by pressing ALT+Z.

    Description :
        In your seventh assignment you will show me that you know to transcend humanity and solve a problem
        by not solving it but instead planting seeds and watching a garden grow that contains an answer to 
        give you ther insights.

        You will mess around with the program and answer the questions below.

    Steps:
        1) Compile, run, and test the program.

        2) Answer the questions below. Please do not use more than three sentences each. Make sure you recompile each time you edit the variables at the top of this file.

        3) Upload to Moodle your modified version of this file.

    Questions:

        Q1) Run the program with the default values five times. Does it take a different number of generations each time? Why?

            ***Answer Q1 here***

        Q2) Run the program with the populationSize = 2000, five times. With a larger population size does it take less generations? Why? 

            ***Answer Q2 here***

        Q3) Run the program with the percentAllowedToBreed = 0 five times. Without breeding/crossover does the program take less or more generations? Why? 

            ***Answer Q3 here***

        Q4) Run the program with the percentAllowedToBreed = 0.3 and all the mutation rates set to 0.0. Without muatation does the program take less or more generations? Why? 

            ***Answer Q4 here***

        Q5) Run the program with a much larger goal String five times. Did the program take a sigifiantly longer time or was it only a bit longer? Why?

            ***Answer Q5 here***

    Required files in your submission:
        - HW7.java that you have edited (NOT THE HW7.class)
*/

////// Do ASSIGNMENT BELOW /////////

public class HW7
{
    //Species are judged by how close they are to the goal. Must be no symbols and no spaces, ALL Caps.
    public static String goal = "HELLOILOVECATS";

    //The population size of each generation.
    public static int populationSize = 500;

    //The number of individuals that are copied directly to the next generation.
    public static int topSaved = 100;

    //The max length that an individual in the starting population can be.
    public static int maxStartingIndiviualLength = 10;

    //The percent of top individuals that are allowed to breed.
    public static double percentAllowedToBreed = 0.3;

    //The chance of a point mutation (a character change).
    public static double pointMutatationChance = 0.1;

    //The chance of an addition mutation (a new character being added to the genes).
    public static double additionMutatationChance = 0.1;

    //The chance of a deletion mutation (a character being removed)
    public static double deletionMutatationChance = 0.1;

    //Wether you want to print out every individual created
    public static boolean outputAllIndiviuals = false;

    ///////////////////////DON'T EDIT BELOW//////////////////////
    public static ArrayList<Species> currentGeneration;
    public static Species best;
    public static int generations;

    public static void main(String[] args)
    {
        generations = 1;
        generateInitialPopulation();

        //Loop until we get the perfect indivual!
        while(best.getFitness(goal) != 0)
        {
            evolve();
        }

        //We are done!
        System.out.println("Final Result: " + best.genes);
        System.out.println("Took "  + generations + " Generations");
        System.out.println("------------------------");
        System.out.println("populationSize = " + populationSize);
        System.out.println("topSaved = " + topSaved);
        System.out.println("maxStartingIndiviualLength = " + maxStartingIndiviualLength);
        System.out.println("percentAllowedToBreed = " + percentAllowedToBreed);
        System.out.println("pointMutatationChance = " + pointMutatationChance);
        System.out.println("additionMutatationChance = " + additionMutatationChance);
        System.out.println("deletionMutatationChance = " + deletionMutatationChance);
    }

    public static void generateInitialPopulation()
    {
        System.out.println("Inital indiviuals: ");

        currentGeneration = new ArrayList<Species>();
        for(int i = 0; i < populationSize; ++i)
        {
            Species species = generateRandomPopulation();
            System.out.println(species.genes + " (" + species.getFitness(goal) + ")");
            currentGeneration.add(species);
        }

        System.out.println("-----------\n");

        //Just temporarily random
        best = currentGeneration.get(0);
    }

    public static void evolve()
    {
        generations++;

        //Fancy code here
        Collections.sort(currentGeneration, new Comparator<Species>() {
            @Override
            public int compare(Species a, Species b) {
                return Integer.compare(a.getFitness(goal), b.getFitness(goal));
            }
        });

        best = currentGeneration.get(0);
        System.out.println("Gen " + generations + " best = " + best.genes + " (" + best.getFitness(goal) + ")");

        ArrayList<Species> nextGeneration = new ArrayList<Species>();

        int j = 0;
        int breedLimit = (int)(populationSize * percentAllowedToBreed);
        
        //Lets fill this generation
        while(nextGeneration.size() < populationSize)
        {
            if(j < topSaved)
            {
                nextGeneration.add(currentGeneration.get(j));
                j++;
            }
            else
            {
                Species a = currentGeneration.get((int)(Math.random() * breedLimit));
                Species b = currentGeneration.get((int)(Math.random() * breedLimit));
                Species[] ar = a.breed(b);
                nextGeneration.add(ar[0]);
                nextGeneration.add(ar[1]);
            }
        }

        //For better output I go backwards
        for(int i = populationSize - 1; outputAllIndiviuals && i >= 0; --i)
        {
            Species species = nextGeneration.get(i);
            System.out.println(species.genes + " (" + species.getFitness(goal) + ")");
        }

        currentGeneration = nextGeneration;

        //Apply mutations
        for(int i = 0; i < populationSize; ++i)
        {
            if(Math.random() < additionMutatationChance)
                currentGeneration.get(i).additionMutation();
            if(Math.random() < deletionMutatationChance)
                currentGeneration.get(i).deletionMutation();
            if(Math.random() < pointMutatationChance)
                currentGeneration.get(i).pointMutation();
        }
    }

    public static Species generateRandomPopulation()
    {
        String genes = "";
        int length = (int)(Math.random() * maxStartingIndiviualLength + 1);

        for(int i = 0; i < length; ++i)
        {
            genes += (char)(Math.random() * 26 + 'A');
        }

        return new Species(genes);
    }

}