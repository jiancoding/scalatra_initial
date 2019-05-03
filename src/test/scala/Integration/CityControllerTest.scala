package Integration

import com.chapter.one.tutorial.model.City
import org.json4s.{DefaultFormats, Formats}
import org.json4s._
import org.json4s.jackson.JsonMethods._

class CityControllerTest extends TestBase {

  //reference json library link: https://index.scala-lang.org/json4s/json4s/json4s-jackson/3.5.2?target=_2.12
  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  behavior of "HttpExample"

  it should "return 200 ok when hitting city endpoint" in {
   val id = 101
    val countryCode = "countryCode"
    get(s"/city/$id&$countryCode") {
     assert(status == 200)
     val result = parse(body).extract[City]
     assert(result.id == id)
   }
  }

  it should "return correct city by id when hitting city endpoint" in {
    val id = 100
    val countryCode = "countryCode"
    get(s"/city/$id&$countryCode") {
      assert(status == 200)
      val result = parse(body).extract[Option[City]]
      assert(result.isDefined)
      assert(result.get.id == id)
    }
  }

  it should "do something" in {
    assert(1==1)
  }

  it should "do anything" in {
    assert(1==1)
  }
}
