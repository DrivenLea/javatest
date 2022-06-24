package 练习;

public class TestRandomCharacter {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		final int UNMBER_OF_CHARS = 175;
		final int CHARS_PER_LINE = 25;
		
		for(int i = 0; i < UNMBER_OF_CHARS; i++) {
			char ch = RandomCharacter.getRandomLowerCaseLetter();
			if((i + 1)% CHARS_PER_LINE == 0)
				System.out.println(ch);
			else
				System.out.print(ch);
			
		}

	}

}
