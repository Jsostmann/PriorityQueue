package com.Ostmann.James;


public abstract class Heap<T extends Comparable<T>> {
  protected int capacity;
  protected int size;
  protected final int top = 0;
  protected T[] heap;


  protected int index = size - 1;
  protected int parent = (index - 1) / 2;


  public Heap(){
      this.capacity = 10000;
      this.size = 0;
      heap = (T[]) new Comparable[capacity];
  }


  public int getSize(){

    return this.size;
  }
  public  T getTop() {
    if(size > 0) {
      return (T) heap[top];
    }
    return null;
  }
  void push(T obj) {

    heap[size++] = obj;

    bubbleUp();

  }
  T poll() {

    if(size > 0) {
      return (T)heap[top];
    }
    return null;
  }
  void pop() {

    if(!this.isEmpty()) {

      heap[top] = heap[--size];
      bubbleDown();

    }
  }
  public boolean isEmpty() {

    return getSize() == 0;
  }


  @Override
  public String toString(){

    String answer = "";

    for(int i = 0; i < size; i++) {

      T temp = heap[i];

      answer += temp.toString();

      answer += System.lineSeparator();

     }

    return answer;
  }
  protected boolean hasLeftChild(int current) {

    return current * 2 + 1 < size;
  }
  protected boolean hasRightChild(int current) {

    return current * 2  + 2 < size;
  }
  protected boolean hasParent(int current) {

    return (current - 1) / 2 > -1;
  }


  T swap(T obj1, T obj2) {

    return obj2;
  }

  void increment() {

    this.index = parent;
    this.parent = (parent - 1) / 2;

  }

  abstract void bubbleUp();
  abstract void bubbleDown();
}
