import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class Seven_Dwarves {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int total = 0;
		int[] arr = new int[9];
		int[] arr2 = new int[9];
		for(int i =0;i<9;i++)
		{
			System.out.print("Enter Input people "+(i+1)+" : ");
			int process = input.nextInt();
			arr[i] = process;
			if(process < 1 || process > 99)
			{
				System.out.println("please input number 1 - 99");
				--i;
			}
			else
			{
				total+=process;
			}
		}
		if(total!=100)
		{
			int x = total;
			System.out.println("total : "+x);
			for(int i=0;i<arr.length;i++)
			{
				//System.out.println("-------- " + total + " - " + arr[i] + " = " + (total-arr[i]));
				x = total-arr[i];
				
				for(int k=0;k<arr.length;k++)
				{
					int a = x;
					//System.out.println(a + " - " + arr[k] + " = " + (a-arr[k]));
					a = a-arr[k];
					if(a==100)
						arr2[k] = arr[k];
					//System.out.println(a + " - " + arr[k] + " = " + (a-arr[k]));
				}
			}
			for(int i=0;i<arr.length;i++)
			{
				 if(arr[i] != arr2[i])
				 	System.out.println(arr[i]);
			}
		}
		else
			for(int i=0;i<arr.length;i++)
			{
				 if(arr[i] != arr2[i])
				 	System.out.println(arr[i]);
			}
	 }
}