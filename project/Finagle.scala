package storehaus

/** Module defining latest finagle version
 *  and means of constructing finagle module
 *  dependency */
object Finagle {
  import sbt._
  val LatestVersion = "6.3.0"
  def module(name: String, version: String = LatestVersion) =
    "com.twitter" %% "finagle-%s".format(name) % version
}
