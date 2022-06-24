package 练习;

public class AnalyzeNumbers {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
java.util.Scanner input = new  java.util.Scanner(System.in);
System.out.print("Enter the number of items:   ");
int n = input.nextInt();
double [] numbers = new double[n];
double sum =0;

System.out.print("Enter the number:  ");
for(int i = 0 ;i < n; i++) {
	numbers[i] = input.nextDouble();
	sum+=numbers[i];	
}

double average = sum/n;

int count =0;
for(int i = 0;i < n; i++) {
	if(numbers[i]>average)
		count++;
}

System.out.println("Average is " + average);
System.out.println("Number of elements above the average is " + count);

	}

}
