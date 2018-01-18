class SimpleArray
{
   public static int [] squareAll(int values[])
   {
      int [] newValues = new int[values.length];
      for (int i = 0; i < values.length; i++) {
    	  newValues[i] =  (int) Math.pow(values[i], 2);
      }
      return newValues;
   }
   
   public static void main (String [] args) {
	   int [] a = {1,2,3,4,5,6,7,8,9};
	   System.out.println(squareAll(a));
   }
}
