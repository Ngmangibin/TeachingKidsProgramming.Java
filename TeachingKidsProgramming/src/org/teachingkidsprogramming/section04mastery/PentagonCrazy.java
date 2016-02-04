package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Purples;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise move as fast as possible --#3
    Tortoise.setSpeed(10);
    createColorPalette();
    //    ------------- End of createColorPalette recipe --#8.3
    //
    //    drawPentagon (recipe below) --#10.1
    //
    drawPentagon();
  }
  private static void drawPentagon()
  {
    //    ------------- Recipe for drawPentagon --#10.2
    //    Do the following 200 times --#2.1
    for (int i = 0; i < 200; i++)
    {
      //        adjustPen (recipe below) --#9.1
      //
      //        ------------- Recipe for adjustPen --#9.2
      adjustPen();
      //        ------------- End of adjustPen recipe --#9.3 
      //
      //        The current length of a side is the same as the number of the side you are about to draw ( 1st side = 1 pixel, 2nd side = 2 pixels, etc) --#4.2
      //        Move the tortoise the length of a side --#4.1
      Tortoise.move(i);
      //        Turn the tortoise 1/5th of 360 degrees --#1
      Tortoise.turn(360 / 5);
      //        Turn the tortoise 1 more degree --#5
      Tortoise.turn(1);
      //    Repeat --#2.2
      //    ------------- End of drawPentagon recipe --#10.3
    }
  }
  private static void adjustPen()
  {
    //        Change the pen color of the line the tortoise draws to the next color on the color wheel --#6
    Tortoise.setPenColor(ColorWheel.getNextColor());
    //        Increase the tortoises pen width by 1 --#15                                              
    //        If the tortoises pen width is greater than 4, then --#17
    //            Reset it to 1 --#16
  }
  private static void createColorPalette()
  {
    //    createColorPalette (recipe below) --#8.1
    //
    //    ------------- Recipe for createColorPalette --#8.2
    //    Add steel blue to the color wheel --#7
    ColorWheel.addColor(Blues.SteelBlue);
    //    Add dark orchid to the color wheel --#11
    ColorWheel.addColor(Purples.DarkOrchid);
    //    Add dark slate blue to the color wheel --#12
    ColorWheel.addColor(Blues.DarkSlateBlue);
    //    Add teal to the color wheel --#13
    ColorWheel.addColor(Blues.Teal);
    //    Add indigo to the color wheel --#14
    ColorWheel.addColor(Purples.Indigo);
  }
}
