import javax.swing.JOptionPane;

public class numeroPrimo {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Qual numero primo vc quer saber?"));
        
        JOptionPane.showMessageDialog(null,((ehPrimo(n))? "Numeró "+n+" e primo":"Numeró "+n+" não e primo"));
    }            
    

    //Número Primo
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
    
}
