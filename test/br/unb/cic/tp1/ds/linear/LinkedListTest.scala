package br.unb.cic.tp1.ds.linear

import org.scalatest.FunSuite

class LinkedListTest extends FunSuite{
  
  test("test constructor"){
    val intLl = new LinkedList[Int]();
    assert(intLl!=null);
  }
  
  test("test insert"){
    val intLinkedList = new LinkedList[Int]();
    intLinkedList.insert(10, 0);
    assert(intLinkedList.elementAt(0) == 10);
    
    intLinkedList.insert(7, 1);
    assert(intLinkedList.elementAt(0) == 10);
    assert(intLinkedList.elementAt(1) == 7);
    
    intLinkedList.insert(2, 0);
    assert(intLinkedList.elementAt(0) == 2);
    assert(intLinkedList.elementAt(1) == 10);
    assert(intLinkedList.elementAt(2) == 7);
  }
  
  test("test insert error"){
    val intLinkedList = new LinkedList[Int]();
    assertThrows[IllegalArgumentException]{
      intLinkedList.insert(7, 1);
    };
  }
  
  test("test clear"){
    val intLinkedList = new LinkedList[Int]();
    intLinkedList.insert(10, 0);
    intLinkedList.insert(11, 0);
    intLinkedList.insert(2, 0);
    intLinkedList.insert(13, 0);
    intLinkedList.insert(4, 0);
    intLinkedList.clear();
    assert(intLinkedList.size()==0);
  }
  
    test("test addAll"){
    val intLinkedList = new LinkedList[Int]();
    intLinkedList.insert(10, 0);
    intLinkedList.insert(11, 0);
    intLinkedList.insert(2, 0);
    intLinkedList.insert(13, 0);
    intLinkedList.insert(4, 0);
    
    val intLinkedList2 = new LinkedList[Int]();
    intLinkedList2.addAll(intLinkedList);
    
    assert(intLinkedList.elementAt(2) == intLinkedList2.elementAt(2));
  }
}
