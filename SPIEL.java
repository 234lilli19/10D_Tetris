import java. awt. event. *;

/**
 * Beschreiben Sie hier die Klasse SPIEL.
 * 
 *  
 * @version (eine Versionsnummer oder ein Datum)
 */
 class SPIEL extends SIMULATION
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
    
    void TaktImpulsAusfuehren ()
    {
        if ((spielstein. XPositionGeben() <= spielfeldrand. XMaxGeben())
        && (spielstein. XPositionGeben() >= spielstein. XMinGeben())
        && (spielstein.YPositionGeben() <= spielfeldrand. YMaxGeben())
        && (spielstein.YPositionGeben() >= spielfeldrand. YMinGeben())
        && !spielstein.BeruehrungOben())
        {
            spielstein. Bewegen();
        }
        else
        {
            Anhalten();
            if(spielstein.BeruehrungOben())
            {
                spielfeldrand.EndemeldungSetzen("Game Over - Platz verbraucht");
            }
            
        }
    
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
          
          case KeyEvent. VK_DOWN:
              spielstein. RichtungSetzen ('S');
              break;
          case KeyEvent. VK_LEFT:
            spielstein. RichtungSetzen ('W');
            break;
          case KeyEvent. VK_RIGHT:
            spielstein. RichtungSetzen ('O');
            break;
          case KeyEvent. VK_UP:
              spielstein. Drehen ('R');
          default:
            //System. out. println ("Taste: " + (0 + (int) welche));
        }
    }
 }

