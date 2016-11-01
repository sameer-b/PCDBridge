package com.pcd;
import cpabe.Cpabe;

public class Main {

    public static void main(String[] args) {
        String PUB_FILE = args[0];
        String PRV_FILE = args[1];
        String enc_file = args[2];
        String dec_file = enc_file;
        Cpabe bridge = new Cpabe();
        try {
            bridge.dec(PUB_FILE, PRV_FILE, enc_file, dec_file);
        } catch(Exception e) {
            System.err.println(e);
        }

    }
}
