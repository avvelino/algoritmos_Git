import java.util.Arrays;

import javax.swing.JOptionPane;

public class contagem {
    public static void main(String[] args)throws Exception {
        String n = String.valueOf(JOptionPane.showInputDialog(null, "Qual números de entrada em um conjunto de dados?"));
        String verif;
        int cont = 0;
        
        if(isInteger(n)){
            int nInt = Integer.parseInt(n);
            String z[] = new String[nInt];
            cont++;
            for(int i = 0;i<nInt;i++){
                verif = String.valueOf(JOptionPane.showInputDialog(null, "Qual o "+(i+1)+"° dado?"));
                z[i] = verif;
                cont = (isInteger(verif))? cont + 1 : cont;
            }
            
            JOptionPane.showMessageDialog(null, "Números de entradas: "+nInt+".  Dados inseridos: "+Arrays.toString(z)+". Contador de Inteiros: "+cont);
        
        }else{
            JOptionPane.showMessageDialog(null, "Números de entrada deve ser um inteiro!");
        }
        


    
    }

    public static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }
}
