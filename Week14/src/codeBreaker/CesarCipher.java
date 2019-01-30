package codeBreaker;

public class CesarCipher {

	public static void main(String[] args) {
		System.out.println(encrypt("word",3));
		System.out.println(decrypt("Neze",4));
	}
	
	public static String encrypt(String original, int key) {
		
		System.out.println("password is "+original);
		
		char[] orgArray = original.toCharArray();
		for(int index = 0; index<original.length();index++) {
			orgArray[index]+=key;
		} 
		
		return String.valueOf(orgArray);
	}
	public static String decrypt(String original, int key) {
		
		char[] charArray = original.toCharArray();
		for(int index =0; index <charArray.length; index++) {
			charArray[index]-=key;
		}
		return String.valueOf(charArray);
	}
	

}
