package homework.homework03;

public class CharacterController {
	CharacterController(){}
	
	public int countAlpha(String s) throws CharCheckException{
		int count =0 ;
		for(int i = 0 ; i<s.length();i++) {
			if(s.charAt(i)==' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어있습니다.");
	
			}
			if('A'<=s.charAt(i)&&s.charAt(i)<='Z'||'a'<=s.charAt(i)&&s.charAt(i)<='z') {
				count++;
			}
		}
		return count;
	}
}
