package no.hvl.dat102.oppgave4;

public class QuickSort {

	private int[] numbers;
    private int number;

    public void sort(int[] values) {
        // check for empty or null array
        if (values ==null || values.length==0){
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // henter pivot elementet fra midten av listen
        int pivot = numbers[low + (high-low)/2];

        // Splitter til to forskjellige lister
        while (i <= j) {
            //hvis nåverende verdi fra venstre listen er minre enn pivot elementet
            // hent neste element i venstre liste
            while (numbers[i] < pivot) {
                i++;
            }
            // hvis nåværede værdi fra høyre liste er større enn pivot elementet
            // hent neste element fra høyre listen
            while (numbers[j] > pivot) {
                j--;
            }

            // hvis vi har funnet en værdi i venstre liste som er større en 
            //pivot elementet og hvis vi har funnet en verdi i høyre listet
            // som er mindre enn pivot elementet, da bytter vi verdiene.
            // når vi er ferdig med det kan vi øke verdiene til i og j.
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Rekusjon
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
