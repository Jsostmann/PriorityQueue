package com.Ostmann.James;

public class MaxHeap<T extends Comparable<T>> extends Heap<T> {

  public MaxHeap() {

  }

  @Override
  void pop() {

  }

  @Override
  void bubbleUp() {

    index = size - 1;
    parent = (index - 1) / 2;


    while(index > 0 && parent > -1 && (heap[index].compareTo(heap[parent])) > 0) {

      T temp =  heap[parent];

      heap[parent] = swap(heap[parent],heap[index]);

      heap[index] = temp;

      index = parent;

      parent = (parent - 1) / 2;

    }

  }

  @Override
  void bubbleDown() {
    int index = top;

    while(index * 2 + 1 < size) {

      int leftIndex = index * 2 + 1;
      int rightIndex = index * 2 + 2;
      int minIndex = leftIndex;


      if(rightIndex < size) {
        if(heap[minIndex].compareTo(heap[rightIndex]) < 0) {

          minIndex = rightIndex;
        }
      }
      if(heap[index].compareTo(heap[minIndex]) < 0) {

        T temp = heap[index];
        heap[index] = heap[minIndex];
        heap[minIndex] = temp;

        index = minIndex;
      } else {
        break;
      }
    }
  }


}
