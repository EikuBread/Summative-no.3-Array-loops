import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    int AnimationInterval = 10;
    int Fc = 0;
    GreenfootImage [] Arrow;
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        LoadImages();
        animate(Arrow);
    }    
    void animate (GreenfootImage [] images)
    {
       if (Fc >= images.length * AnimationInterval) 
       {
           Fc=0;
       }
       if (Fc% AnimationInterval==0) 
       {
           setImage(images[Fc/AnimationInterval]);
       }
       Fc++;
    }
    
    void LoadImages()
    {
        Arrow = new GreenfootImage[6];
        
        for (int i = 0; i < Arrow.length; i++)
        {
            // Again, assuming the image files are tile0.png, tile1.png, etc.
            String imagePath = "Images/Arrow" + i + ".png";
            Arrow[i] = new GreenfootImage(imagePath);
            
            
        }
    }
}
