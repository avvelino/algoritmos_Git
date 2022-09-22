import java.util.Arrays;

import javax.swing.JOptionPane;

public class fibonnacci {
    public static void main(String[] args) throws Exception {

        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos termos de fibonnaci vc quer saber ?"));
        long fi[] = new long[n];
        if(n>1){
            for (int i = 0; i < n; i++) {
                fi[i] = fibo(i);
            }
            JOptionPane.showMessageDialog(null,"Fibonnacci de "+n+" termos: "+Arrays.toString(fi));
        }else if(n<1){
            JOptionPane.showMessageDialog(null,"Valor de termo deve ser maior que 1!!");
        }

    }

    public static long fibo(int n){
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }


}
