package com.globalvelocity

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

/*
* User: ctaylor
* Date: 8/12/13
* Time: 12:12 PM
*/

class NumberFiltersTest extends FunSpec with ShouldMatchers with NumberFilters {

  describe("Basic scala collection api tests") {

    it("should filter even numbers") {

      filterEvenNumbers((0 to 10).toList) should equal(List(0, 2, 4, 6, 8, 10))

      filterEvenNumbers(List(0)) should equal(List(0))

      filterEvenNumbers(List(1,3,5,7)) should equal(List.empty)

    }

    it ("should partition an inputList into a 3-tuple of lists containing negatives, zeros, and positives respectively"){

      partitionNumbersBySign(List(20, 15, 0, -5, 0, -1, 3)) should equal(Tuple3(List(-5, -1), List(0, 0), List(20, 15, 3)))

      partitionNumbersBySign(List(20, 15, -5, -1, 3)) should equal(Tuple3(List(-5, -1), List.empty, List(20, 15, 3)))

      partitionNumbersBySign(List.empty) should equal(Tuple3(List.empty, List.empty, List.empty))

    }
  }

}
