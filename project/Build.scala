import com.github.retronym.SbtOneJar._
import sbt.Keys._
import sbt._

object Build extends Build {

  lazy val root = (project in file(".")).
    aggregate(`core`, `util`, `runner`).
    settings(
      aggregate in update := false
    )

  private lazy val commonSettings = Seq(
    organization := "pl.info.rkluszczynski.pmf",
    version := "0.1.0",
    scalaVersion := "2.11.8",

    libraryDependencies ++= Seq(
      "org.springframework.boot" % "spring-boot-starter" % "1.3.3.RELEASE"
    ),

    exportJars := true
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
    dependsOn(`core`, `util`).
    settings(commonSettings: _*).
    settings(oneJarSettings: _*).
    settings(
      name := "pmf-segmentation-runner",

      mainClass in oneJar := Some("pl.info.rkluszczynski.pmf.runner.Application")
    )
}
