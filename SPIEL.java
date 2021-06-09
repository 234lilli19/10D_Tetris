import java. awt. event. *;

/**
 * Beschreiben Sie hier die Klasse SPIEL.
 * 
 * @LadyBotox,LadyAnna-Lena 
 * @version (eine Versionsnummer oder ein Datum)
 */
 class SPIEL
{
    RANDSYMBOL spielfeldrand;
    SPIELSTEIN spielstein;
    int punkte;
    /**
     * Konstruktor für Objekte der Klasse SPIEL
     */
     SPIEL()
    {
       spielfeldrand = new RANDSYMBOL (); 
       punkte = 0;
    }
    
    void Anhalten()
    {
        timer.stop ();
    }
    
    void Starten()
    {
        timer.start ();
    }
    
    void TasteGedrueckt (char welche)
    {
        switch (welche)
        {
          case 'S':
          case 's':
            Starten ();
            break;
          case 'P':
          case 'p':
            Anhalten ();
            break;
          
          case KeyEvent. VK_LEFT:
            spielstein. RichtungSetzen ('W');
            break;
          case KeyEvent. VK_RIGHT:
            spielstein. RichtungSetzen ('O');
            break;
          
          default:
            //System. out. println ("Taste: " + (0 + (int) welche));
        }
    }
}

