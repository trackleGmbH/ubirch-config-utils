
/*
 * BASIC INFORMATION
 ********************************************************/

name := "ubirch-config-utils"
description := "common config related code"
version := "0.2.4"
organization := "com.ubirch.util"
homepage := Some(url("http://ubirch.com"))
scalaVersion := "2.11.12"
scalacOptions ++= Seq(
  "-feature"
)
scmInfo := Some(ScmInfo(
  url("https://github.com/ubirch/ubirch-config-utils"),
  "https://github.com/ubirch/ubirch-config-utils.git"
))

/*
 * CREDENTIALS
 ********************************************************/
//
(sys.env.get("CLOUDREPO_USER"), sys.env.get("CLOUDREPO_PW")) match {
  case (Some(username), Some(password)) =>
    println("USERNAME and/or PASSWORD found.")
    credentials += Credentials("ubirch.mycloudrepo.io", "ubirch.mycloudrepo.io", username, password)
  case _ =>
    println("USERNAME and/or PASSWORD is taken from /.sbt/.credentials")
    credentials += Credentials(Path.userHome / ".sbt" / ".credentials")
}

/*
 * RESOLVER
 ********************************************************/


resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"))


/*
 * PUBLISHING
 ********************************************************/

publishTo := Some("io.cloudrepo" at "https://ubirch.mycloudrepo.io/repositories/ubirch-utils-mvn")
publishMavenStyle := true



/*
 * DEPENDENCIES
 ********************************************************/

lazy val typesafeConfig = "com.typesafe" % "config" % "1.3.3"
lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"

libraryDependencies ++= Seq(
  typesafeConfig,
  scalaTest % "test"
)
