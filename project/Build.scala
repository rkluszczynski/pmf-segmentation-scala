import sbt.Keys._
import sbt._

object Build extends Build {

  lazy val commonSettings = Seq(
    organization := "pl.info.rkluszczynski.pmf",
    version := "0.1.0",
    scalaVersion := "2.11.8"
  )

  lazy val root = (project in file(".")).
    aggregate(`util`, `core`).
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
}
