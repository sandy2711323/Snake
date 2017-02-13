import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (Sandeep Satone) 
 * @version (Version 1.0)
 */
public class Snake extends Actor
{
    private final int SPEED = 5;
    public static  int SCORE = 0;
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(SPEED);
        checkIfTouchingEdge();
        makeTurn();
        addFood();
       
    }  
    
    private void checkIfTouchingEdge(){
        
         if(isAtEdge()){
         //  getWorld().removeObject(this) ;
           
           GameOver gameOverObject = new GameOver();
           getWorld().addObject(gameOverObject, getWorld().getWidth()/2,  getWorld().getHeight()/2);
           Greenfoot.stop();
           
           
        }  
        
    
    }
    
    private void makeTurn(){
        String key = Greenfoot.getKey();
           if ("left".equals(key)){//System.out.println("space");
                  setRotation(180);
                  
            }
            if ("right".equals(key)){//System.out.println("space");
                
                     setRotation(0);
            }
            if ("up".equals(key)){//System.out.println("space");
                
                     setRotation(270);
            }
            if ("down".equals(key)){//System.out.println("space");
                
                     setRotation(90);
            }
    
    }
    
    private void addFood(){
         
        while (getWorld().getObjects(Food.class).size() < 1){
            SCORE++;
            getWorld().addObject(new Food(),getRandomNumberValue(50,550),getRandomNumberValue(50,350));
            getWorld().showText("Score : "+Integer.toString(SCORE), 350,10 );
     }
   }
   private int getRandomNumberValue(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
}
