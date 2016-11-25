import scala.util.control._

object CardStraights {

  def longestStraight(cards: Array[Int]): Int = {
    var sortedList = cards.sortWith((_ < _))
    //sort the raw data 
    var slwithoutJ = sortedList.dropWhile(_ == 0)
    //get rid of joker

    var removedu = slwithoutJ.distinct

    var joker = 0;
    for (arg <- sortedList) {
      if (arg == 0)
        joker += 1
    }
    //Get the number of joker
    var tempjoker = joker;
    var temp = 0;
    var loop = new Breaks
    var count = 0;
    var biggestcount = 0;

    for (arg <- removedu) {
      temp = arg
      tempjoker = joker;
      count = 0

      loop.breakable {
        while (temp <= (removedu.last + joker)) {

          if (removedu.exists(_ == temp)) {
            count += 1
            temp += 1
          } else {

            if (tempjoker > 0) {
              tempjoker -= 1
              count += 1
              temp += 1

            } else {

              if (count > biggestcount) {
                biggestcount = count
              }
              loop.break;
            }
          }
        }

      }

    }
    biggestcount
  }
}