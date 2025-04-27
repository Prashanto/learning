package org.pklearning.jdbc.lob;

import java.io.File;
import java.io.FileInputStream;

public class read_store_blob {
    public static void main(String[] args) throws Exception {
        String fileName="C:\\Users\\Prashanto Kumar\\Documents\\PL_SQL_Notes.docx";
        File f=new File(fileName);
        String newFile=f.getParent()+"\\new_"+f.getName();
        try(
            FileInputStream fis=new FileInputStream(f);
        ) {
            ProductLine p = new ProductLine();
            String productLine = "Motorcycles";
            p.storeBlob(productLine, fis);
            p.blobToFile(p.readBlob(productLine),newFile);
            System.out.println("Done");
        }
    }
}
