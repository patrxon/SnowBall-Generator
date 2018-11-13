
public class Code {

	int tab[];
	
	Code(int len){
		tab = new int[len];
		
		for(int i=0; i<len; i++)
		{
			if(i%7==0) tab[i]=0;
			else if(i%7==1) tab[i]=1;
			else if(i%7==2) tab[i]=0;
			else if(i%7==3) tab[i]=1;
			else if(i%7==4) tab[i]=1;
			else if(i%7==5) tab[i]=1;
			else if(i%7==6) tab[i]=1;
			
		}
	}
	
	
	int giveNr(int a) {
		return tab[a];
	}
	
}
