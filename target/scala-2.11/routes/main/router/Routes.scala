
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/casey/Documents/TheBoard/conf/routes
// @DATE:Fri May 05 13:31:49 EDT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_3: controllers.Application,
  // @LINE:10
  MessageController_0: controllers.MessageController,
  // @LINE:15
  UserController_1: controllers.UserController,
  // @LINE:26
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_3: controllers.Application,
    // @LINE:10
    MessageController_0: controllers.MessageController,
    // @LINE:15
    UserController_1: controllers.UserController,
    // @LINE:26
    Assets_2: controllers.Assets
  ) = this(errorHandler, Application_3, MessageController_0, UserController_1, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_3, MessageController_0, UserController_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message/list""", """controllers.MessageController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message/add""", """controllers.MessageController.add"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message/add""", """controllers.MessageController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.authenticate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.UserController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """join""", """controllers.UserController.join"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """join""", """controllers.UserController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_3.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_MessageController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message/list")))
  )
  private[this] lazy val controllers_MessageController_list1_invoker = createInvoker(
    MessageController_0.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "list",
      Nil,
      "GET",
      """ messages""",
      this.prefix + """message/list"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_MessageController_add2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message/add")))
  )
  private[this] lazy val controllers_MessageController_add2_invoker = createInvoker(
    MessageController_0.add,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "add",
      Nil,
      "GET",
      """""",
      this.prefix + """message/add"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_MessageController_create3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message/add")))
  )
  private[this] lazy val controllers_MessageController_create3_invoker = createInvoker(
    MessageController_0.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """message/add"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_login4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_login4_invoker = createInvoker(
    UserController_1.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "login",
      Nil,
      "GET",
      """ users""",
      this.prefix + """login"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_authenticate5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_authenticate5_invoker = createInvoker(
    UserController_1.authenticate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_UserController_logout6_invoker = createInvoker(
    UserController_1.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UserController_join7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("join")))
  )
  private[this] lazy val controllers_UserController_join7_invoker = createInvoker(
    UserController_1.join,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "join",
      Nil,
      "GET",
      """""",
      this.prefix + """join"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_UserController_create8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("join")))
  )
  private[this] lazy val controllers_UserController_create8_invoker = createInvoker(
    UserController_1.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """join"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Assets_at9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_3.index)
      }
  
    // @LINE:10
    case controllers_MessageController_list1_route(params) =>
      call { 
        controllers_MessageController_list1_invoker.call(MessageController_0.list)
      }
  
    // @LINE:11
    case controllers_MessageController_add2_route(params) =>
      call { 
        controllers_MessageController_add2_invoker.call(MessageController_0.add)
      }
  
    // @LINE:12
    case controllers_MessageController_create3_route(params) =>
      call { 
        controllers_MessageController_create3_invoker.call(MessageController_0.create)
      }
  
    // @LINE:15
    case controllers_UserController_login4_route(params) =>
      call { 
        controllers_UserController_login4_invoker.call(UserController_1.login)
      }
  
    // @LINE:16
    case controllers_UserController_authenticate5_route(params) =>
      call { 
        controllers_UserController_authenticate5_invoker.call(UserController_1.authenticate)
      }
  
    // @LINE:18
    case controllers_UserController_logout6_route(params) =>
      call { 
        controllers_UserController_logout6_invoker.call(UserController_1.logout)
      }
  
    // @LINE:20
    case controllers_UserController_join7_route(params) =>
      call { 
        controllers_UserController_join7_invoker.call(UserController_1.join)
      }
  
    // @LINE:21
    case controllers_UserController_create8_route(params) =>
      call { 
        controllers_UserController_create8_invoker.call(UserController_1.create)
      }
  
    // @LINE:26
    case controllers_Assets_at9_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(Assets_2.at(path, file))
      }
  }
}
