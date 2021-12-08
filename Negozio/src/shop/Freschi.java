package shop;

public class Freschi extends Alimentari {
	  static private double COSTO_SACCHETTO = 0.05;
	  private boolean confezionato;
	  
	 public Freschi( String codice, double prezzo, String descrizione,double peso, double calorie, boolean confezionato) {
	   super(codice, prezzo, descrizione, peso, calorie);
	   this.confezionato = confezionato;
	 }
	 static public double getCostoSacchetto() {
	  return COSTO_SACCHETTO;
	 }
	 static public void setCostoSacchetto(double costo) {
	  COSTO_SACCHETTO = costo;
	 }
	 public void setConfezionato(boolean confezionato) {
	  this.confezionato = confezionato;
	 }
	 public boolean getConfezionata() {
	  return confezionato;
	 }
	 public String toString() {
	  String tipoConfezione;
	  if (!confezionato)
	    tipoConfezione = "sfusa";
	  else
	   tipoConfezione = "preconfezionata";
	  return super.toString()+" Confezione: "+tipoConfezione;
	 }
	 public double calcolaImporto() {
	  double importo = super.calcolaImporto();
	  if (!confezionato)
	   importo += COSTO_SACCHETTO;
	  return importo;
	 }
	public Freschi clone() {
	  Freschi prodotto = new Freschi( super.getCodice(),super.prezzoUnitario,
	  super.getDescrizione(),super.getPeso(),
	  super.getCalorieUnitarie(),
	  this.confezionato);
	  return prodotto;
	 }
	}