
name := "scalatra_initial"

version := "0.1"

scalaVersion := "2.12.0"

val ScalatraVersion = "2.6.+"

libraryDependencies ++= Seq(
  "org.scalatra"            %% "scalatra"          % ScalatraVersion,
  "org.scalatra"            %% "scalatra-scalate"  % ScalatraVersion,
  "javax.servlet"           %  "javax.servlet-api" % "3.1.0"            % "provided",

  "org.scalatra"            %% "scalatra-json"     % ScalatraVersion,
  "org.json4s"              %% "json4s-jackson"    % "3.5.2",
  //logging
  "ch.qos.logback"          %  "logback-classic"   % "1.2.3"            % "provided",
  //test
  "org.scalatra"            %% "scalatra-scalatest" % "2.6.5"            % "test"
)

enablePlugins(ScalatraPlugin)