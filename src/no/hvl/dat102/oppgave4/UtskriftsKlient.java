package no.hvl.dat102.oppgave4;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class UtskriftsKlient {

	public static void main(String[] args) {
		
		Integer[] tabell1 = new Integer[2000];
		for(int i = 0; i < tabell1.length; i++) {
			tabell1[i] = (int) Math.round(Math.random()* 100);
		}
		Integer[] tabell2 = new Integer[4000];
		for(int i = 0; i < tabell2.length; i++) {
			tabell2[i] = (int) Math.round(Math.random()* 100);
		}
		Integer[] tabell3 = new Integer[8000];
		for(int i = 0; i < tabell3.length; i++) {
			tabell3[i] = (int) Math.round(Math.random()* 100);
		}
		Integer[] tabell4 = new Integer[16000];
		for(int i = 0; i < tabell4.length; i++) {
			tabell4[i] = (int) Math.round(Math.random()* 100);
		}
		
		
		int i = 0;
		long diff = 0;
		Integer[] kopi4 = tabell4;
		while( i < 5) {
		long start1 = System.nanoTime();
		Sorting.mergeSort(kopi4);
		long stop1 = System.nanoTime();
		kopi4 = tabell4;
		diff += (stop1 - start1);
		if(i == 0) {
			System.out.println(diff);
		}
		i++;
		}
		long gjennomsnitt1 = diff/5;
		double gjennomsnitt1teori = (16000)*14*(601);
		
		
		int j = 0;
		long diff1 = 0;
		Integer[] kopi3 = tabell3;
		while( j < 5) {
		long start1 = System.nanoTime();
		Sorting.mergeSort(kopi3);
		long stop1 = System.nanoTime();
		kopi3 = tabell3;
		diff1 += (stop1 - start1);
		j++;
		}
		long gjennomsnitt2 = diff1/5;
		double gjennomsnitt2teori = (8000)*(13)*601;
		
		int k = 0;
		long diff2 = 0;
		Integer[] kopi2 = tabell2;
		while( k < 5) {
		long start1 = System.nanoTime();
		Sorting.mergeSort(kopi2);
		long stop1 = System.nanoTime();
		kopi2 = tabell2;
		diff2 += (stop1 - start1);
		k++;
		}
		long gjennomsnitt3 = diff2/5;
		double gjennomsnitt3teori = (4000)*(12)*(601);
		
		
		int l = 0;
		long diff3 = 0;
		Integer[] kopi1 = tabell1;
		while( l < 5) {
		long start1 = System.nanoTime();
		Sorting.mergeSort(kopi1);
		long stop1 = System.nanoTime();
		kopi1 = tabell1;
		diff3 += (stop1 - start1);
		l++;
		}
		long gjennomsnitt4 = diff3/5;
		double gjennomsnitt4teori = (2000)*(11)*(601); //fant konstanten c ved utregning c=601
		
		
		
		
		
		
		
		
		System.out.println("tabell for BubbleSort, konstanten c = 2.7");
		System.out.println("------------------------------------------------------------------");
		System.out.println("| n\t |antall målinger\t| målt tid\t | teoretisk tid |");
		System.out.println("------------------------------------------------------------------");
		System.out.println("|2 000  |\t\t5\t|"+  gjennomsnitt4 +"\t\t|" +gjennomsnitt4teori +"\t\t|");
		System.out.println("------------------------------------------------------------------");
		System.out.println("|4 000  |\t\t5\t|"+  gjennomsnitt3 + "\t|"+gjennomsnitt3teori +"\t\t |");
		System.out.println("------------------------------------------------------------------");
		System.out.println("|8 000  |\t\t5\t|"+  gjennomsnitt2 + "\t|"+gjennomsnitt2teori +" \t|");
		System.out.println("------------------------------------------------------------------");
	 	System.out.println("|16 000 |\t\t5\t|" + gjennomsnitt1 + "\t|"+gjennomsnitt1teori +" \t|");
		System.out.println("------------------------------------------------------------------");
		
		// TODO Auto-generated method stub

	}

}
