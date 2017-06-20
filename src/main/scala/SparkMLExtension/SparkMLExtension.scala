package SparkMLExtension

/**
  * Created by victorvulovic on 6/19/17.
  */

import org.apache.spark.{SparkConf, SparkContext}

object SparkMLExtension {
  def main(args: Array[String]): SparkContext = {
    val conf = new SparkConf ()
      .setMaster("local[*]") //(args.lift(0).toString())
      .setAppName("my app") //(args.lift(1).toString())
    val sc = new SparkContext (conf)

//   println(sc.parallelize(1 to 100).sum)
//  val tweets = sc.textFile("file:///Users/victorvulovic/Tweets/conor-twitterdata-1-2017-04-12-18-43-41-64dd2536-cb04-4058-8780-324e99f103f4")
//    tweets.take(2).foreach(println)
    sc
  }
}
