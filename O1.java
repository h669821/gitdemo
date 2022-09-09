import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=11;
		
		for (int i=1; i<n; ++i) {
			 String meldingTxt="skrive inn inntekten";
			 int inntekten=Integer.parseInt(showInputDialog(meldingTxt));
		        if (inntekten<0) {
		            showMessageDialog(null,"det finnes ingen minus inntekten");}
		        else if (inntekten<164100){
		        	showMessageDialog(null,"trinnsats er 0%");}
		        else if (inntekten>=164101 && inntekten<=230950) {
		        	showMessageDialog(null,"trinnsats er 0,93%");}
		        else if (inntekten>=230951 && inntekten<=580650) {
		        	showMessageDialog(null,"trinnsats er 2,41%");}
		        else if (inntekten>=580651 && inntekten<=934050) {
		        	showMessageDialog(null,"trinnsats er 11,52%");}
		        else if (inntekten>934051) {
		        	showMessageDialog(null,"trinnsats er 14,52%");}
		        	}
		        }
		}
		