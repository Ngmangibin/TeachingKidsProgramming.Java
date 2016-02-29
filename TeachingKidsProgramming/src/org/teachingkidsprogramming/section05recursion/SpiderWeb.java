package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise go as fast as possible --#6
    Tortoise.setSpeed(10);
    //    Change the width of the line the tortoise draws to 1 pixel --#12
    Tortoise.setPenWidth(1);
    //    Change the Tortoise to a Spider --#14
    Tortoise.setAnimal(Animals.Spider);
    //    Change the pen color of the line the tortoise draws to red --#13.1
    Tortoise.setPenColor(PenColors.Reds.Red);
    //    Set the color of the background window to black (HINT: use the Tortoise to get the background window) --#13.2
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    //    The current length of a line is 10 pixels --#1.2                  
    double length = 10.5;
    //    The current zoom is 1.1 --#8.2
    double zoom = 1.1;
    //    Do the following 10 times --#10.1
    for (int i = 0; i < 10; i++)
    {
      //     WeaveOneLayer (recipe below) --#9                                                                  
      length = weaveOneLayer(length, zoom);
      //     Change the zoom so it is multiplied by 1.3 --#11
      zoom *= 1.3;
      //    Repeat
    }
  }
  //    ------------- Recipe for WeaveOneLayer --#9
  public static double weaveOneLayer(double length, double zoom)
  {
    //    Do the following 6 times --#5
    for (int i = 0; i < 6; i++)
    {
      //     DrawTriangle (recipe below) --#4.2
      drawTriangle(length);
      //     Turn the tortoise 1/6th of 360 degrees to the right --#7
      Tortoise.turn(360.0 / 6);
      //     Increase the length of the line by the current zoom --#8.1
      length += zoom;
      //    Repeat --#10.2
    }
    return length;
  }
  //    ------------- End of WeaveOneLayer recipe --#9
  //    ------------- Recipe for DrawTriangle --#4
  public static void drawTriangle(double length)
  {
    //    Do the following 3 times --#3.1
    for (int i = 0; i < 3; i++)
    {
      //     Move the tortoise the length of a line --#1.1
      Tortoise.move(length);
      //     Turn the tortoise 1/3rd of 360 degrees --#2
      Tortoise.turn(360.0 / 3);
      //    Repeat --#3.2
    }
  }
  //    ------------- End of DrawTriangle recipe --#4
}