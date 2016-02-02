package org.teachingkidsprogramming.section03ifs;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning the Tortoise woke up in a dream.");
    animateStartStory();
    String action = askAQuestion("Do you want to 'wake up' or 'explore' the dream?");
    if ("wake up".equalsIgnoreCase(action))
    {
      //          wakeUp (recipe below) --#2.1
      wakeUp();
    }
    else if ("explore".equalsIgnoreCase(action))
    {
      //      approachOoze (recipe below) --#4.1
      approachOoze();
    }
    else
    {
      //      endStory (recipe below) --#6.1
      endStory();
    }
  }
  private static void endStory()
  {
    //      ------------- Recipe for endStory --#6.2
    //         Tell the user "You don't know how to read directions. You can't play this game. The end." --#5
    MessageBox.showMessage("Why u no read directions. You no play this game right. The end");
    //      ------------- End of endStory recipe --#6.3
  }
  private static void approachOoze()
  {
    //      ------------- Recipe for approachOoze --#4.2
    //         Tell the user "You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket." --#3
    MessageBox.showMessage("you see a bucket, full of suff and being the stupid kid you are, you pick it up");
    //         Ask the user "Do you want to pour the ooze into the 'backyard' or 'toilet'?" --#7
    String toilet = MessageBox.askForTextInput("Do you want to pour de ooze into de backyard or toilet?");
    //         If they answer "toilet" --#8.1
    if ("toilet".equalsIgnoreCase(toilet))
    {
      //            pourIntoToilet (recipe below) --#12.1
      pourIntoToilet();
      //         Otherwise, if they answer "backyard" --#8.2
    }
    else if ("backyard".equalsIgnoreCase(toilet))
    {
      //            pourIntoBackyard (recipe below) --#19.1
      //            ------------- Recipe for pourIntoBackyard --#19.2
      //                Tell the user "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water." --#17
      //                Ask the user "As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?" --#18
      //                If they answer "faint" --#20.1
      //                        Tell the user "You made a delicious soup! Yum! The end." --#21
      //                Otherwise, if they answer "scream" --#20.2
      //                    startStory --#22
      //                Otherwise, if they answer anything else --#20.3
      //                    endStory --#23
      //         ------------- End of pourIntoBackyard recipe --#19.3
    }
    else
    {
      //         Otherwise, if they answer anything else --#8.3
      //            endStory --#9
      endStory();
    }
    //      ------------- End of approachOoze recipe --#4.3
  }
  private static void pourIntoToilet()
  {
    //            ------------- Recipe for pourIntoToilet --#12.2
    //               Tell the user "As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste." --#10
    MessageBox.showMessage("the stuff explodes you is covered in stuff that be nasty and wasty");
    //               Ask the user "Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?" --#11
    String Ninja = MessageBox.askForTextInput("Do you want to be like NINJA. YES or HECK YAAS?");
    //               If they answer "yes" --#13.1
    if ("yes".equalsIgnoreCase(Ninja))
    {
      //                    Tell the user "Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!" --#14
    }
    //               Otherwise, if they answer "heck yaas" --#13.2
    if ("heck yaas".equalsIgnoreCase(Ninja))
    {
      //                    Tell the user "Awesome dude!  You live out the rest of your life fighting crimes and eating pizza !" --#15
    }
    //               Otherwise, if they answer anything else --#13.3
    //                    endStory --#16
    endStory();
    //            ------------- End of pourIntoToilet recipe --#12.3
  }
  private static void wakeUp()
  {
    //          ------------- Recipe for wakeUp --#2.2
    //              Tell the user "You wake up and have a boring day. The end." --#1
    MessageBox.showMessage("You wake up and have a boring day. The end.");
    //          ------------- End of wakeUp recipe --#2.3
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
