//Given an array of integers, return a new array with each value doubled.
//  For example:
//[1, 2, 3] --> [2, 4, 6]


object LostWithoutMap extends App{


  def mapping(xs: List[Int]) = {xs.map(n => n *2)}

  println(mapping(List(1,2,3,4,5,6)))

  println("--------------------------")

  def mapping2(xs: List[Int]):List[Int] = {
    for (x <- xs) yield x *2
  }
  println(mapping2(List(1,2,3,4,5,6)))


}
