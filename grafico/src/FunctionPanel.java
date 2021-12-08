import java.awt.*;
import javax.swing.*;


class FunctionPanel extends JPanel {
int xMin=-7, xMax=7, yMin=-1, yMax=1;
// gli intervalli in cui vogliamo graficare
int larghezza=500, altezza=400;
// corrispondono alla grandezza del Jframe
// ERA MEGLIO USARE UN COSTRUTTORE....
float fattoreScalaX, fattoreScalaY;
public void paintComponent(Graphics g){
super.paintComponent
(g); // va fatto sempre
setBackground(Color.white); // fondo bianco
fattoreScalaX=larghezza/((float)xMax-xMin);
fattoreScalaY=altezza/((float)yMax-yMin);
// dobbiamo fare le proporzioni tra
// l'intervallo di valori della finestra
// (500*400) e l'intervallo da graficare (14*2)
// incornicia il grafico in nero
g.setColor(Color.black);
g.drawRect(0,0,larghezza-1,altezza-1);
// e disegna degli assi cartesiani
g.setColor(Color.red);
g.drawLine(0,altezza/2, larghezza-1,altezza/2);
g.drawLine(larghezza/2,0,larghezza/2,altezza-1);
// scrittura valori estremi degli assi
g.drawString(""+xMin, 5,altezza/2-5);
g.drawString(""+xMax, larghezza-10,altezza/2-5);
g.drawString(""+yMax, larghezza/2+5,15);
g.drawString(""+yMin, larghezza/2+5,altezza-5);
//disegna il grafico della funzione in blu
g.setColor(Color.blue);
setPixel(g,xMin,f(xMin)); // punto iniziale
for (int ix=1; ix<larghezza; ix++){
//per ognuno dei pixel della finestra
float x = xMin+((float)ix)/fattoreScalaX;
setPixel(g,x,f(x));
}
} 
//definizione della funzione,
//statica, da graficare
static float f(float x){
return (float)Math.sin(x);
//sin(x) � la funzione (statica!)
//che decidiamo di graficare:
//ovviamente potrebbe essere qualsiasi funzione
}
//questa serve per riportare i valori della
//funzione sui valori della finestra
void setPixel(Graphics g, float x, float y){
if (x<xMin || x>xMax || y<yMin || y>yMax )
return;
int ix = Math.round((x-xMin)*fattoreScalaX);
int iy = altezza-Math.round(
(y-yMin)*fattoreScalaY);
g.drawLine(ix,iy,ix,iy)
;
//disegna in effetti un singolo punto
}
}
