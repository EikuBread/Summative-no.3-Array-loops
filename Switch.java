import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Switch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Switch extends Actor
{
    boolean on = false;
    /**
     * Act - do whatever the Switch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Images();
        Button();
        
       
    }  
    
    
    void Button ()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            keypressed();
        }
    }
    
    void Images()
    {
        if (on ==false)
        {
            setImage("Switch/Greenswitch.png");  
        }
        if (on ==true)
        {
            setImage("Arrow/0.png");  
        }
    }
    void keypressed()
    
    {
        if (isTouching(Arrow.class)&&on ==false)
        {
            on = true;
        }
        
    }
}
