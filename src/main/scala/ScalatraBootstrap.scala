import com.chapter.one.tutorial.Controller.CityController
import javax.servlet.ServletContext
import org.scalatra._

class ScalatraBootstrap extends LifeCycle{

  override def init(context: ServletContext): Unit = {
    context.mount(new CityController, "/*")
  }

}
