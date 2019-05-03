package Integration

import com.chapter.one.tutorial.model.City
import org.json4s.{DefaultFormats, Formats}
import org.json4s._
import org.json4s.jackson.JsonMethods._

class HttpExampleTest extends TestBase {

  //reference json library link: https://index.scala-lang.org/json4s/json4s/json4s-jackson/3.5.2?target=_2.12
  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  behavior of "HttpExample"

  it should "return 200 ok when hitting city endpoint" in {
   get("/city") {
     assert(status == 200)

     val result = parse(body).extract[City]
     assert(result.id == 1)
   }
  }

  it should "do something" in {
    assert(1==1)
  }

  it should "do anything" in {
    assert(1==1)
  }
}
