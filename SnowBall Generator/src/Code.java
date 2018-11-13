public class Code {

	int tab[];
	String code;

	Code(int len) {	
		
		tab = new int[len];
		code = "010100";
		
		char c;
		
		for(int i=0; i<len; i++)
		{
			c=code.charAt(i%code.length());
			
			if( c == '0'  ) tab[i]=0;
			else if( c == '1' ) tab[i]=1;
			
		}
	}
	
	
	int giveNr(int a) {
		return tab[a];
	}
	
}