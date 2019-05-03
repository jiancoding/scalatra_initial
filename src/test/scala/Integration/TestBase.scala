package Integration

import com.chapter.one.tutorial.HttpExample
import org.scalatest.BeforeAndAfterEach
import org.scalatra.test.scalatest.ScalatraFlatSpec

trait TestBase
  extends ScalatraFlatSpec
    with BeforeAndAfterEach {

    override def beforeAll() {
     super.beforeAll()
     addServlet(classOf[HttpExample], path="/*")
    }

}
