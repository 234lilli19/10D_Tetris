

import java.awt.*;
import javax. swing. *;

class RHODE_ISLAND_Z extends SPIELSTEIN 


{
    private JFrame fenster;
    
    private static final int groesse = SPIELFELD.RasterGroesseGeben ();

    private static int radius = groesse / 4;
    private int x;
    private int y;
    private char ausrichtung;
    private JComponent anzeige;
    
    RHODE_ISLAND_Z()
    {
        fenster = SPIELFELD. FensterGeben ();
        x = 0;
        y = -8;
        anzeige = new JComponent () {
            // Stellt den 1. Stein von RHODE_ISLAND_Z auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (124, 252, 0));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse, groesse);
            }

        };
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (x, y + 1);
        
        
        anzeige = new JComponent () {
            // Stellt den 2. Stein von RHODE_ISLAND_Z auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (124, 252, 0));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse , groesse );
            }

        };
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (x - 1, y);
        
        
        anzeige = new JComponent () {
            // Stellt den 3. Stein von RHODE_ISLAND_Z auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (124, 252, 0));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse , groesse );
            }

        };
        
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (x + 1, y - 1);
        
        
        anzeige = new JComponent () {
            // Stellt den 4. Stein von RHODE_ISLAND_Z auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (124, 252, 0));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse , groesse );
            }

        };
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (x + 1, y );

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
                PositionSetzen (x, y + 1);
                PositionSetzen (x - 1, y);
                PositionSetzen (x + 1, y - 1);
                PositionSetzen (x + 1, y);
                break;
            case 2:
                PositionSetzen (x, y - 1);
                PositionSetzen (x, y + 1);
                PositionSetzen (x + 1, y);
                PositionSetzen (x, y + 1);
                break;
            case 3:
                PositionSetzen (x + 1, y);
                PositionSetzen (x - 1, y);
                PositionSetzen (x, y + 1);
                PositionSetzen (x - 1, y);
                break;
            case 4:
                PositionSetzen (x - 1, y - 1);
                PositionSetzen (x, y + 1);
                PositionSetzen (x + 1, y);
                PositionSetzen (x, y + 1);
                break;
                default:
                    System.out.printIn("Drehen" + ausrichtung);

   
        }
    }
}
