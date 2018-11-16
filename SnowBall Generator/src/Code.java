public class Code {

	int tab[];
	String code;

	Code(int len) {	
		
		tab = new int[len];
		code = "11100111011100011100000" ;
		
		char c;
		
		for(int i=0; i<len; i++)
		{
			c=code.charAt(i%code.length());
			
			if( c == '0'  ) tab[i]=0;
			else if( c == '1' ) tab[i]=1;
			else if( c == '2' ) tab[i]=2;
			else if( c == '3' ) tab[i]=3;
			else if( c == '4' ) tab[i]=4;
			else if( c == '5' ) tab[i]=5;
			
		}
	}
	
	
	int giveNr(int a) {
		return tab[a];
	}
	
}