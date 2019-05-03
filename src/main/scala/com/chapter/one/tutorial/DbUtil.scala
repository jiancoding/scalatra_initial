package com.chapter.one.tutorial

import doobie._
import doobie.implicits._
import cats.effect.{ContextShift, IO}
import com.chapter.one.tutorial.model.City
import doobie.util.transactor.Transactor.Aux

import scala.concurrent.ExecutionContext

object DbUtil {
  implicit lazy val contextShift: ContextShift[IO] = IO.contextShift(ExecutionContext.global)
  private lazy val xa: Aux[IO, Unit] = Transactor.fromDriverManager[IO](
      "org.postgresql.Driver", // driver classname
      "jdbc:postgresql:world", // connect URL (driver-specific)
      "postgres",              // user
      "postgres"              // paspostgressword
     )

  def findCityById(id: Int): Option[City] = {
    val queryString = sql"SELECT id, name, countrycode, district, population FROM city WHERE id = $id"
    val result: Option[City] = queryString.query[City].option.transact(xa).unsafeRunSync()
    result
  }


}
