package no.dat.oppgave1;

public class rekursjon {

	public static int beregn(int n) {
		int sum = (n * (n + 1)) / (2);
		return sum;
	}

	public static int beregnRek(int n) {
		int sum = 0;
		if (n == 0) { // basecase
			return sum;
		} else {
			sum = n + beregnRek(n - 1);
			return sum;
		}
	}
	
	public static int beregnRek1(int n) {
		int nVerdi = 0;
		if(n == 0) {
			nVerdi = 2;
		}
		else if(n==1) {
			nVerdi = 5;
		}
		else {
			nVerdi = 5*beregnRek1(n-1) - 6*beregnRek1(n-2) + 2;
			
		}
		return nVerdi;
	}
	

}
