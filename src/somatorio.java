import javax.swing.JOptionPane;

public class somatorio {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros a serem somados?"));
        int soma = 0;
        int i = 0;
        int aux;

        while(i < n){
            aux = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para somar!"));
            soma = soma +aux;
            i++;
        }

        JOptionPane.showMessageDialog(null,"Somatorio total:"+soma);
    }




}
