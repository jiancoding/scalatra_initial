package com.chapter.one.tutorial

import org.scalatra.{Ok, ScalatraServlet}

class HttpExample extends ScalatraServlet {

  get("/city") {
    Ok("you got it")
  }

}
