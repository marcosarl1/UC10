package com.cenaflix.model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Classe utilitária para operações de criptografia.
 * 
 */
public class Crypto {

    /**
     * Calcula o hash MD5 de uma string.
     * 
     * @param txt A string para a qual o hash MD5 será calculado.
     * @return O hash MD5 como uma string hexadecimal de 32 caracteres.
     */
    public static String getMD5(String txt) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(txt.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);

            String hashText = no.toString(16);
            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            return hashText;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
