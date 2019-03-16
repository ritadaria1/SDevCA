
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/BASE_CODE/projectListDone/conf/routes
// @DATE:Sat Mar 16 19:33:37 GMT 2019


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
