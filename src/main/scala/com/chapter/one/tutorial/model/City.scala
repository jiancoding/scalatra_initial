package com.chapter.one.tutorial.model

case class City(id: Int,
                name: String,
                countryCode: String,
                district: String,
                population: Int
               )


case class Country(code: String,
                   name: String,
                   continent: String,
                   region: String,
                   surfaceArea: Float, //todo pg real data type mapping to float type from scala?
                   indepYear: String, //todo could be null in db
                   popluation: Int,
                   lifeExpectancy: Float, //todo pg real data type mapping to float type from scala?
                   gnp: Double,
                   gnpold: String, //todo could be null in db
                   localName: String,
                   governmentForm: String,
                   headOfState: String,
                   capital: Int,
                   code2: String
                  )

case class countryLanguage(countryCode: String,
                           language: String,
                           isoOfficial: Boolean,
                           percentage: Double
                          )