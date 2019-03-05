// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/CA1sdev/SDevCA/conf/routes
// @DATE:Tue Mar 05 16:49:24 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProjectCtrl_5: controllers.ProjectCtrl,
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:15
  ShoppingCtrl_2: controllers.ShoppingCtrl,
  // @LINE:24
  AdminProjectCtrl_1: controllers.AdminProjectCtrl,
  // @LINE:36
  Assets_3: controllers.Assets,
  // @LINE:40
  LoginController_4: controllers.LoginController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProjectCtrl_5: controllers.ProjectCtrl,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:15
    ShoppingCtrl_2: controllers.ShoppingCtrl,
    // @LINE:24
    AdminProjectCtrl_1: controllers.AdminProjectCtrl,
    // @LINE:36
    Assets_3: controllers.Assets,
    // @LINE:40
    LoginController_4: controllers.LoginController
  ) = this(errorHandler, ProjectCtrl_5, HomeController_0, ShoppingCtrl_2, AdminProjectCtrl_1, Assets_3, LoginController_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProjectCtrl_5, HomeController_0, ShoppingCtrl_2, AdminProjectCtrl_1, Assets_3, LoginController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProjectCtrl.index()"""),
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listProjects""", """controllers.ProjectCtrl.listProjects(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin""", """controllers.AdminProjectCtrl.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/listProjects""", """controllers.AdminProjectCtrl.listProjects(cat:Long = 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/listProjects/""" + "$" + """cat<[^/]+>""", """controllers.AdminProjectCtrl.listProjects(cat:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProject""", """controllers.AdminProjectCtrl.addProject()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProjectSubmit""", """controllers.AdminProjectCtrl.addProjectSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProject/""" + "$" + """id<[^/]+>""", """controllers.AdminProjectCtrl.updateProject(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProjectSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminProjectCtrl.updateProjectSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/delProject/""" + "$" + """id<[^/]+>""", """controllers.AdminProjectCtrl.deleteProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUser""", """controllers.HomeController.addUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUserSubmit""", """controllers.HomeController.addUserSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUser""", """controllers.HomeController.registerUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUserSubmit""", """controllers.HomeController.registerUserSubmit"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProjectCtrl_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProjectCtrl_index0_invoker = createInvoker(
    ProjectCtrl_5.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectCtrl",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProjectCtrl_listProjects2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listProjects")))
  )
  private[this] lazy val controllers_ProjectCtrl_listProjects2_invoker = createInvoker(
    ProjectCtrl_5.listProjects(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectCtrl",
      "listProjects",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """listProjects""",
      """ Show a list of products - note optional parameter (added by Daria)""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ShoppingCtrl_showBasket3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket3_invoker = createInvoker(
    ShoppingCtrl_2.showBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Nil,
      "GET",
      this.prefix + """showBasket""",
      """ Shopping (added by Daria)""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ShoppingCtrl_addToBasket4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket4_invoker = createInvoker(
    ShoppingCtrl_2.addToBasket(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ShoppingCtrl_addOne5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne5_invoker = createInvoker(
    ShoppingCtrl_2.addOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ShoppingCtrl_removeOne6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne6_invoker = createInvoker(
    ShoppingCtrl_2.removeOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket7_invoker = createInvoker(
    ShoppingCtrl_2.emptyBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Nil,
      "GET",
      this.prefix + """emptyBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ShoppingCtrl_placeOrder8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder8_invoker = createInvoker(
    ShoppingCtrl_2.placeOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Nil,
      "GET",
      this.prefix + """placeOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ShoppingCtrl_viewOrder9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder9_invoker = createInvoker(
    ShoppingCtrl_2.viewOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_AdminProjectCtrl_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin")))
  )
  private[this] lazy val controllers_AdminProjectCtrl_index10_invoker = createInvoker(
    AdminProjectCtrl_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "index",
      Nil,
      "GET",
      this.prefix + """Admin""",
      """ Project Administration(added by Daria and Ryan)""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_AdminProjectCtrl_listProjects11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/listProjects")))
  )
  private[this] lazy val controllers_AdminProjectCtrl_listProjects11_invoker = createInvoker(
    AdminProjectCtrl_1.listProjects(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "listProjects",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/listProjects""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_AdminProjectCtrl_listProjects12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/listProjects/"), DynamicPart("cat", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProjectCtrl_listProjects12_invoker = createInvoker(
    AdminProjectCtrl_1.listProjects(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "listProjects",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/listProjects/""" + "$" + """cat<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_AdminProjectCtrl_addProject13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProject")))
  )
  private[this] lazy val controllers_AdminProjectCtrl_addProject13_invoker = createInvoker(
    AdminProjectCtrl_1.addProject(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "addProject",
      Nil,
      "GET",
      this.prefix + """Admin/addProject""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_AdminProjectCtrl_addProjectSubmit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProjectSubmit")))
  )
  private[this] lazy val controllers_AdminProjectCtrl_addProjectSubmit14_invoker = createInvoker(
    AdminProjectCtrl_1.addProjectSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "addProjectSubmit",
      Nil,
      "POST",
      this.prefix + """Admin/addProjectSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_AdminProjectCtrl_updateProject15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProjectCtrl_updateProject15_invoker = createInvoker(
    AdminProjectCtrl_1.updateProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "updateProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/updateProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_AdminProjectCtrl_updateProjectSubmit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProjectSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProjectCtrl_updateProjectSubmit16_invoker = createInvoker(
    AdminProjectCtrl_1.updateProjectSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "updateProjectSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """Admin/updateProjectSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_AdminProjectCtrl_deleteProject17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/delProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProjectCtrl_deleteProject17_invoker = createInvoker(
    AdminProjectCtrl_1.deleteProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProjectCtrl",
      "deleteProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/delProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Assets_versioned18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned18_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_LoginController_login19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login19_invoker = createInvoker(
    LoginController_4.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """login""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_LoginController_loginSubmit20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit20_invoker = createInvoker(
    LoginController_4.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_LoginController_logout21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout21_invoker = createInvoker(
    LoginController_4.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_HomeController_addUser22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser")))
  )
  private[this] lazy val controllers_HomeController_addUser22_invoker = createInvoker(
    HomeController_0.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUser",
      Nil,
      "GET",
      this.prefix + """addUser""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_HomeController_addUserSubmit23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_HomeController_addUserSubmit23_invoker = createInvoker(
    HomeController_0.addUserSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUserSubmit",
      Nil,
      "POST",
      this.prefix + """addUserSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_HomeController_registerUser24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUser")))
  )
  private[this] lazy val controllers_HomeController_registerUser24_invoker = createInvoker(
    HomeController_0.registerUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "registerUser",
      Nil,
      "GET",
      this.prefix + """registerUser""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_HomeController_registerUserSubmit25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUserSubmit")))
  )
  private[this] lazy val controllers_HomeController_registerUserSubmit25_invoker = createInvoker(
    HomeController_0.registerUserSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "registerUserSubmit",
      Nil,
      "POST",
      this.prefix + """registerUserSubmit""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProjectCtrl_index0_route(params@_) =>
      call { 
        controllers_ProjectCtrl_index0_invoker.call(ProjectCtrl_5.index())
      }
  
    // @LINE:7
    case controllers_HomeController_index1_route(params@_) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_0.index())
      }
  
    // @LINE:11
    case controllers_ProjectCtrl_listProjects2_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ProjectCtrl_listProjects2_invoker.call(ProjectCtrl_5.listProjects(cat, filter))
      }
  
    // @LINE:15
    case controllers_ShoppingCtrl_showBasket3_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_showBasket3_invoker.call(ShoppingCtrl_2.showBasket())
      }
  
    // @LINE:16
    case controllers_ShoppingCtrl_addToBasket4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket4_invoker.call(ShoppingCtrl_2.addToBasket(id))
      }
  
    // @LINE:17
    case controllers_ShoppingCtrl_addOne5_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_addOne5_invoker.call(ShoppingCtrl_2.addOne(itemId))
      }
  
    // @LINE:18
    case controllers_ShoppingCtrl_removeOne6_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne6_invoker.call(ShoppingCtrl_2.removeOne(itemId))
      }
  
    // @LINE:19
    case controllers_ShoppingCtrl_emptyBasket7_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket7_invoker.call(ShoppingCtrl_2.emptyBasket())
      }
  
    // @LINE:20
    case controllers_ShoppingCtrl_placeOrder8_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_placeOrder8_invoker.call(ShoppingCtrl_2.placeOrder())
      }
  
    // @LINE:21
    case controllers_ShoppingCtrl_viewOrder9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder9_invoker.call(ShoppingCtrl_2.viewOrder(id))
      }
  
    // @LINE:24
    case controllers_AdminProjectCtrl_index10_route(params@_) =>
      call { 
        controllers_AdminProjectCtrl_index10_invoker.call(AdminProjectCtrl_1.index())
      }
  
    // @LINE:25
    case controllers_AdminProjectCtrl_listProjects11_route(params@_) =>
      call(Param[Long]("cat", Right(0))) { (cat) =>
        controllers_AdminProjectCtrl_listProjects11_invoker.call(AdminProjectCtrl_1.listProjects(cat))
      }
  
    // @LINE:26
    case controllers_AdminProjectCtrl_listProjects12_route(params@_) =>
      call(params.fromPath[Long]("cat", None)) { (cat) =>
        controllers_AdminProjectCtrl_listProjects12_invoker.call(AdminProjectCtrl_1.listProjects(cat))
      }
  
    // @LINE:27
    case controllers_AdminProjectCtrl_addProject13_route(params@_) =>
      call { 
        controllers_AdminProjectCtrl_addProject13_invoker.call(AdminProjectCtrl_1.addProject())
      }
  
    // @LINE:28
    case controllers_AdminProjectCtrl_addProjectSubmit14_route(params@_) =>
      call { 
        controllers_AdminProjectCtrl_addProjectSubmit14_invoker.call(AdminProjectCtrl_1.addProjectSubmit())
      }
  
    // @LINE:29
    case controllers_AdminProjectCtrl_updateProject15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProjectCtrl_updateProject15_invoker.call(AdminProjectCtrl_1.updateProject(id))
      }
  
    // @LINE:30
    case controllers_AdminProjectCtrl_updateProjectSubmit16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProjectCtrl_updateProjectSubmit16_invoker.call(AdminProjectCtrl_1.updateProjectSubmit(id))
      }
  
    // @LINE:31
    case controllers_AdminProjectCtrl_deleteProject17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProjectCtrl_deleteProject17_invoker.call(AdminProjectCtrl_1.deleteProject(id))
      }
  
    // @LINE:36
    case controllers_Assets_versioned18_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned18_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:40
    case controllers_LoginController_login19_route(params@_) =>
      call { 
        controllers_LoginController_login19_invoker.call(LoginController_4.login)
      }
  
    // @LINE:41
    case controllers_LoginController_loginSubmit20_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit20_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:42
    case controllers_LoginController_logout21_route(params@_) =>
      call { 
        controllers_LoginController_logout21_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:43
    case controllers_HomeController_addUser22_route(params@_) =>
      call { 
        controllers_HomeController_addUser22_invoker.call(HomeController_0.addUser)
      }
  
    // @LINE:44
    case controllers_HomeController_addUserSubmit23_route(params@_) =>
      call { 
        controllers_HomeController_addUserSubmit23_invoker.call(HomeController_0.addUserSubmit)
      }
  
    // @LINE:45
    case controllers_HomeController_registerUser24_route(params@_) =>
      call { 
        controllers_HomeController_registerUser24_invoker.call(HomeController_0.registerUser)
      }
  
    // @LINE:46
    case controllers_HomeController_registerUserSubmit25_route(params@_) =>
      call { 
        controllers_HomeController_registerUserSubmit25_invoker.call(HomeController_0.registerUserSubmit)
      }
  }
}
