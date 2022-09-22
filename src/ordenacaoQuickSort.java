import java.util.Arrays;

import javax.swing.JOptionPane;

public class ordenacaoQuickSort {
    public static void main(String[] args)throws Exception {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual tamanho do vetor que vc quer ordenar? (Vetor gerado com valores aleatorios de 0 a 100)"));
        int vetor[] = new int[n];
        
        for(int i = 0; i < vetor.length; i++) {
            int rnd = (int) (1 + Math.random() * 100);
            vetor[i] = rnd;
        }
        JOptionPane.showMessageDialog(null, "Vetor gerado aleatoriamento: "+Arrays.toString(vetor));
            sort(vetor,0,vetor.length - 1);
            Thread.currentThread();
            Thread.sleep(100);
        JOptionPane.showMessageDialog(null, "Vetor ORDENADO QuickSort"+Arrays.toString(vetor));
    }

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1); 
        for (int j=low; j<high; j++){

            if (arr[j] <= pivot)
            {
                i++;
    
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
    
        return i+1;
    }
    
    public static void sort(int arr[], int low, int high){
        if (low < high)
        {
            int pi = partition(arr, low, high);
    
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    

}
