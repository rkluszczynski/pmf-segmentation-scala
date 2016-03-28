import sbt.Keys._
import sbt._

object Build extends Build {

  lazy val commonSettings = Seq(
    organization := "pl.info.rkluszczynski.pmf",
    version := "0.1.0",
    scalaVersion := "2.11.8",

    libraryDependencies ++= Seq(
      "org.springframework.boot" % "spring-boot-starter" % "1.3.3.RELEASE"
    )
  )

  lazy val root = (project in file(".")).
    aggregate(`util`, `core`, `runner`).
    settings(
      aggregate in update := false
    )

  lazy val `core` = (project in file("core")).
    settings(commonSettings: _*).
    settings(
      name := "pmf-segmentation-core"
    )

  lazy val `util` = (project in file("util")).
    settings(commonSettings: _*).
    settings(
      name := "pmf-segmentation-util"
    )

  lazy val `runner` = (project in file("runner")).
    settings(commonSettings: _*).
    settings(
      name := "pmf-segmentation-runner"
    ).
    dependsOn(`core`, `util`)
}
