class BetterLoop
{
   public static boolean contains(int [] values, int v) {
      int count = 0;
	  for (int element : values) {
		if (element == v) {
			count++;
		}
	  }
      return (count > 0);  
   }	
}
