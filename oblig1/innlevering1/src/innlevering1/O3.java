package innlevering1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int faktult=1;
	        String meldingTxt="nummer!";
	        int n=Integer.parseInt(showInputDialog(meldingTxt));
	        if (n<0)
	            showMessageDialog(null,"vi kan ikke renge med mindre enn null");
	        else
	        {
	            for(int i=1;i<=n;i++)
	            {
	                if(n>0) {
	                    faktult=faktult*i;
	                }
	            }
	            showMessageDialog(null,"verdien" +n+ "!="+faktult);
	        }
	    }
	}