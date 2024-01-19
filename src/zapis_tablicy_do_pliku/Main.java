package zapis_tablicy_do_pliku;

import javax.swing.*;
import java.io.*;

class matrix
{
    int rozmiar = 10;

    public void czytajDane()
    {
        int i, j;

        System.out.println("Tworzymy tablice 10x10");
        for (i = 0; i < j; i++)
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
        System.out.println("Zapisujemy tablice 10x10 do pliku");

        FileWriter fr = new FileWriter(dane.txt);

        for (i =0; i <rozmiar; i++)
        {
            for (j = 0; j < rozmiar; j++)
            {
                fw.write((char)(tablica[i][j])); //rzutujemy i zapisujemy tablice do pliku
                System.out.print(tablica[i][j] + " ");
            }//j

            System.out.println();
        }//i
    }

    ///////////////////////////////////////////////////////////////////////////////
}



public class Main {
}
