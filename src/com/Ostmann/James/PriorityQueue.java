package com.Ostmann.James;

public class PriorityQueue<E extends Comparable<E>> {
  private Heap<E> heap;

  public PriorityQueue() {
    heap = new MinHeap<>();
  }

  public void add(E obj){

    heap.push(obj);
  }
  public void remove() {

    heap.pop();
  }


  @Override
  public String toString(){

    return heap.toString();

  }
}
