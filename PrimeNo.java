package guviTask;

public class PrimeNo 
{

	public static void main(String[] args)
	{
		 int num = 24, i = 2;
		    boolean boo = false;
		    while (i <= num / 2) 
		    {
		      if (num % i == 0)
		      {
		        boo = true;
		        break;
		      }

		        ++i;
		    }

		    if (!boo)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }


	}


