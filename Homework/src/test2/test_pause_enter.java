package test2;

import java.io.*;

public class test_pause_enter {
  public static void main(String[] args) {

    System.out.print("Enter Ű�� ��������");

    pause(); // '����'��Ű��

    System.out.println("������ Ǯ�Ƚ��ϴ�.");

  }




  public static void pause() {
    try {
      System.in.read();
    } catch (IOException e) { }
  }


}