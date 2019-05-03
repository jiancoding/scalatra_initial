
name := "scalatra_initial"

version := "0.1"

scalaVersion := "2.12.0"

val ScalatraVersion = "2.6.+"
lazy val doobieVersion = "0.6.0"

libraryDependencies ++= Seq(
  "org.scalatra"            %% "scalatra"           % ScalatraVersion,
  "org.scalatra"            %% "scalatra-scalate"   % ScalatraVersion,
  "javax.servlet"           %  "javax.servlet-api"  % "3.1.0"            % "provided",
  //json lib
  "org.scalatra"            %% "scalatra-json"      % ScalatraVersion,
  "org.json4s"              %% "json4s-jackson"     % "3.5.2",
  //doobie lib
  "org.tpolecat"            %% "doobie-core"        % doobieVersion,
  "org.tpolecat"            %% "doobie-postgres"    % doobieVersion,
  "org.tpolecat"            %% "doobie-hikari"      % doobieVersion,
  "org.tpolecat"            %% "doobie-scalatest"   % doobieVersion     % "test",  // ScalaTest support for typechecking statements.
  
  //logging
  "ch.qos.logback"          %  "logback-classic"    % "1.2.3"            % "provided",
  //test
  "org.scalatra"            %% "scalatra-scalatest" % "2.6.5"            % "test"
)

enablePlugins(ScalatraPlugin)