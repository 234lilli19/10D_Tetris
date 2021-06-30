
/**
 * Beschreiben Sie hier die Klasse SPIELSTEIN.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
 class SPIELSTEIN
{
    BLUE_RICKY blue_ricky;
    CLEVELAND_Z cleveland_z;
    TEEWEE teewee;
    HERO hero;
    ORANGE_RICKY orange_ricky;
    RHODE_ISLAND_Z rhode_island_z;
    SMASHBOY smashboy;
    SPIELSTEIN spielstein;
     int y;
     int x;
     char ausrichtung;
    
    SPIELSTEIN(int x, int y)
    {
        spielstein.AusrichtungSetzen (richtung);
        spielstein. PositionSetzen (x, y);
        
    }
    
    void RichtungSetzen(char richtungNeu)
    {
        spielstein.Ausrichtung (richtungNeu);
    }
    
    void Drehen()
    {
        Drehen();
    }
    
    void Bewegen(boolean fallen)
    {
        int x; xalt;
        int y; yalt;
        x = spielstein.XPositionGeben();
        y = spielstein.YPositionGeben();
        xalt = x;
        yalt = y;
        switch (spielstein.AusrichtungGeben())
        {
            case 'O':
                x += 1;
                break;
            case 'W':
                x -= 1;
                break;
            case 'S':
                y += 1;
                break;
            case 'R':
                Drehen();
            break;
        }
    }
    
    void XPositionGeben()
    {
        return spielstein.XPositionGeben();
    }
    
    void YPositionGeben()
    {
        return spielstein.YPositionGeben();
    }
    
    boolean BeruehrungOben()
    {
        for (SPIELSTEIN r: spielstein)
        {
            if ((spielstein.XPositionGeben() == r.XPositionGeben()) &&
            (spielstein.YPositionGeben() == r.YPositionGeben()))
            {
                return true;
            }
        }
        return false;
        }
}



