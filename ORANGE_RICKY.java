
import java.awt.*;
import javax. swing. *;

 class ORANGE_RICKY extends SPIELSTEIN
{
    private JFrame fenster;
    
    private static final int groesse = SPIELFELD.RasterGroesseGeben ();

    private static int radius = groesse / 4;
    private int x;
    private int y;
    private char ausrichtung;
    private JComponent anzeige;
    
    ORANGE_RICKY()
    {
        x = 0;
        y = -7;
        fenster = SPIELFELD. FensterGeben ();
        anzeige = new JComponent () {
            // Stellt den 1. Stein von Orange Ricky auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (255, 127, 0));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse, groesse);
            }

        };
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (x, y);
        
        
        anzeige = new JComponent () {
            // Stellt den 2. Stein von Orange Ricky auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (255, 127, 0));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse , groesse );
            }

        };
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (x + 1, y);
        
        
        anzeige = new JComponent () {
            // Stellt den 3. Stein von Orange Ricky auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (255, 127, 0));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse , groesse );
            }

        };
        
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (x + 1, y);
        
        
        anzeige = new JComponent () {
            // Stellt den 4. Stein von Orange Ricky auf dem Fenster dar.
            public void paintComponent (Graphics a)
            {
                a. clearRect (0, 0, groesse, groesse);
                a. setColor (new Color (255, 127, 0));
                a. fillRect (0, 0, groesse, groesse);
                a. setColor (Color. black);
                a. drawRect (0, 0, groesse , groesse );
            }

        };
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (x , y - 1);

    }

    
    public void PositionSetzen (int x, int y)
    {
       this. x = x;
       this. y = y;
       anzeige. setLocation (SPIELFELD. FensterBreiteGeben () / 2 + x * groesse, SPIELFELD. FensterHoeheGeben () / 2 + y * groesse);
    }

   
}
