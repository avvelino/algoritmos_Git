import javax.swing.JOptionPane;

public class mdc {
    public static void main(String[] args)throws Exception {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira PRIMEIRO valor"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira SEGUNDO valor"));
        int mdc = calculaMDC(valor1, valor2);
        JOptionPane.showMessageDialog(null,"Maximo divisor comum: "+mdc);
    }

    public static int calculaMDC(int valor1,int valor2) {
        
     
        int resto;
        while (valor2 != 0) {
            resto = valor1 % valor2;
            valor1 = valor2;
            valor2 = resto;
            
        }
        return valor1;  
    }
}
