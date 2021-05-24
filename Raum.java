public class Raum {
  
  // Attribute
  public String beschreibung;
  public Raum norden;
  public Raum sueden;
  public Raum westen;
  public Raum osten;
  
  // Konstruktor
  public Raum(String p_beschreibung) {
    this.beschreibung = p_beschreibung;
  } 
     
  // Methoden
  public String getBeschreibung() {
    return beschreibung;
  }

  public Raum getNorden() {
    return norden;
  }

  public Raum getSueden() {
    return sueden;
  }

  public Raum getWesten() {
    return westen;
  }

  public Raum getOsten() {
    return osten;
  }
  
} 

