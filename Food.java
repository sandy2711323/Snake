import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (Sandeep Satone) 
 * @version (Version 1.0)
 */
public class Food extends Actor
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Actor fruit = getOneIntersectingObject(Snake.class);
        if(fruit != null){
        getWorld().removeObject(this);         
        }
    }    
}
