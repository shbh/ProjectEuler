package com.project.euler.feature;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



 
@SuppressWarnings("restriction")
public final class Encrypt {
    
	public static synchronized String encrypt(String plaintext,
            String algorithm, String encoding) throws Exception {
        MessageDigest msgDigest = null;
        String hashValue = null;
        try {
            msgDigest = MessageDigest.getInstance(algorithm);
            msgDigest.update(plaintext.getBytes(encoding));
            byte rawByte[] = msgDigest.digest();
            hashValue = (new sun.misc.BASE64Encoder()).encode(rawByte);
 
        } catch (NoSuchAlgorithmException e) {
            System.out.println("No Such Algorithm Exists");
        } catch (UnsupportedEncodingException e) {
            System.out.println("The Encoding Is Not Supported");
        }
        return hashValue;
    }
 
//    public static void main(String args[]) throws Exception {
//      /*  String plainPassword = "SecretPassword";
// 
//        System.out.println("PlainText\tAlgo\tEncoding\tEncrypted Password");
//        System.out.println(plainPassword + "\tSHA\tUTF-8\t"
//                + encrypt("MySecretPassword", "SHA", "UTF-8"));
//        System.out.println(plainPassword + "\tSHA-1\tUTF-16\t"
//                + encrypt("MySecretPassword", "SHA-1", "UTF-16"));
//        System.out.println(plainPassword + "\tMD5\tUTF-8\t"
//                + encrypt("MySecretPassword", "MD5", "UTF-8"));
//        System.out.println(plainPassword + "\tMD5\tUTF-16\t"
//                + encrypt("MySecretPassword", "MD5", "UTF-16"));
// 	*/
//    
//    	
//    	Reader reader = Reader.getInstance();
//    	java.util.Map<Integer,String> results = reader.getResults();
//    	
//    	for(java.util.Map.Entry<Integer, String> entry : results.entrySet())
//    	{
//    		System.out.println(entry.getKey()+"="+encrypt(entry.getValue(), "SHA", "UTF-8"));
//    	}
//    	
//
//    
//    }
    
    
    
}