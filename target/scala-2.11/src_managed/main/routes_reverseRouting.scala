// @SOURCE:/home/samir/personal/api/conf/routes
// @HASH:84a1052259a5a1db25f5fd22e79fd0b24d013385
// @DATE:Fri Feb 20 04:02:52 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:36
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers {

// @LINE:36
class ReverseAssets {


// @LINE:36
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:7
class ReverseDashboard {


// @LINE:7
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dashboard")
}
                        

}
                          

// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:10
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:9
def authenticate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          
}
                  

// @LINE:33
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
package controllers.account.settings {

// @LINE:33
// @LINE:16
// @LINE:15
class ReverseEmail {


// @LINE:33
def validateEmail(token:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "email/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                        

// @LINE:16
def runEmail(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "settings/email")
}
                        

// @LINE:15
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "settings/email")
}
                        

}
                          

// @LINE:14
// @LINE:13
class ReversePassword {


// @LINE:13
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "settings/password")
}
                        

// @LINE:14
def runPassword(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "settings/password")
}
                        

}
                          

// @LINE:12
class ReverseIndex {


// @LINE:12
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "settings")
}
                        

}
                          
}
                  

// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:20
// @LINE:19
package controllers.account {

// @LINE:23
// @LINE:20
// @LINE:19
class ReverseSignup {


// @LINE:23
def confirm(confirmToken:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "confirm/" + implicitly[PathBindable[String]].unbind("confirmToken", dynamicString(confirmToken)))
}
                        

// @LINE:20
def save(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:19
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                        

}
                          

// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
class ReverseReset {


// @LINE:31
def runReset(token:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                        

// @LINE:26
def ask(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "reset/ask")
}
                        

// @LINE:30
def reset(token:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                        

// @LINE:27
def runAsk(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "reset/ask")
}
                        

}
                          
}
                  


// @LINE:36
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:36
class ReverseAssets {


// @LINE:36
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:7
class ReverseDashboard {


// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
      }
   """
)
                        

}
              

// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:10
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              
}
        

// @LINE:33
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
package controllers.account.settings.javascript {
import ReverseRouteContext.empty

// @LINE:33
// @LINE:16
// @LINE:15
class ReverseEmail {


// @LINE:33
def validateEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.account.settings.Email.validateEmail",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "email/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:16
def runEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.account.settings.Email.runEmail",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/email"})
      }
   """
)
                        

// @LINE:15
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.account.settings.Email.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/email"})
      }
   """
)
                        

}
              

// @LINE:14
// @LINE:13
class ReversePassword {


// @LINE:13
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.account.settings.Password.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/password"})
      }
   """
)
                        

// @LINE:14
def runPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.account.settings.Password.runPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/password"})
      }
   """
)
                        

}
              

// @LINE:12
class ReverseIndex {


// @LINE:12
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.account.settings.Index.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings"})
      }
   """
)
                        

}
              
}
        

// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:20
// @LINE:19
package controllers.account.javascript {
import ReverseRouteContext.empty

// @LINE:23
// @LINE:20
// @LINE:19
class ReverseSignup {


// @LINE:23
def confirm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.account.Signup.confirm",
   """
      function(confirmToken) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "confirm/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("confirmToken", encodeURIComponent(confirmToken))})
      }
   """
)
                        

// @LINE:20
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.account.Signup.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:19
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.account.Signup.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

}
              

// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
class ReverseReset {


// @LINE:31
def runReset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.account.Reset.runReset",
   """
      function(token) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:26
def ask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.account.Reset.ask",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/ask"})
      }
   """
)
                        

// @LINE:30
def reset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.account.Reset.reset",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:27
def runAsk : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.account.Reset.runAsk",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/ask"})
      }
   """
)
                        

}
              
}
        


// @LINE:36
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:36
class ReverseAssets {


// @LINE:36
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:7
class ReverseDashboard {


// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Dashboard", "index", Seq(), "GET", """""", _prefix + """dashboard""")
)
                      

}
                          

// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:10
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

}
                          
}
        

// @LINE:33
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
package controllers.account.settings.ref {


// @LINE:33
// @LINE:16
// @LINE:15
class ReverseEmail {


// @LINE:33
def validateEmail(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.account.settings.Email.validateEmail(token), HandlerDef(this.getClass.getClassLoader, "", "controllers.account.settings.Email", "validateEmail", Seq(classOf[String]), "GET", """""", _prefix + """email/$token<[^/]+>""")
)
                      

// @LINE:16
def runEmail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.account.settings.Email.runEmail(), HandlerDef(this.getClass.getClassLoader, "", "controllers.account.settings.Email", "runEmail", Seq(), "POST", """""", _prefix + """settings/email""")
)
                      

// @LINE:15
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.account.settings.Email.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.account.settings.Email", "index", Seq(), "GET", """""", _prefix + """settings/email""")
)
                      

}
                          

// @LINE:14
// @LINE:13
class ReversePassword {


// @LINE:13
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.account.settings.Password.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.account.settings.Password", "index", Seq(), "GET", """""", _prefix + """settings/password""")
)
                      

// @LINE:14
def runPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.account.settings.Password.runPassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.account.settings.Password", "runPassword", Seq(), "POST", """""", _prefix + """settings/password""")
)
                      

}
                          

// @LINE:12
class ReverseIndex {


// @LINE:12
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.account.settings.Index.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.account.settings.Index", "index", Seq(), "GET", """""", _prefix + """settings""")
)
                      

}
                          
}
        

// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:20
// @LINE:19
package controllers.account.ref {


// @LINE:23
// @LINE:20
// @LINE:19
class ReverseSignup {


// @LINE:23
def confirm(confirmToken:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.account.Signup.confirm(confirmToken), HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Signup", "confirm", Seq(classOf[String]), "GET", """ Accessed when the user confirms the registration.""", _prefix + """confirm/$confirmToken<[^/]+>""")
)
                      

// @LINE:20
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.account.Signup.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Signup", "save", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:19
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.account.Signup.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Signup", "create", Seq(), "GET", """ Registers the user, sending an email to confirm the account.""", _prefix + """signup""")
)
                      

}
                          

// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
class ReverseReset {


// @LINE:31
def runReset(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.account.Reset.runReset(token), HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Reset", "runReset", Seq(classOf[String]), "POST", """""", _prefix + """reset/$token<[^/]+>""")
)
                      

// @LINE:26
def ask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.account.Reset.ask(), HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Reset", "ask", Seq(), "GET", """ Displays a page to send a reset email given the user's email.""", _prefix + """reset/ask""")
)
                      

// @LINE:30
def reset(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.account.Reset.reset(token), HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Reset", "reset", Seq(classOf[String]), "GET", """ Resets the password using the password.""", _prefix + """reset/$token<[^/]+>""")
)
                      

// @LINE:27
def runAsk(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.account.Reset.runAsk(), HandlerDef(this.getClass.getClassLoader, "", "controllers.account.Reset", "runAsk", Seq(), "POST", """""", _prefix + """reset/ask""")
)
                      

}
                          
}
        
    