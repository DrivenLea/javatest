package ��ϰ;

public class SwitchNumberOfArray {

	public static void main(String[] args) { 
		// TODO �Զ����ɵķ������
    int []list = {1,2,3,4,5,6,7};
    
    for(int i=0,j=list.length-1;i<list.length/2;i++,j--) {
    	
    	int temp =list[i];
    	list[i]=list[j];
    	list[j]=temp;
    }
    for(int e:list) {
    	System.out.println(e);
    }
    
}
}    

