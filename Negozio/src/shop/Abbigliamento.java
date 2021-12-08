package shop ;

public class Abbigliamento extends Merce {
 private static double SCONTO_DONNA = 10;
 private static double SCONTO_UOMO = 5;
 private char sesso;
 private String taglia;
 private String tipologia;
 
 public Abbigliamento( String codice, double prezzo, char sesso, String taglia, String tipologia) {
   super(codice, prezzo);
   this.sesso = sesso;
   this.taglia = taglia;
   this.tipologia = tipologia;
 }
 static public double getScontoDonna() {
  return SCONTO_DONNA;
 }
 static public void setScontoDonna(double percentuale) {
  SCONTO_DONNA = percentuale;
 }
 static public double getScontoUomo() {
  return SCONTO_UOMO;
 }
 static public void setScontoUomo(double percentuale) {
  SCONTO_UOMO = percentuale;
 }
 public void setSesso(char sesso) {
  this.sesso = sesso;
 }
 public char getSesso() {
  return sesso;
 }
 public void setTaglia(String taglia) {
  this.taglia=taglia;
 }
 public String getTaglia() {
  return taglia;
 }
 public void setTipologia(String tipologia) {
  this.tipologia=tipologia;
 }
 public String getTipologia() {
  return tipologia;
 }
 public double calcolaImporto() {
  if (sesso == 'F') return prezzoUnitario-prezzoUnitario*SCONTO_DONNA/100.0;
  if (sesso == 'M') return prezzoUnitario-prezzoUnitario*SCONTO_UOMO/100.0;
  return prezzoUnitario;
 }
 public String toString() {
 return super.toString()+" Tipologia: "+tipologia+" Sesso: "+sesso+" Taglia: "+taglia+" Prezzo: "+calcolaImporto();
}
 public Abbigliamento clone() {
  Abbigliamento prodotto = new Abbigliamento( super.getCodice(),
  super.prezzoUnitario,
  this.sesso, this.taglia,
  this.tipologia );
  return prodotto;
 }
}