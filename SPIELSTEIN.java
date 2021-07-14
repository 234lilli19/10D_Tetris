
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
    
    int XPositionGeben()
    {
        return blue_ricky.XPositionGeben();
        return cleveland_z.XPositionGeben();
        return teewee.XPositionGeben();
        return hero.XPositionGeben();
        return orange_ricky.XPositionGeben();
        return rhode_island_z.XPositionGeben();
        return smashboy.XPositionGeben();
    }
    
    int YPositionGeben()
    {
        return blue_ricky.YPositionGeben();
        return cleveland_z.YPositionGeben();
        return teewee.YPositionGeben();
        return hero.YPositionGeben();
        return orange_ricky.YPositionGeben();
        return rhode_island_z.YPositionGeben();
        return smashboy.YPositionGeben();
        
    }
    
    void Bewegen( boolean fallen)
    {
        switch ()
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
    
    int PositionSetzen(int x, int y)
    {
        x=0;
        y=-8;
    }
    
    boolean BeruehrungOben()
    {
        for (SPIELSTEIN r: blue_ricky)
        {
            if ((spielstein.XPositionGeben() == r.XPositionGeben()) &&
            (spielstein.YPositionGeben() == r.YPositionGeben()))
            {
                return true;
            }
        }
        
        for (SPIELSTEIN r: teewee)
        {
            if((spielstein.XPositionGeben() == r.XPositionGeben()) &&
            (spielstein.YPositionGeben() == r.YPositionGeben()))
            {
                return true;
            }
        }
        
        for (SPIELSTEIN r: orange_ricky)
        {
            if((spielstein.XPositionGeben() == r.XPositionGeben()) &&
            (spielstein.YPositionGeben() == r.YPositionGeben()))
            {
                return true;
            }
        }
        
        for (SPIELSTEIN r: rhode_island_z)
        {
            if((spielstein.XPositionGeben() == r.XPositionGeben()) &&
            (spielstein.YPositionGeben() == r.YPositionGeben()))
            {
                return true;
            }
        }
        
        for (SPIELSTEIN r: smashboy)
        {
            if((spielstein.XPositionGeben() == r.XPositionGeben()) &&
            (spielstein.YPositionGeben() == r.YPositionGeben()))
            {
                return true;
            }
        }
        
        return false;
        
    }
}



