import java. awt. *;
import javax. swing. *;
/**
 * Der Rand um das Spielfeld.
 * 
 */
class RANDSYMBOL
{
    /** Das Anzeigefenster. */
    private JFrame fenster;
    
    /** Anzeigegröße für das Rumpfelement */
    private static final int groesse = SPIELFELD. RasterGroesseGeben();

    /** Interna */
    private JComponent anzeige;
    private int xMin, xMax, yMin, yMax;
    private boolean wertGesetzt;
    private int punkte = 0;
    private boolean endemeldungGesetzt;
    private String endeMeldung = "";
    
     RANDSYMBOL()
    {
        this (SPIELFELD. FensterBreiteGeben() / groesse - 2, SPIELFELD. FensterHoeheGeben() / groesse - 2);
    }
    
    RANDSYMBOL(int breite, int hoehe)
    {
        wertGesetzt = false;
        endemeldungGesetzt = false;
        fenster = SPIELFELD.FensterGeben ();
        anzeige = new JComponent () {
    
            // Stellt das Rumpfelement auf dem Fenster dar.
            public void paintComponent (Graphics g)
            {
                g. setColor (Color. lightGray);
                int [] xKoord = {0, getWidth (), getWidth (), 0, 0, groesse, groesse, getWidth () - groesse, getWidth () - groesse, groesse, 0};
                int [] yKoord = {0, 0, getHeight (), getHeight (), 0, groesse, getHeight () - groesse, getHeight () - groesse, groesse, groesse, 0};
                g. fillPolygon(xKoord, yKoord, xKoord.length);
                if (wertGesetzt)
                {
                    Font font = new Font ("Helvetica", Font.BOLD, 14);
                    g. setFont (font);
                    g. setColor (Color. blue);
                    g. drawString ("Punkte: " + punkte, 4, 3 * groesse / 4);
                }
                if (endemeldungGesetzt)
                {
                    Font font = new Font ("Helvetica", Font.BOLD, 24);
                    g. setFont (font);
                    g. setColor (Color. red);
                    g. drawString (endeMeldung, groesse * 2, getHeight () / 4);
                }
            }
        };
        anzeige. setVisible (true);
        fenster. add (anzeige, 0);
        GroesseSetzen (breite, hoehe);
    }

    /**
     * Setzt die Breite und Höhe des Randelements.
     * Die Maximalkoordinaten des Spielfelds werden ermittelt.
     * @param breite Spielfeldbreite in Kästchen
     * @param hoehe Spielfeldhöhe in Kästchen
     */
    void GroesseSetzen (int breite, int hoehe)
    {
        xMax = breite / 2 - 1;
        yMax = hoehe / 2 - 1;
        if (breite % 2 == 0)
        {
            xMin = - xMax - 1;
        }
        else
        {
            xMin = -xMax - 2;
        }
        if (hoehe % 2 == 0)
        {
            yMin = - yMax - 1;
        }
        else
        {
            yMin = -yMax - 2;
        }
        anzeige. setSize ((breite+2)*groesse, (hoehe+2)*groesse);
        anzeige. setLocation (SPIELFELD. FensterBreiteGeben () / 2 - (breite / 2 + 1 + breite % 2) * groesse, SPIELFELD. FensterHoeheGeben () / 2 - (hoehe / 2 + 1 + hoehe % 2) * groesse);
    }

    /**
     * Entfernt die Figur aus der Anzeige
     */
    void Entfernen ()
    {
        (SPIELFELD. FensterGeben ()). remove (anzeige);
        (SPIELFELD. FensterGeben ()). repaint();
    }
    
    /**
     * Meldet die maximale x-Koordinate des Spielfelds.
     * @return maximale x-Koordinate
     */
    int XMaxGeben ()
    {
        return xMax;
    }
    
    /**
     * Meldet die minimale x-Koordinate des Spielfelds.
     * @return minimale x-Koordinate
     */
    int XMinGeben ()
    {
        return xMin;
    }
    
    /**
     * Meldet die maximale y-Koordinate des Spielfelds.
     * @return maximale y-Koordinate
     */
    int YMaxGeben ()
    {
        return yMax;
    }
    
    /**
     * Meldet die minimale y-Koordinate des Spielfelds.
     * @return minimale y-Koordinate
     */
    int YMinGeben ()
    {
        return yMin;
    }
    /**
     * Setzt den Punktestand für die Anzeige
     * @param punkte der anzuzeigende Punktestand
     */
    void PunkteSetzen (int punkte)
    {
        this.punkte = punkte;
        wertGesetzt = true;
        anzeige. invalidate();
    }
    
    /**
     * Setzt die Endemeldung für die Anzeige
     * @param die anzuzeigende Endemeldung
     */
    void EndemeldungSetzen (String meldung)
    {
        endeMeldung = meldung;
        endemeldungGesetzt = true;
        anzeige. invalidate();
        anzeige. repaint();
    }

}
