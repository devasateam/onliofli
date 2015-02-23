// @SOURCE:/home/samir/personal/api/conf/routes
// @HASH:89b48bb340c03fd7b7ce420c7c40e09800e0b864
// @DATE:Tue Feb 24 00:20:07 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:22
// @LINE:7
// @LINE:6
package controllers {

// @LINE:22
class ReverseAssets {


// @LINE:22
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:6
class ReverseAuthenticationController {


// @LINE:6
def authenticate(email:String, password:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)), Some(implicitly[QueryStringBindable[String]].unbind("password", password)))))
}
                        

}
                          

// @LINE:7
class ReverseApplication {


// @LINE:7
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

}
                          
}
                  


// @LINE:22
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:22
class ReverseAssets {


// @LINE:22
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseAuthenticationController {


// @LINE:6
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AuthenticationController.authenticate",
   """
      function(email,password) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("password", password)])})
      }
   """
)
                        

}
              

// @LINE:7
class ReverseApplication {


// @LINE:7
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

}
              
}
        


// @LINE:22
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:22
class ReverseAssets {


// @LINE:22
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:6
class ReverseAuthenticationController {


// @LINE:6
def authenticate(email:String, password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AuthenticationController.authenticate(email, password), HandlerDef(this.getClass.getClassLoader, "", "controllers.AuthenticationController", "authenticate", Seq(classOf[String], classOf[String]), "POST", """ Home page""", _prefix + """login""")
)
                      

}
                          

// @LINE:7
class ReverseApplication {


// @LINE:7
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

}
                          
}
        
    