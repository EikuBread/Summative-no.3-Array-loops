import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int dx = 0;
    Arrow arrow;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 200, 1); 

        for (int i = 0; i < 6; i++)
        {
            int x = 85 * i + 85;
            int y = 0  * i + 130;

            addObject(new Switch(), x,y);
        }

        arrow= new Arrow();
        addObject(arrow, 80, 40);

        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            arrow.setLocation(arrow.getX()+5, 55);
           if (arrow.getX() >=520) 
      
           {
            
            arrow.setLocation(520, 55);
          
           }
            
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            arrow.setLocation(arrow.getX()-5, 55);
            if (arrow.getX() <=79) 
      
            {
          
                arrow.setLocation(80, 55);
          
        }
        }
        
      
    }
    
    
        
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
