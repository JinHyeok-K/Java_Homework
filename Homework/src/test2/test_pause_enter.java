package test2;

import java.io.*;

public class test_pause_enter {
  public static void main(String[] args) {

    System.out.print("Enter 키를 누르세요");

    pause(); // '중지'시키기

    System.out.println("중지가 풀렸습니다.");

  }




  public static void pause() {
    try {
      System.in.read();
    } catch (IOException e) { }
  }


}