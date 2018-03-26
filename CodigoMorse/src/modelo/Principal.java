package modelo;
import static javax.swing.JOptionPane.*;
import java.util.StringTokenizer;
public class Principal {

	public static void main(String[] args) {
		String cadena=showInputDialog("Ingrese la cadena que desea pasar a código morse");
		morse(cadena);
	}
	
	static void morse(String cadena){
		String[] nueva=cadena.split("");
		String[] relacion=new String[38];
		String[] morse=new String[38];
		String[] resultado=new String[nueva.length];
		morse[0]=".- ";		relacion[0]="a";
		morse[1]="-... ";	relacion[1]="b";
		morse[2]="-.-. ";	relacion[2]="c";
		morse[3]="-.. ";	relacion[3]="d";
		morse[4]=". ";		relacion[4]="e";
		morse[5]="..-. ";	relacion[5]="f";
		morse[6]="--. ";	relacion[6]="g";
		morse[7]=".... ";	relacion[7]="h";
		morse[8]=".. ";		relacion[8]="i";
		morse[9]=".--- ";	relacion[9]="j";
		morse[10]="-.- ";	relacion[10]="k";
		morse[11]=".-.. ";	relacion[11]="l";
		morse[12]="-- ";	relacion[12]="m";
		morse[13]="-. ";	relacion[13]="n";
		morse[37]="-. ";	relacion[37]="ñ";
		morse[14]="--- ";	relacion[14]="o";
		morse[15]=".--. ";	relacion[15]="p";
		morse[16]="--.- ";	relacion[16]="q";
		morse[17]=".-. ";	relacion[17]="r";
		morse[18]="... ";	relacion[18]="s";
		morse[19]="- ";		relacion[19]="t";
		morse[20]="..- ";	relacion[20]="u";
		morse[21]="...- ";	relacion[21]="v";
		morse[22]=".-- ";	relacion[22]="w";
		morse[23]="-..- ";	relacion[23]="x";
		morse[24]="-.-- ";	relacion[24]="y";
		morse[25]="--.. ";	relacion[25]="z";
		morse[26]=".---- ";	relacion[26]="1";
		morse[27]="..--- ";	relacion[27]="2";
		morse[28]="...-- ";	relacion[28]="3";
		morse[29]="....- ";	relacion[29]="4";
		morse[30]="..... ";	relacion[30]="5";
		morse[31]="-.... ";	relacion[31]="6";
		morse[32]="--... ";	relacion[32]="7";
		morse[33]="---.. ";	relacion[33]="8";
		morse[34]="----. ";	relacion[34]="9";
		morse[35]="----- ";	relacion[35]="0";
		morse[36]="  ";		relacion[36]=" ";
		for (int i = 0; i < nueva.length; i++) {
			for (int j = 0; j < 38; j++) {
				if (nueva[i].equalsIgnoreCase(relacion[j])) {
					resultado[i]=morse[j];
				}
			}
		}
		String salida="";
		for (int k = 0; k < resultado.length; k++) {
			salida+=resultado[k];
		}
		showMessageDialog(null,cadena + "= " + salida);
	}

}
