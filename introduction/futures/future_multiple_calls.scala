// An example of running many futures concurrently 

import scala.concurrent.{Await, Future, future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scala.util.Random

object Sleep {
  def sleep(time: Long) {
  	Thread.sleep(time)
	}
}

object Cloud {
  def runAlgorithm(i: Int): Future[Int] = future {
    Sleep.sleep(Random.nextInt(500))
    val result = i + 10
    result
  }
}

object RunningMultipleCalcs extends App {
  println("starting futures")
  val result1 = Cloud.runAlgorithm(10)
  val result2 = Cloud.runAlgorithm(20)
  val result3 = Cloud.runAlgorithm(30)
  
  println("before comprehension")
  val result = for {
    r1 <- result1
    r2 <- result2
    r3 <- result3
  } yield (r1 + r2 + r3)
  
  println("before onSuccess")
  result onSuccess {
    case result => println(s"total = $result")
  }
  
  println("before sleep at the end")
  Sleep.sleep(2000)
}
