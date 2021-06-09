
/**
 * Beschreiben Sie hier die Klasse HERO.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.awt.*;
import javax. swing. *;

 class HERO extends SPIELSTEIN
{

    
    private JFrame fenster;
    
    private static final int groesse = SPIELFELD.RasterGroesseGeben ();

    private static int radius = groesse / 4;
    private int x;
    private int y;
    private char ausrichtung;
    private JComponent anzeige;
    
    HERO()
    {
        fenster = SPIELFELD. FensterGeben ();
        anzeige = new JComponent () {
            // Stellt den 1. Stein von HERO auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (0, 255, 255));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse, groesse);
            }

        };
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (1, 0);
        
        
        anzeige = new JComponent () {
            // Stellt den 2. Stein von HERO auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (0, 255, 255));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse , groesse );
            }

        };
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (2, 0);
        
        
        anzeige = new JComponent () {
            // Stellt den 3. Stein von HERO auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (0, 255, 255));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse , groesse );
            }

        };
        
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (3, 0);
        
        
        anzeige = new JComponent () {
            // Stellt den 4. Stein von HERO auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (0, 255, 255));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse , groesse );
            }

        };
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (0, 0);

    }

    
    public void PositionSetzen (int x, int y)
    {
       this. x = x;
       this. y = y;
       anzeige. setLocation (SPIELFELD. FensterBreiteGeben () / 2 + x * groesse, SPIELFELD. FensterHoeheGeben () / 2 + y * groesse);
    }
        
    }


