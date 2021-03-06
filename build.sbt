lazy val root = Project("root", file("."))
  .aggregate(basics)
  .settings(BaseSettings.settings: _*)

lazy val basics = Project("basics", file("basics"))
  .settings(BaseSettings.settings: _*)
  .settings(Dependencies.basics: _*)

lazy val scalaz = Project("scalaz", file("scalaz"))
  .settings(BaseSettings.settings: _*)
  .settings(Dependencies.scalaz: _*)