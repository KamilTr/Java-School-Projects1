package del1;


public class generatePassword {
	

	public static void main(String[] args){
		
		char[] losen = randomPassword();		
		String svar = new String(losen);
		boolean passwordkoll = passwordCheck.passwordChecks(svar);
		System.out.println(svar);
		System.out.println(passwordkoll);
		
	}

	public static char[] randomPassword(){
	
		boolean checkA = false;
		boolean checkB = false;
		boolean checkC = false;
		
		int lengthPassword = (8 + (int)(Math.random()*5));
		char[] password = new char[lengthPassword];
		int[] temp = new int[lengthPassword];
		
		while(checkA == false || checkB == false || checkC == false){
			
		checkA = false;
		checkB = false;
		checkC = false;
		
		char[] alphabet = new char[] 
				{'a','b','c','d','e','f','g','h','i','j','k','l','m',
				'n','o','p','q','r','s','t','u','v','w','x','y','z'};  
		char[] alphabetCaps = new char[]
				{'A','B','C','D','E','F','G','H','I','J','K','L','M',
				'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] number = new char[]
				{'0','1','2','3','4','5','6','7','8','9'};
		
		
		for(int i = 0; i < lengthPassword; i++){
			int random = (int)(Math.random()*3);
			
			if(random == 0){
				password[i]  = alphabet[(int)(Math.random()*26)]; 
				temp[i] = 0;
			}
			
			if(random == 1){
				password[i]  = alphabetCaps[(int)(Math.random()*26)]; 
				temp[i] = 1;
			}
			if(random == 2){
				password[i]  = number[(int)(Math.random()*10)]; 
				temp[i] = 2;
			}			
		}
		
		for(int j = 0; j < lengthPassword; j++){
			if(temp[j] == 0){checkA = true;}
			if(temp[j] == 1){checkB = true;}				
			if(temp[j] == 2){checkC = true;}			
		}
		
		}
		return password;
	}
	
	
}
