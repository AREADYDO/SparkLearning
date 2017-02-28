package org.apache.spark.rdd.learning

import org.apache.log4j.{Level, Logger}
import org.apache.spark.util.SparkLearningFunSuite

/**
  *
  * Created by xingyun.xb on 2017/2/28.
  */
class baseSuite extends SparkLearningFunSuite{
  test("accumulatorSuite"){
    Logger.getLogger("org.apache.spark").setLevel(Level.ERROR)
    Logger.getLogger("org.eclipse.jetty.server").setLevel(Level.ERROR)
    val accum = sc.accumulator(0, "My Accumulator")
    var RDD=sc.parallelize(Array(1, 2, 3, 4))
    println(RDD.partitions.length)
      RDD.foreach(x => accum += x)
    println(accum.value)
    println(accum.name)
    println(accum.initialValue)
  }

}
