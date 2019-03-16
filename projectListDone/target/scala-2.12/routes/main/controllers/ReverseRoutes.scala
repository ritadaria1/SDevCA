
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/BASE_CODE/projectListDone/conf/routes
// @DATE:Sat Mar 16 19:33:37 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def addProjects(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addProjects")
    }
  
    // @LINE:16
    def updateEmployee(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:8
    def employee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee")
    }
  
    // @LINE:12
    def addEmployeeSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addEmployeeSubmit")
    }
  
    // @LINE:7
    def profile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:10
    def addProjectsSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addProjectsSubmit")
    }
  
    // @LINE:14
    def deleteEmployee(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(cat:Long = 0L): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(cat == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:15
    def updateProjects(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProjects/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:13
    def deleteProjects(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delProjects/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:11
    def addEmployee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addEmployee")
    }
  
  }

  // @LINE:18
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:20
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:18
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
