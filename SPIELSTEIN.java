
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
        AusrichtungSetzen (richtung);
        PositionSetzen (x, y);
        
    }
    
    void Ausrichtung(char ausrichtungNeu)
    {
        
    }
    void RichtungSetzen(char richtungNeu)
    {
        Ausrichtung (richtungNeu);
    }
    void Drehen()
    {
        
    }
    
    void Bewegen(int fallen)
    {
        switch (blue_ricky.PositionSetzen())
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
    
    void PositionSetzen(int x, int y)
    {
        x=0;
        y=-8;
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



