package br.unb.cic.tp1.ds

trait List[T] {
  def insert(v : T) : Unit;
  def elementAt(pos : Int) : Unit;
  def size : Int;
  def addAll[S <: T](elements : List[S]): Unit
}