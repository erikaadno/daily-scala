package com.github.study.FizzBuzz

/**
 * Created by tamaki on 2015/02/08.
 */
object FizzBuzz {

  val list = (1 to 100)
  // 一番スタンダードなやつ
  def useMap = {
    val result = list.map{ i =>
      i match {
        case i if i % 15 == 0 => "FizzBuzz"
        case i if i % 5 == 0 => "Buzz"
        case i if i % 3 == 0 => "Fizz"
        case _ => i.toString
      }
    }
    println(result.mkString("\n"))
  }

  def useFor = {
    val result = for {
      i <-list
    } yield {
      i match {
        case i if i % 15 == 0 => "FizzBuzz"
        case i if i % 5 == 0 => "Buzz"
        case i if i % 3 == 0 => "Fizz"
        case _ => i.toString
      }
    }
    println(result.mkString("\n"))
  }

  def useTailrec = {
    def loop(fizzbuzzed: Seq[String], acc: Seq[Int]): Seq[String] = {
      acc match {
        case h :: t if h % 15 == 0 => loop(fizzbuzzed :+ "FizzBuzz", t)
        case h :: t if h % 5 == 0 => loop(fizzbuzzed :+ "Buzz", t)
        case h :: t if h % 3 == 0 => loop(fizzbuzzed :+ "Fizz", t)
        case h :: t => loop(fizzbuzzed :+ h.toString, t)
        case _ => fizzbuzzed
      }
    }
    println(loop(Nil, (1 to 100).toList.toSeq).mkString("\n"))
  }
}
