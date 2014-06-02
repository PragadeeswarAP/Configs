libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.1.3" % "test"

libraryDependencies += "org.scala-tools.testing" % "specs_2.9.3" % "1.6.9" % "test"

libraryDependencies ++= Seq(
  "com.twitter" %% "scalding" % "0.9.0rc4"
)
 
initialCommands in console := """
  |import com.twitter.scalding._
  |import com.twitter.scalding.mathematics._
   """.stripMargin
