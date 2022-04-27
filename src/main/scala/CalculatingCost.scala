object CalculatingCost extends App{

  def cost(days: Int): Int = {
    val oneDay = 40
    if (days == 1) oneDay
    else if (days >= 7) days * oneDay - 50
    else if (days >= 3) days * oneDay - 20
    else 0
  }

  // else cost((days * oneDay) -50)

  // else days >= 7 (days * 40 - 50)

  println(cost(8))

}

