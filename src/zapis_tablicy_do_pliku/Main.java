package zapis_tablicy_do_pliku;

import javax.swing.*;
import java.io.*;

class matrix
{
    int rozmiar = 10;

    public void czytajDane(int tablica[][], int rozmiar)
    {
        int i, j;

        System.out.println("\nTworzymy tablice 10x10 \n");
        for (i = 0; i < rozmiar; i++)
        {
            for (j = 0; j < rozmiar; j++)
            {
                if (i == j)
                    tablica[i][j] = 1;
                else
                    tablica[i][j] = 0;
                System.out.print(tablica[i][j] + " ");
            }//j
            System.out.println();
        }//i
    }

    public void zapiszdanedoPliku(int tablica[][], int rozmiar)
            throws IOException
    {
        int i, j;

        System.out.println();
        System.out.println("Zapisujemy tablice 10x10 do pliku \n");

        FileWriter fw = new FileWriter("dane.txt");

        for (i =0; i <rozmiar; i++)
        {
            for (j = 0; j < rozmiar; j++)
            {
                fw.write((char)(tablica[i][j])); //rzutujemy i zapisujemy tablice do pliku
                System.out.print(tablica[i][j] + " ");
            }//j

            System.out.println();
        }//i

        fw.close(); //zamykamy plik
    }

    public void czytajdanezPliku(int tablica[][], int rozmiar)
            throws IOException
    {
        int i, j;
        System.out.println();
        System.out.println("Odczytujemy tablice 10x10 z pliku. \n");

        FileReader fr = new FileReader("dane.txt");
        BufferedReader br = new BufferedReader(fr);

        for(i = 0; i < rozmiar; i++)
        {
            for (j = 0; j < rozmiar; j++)
            {
                tablica[i][j] = (int) br.read(); //odczytujemy tablice z pliku i rzutujemy
                System.out.print(tablica[i][j] + " ");
            }//j
            System.out.println();
        }//i
        fr.close();//zamykamy plik
    }
} // koniec klasy matrix


public class Main
{
    public static void main(String[] args)
        throws IOException
    {
        int rozmiar = 10;

        int tab[][] = new int[rozmiar][rozmiar];
        int tab1[][] = new int[rozmiar][rozmiar];

        matrix matrix1 = new matrix(); //deklarujemy i tworzymy obiekt matrix1

        matrix1.czytajDane(tab, rozmiar);
        matrix1.zapiszdanedoPliku(tab, rozmiar);
        matrix1.czytajdanezPliku(tab1, rozmiar);
    }
}
