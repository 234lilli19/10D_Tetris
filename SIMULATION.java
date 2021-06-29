
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax. swing. *;

/**
 * Beschreiben Sie hier die Klasse SIMULATION.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
class SIMULATION
{
        private Timer timer;
        
        SIMULATION ()
        {
            timer = new Timer (1000, new ActionListener () {
                public void actionPerformed (ActionEvent evt)
                {
                    TaktImpulsAusfuehren ();
                }
            });
            SPIELFELD. FensterGeben (). addKeyListener (new KeyAdapter () {
                public void keyPressed(KeyEvent e)
                {
                    TasteGedrueckt ((char) e. getKeyCode ());
                }
            });
        }
        
        void TaktImpulsAusfuehren ()
        {
            System. out. println ("Tick");
        }
        
        void Starten ()
        {
            timer. start ();
        }
        
        void Anhalten ()
        {
            timer. stop ();
        }
        
        void TaktdauerSetzen (int dauer)
        {
            timer. setDelay(dauer);
        }
        
        void TasteGedrueckt (char welche)
        {
            System. out. println ("Taste gedrückt: " + welche);
        }
}
