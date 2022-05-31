import scala.runtime.ScalaRunTime.stringOf

object RemoveElement extends App{
  def removeElement(nums: Array[Int], `val`: Int)  = {

    val nums2 = nums.map(_.toString)
    val filterNum : Array[String] = nums2.filterNot(n => n == (`val`).toString)

   val counter = nums2.length - filterNum.length

//    var filterNum2 = filterNum

    var filterNum3: Array[String] = Array()

        for (n <- 1 to counter ) yield {
          filterNum3 = filterNum3 :+ "_"
        }
  val newArray : Array[String] = Array.concat(filterNum, filterNum3)
  println(stringOf(newArray))
    filterNum.length
  }
  println(removeElement(Array(3,2,2,3), 3))
}
