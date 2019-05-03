package com.chapter.one.tutorial

import com.chapter.one.tutorial.model.City
import org.json4s.DefaultFormats
import org.scalatra.json.JacksonJsonSupport
import org.scalatra.{Ok, ScalatraServlet}


class HttpExample extends ScalatraServlet with JacksonJsonSupport {

   before() {
    contentType = formats("json")
  }

  protected implicit lazy val jsonFormats: DefaultFormats.type = DefaultFormats

  get("/city") {
    val city = City(1, "name", "countryCode", "district", 11)
    Ok(city)
  }

}
