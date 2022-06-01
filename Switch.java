import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Switch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Switch extends Actor
{
    boolean switchs = false;
    /**
     * Act - do whatever the Switch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if (switchs ==false)
        {
            setImage("Switch/Greenswitch.png");  
        }
        if (switchs ==true)
        {
            setImage("Switch/Redswitch.png");  
        }
    }    
}
