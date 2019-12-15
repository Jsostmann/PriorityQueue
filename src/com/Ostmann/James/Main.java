package com.Ostmann.James;

public class Main {

  public static void main(String[] args) {

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    pq.add(5);
    pq.add(4);
    pq.add(3);
    pq.add(2);
    pq.add(1);
    System.out.println(pq);
    pq.remove();
    System.out.println(pq);


  }
}
