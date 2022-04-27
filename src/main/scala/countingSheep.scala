object countingSheep extends App{

  def countingSheep(num: Int): String = {
    val sheep = num + " sheep..."
    if (num == 0) " "
    else if (num == 1) sheep
    else countingSheep(num-1) + sheep

      // num = 2 so last else is run, 2 - 1 = 1 so:
      // countingSheep(1) + (2 sheep)
      // 1 sheep ... 2 sheep
  }
  println(countingSheep(2))

}
