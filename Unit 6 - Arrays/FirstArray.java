// Singh
// 6.1.6 - Our first array

public class FirstArray
{
    public static void main(String[] args)
    {
      // Create the 3 arrays here
      String[] names = {"Las Vegas", "Minsk", "Sao Paulo"};
      int[] population = {667501, 2038822, 12330000};
      double[] sunshine = {8.11, 1.36, 6.05};
        
      // Print all 3 arrays according to the output in the description
      for(int i = 0; i < names.length; i++){
        System.out.println(names[i] + "'s population is " + population[i] + ".");
      }
      System.out.println();
      for(int i = 0; i < names.length; i++){
        System.out.println("The least amount of sunshine " + names[i] + " gets is " + sunshine[i] + " hours a day.");
      }
    
    }
}
