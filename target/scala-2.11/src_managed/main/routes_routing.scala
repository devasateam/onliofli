// @SOURCE:F:/project/practise/marketplace-play/api/conf/routes
// @HASH:cd4720583ae0ec709adb55914f3b84168b35c31d
// @DATE:Mon Feb 23 00:36:08 IST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Dashboard_index1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dashboard"))))
private[this] lazy val controllers_Dashboard_index1_invoker = createInvoker(
controllers.Dashboard.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Dashboard", "index", Nil,"GET", """""", Routes.prefix + """dashboard"""))
        

// @LINE:9
private[this] lazy val controllers_Application_authenticate2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_authenticate2_invoker = createInvoker(
controllers.Application.authenticate(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:10
private[this] lazy val controllers_Application_logout3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout3_invoker = createInvoker(
controllers.Application.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:12
private[this] lazy val controllers_account_settings_Index_index4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settings"))))
private[this] lazy val controllers_account_settings_Index_index4_invoker = createInvoker(
controllers.account.settings.Index.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.account.settings.Index", "index", Nil,"GET", """""", Routes.prefix + """settings"""))
        

// @LINE:13
private[this] lazy val controllers_account_settings_Password_index5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settings/password"))))
private[this] lazy val controllers_account_settings_Password_index5_invoker = createInvoker(
controllers.account.settings.Password.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.account.settings.Password", "index", Nil,"GET", """""", Routes.prefix + """settings/password"""))
        

// @LINE:14
private[this] lazy val controllers_account_settings_Password_runPassword6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settings/password"))))
private[this] lazy val controllers_account_settings_Password_runPassword6_invoker = createInvoker(
controllers.account.settings.Password.runPassword(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.account.settings.Password", "runPassword", Nil,"POST", """""", Routes.prefix + """settings/password"""))
        

// @LINE:15
private[this] lazy val controllers_account_settings_Email_index7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settings/email"))))
private[this] lazy val controllers_account_settings_Email_index7_invoker = createInvoker(
controllers.account.settings.Email.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.account.settings.Email", "index", Nil,"GET", """""", Routes.prefix + """settings/email"""))
        

// @LINE:16
private[this] lazy val controllers_account_settings_Email_runEmail8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settings/email"))))
private[this] lazy val controllers_account_settings_Email_runEmail8_invoker = createInvoker(
controllers.account.settings.Email.runEmail(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.account.settings.Email", "runEmail", Nil,"POST", """""", Routes.prefix + """settings/email"""))
        

// @LINE:19
private[this] lazy val controllers_account_Signup_create9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
private[this] lazy val controllers_account_Signup_create9_invoker = createInvoker(
controllers.account.Signup.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Signup", "create", Nil,"GET", """ Registers the user, sending an email to confirm the account.""", Routes.prefix + """signup"""))
        

// @LINE:20
private[this] lazy val controllers_account_Signup_save10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
private[this] lazy val controllers_account_Signup_save10_invoker = createInvoker(
controllers.account.Signup.save(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Signup", "save", Nil,"POST", """""", Routes.prefix + """signup"""))
        

// @LINE:23
private[this] lazy val controllers_account_Signup_confirm11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("confirm/"),DynamicPart("confirmToken", """[^/]+""",true))))
private[this] lazy val controllers_account_Signup_confirm11_invoker = createInvoker(
controllers.account.Signup.confirm(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Signup", "confirm", Seq(classOf[String]),"GET", """ Accessed when the user confirms the registration.""", Routes.prefix + """confirm/$confirmToken<[^/]+>"""))
        

// @LINE:26
private[this] lazy val controllers_account_Reset_ask12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/ask"))))
private[this] lazy val controllers_account_Reset_ask12_invoker = createInvoker(
controllers.account.Reset.ask(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Reset", "ask", Nil,"GET", """ Displays a page to send a reset email given the user's email.""", Routes.prefix + """reset/ask"""))
        

// @LINE:27
private[this] lazy val controllers_account_Reset_runAsk13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/ask"))))
private[this] lazy val controllers_account_Reset_runAsk13_invoker = createInvoker(
controllers.account.Reset.runAsk(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Reset", "runAsk", Nil,"POST", """""", Routes.prefix + """reset/ask"""))
        

// @LINE:30
private[this] lazy val controllers_account_Reset_reset14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+""",true))))
private[this] lazy val controllers_account_Reset_reset14_invoker = createInvoker(
controllers.account.Reset.reset(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Reset", "reset", Seq(classOf[String]),"GET", """ Resets the password using the password.""", Routes.prefix + """reset/$token<[^/]+>"""))
        

// @LINE:31
private[this] lazy val controllers_account_Reset_runReset15_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+""",true))))
private[this] lazy val controllers_account_Reset_runReset15_invoker = createInvoker(
controllers.account.Reset.runReset(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Reset", "runReset", Seq(classOf[String]),"POST", """""", Routes.prefix + """reset/$token<[^/]+>"""))
        

// @LINE:33
private[this] lazy val controllers_account_settings_Email_validateEmail16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("email/"),DynamicPart("token", """[^/]+""",true))))
private[this] lazy val controllers_account_settings_Email_validateEmail16_invoker = createInvoker(
controllers.account.settings.Email.validateEmail(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.account.settings.Email", "validateEmail", Seq(classOf[String]),"GET", """""", Routes.prefix + """email/$token<[^/]+>"""))
        

// @LINE:36
private[this] lazy val controllers_Assets_at17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:38
private[this] lazy val controllers_AuthenticationController_login18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loginnew"))))
private[this] lazy val controllers_AuthenticationController_login18_invoker = createInvoker(
controllers.AuthenticationController.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AuthenticationController", "login", Nil,"GET", """""", Routes.prefix + """loginnew"""))
        

// @LINE:39
private[this] lazy val controllers_AuthenticationController_authenticate19_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loginnew"))))
private[this] lazy val controllers_AuthenticationController_authenticate19_invoker = createInvoker(
controllers.AuthenticationController.authenticate(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.AuthenticationController", "authenticate", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """loginnew"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard""","""controllers.Dashboard.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings""","""controllers.account.settings.Index.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings/password""","""controllers.account.settings.Password.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings/password""","""controllers.account.settings.Password.runPassword()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings/email""","""controllers.account.settings.Email.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings/email""","""controllers.account.settings.Email.runEmail()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.account.Signup.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.account.Signup.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """confirm/$confirmToken<[^/]+>""","""controllers.account.Signup.confirm(confirmToken:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/ask""","""controllers.account.Reset.ask()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/ask""","""controllers.account.Reset.runAsk()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""controllers.account.Reset.reset(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""controllers.account.Reset.runReset(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """email/$token<[^/]+>""","""controllers.account.settings.Email.validateEmail(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginnew""","""controllers.AuthenticationController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginnew""","""controllers.AuthenticationController.authenticate(email:String, password:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Dashboard_index1_route(params) => {
   call { 
        controllers_Dashboard_index1_invoker.call(controllers.Dashboard.index())
   }
}
        

// @LINE:9
case controllers_Application_authenticate2_route(params) => {
   call { 
        controllers_Application_authenticate2_invoker.call(controllers.Application.authenticate())
   }
}
        

// @LINE:10
case controllers_Application_logout3_route(params) => {
   call { 
        controllers_Application_logout3_invoker.call(controllers.Application.logout())
   }
}
        

// @LINE:12
case controllers_account_settings_Index_index4_route(params) => {
   call { 
        controllers_account_settings_Index_index4_invoker.call(controllers.account.settings.Index.index())
   }
}
        

// @LINE:13
case controllers_account_settings_Password_index5_route(params) => {
   call { 
        controllers_account_settings_Password_index5_invoker.call(controllers.account.settings.Password.index())
   }
}
        

// @LINE:14
case controllers_account_settings_Password_runPassword6_route(params) => {
   call { 
        controllers_account_settings_Password_runPassword6_invoker.call(controllers.account.settings.Password.runPassword())
   }
}
        

// @LINE:15
case controllers_account_settings_Email_index7_route(params) => {
   call { 
        controllers_account_settings_Email_index7_invoker.call(controllers.account.settings.Email.index())
   }
}
        

// @LINE:16
case controllers_account_settings_Email_runEmail8_route(params) => {
   call { 
        controllers_account_settings_Email_runEmail8_invoker.call(controllers.account.settings.Email.runEmail())
   }
}
        

// @LINE:19
case controllers_account_Signup_create9_route(params) => {
   call { 
        controllers_account_Signup_create9_invoker.call(controllers.account.Signup.create())
   }
}
        

// @LINE:20
case controllers_account_Signup_save10_route(params) => {
   call { 
        controllers_account_Signup_save10_invoker.call(controllers.account.Signup.save())
   }
}
        

// @LINE:23
case controllers_account_Signup_confirm11_route(params) => {
   call(params.fromPath[String]("confirmToken", None)) { (confirmToken) =>
        controllers_account_Signup_confirm11_invoker.call(controllers.account.Signup.confirm(confirmToken))
   }
}
        

// @LINE:26
case controllers_account_Reset_ask12_route(params) => {
   call { 
        controllers_account_Reset_ask12_invoker.call(controllers.account.Reset.ask())
   }
}
        

// @LINE:27
case controllers_account_Reset_runAsk13_route(params) => {
   call { 
        controllers_account_Reset_runAsk13_invoker.call(controllers.account.Reset.runAsk())
   }
}
        

// @LINE:30
case controllers_account_Reset_reset14_route(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_reset14_invoker.call(controllers.account.Reset.reset(token))
   }
}
        

// @LINE:31
case controllers_account_Reset_runReset15_route(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_runReset15_invoker.call(controllers.account.Reset.runReset(token))
   }
}
        

// @LINE:33
case controllers_account_settings_Email_validateEmail16_route(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_settings_Email_validateEmail16_invoker.call(controllers.account.settings.Email.validateEmail(token))
   }
}
        

// @LINE:36
case controllers_Assets_at17_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at17_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:38
case controllers_AuthenticationController_login18_route(params) => {
   call { 
        controllers_AuthenticationController_login18_invoker.call(controllers.AuthenticationController.login())
   }
}
        

// @LINE:39
case controllers_AuthenticationController_authenticate19_route(params) => {
   call(params.fromQuery[String]("email", None), params.fromQuery[String]("password", None)) { (email, password) =>
        controllers_AuthenticationController_authenticate19_invoker.call(controllers.AuthenticationController.authenticate(email, password))
   }
}
        
}

}
     