package br.unb.cic.tp1.ds.linear

import org.scalatest.FunSuite

class StackTest extends FunSuite{
  
  test("test constructor"){
    val stack = new Stack[Int]();
    assert(stack!=null);
  }
  
  test("test insert"){
    val intStack = new Stack[Int]();
    intStack.insert(1);
    assert(intStack.elementAt(0) == 1);
    
    intStack.insert(2);
    assert(intStack.elementAt(0) == 2);
    assert(intStack.elementAt(1) == 1);
    
    intStack.insert(3);
    assert(intStack.elementAt(0) == 3);
    assert(intStack.elementAt(1) == 2);
    assert(intStack.elementAt(2) == 1);
  }
  
  test("test remvoe"){
    val intStack = new Stack[Int]();
    
    intStack.insert(1);
    intStack.insert(2);
    intStack.insert(3);
    intStack.remove();
    assert(intStack.elementAt(0) == 2);
  }
}