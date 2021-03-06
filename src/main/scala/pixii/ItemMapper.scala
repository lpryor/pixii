package pixii

import com.amazonaws.services.dynamodbv2.model._
import scala.collection._

/** User-provided conversion to/from attributes values */
trait ItemMapper[T] {
  def apply(value: T): Map[String, AttributeValue]
  def unapply(attributes: Map[String, AttributeValue]): T
}
