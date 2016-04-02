package com.pcd;
import cpabe.Cpabe;

public class Main {

    public static void main(String[] args) {
        String PUB_FILE = System.getenv("PCD_PUB_FILE");
        String PRV_FILE = System.getenv("PCD_PRV_FILE");
        String enc_file = args[0];
        String dec_file = enc_file + "dec" ;
        Cpabe bridge = new Cpabe();
        try {
            bridge.dec(PUB_FILE, PRV_FILE, enc_file, dec_file);
        } catch(Exception e) {
            System.err.println(e);
        }

    }
}
