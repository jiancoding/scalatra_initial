package com.chapter.one.tutorial.Controller

import com.chapter.one.tutorial.DbUtil._
import org.json4s.DefaultFormats
import org.scalatra.json.JacksonJsonSupport
import org.scalatra.{NotFound, Ok, ScalatraServlet}

class CityController extends ScalatraServlet with JacksonJsonSupport {
  protected implicit lazy val jsonFormats: DefaultFormats.type = DefaultFormats

   before() {
    contentType = formats("json")
  }

  get("/city/:id & :countryCode") {
    val id = params("id").toInt
    val countryCode = params("countryCode")

    val city = findCityById(id)
    city match {
      case None => NotFound()
      case c => Ok(c)
    }
  }

}
