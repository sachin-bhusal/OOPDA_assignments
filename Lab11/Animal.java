   package Lab11;

   public abstract class Animal 
   {
      protected int count = 0;

      public void incrementCount()
      {
      count++;
      }

      public void resetCount()
      {
      count = 0;
      }

      public int getCount()
      {
      return count;
      }

      public abstract String getCountString();

   }
