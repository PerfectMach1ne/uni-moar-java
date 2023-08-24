package Cwiczenie5_2;

import java.io.File;

public class Nazwy {
    Nazwy() {
        File file = new File("D:/WSPA");
        String[] fileList = file.list();
        assert fileList != null;
        for (String name : fileList) System.out.println(name);
    }
}
