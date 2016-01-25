package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class FourSquare
{
  public static void main(String[] args)
  {
    ColorWheel.addColor(PenColors.Pinks.Fuchsia);
    ColorWheel.addColor(PenColors.Purples.DarkOrchid);
    ColorWheel.addColor(PenColors.Blues.RoyalBlue);
    //  Show the tortoise --#1
    Tortoise.show();
    for (int i = 0; i < 4; i++)
    {
      //  Make the tortoise move as fast as possible --#7
      Tortoise.setSpeed(10);
      for (int j = 0; j < 4; j++)
      {
        //  Do the following 4 times --#8.1
        //      drawSquare (recipe below) --#6.1
        drawsquare();
        //      Turn the tortoise 90 degrees to the right --#9
        Tortoise.turn(90);
        //  Repeat --#8.2
      }
    }
  }
  private static void drawsquare()
  {
    //      ------------- Recipe for drawSquare --#6.2
    //      Do the following 4 times --#5.1
    //          Change the pen color of the line the tortoise draws to a random color --#3
    Tortoise.setPenColor(ColorWheel.getRandomColorFromWheel());
    //          Move the tortoise 50 pixels --#2
    Tortoise.move(50);
    //          Turn the tortoise 90 degrees to the right --#4\
    Tortoise.turn(90);
    //      Repeat --#5.2
  }
}
