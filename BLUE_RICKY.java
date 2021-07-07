
/**
 * Beschreiben Sie hier die Klasse BLUE_RICKY.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.awt.*;
import javax. swing. *;

class BLUE_RICKY extends SPIELSTEIN 


{
    private JFrame fenster;
    
    private static final int groesse = SPIELFELD.RasterGroesseGeben ();

    private static int radius = groesse / 4;
    private int x;
    private int y;
    private char ausrichtung;
    private JComponent anzeige;
    
    BLUE_RICKY()
    {
        fenster = SPIELFELD. FensterGeben ();
        x = 0;
        y = -8;
        anzeige = new JComponent () 
        {
            // Stellt den 1. Stein von Blue Ricky auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (0, 0, 205));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse, groesse);
            }

        };
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (x, y);
        
        
        anzeige = new JComponent () {
            // Stellt den 2. Stein von Blue Ricky auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (0, 0, 205));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse , groesse );
            }

        };
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (x + 1, y);
        
        
        anzeige = new JComponent () {
            // Stellt den 3. Stein von Blue Ricky auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (0, 0, 205));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse , groesse );
            }

        };
        
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (x + 1, y);
        
        
        anzeige = new JComponent () {
            // Stellt den 4. Stein von Blue Ricky auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (0, 0, 205));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse , groesse );
            }

        };
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (x, y + 1);

    }

    
    public void PositionSetzen (int x, int y)
    {
       this. x = x;
       this. y = y;
       anzeige. setLocation (SPIELFELD. FensterBreiteGeben () / 2 + x * groesse, SPIELFELD. FensterHoeheGeben () / 2 + y * groesse);
    }

    void Drehen()
    {
        switch (ausrichtung)
        {
            case 1:
                PositionSetzen (x, y);
                PositionSetzen (x + 1, y);
                PositionSetzen (x + 1, y);
                PositionSetzen (x, y + 1);
                break;
            case 2:
                PositionSetzen (x + 1, y - 1);
                PositionSetzen (x, y + 1);
                PositionSetzen (x, y + 1);
                PositionSetzen (x - 1, y);
                break;
            case 3:
                PositionSetzen (x + 1, y);
                PositionSetzen (x - 1, y);
                PositionSetzen (x - 1, y);
                PositionSetzen (x, y + 1);
                break;
            case 4:
                PositionSetzen (x, y + 1);
                PositionSetzen (x, y - 1);
                PositionSetzen (x, y - 1);
                PositionSetzen (x + 1, y);
                break;
                default:
                    System.out.printIn("Drehen" + drehphase);
        }
    }
}


   
