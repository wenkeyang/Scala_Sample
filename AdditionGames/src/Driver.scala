

object Driver {
  def main(args: Array[String]): Unit = {
    val list1 = Array(3, 4, 5)
    val list2 = Array(1, 1, 1)
    val list3 = Array(3, 5, 48)
    val list4 = Array(36, 36, 36)
    val list5 = Array(8, 2, 6)

    val time1 = 3
    val time2 = 8
    val time3 = 40
    val time4 = 13
    val time5 = 13

    println(AdditionGame.getMaximumPoints(list1, time1))
    println(AdditionGame.getMaximumPoints(list2, time2))
    println(AdditionGame.getMaximumPoints(list3, time3))
    println(AdditionGame.getMaximumPoints(list4, time4))
    println(AdditionGame.getMaximumPoints(list5, time5))

  }
}