package com.globalvelocity

/*
* User: ctaylor
* Date: 8/12/13
* Time: 12:10 PM
*/

trait NumberFilters {

  //TODO: Implement these so the test will succeed.

  def filterEvenNumbers(ints:List[Int]):List[Int] = {
    //Implement here
    List.empty[Int]
  }

    /**
     * This method takes an input List[Int] and partitions it into a 3-tuple of lists as follows:
     * [See NumberFiltersTest for more examples]
     * val inputList = List(20, 15, 0, -5, 0, -1, 3)
     * val partitionedResult = Tuple3(List(-5, -1), List(0, 0), List(20, 15, 3))
     */
  def partitionNumbersBySign(ints:List[Int]):Tuple3[List[Int], List[Int], List[Int]] = {
      //Implement here
      Tuple3(List.empty[Int], List.empty[Int], List.empty[Int])
    }
}
