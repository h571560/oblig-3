package no.dat.oppgave1;

public class rekusrsjonKlient {
	
	public static void main(String[] args) {
		System.out.println(rekursjon.beregn(100));
		System.out.println(rekursjon.beregnRek(100));
		for(int i = 0; i < 10; i++) {System.out.println(rekursjon.beregnRek1(i));}
	}
	
}
