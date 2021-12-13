package tdi.training.java.core.service;

import tdi.training.java.core.data.LatihanNo3;

public class LatihanNo2 {
    
    public void setNamaLengkap(String nama) {
        LatihanNo3 latihan3 = new LatihanNo3();
        System.out.println(String.format("Nama lengkap saya adalah %s", latihan3.getNamaLengkap(nama)));
    }

}
