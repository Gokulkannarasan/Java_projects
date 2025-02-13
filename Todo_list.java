package Projects;
import java.util.*;
public class Todo_list {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <String> tasks=new ArrayList<>();
		boolean start=true;
		while(start)
		{
			System.out.println("Welcome to todo list");
			System.out.println("1.Add tasks");
			System.out.println("2.Remove tasks");
			System.out.println("3.View tasks");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			   case 1:
				   System.out.println("Enter the task:");
				   String task=sc.nextLine();
				   tasks.add(task);
				   System.out.println("task added\n");
				   break;
				   
			   case 2:
				   System.out.println("Enter the task number to remove:");
				   int index=sc.nextInt();
				   if(index>0 && index <=tasks.size())
				   {
					   tasks.remove(index-1);
					   System.out.println("task removed!\n");
					   break;
				   }
				   else
				   {
					   System.out.println("Invalid task\n");
				   }
				   
			   case 3:
				   System.out.println("Your tasks");
				   for(int i=0;i<tasks.size();i++)
				   {
					   System.out.println((i+1)+"."+tasks.get(i));
					   
				   }
				   System.out.println();
				   break;
				   
			   case 4:
				   System.out.println("Thanks for using me!!");
				   System.out.println("Bye bye see you...\n");
				   start=false;
				   break;
				   
			   default:
				   System.out.println("Invalid choice!");
			
			}
			
		}

	}

}
