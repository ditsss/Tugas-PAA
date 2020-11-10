package insertionsort;  

import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
                        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("==== SELAMAT DATANG DI PROGRAM INSERTION SORT====");
        System.out.println("======= DENGAN METODE DIVIDE AND CONQUER ========\n");
    
            System.out.print("Input banyaknya Data : ");    int jlh_data = scan.nextInt();

            int[] data = new int[jlh_data];
            for(int a = 0; a < jlh_data; a++)
        {
            System.out.print("Nilai Data ke-"+(a+1)+" : "); data[a] = scan.nextInt();
        }
  
        System.out.println("Data Sebelum di Sorting : "+Arrays.toString(data));                                                 
         
        //  Proses Algoritma Divide and Conquer
        //  Divide (Pemisahan Data)
        System.out.println("\nDivide");
        for(int a = 0; a < data.length; a++)
        {
            System.out.println("Iterasi ke-"+(a+1));
            for(int b = 0; b < data.length; b++)
            {
                if(b == 0 || b <= a)
                {
                    System.out.print("| "+data[b]+" ");
                }

                else
                {
                    System.out.print(" "+data[b]);
                }
                 
                if(b == a)
                {
                    System.out.print("|");
                }
            }
            System.out.println("\n");
        }
      
         // Merge atau Combine atau Conquer (Penggabungan Data sembari di Sorting)
        System.out.println("Merge/Combine/Conquer");
        for(int a = 0; a < data.length-1; a++)
        {
            System.out.println("Iterasi ke-"+(a+2));
            
        //  Proses Sorting Insertion Sort
            for(int b = a+1; b > 0; b--)
            {
                if(data[b] < data[b-1])
                {
                    int temp = data[b];
                    data[b] = data[b-1];
                    data[b-1] = temp;
                }
            }
             
            for(int c = 0; c < data.length; c++)
            {
                if(c <= a+1)
                {
                    System.out.print(data[c]+" ");
                }
                 
                else
                {   
                    if(a == data.length-1)
                    {
                        System.out.print(data[c]);
                            continue;
                    }
                     
                    System.out.print("| "+data[c]+" ");
                     
                    if(c == data.length-1)
                        System.out.print("|");
                }  
            }
            System.out.println("\n");
           
        }           
            System.out.println("Data Setelah di Sorting : "+Arrays.toString(data));
    }
    }