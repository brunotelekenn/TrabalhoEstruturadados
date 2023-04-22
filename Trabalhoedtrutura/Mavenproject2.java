
package Trabalhoedtrutura;

import java.util.Scanner;

/**  * @author Bruno */
public class Mavenproject2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

      
        int[] vetor = new int[tamanho];
        System.out.print("Digite os dados do vetor: ");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = sc.nextInt();
        }

        
        System.out.print("Escolha o método (1-Insertion Sort, 2-Selection Sort, 3-Bubble Sort): ");
        int metodo = sc.nextInt();

       
        if (metodo == 1) {
            insertionSort(vetor);
        } else if (metodo == 2) {
            selectionSort(vetor);
        } else if (metodo == 3) {
            bubbleSort(vetor);
        } else {
            System.out.println("Método de ordenação inválido!");
            return;
        }

        
        System.out.print("Vetor principal: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

   
    public static void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int key = vetor[i];
            int j = i - 1;

            
            
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = key;
        }
    }

    
    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            
            
            
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

  
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
      
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }
}