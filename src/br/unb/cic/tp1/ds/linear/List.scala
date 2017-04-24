package br.unb.cic.tp1.ds.linear

trait List[T] {  
  def size : Int;
  def insert(v : T, pos : Int) : Unit;
  def elementAt(pos : Int) : T;
  def addAll[S <: T](elements : List[S]): Unit
  def clear() : Unit;
}