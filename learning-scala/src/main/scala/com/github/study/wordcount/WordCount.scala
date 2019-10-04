package com.github.study.wordcount

/**
 * Created by tamaki on 2015/02/08.
 */
class WordCount {

  //------------------------------------------------------
  // ワードカウント問題
  // https://gist.github.com/j5ik2o/7210762
  //------------------------------------------------------
  def countFruitsFromLines(lines: List[String]): Map[String, Int] = {
    ???
  }

  def fib(n: Int): Int = {
    def loop(target: Int, init: Int, acc: Int): Int = {
      if (target == 0) init
      else loop(target - 1, acc, init + acc)
    }
    loop(n, 0, 1)
  }

  def fact(n: Int): Long = {
    def loop(target: Long, acc: Long): Long = {
      if (target == 1) acc
      else loop(target - 1, acc * target)
    }
    loop(n.toLong, 1L)
  }

  def getSum(numbers: List[Int]): Long {
    def loop(sum: Int, acc: List[Int]): Long = {
      if (acc.isEmpty) sum
      else loop(sum + acc.head, acc.tail)
    }
    loop(0, numbers)
  }

//  /**
//   * 勉強会をやる発端となったダメコード
//   * @param lines
//   * @return
//   */
//  def countFruitsFromLines(lines: List[String]): Map[String, Int] = {
//    lines.foldLeft(new scala.collection.mutable.HashMap[String, Int]) { (b, line) =>
//      line.split(" ").map( m => {
//        val cnt:Int = b.get(m).getOrElse(0) + 1
//        b.put(m, cnt)
//      })
//      b
//    }.toMap
//  }

}
