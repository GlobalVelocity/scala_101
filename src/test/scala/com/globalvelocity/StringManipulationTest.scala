package com.globalvelocity

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

/**
 * Created by tpalmer on 6/5/14.
 */
class StringManipulationTest extends FunSpec with ShouldMatchers with StringManipulation {

  describe("String Manipulation Test") {
    it ("should filter whitespace") {
      removeWhitespace(List("test", "this is a test")) should equal (List("test", "thisisatest"))
      removeWhitespace(List("", "another test", " spaces \tand tabs", " and \n newlines")) should equal (List("", "anothertest", "spacesandtabs", "andnewlines"))
      removeWhitespace(List.empty[String]) should equal (List.empty[String])
    }
  }
}
