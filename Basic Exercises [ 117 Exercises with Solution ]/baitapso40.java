package baitaptieptheo;

import java.nio.charset.Charset;
public class baitapso40 {
  public static void main(String[] args) {
	System.out.println("List of available character sets: ");  
    for (String str : Charset.availableCharsets().keySet()) {
      System.out.println(str);
    }
  }
}