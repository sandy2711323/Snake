import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Sandeep Satone) 
 * @version (Version 1.0)
 */
public class MyWorld extends World
{
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    private static final String BRANDING = "Developed by Sandeep Satone";

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDTH, HEIGHT, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        showText(BRANDING, 150,10 );
        
        Snake snake = new Snake();
        addObject(snake,WIDTH/8,HEIGHT/2);
        Food food = new Food();
        addObject(food,getRandomNumberValue(50,550),getRandomNumberValue(50,350));
        
        resetStaticVariables();
        showText("Score : "+Integer.toString(Snake.SCORE), 350,10 );
        
       
    }
    
    public int getRandomNumberValue(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    
    private void resetStaticVariables() {  

            Snake.SCORE = 0;

    }
    

    
}
