package Projects;

import java.util.*;

public class Java_calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean keep_running=true;
		while(keep_running)
		{
			System.out.print("Enter the type of operation you need to perform(+,-,*,/,%,^): ");
			char operator=sc.next().charAt(0);
			sc.nextLine();
			
			
			double result=0;
			boolean valid=true;
			if(operator == '+' || operator == '-' || operator == '*')
			{
				System.out.print("Enter numbers seperated by spaces:");
				String[] inputs=sc.nextLine().split(" ");
				double[] numbers=new double[inputs.length];
				
				for(int i=0;i<inputs.length;i++)
				{
					numbers[i]=Double.parseDouble(inputs[i]);
				}
				
				result=numbers[0];
				for(int i=1;i<inputs.length;i++)
				{
					switch(operator)
					{
					   case '+':
						   result+=numbers[i];
						   break;
						   
					   case '-':
						   result-=numbers[i];
						   break;
						   
					   case '*':
						   result*=numbers[i];
						   break;
					}
				}
			}
			 else if (operator == '/' || operator == '%' || operator == '^') {
	                // Take only two numbers for division, modulus, power
	                System.out.println("Enter two numbers:");
	                double num1 = sc.nextDouble();
	                double num2 = sc.nextDouble();

	                switch (operator) {
	                    case '/':
	                        if (num2 != 0) {
	                            result = num1 / num2;
	                        } else {
	                            System.out.println("Error! Division by zero.");
	                            valid = false;
	                        }
	                        break;
	                    case '%':
	                        if (num2 != 0) {
	                            result = num1 % num2;
	                        } else {
	                            System.out.println("Error! Modulus by zero.");
	                            valid = false;
	                        }
	                        break;
	                    case '^':
	                        result = Math.pow(num1, num2);
	                        break;
	                }
	            } else {
	                System.out.println("Invalid operator! Please use +, -, *, /, %, or ^.");
	                valid = false;
	            }

	            if (valid) {
	                System.out.println("Result: " + result);
	            }

	            System.out.println("\nDo you want to perform another calculation? (yes/no)");
	            String command = sc.next().toLowerCase();
	            if (!command.equals("yes")) {
	                keep_running = false;
	            }
			
			
		}
			
		System.out.println("Calculator closed.");
		System.out.println("Thanks for using!!!");
		sc.close();

	}

}
