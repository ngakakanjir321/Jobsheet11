package jobsheet11;

import java.util.Locale;

public class bagan2 {
    public static void main(String[] args) {
        String identitas = "Muhamad Fathoni /XRPL 2 / 20";
        System.out.println(" identitas : " + identitas);
      
        String x = "OPERASI";
        System.out.println("isi variable = "+ x);
        System.out.println("\""+ x +"\" Panjang Character = "+ x.length ());
        System.out.println("x adalah kosong = " + x.isEmpty());
        String y = "";
        System.out.println("isi variable y = "+ y);
        System.out.println("y adalah kosong = " + y.isEmpty());

        System.out.println("isi x sama dengan y = " + x.equals(y));
        String z = "operasi";
        System.out.println("isi variable z = " + z);
        System.out.println("isi x sama dengan z (case sensitive) = " + x.equals(z));
        String r = "operasi";
        System.out.println("isi variable r = "+ r);
        System.out.println("isi x sama dengan r (case sensitive = "+ x.equals(r));
        System.out.println("isi x sama dengan r (Not case sensitive) = "+ x.equalsIgnoreCase(r));
           }
}