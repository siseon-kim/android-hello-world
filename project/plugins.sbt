logLevel := Level.Warn

resolvers += Resolver.sbtPluginRepo("snapshots")

addSbtPlugin("com.hanhuy.sbt" % "sbt-idea" % "1.7.0-SNAPSHOT")

addSbtPlugin("com.hanhuy.sbt" % "android-sdk-plugin" % "1.3.17")