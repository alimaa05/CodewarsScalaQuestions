object ArrayDiff extends App{

  def arrayDiff(a: Seq[Int], b: Seq[Int]) = {
    if (b.isEmpty) a
    else if (a.isEmpty) a
    else {for (n <- 0 until b.length) yield {
      a.filter(_.!=(b(n)))
    }}

  }
  println(arrayDiff(Seq(1,2,3,4,5,5), Seq(1,2)))

}
