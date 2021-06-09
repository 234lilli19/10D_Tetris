
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
    
    SPIELSTEIN()
    {
        spielstein = new SPIELSTEIN();   
    }
    
    void PositionSetzen (int x, int y)
    {
        spielstein.PositionSetzen (0, -9);    
    }
    
    int YPositionGeben()
    {
        return y;    
    }
    
    
    void RichtungSetzen()
    {
        
    }
}


