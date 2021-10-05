package src;

public abstract class Shortcut {
   private static int storyCounter = 1;

   public static int giveNewStory()
   {
        System.out.println("[Shortcut] Story " + formatStoryNumber(storyCounter) + " created");
        return storyCounter++;
   }

   public static String formatStoryNumber(int storyNumber)
   {
       return "sc-" + String.format("%04d", storyNumber);
   }
}
