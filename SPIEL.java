import java. awt. event. *;

/**
 * Beschreiben Sie hier die Klasse SPIEL.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
 class SPIEL extends SIMULATION
{
    /** Der Spielstein. */
    SPIELSTEIN spielstein;
    /** Das Spielfeld. */
    RANDSYMBOL spielfeldrand;
    /** Der Punktestand. */
    int punkte;
    
    /**
     * Konstruktor für Objekte der Klasse SPIEL
     */
     SPIEL()
    {
        spielfeldrand = new RANDSYMBOL();
        punkte = 0;
        
    }

}
