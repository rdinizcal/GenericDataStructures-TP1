package br.unb.cic.tp1.ds.linear

class Stack[T] extends List[T] {
    
  var _size = 0;
  var _head : Node[T] = null;
  
  override def size = _size;
  
  override def insert(v : T, pos : Int = 0) = {
    val newNode = new Node[T](v);
    
    if(_head == null) _head = new Node[T](v);
    
    if(_head._next == null){
      _head._next = newNode;
    }else{
      newNode._next = _head._next;
      _head._next = newNode;
    }
     
    _size+=1;
  };
  
  def remove() = {
    require(_head._next != null);
    _head._next = _head._next._next;
  }
  
  override def elementAt(pos : Int) : T = {
    require(pos >= 0 && pos <= _size);
    var it = _head._next;
    for(i <- 0 until pos) {it = it._next}
    return it._value;
  };
  
  override def addAll[S <: T](elements : List[S]): Unit = {
    for(v <- 0 until elements.size){
      this.insert(elements.elementAt(v));
    }
  };
  
  override def clear() : Unit = {
    _size = 0;
    _head._next = null;
  };
}