package ��ϰ;

public class MaxTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int i =5;
		int j =2;
		int k = max(i,j);
		System.out.println("The max of " + i + " and " + j + " is " + k);
		
		
				
		}

	public static int max(int num1, int num2) {
		int result;
		if(num1 >num2)
			result=num1;
		else
			result=num2;
			
		return result;

	
	}
}
