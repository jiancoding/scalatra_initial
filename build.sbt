
name := "scalatra_initial"

version := "0.1"

scalaVersion := "2.12.0"

val ScalatraVersion = "2.6.+"

libraryDependencies ++= Seq(
  "org.scalatra"            %% "scalatra"          % ScalatraVersion,
  "org.scalatra"            %% "scalatra-scalate"  % ScalatraVersion,
  "ch.qos.logback"          %  "logback-classic"   % "1.2.3"            % "provided",
  "org.eclipse.jetty"       %  "jetty-webapp"      % "9.4.7.v20170914"  % "provided",
  "javax.servlet"           %  "javax.servlet-api" % "3.1.0"            % "provided",
  //test
  "org.scalatra"            %% "scalatra-scalatest" % "2.6.5"            % "test"
)

enablePlugins(ScalatraPlugin)