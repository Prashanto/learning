package org.pklearning.jdbc.lob;

import java.io.*;

public class read_store_clob {

    public static void main(String[] args) throws Exception {
        String textFile="C:\\Users\\Prashanto Kumar\\Documents\\Install Mass Effect 2.log";
        String productLine="Classic Cars";
        try (FileReader fr=new FileReader(textFile);
                ){
            ProductLine pl=new ProductLine();
            pl.storeClob(productLine,fr);
            System.out.println("Printing contents_________________________________________");
            pl.printClobColumn(pl.readClob(productLine));
        }


    }
}