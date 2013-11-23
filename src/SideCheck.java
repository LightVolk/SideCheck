/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Konstantin
 * 
 * small lib ,wich provides - is x,y koords have x+1,x-1 or y-1,y+1 koords or not.
 * Xmax,Ymax- maximum value of x,y koords.
 */

// In image processing, pixel (x, y) 
//refers to the pixel in column x and row y, with pixel (0, 0) at the upper left corner and pixel (W − 1, H − 1) at the bottom right corner.
public class SideCheck {
    
    public static boolean tt(int x,int y,int X,int Y)
    {
        
        return false;
    }
    public static boolean IsPointAtLeftSide(int xkoord,int ykoord,int Xmax,int Ymax)
    {
        return (xkoord==0);
    }
    
    public static boolean  IsPointAtRightSide(int xkoord,int ykoord,int Xmax,int Ymax)
    {
     return (xkoord==Xmax);
    }
    
    public static boolean IsPointAtBottomSide(int xkoord,int ykoord,int Xmax,int Ymax)
    {return ykoord==Ymax;}
    
    public static boolean IsPointAtTopSide(int xkoord,int ykoord,int Xmax,int Ymax)
    {return ykoord==0;}
    
    public static boolean  IsPointAtUpperLeftCorner(int xkoord,int ykoord,int Xmax,int Ymax)
    {
        return (IsPointAtLeftSide(xkoord, ykoord, Xmax, Ymax)&&IsPointAtTopSide(xkoord, ykoord, Xmax, Ymax));
    }
    
    public static boolean  IsPointAtBottomLeftCorner(int xkoord,int ykoord,int Xmax,int Ymax)
    {
        return (IsPointAtLeftSide(xkoord, ykoord, Xmax, Ymax)&&IsPointAtBottomSide(xkoord, ykoord, Xmax, Ymax));
    }
    
    public static boolean IsPointAtUpperRightCorner(int xkoord,int ykoord,int Xmax,int Ymax)
    {
        return (IsPointAtTopSide(xkoord, ykoord, Xmax, Ymax)&&IsPointAtRightSide(xkoord, ykoord, Xmax, Ymax));
    }
    
    public static boolean IsPointAtBottomRightCorner(int xkoord,int ykoord,int Xmax,int Ymax)
    {
        return (IsPointAtBottomSide(xkoord, ykoord, Xmax, Ymax)&&(IsPointAtRightSide(xkoord, ykoord, Xmax, Ymax)));
    }
}


