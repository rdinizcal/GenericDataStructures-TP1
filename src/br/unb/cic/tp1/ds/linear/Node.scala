package br.unb.cic.tp1.ds.linear

class Node[T] (value : T, next : Node[T] = null) {
  val _value : T = value;
  var _next : Node[T] = next;
  
  override def toString: String = {
    return "%d".format(_value);
  }
}