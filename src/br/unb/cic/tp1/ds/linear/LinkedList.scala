package br.unb.cic.tp1.ds.linear

class Node[T] (value : T, next : Node[T] = null) {
  val _value : T = value;
  var _next : Node[T] = next;
}

class LinkedList[T] extends List[T]{
  
  var _size : Int = 0;
  val _head : Node[T] = null;
  
  override def size() : Int = {
    return _size;
  }
  
  override def insert(v : T, pos : Int) : Unit = {
    require(pos >= 0 && pos < _size);
    
    val newNode = new Node[T](v,null);
    var prevNode : Node[T] = null;
    
    if(pos == 0){
      newNode._next = _head._next;
      _head._next = newNode;
    }else{
      prevNode = _head._next;
      for(i <- 0 until pos-1) prevNode = prevNode._next
      
      newNode._next = prevNode._next;
      prevNode._next = newNode;
    }
    
    _size+=1;
  }

  
  override def elementAt(pos : Int) : T = {
    require(pos >= 0 && pos < _size)
    var it = _head;
    for(i <- 0 until pos) {it = it._next}
    return it._value;
  }
  
  override def addAll[S <: T](elements : List[S]): Unit = {
    for(v <- 0 until elements.size){
      this.insert(elements.elementAt(v), v);
    }
  }
 
  override def clear() : Unit = {
    _size = 0;
    _head._next = null;
  }
  
}