object CalculatingCost extends App{

  def cost(days: Int): Int = {
    val oneDay = 40
    if (days < 3) days * oneDay
    else if (days >= 7) days * oneDay - 50
    else if (days >= 3) days * oneDay - 20
    else 0
  }

  // else cost((days * oneDay) -50)

  // else days >= 7 (days * 40 - 50)

  println(cost(1))

  println("------------------------")

// another approach
  def cost2(days : Int) : Int = {
    val pricePerDay = 40
    if (days < 3) {
      return days*pricePerDay
    }
    else if (days > 2 && days < 7) {
      return days*pricePerDay-20
    }
    days*pricePerDay-50
  }

  println(cost(1))

}

