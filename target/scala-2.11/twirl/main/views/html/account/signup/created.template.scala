
package views.html.account.signup

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
object created extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main()/*1.8*/ {_display_(Seq[Any](format.raw/*1.10*/("""

    """),format.raw/*3.5*/("""<h3>"""),_display_(/*3.10*/Messages("signup.successfull")),format.raw/*3.40*/("""</h3>
    """),_display_(/*4.6*/Messages("signup.msg.created")),format.raw/*4.36*/("""

    """),format.raw/*6.5*/("""<div class="form-actions">
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.Application.index),format.raw/*7.43*/("""" class="btn btn-default">"""),_display_(/*7.70*/Messages("goback")),format.raw/*7.88*/("""</a>
    </div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Feb 22 00:49:32 IST 2015
                  SOURCE: /home/samir/personal/api/app/views/account/signup/created.scala.html
                  HASH: c989909db1c7176e440bb12c58eae1d1d139cbd1
                  MATRIX: 815->1|828->7|867->9|899->15|930->20|980->50|1016->61|1066->91|1098->97|1169->142|1183->148|1221->166|1274->193|1312->211
                  LINES: 29->1|29->1|29->1|31->3|31->3|31->3|32->4|32->4|34->6|35->7|35->7|35->7|35->7|35->7
                  -- GENERATED --
              */
          