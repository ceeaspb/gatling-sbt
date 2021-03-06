import sbt._

object Dependencies {

	private val testInterface     = "org.scala-sbt"         % "test-interface"            % "1.0"

	private val gatlingHighcharts = "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.0.0-SNAPSHOT" % "provided"

	val testFrameworkDeps = Seq(gatlingHighcharts, testInterface)

	val pluginDeps = Seq(gatlingHighcharts)
}