package 二维数组;

import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
 		// TODO 自动生成的方法存根
    final int NUMBER_OF_DAYS= 10;   
    final int NUMBER_OF_HOURS=24;
    
    double [][][] data =new double [NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];
    
    Scanner input=new Scanner(System.in);
    
    for(int k=0; k <  NUMBER_OF_DAYS * NUMBER_OF_HOURS;k++) {
    	int day=input.nextInt();
    	int hours=input.nextInt();
    	double temperature =input.nextDouble();
    	double hunidity = input.nextDouble();
    data[day-1][hours-1][0]=temperature;
    data[day-1][hours-1][1]=hunidity;
	}

    
     for(int i=0;i<NUMBER_OF_DAYS;i++) {
    	 int dailyTemperatureTotal = 0;
    	 int dailyHumidityTotal = 0;
    	 for(int j=0;j<NUMBER_OF_HOURS;j++) {
    		 dailyTemperatureTotal +=data[i][j][0];
    		 dailyHumidityTotal += data[i][j][1];
    	 }
    	 
    		 
     
     System.out.println("Day " + i + "'s average temperature is " 
     + dailyTemperatureTotal/NUMBER_OF_HOURS);
     System.out.println("Day " + i + "'s average hunidity is " 
     + dailyHumidityTotal/NUMBER_OF_HOURS);
     
     }
}
}
