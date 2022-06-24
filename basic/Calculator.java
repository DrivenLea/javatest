package 练习;

public class Calculator {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    if (args.length !=3) {
    	System.out.println(
    			"Usafe: java Calculator operand1 operator operand2");
    	System.exit(0);
    }
    
    int result = 0;
    
    switch(args[1].charAt(0)) {
    case '+' :result= Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
    break;
    case '-' :result= Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
    break;
    case '.' :result= Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
    break;
    case '/' :result= Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
  
    }
    
    System.out.println(args[0] + ' '  + args[1] + ' ' + args[2] + " = " + result);
	}

}
