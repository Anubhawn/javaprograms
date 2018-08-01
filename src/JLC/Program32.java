package JLC;

public class Program32 {
	public static void main(String args[]) {
		 try { 
			 int s;
				if(args.length>=2)
				{
				String a=args[0];
				String b=args[1];
				int a1=Integer.parseInt(a);
				int b1=Integer.parseInt(b);
				s=a1+b1;
				System.out.println("The sum is "+s);
				}
				else
					System.out.println("ERROR!!!!!\nEnter at least two integer values in commandline argument");
				
		    } 
		 catch(NumberFormatException e) { 
		        System.out.println("ERROR!!!!!\nEnter Integer Values in Command Line argument");
		    }
		 
		    
		}
		
	}
	


