package array;
import java.util.*;
public class ArrrEx {

	/*public static void main(String[] args) {
			// TODO Auto-generated method stub
	        // int[] marks=new int[5];
	         Scanner sc = new Scanner(System.in);
	         for(int i=0;i<marks.length;i++) //5<5
	         {
	        	 marks[i]=sc.nextInt();  //
	         }
	         for(int i=0;i<marks.length;i++)
	         {
	        	 System.out.println("Marks["+(i+1)+"]="+marks[i]);
	         }
	        /* int scores[]=new int[3];
	         scores[0]=10;
	         scores[1]=20;
	         scores[2]=30;
	         int age[]= {1,2,3};
	         int s[]=new int[] {1,4,8};*/
	      /*   Exam ob[]=new Exam[3];
	         ob[0]=new Exam();*/
	         
		/*}

	}
	class Exam
	{
		public Exam()
		{
			System.out.println("Cons called");
		}
	}*/
		public static void main(String[] args) {
	      int[][] data=new int[2][2];
	      Scanner sc = new Scanner(System.in);
	      for(int i=0;i<2;i++) 
	      {
	    	for(int j=0;j<2;j++)
	    	{
	    		System.out.println("Enter row "+(i+1)+" col "+(j+1)+" values");
	    		data[i][j]=sc.nextInt();
	    	}
	      }
	      for(int i=0;i<2;i++) 
	      {
	    	for(int j=0;j<2;j++)
	    	{
	    		System.out.print(data[i][j]+"\t");	
	    	}
	    	System.out.println();
	      }

		}

	}

