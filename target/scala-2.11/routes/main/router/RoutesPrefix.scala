
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/websiteFrame(2.6.7)/conf/routes
// @DATE:Mon Apr 24 12:05:02 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
