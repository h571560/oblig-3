package no.dat.oppgave1;

import java.sql.Time;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * SolveTowers uses recursion to solve the Towers of Hanoi puzzle.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class SolveTowers
{
    /**
     * Creates a TowersOfHanoi puzzle and solves it.
     */
    public static void main(String[] args)
    {
   
        TowersOfHanoi towers = new TowersOfHanoi(29);
        Instant start = Instant.now();  
        towers.solve();
        Instant stop = Instant.now();
        Duration time = Duration.between(start,stop);
        System.out.println("tiden det tok var: " + time.toNanos() + " nanosekunder, eller " + time.toString().substring(2,7) + " sekunder");
        
    }
}
