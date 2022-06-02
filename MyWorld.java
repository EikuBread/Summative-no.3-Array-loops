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
    int mix = 85;
    int max = 130;
    int selection =0;
    Switch[] switches;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 200, 1); 
        int min = 80;
        int max = 40;
        switches= new Switch[6];

        for (int i = 0; i <switches.length; i++)
        {
            int x = 85 * i + 85;
            int y = 0  * i + 130;
    
            addObject(new Switch(), x,y);
        }
        
        for (int m =0; m <3; m++)
        {
            int random= Greenfoot.getRandomNumber(6);
            
        }
        arrow= new Arrow();
        addObject(arrow, 80, 60);
    }

    public void act()
    {
        if(arrow!=null&&Greenfoot.isKeyDown("d")&&selection<switches.length-1)
        {
            selection=selection-1;
            arrow.setLocation(arrow.getX()+5, 55);
           if (arrow.getX() >=520) 
      
           {
            // prevents the player to get our
            arrow.setLocation(520, 55);
          
           }
           
        }
        
        if (arrow!=null&&Greenfoot.isKeyDown("a")&&selection!=0)
        {
            arrow.setLocation(arrow.getX()-5, 55);
            if (arrow.getX() <=79) 
      
            {
          
                    arrow.setLocation(80, 55);
              
            }
        }
        
      
    }
    
}
