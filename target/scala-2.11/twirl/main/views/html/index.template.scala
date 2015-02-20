
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.Register],Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register], loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    """),format.raw/*4.5*/("""<script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.at("javascripts/password.js")),format.raw/*4.62*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*1.78*/("""

"""),format.raw/*5.2*/("""

"""),_display_(/*7.2*/main(null, scripts)/*7.21*/ {_display_(Seq[Any](format.raw/*7.23*/("""

  """),_display_(/*9.4*/wflash()),format.raw/*9.12*/("""
  """),format.raw/*10.3*/("""<div class="col-lg-6">
  </div>

  <div class="col-lg-6">
    <div class="well">
      """),_display_(/*15.8*/login(loginForm)),format.raw/*15.24*/("""
    """),format.raw/*16.5*/("""</div>

    <div class="well">
      """),_display_(/*19.8*/account/*19.15*/.signup.createFormOnly(signupForm)),format.raw/*19.49*/("""
    """),format.raw/*20.5*/("""</div>
  </div>
""")))}))}
  }

  def render(signupForm:Form[Application.Register],loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm,loginForm)

  def f:((Form[Application.Register],Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm,loginForm) => apply(signupForm,loginForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 20 04:02:53 IST 2015
                  SOURCE: /home/samir/personal/api/app/views/index.scala.html
                  HASH: 5e3e2385781c21edc1097cb2d8d50d52d7b1822f
                  MATRIX: 767->1|914->80|928->87|1008->91|1039->96|1079->110|1093->116|1150->153|1225->77|1253->189|1281->192|1308->211|1347->213|1377->218|1405->226|1435->229|1549->317|1586->333|1618->338|1682->376|1698->383|1753->417|1785->422
                  LINES: 26->1|28->3|28->3|30->3|31->4|31->4|31->4|31->4|33->1|35->5|37->7|37->7|37->7|39->9|39->9|40->10|45->15|45->15|46->16|49->19|49->19|49->19|50->20
                  -- GENERATED --
              */
          