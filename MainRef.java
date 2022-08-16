
class MainRef
{
	  public static void main (String [] arguments)
  {
    int number = 1;
   
    System.out.println("number = " + number);
  
    number = update(number);

    System.out.println("number = " + number);
  } 
  
    public static int update( int number )
	{ 
        
     		number++;
     		return number; 
    	}
}