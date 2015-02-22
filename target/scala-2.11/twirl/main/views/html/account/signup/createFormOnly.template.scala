
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
object createFormOnly extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Register],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*4.6*/implicitFieldConstructor/*4.30*/ = {{
        FieldConstructor(twitterBootstrapInput.render)
    }};
Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""    """),format.raw/*6.6*/("""

"""),format.raw/*8.1*/("""<h3>"""),_display_(/*8.6*/Messages("signup.new")),format.raw/*8.28*/("""</h3>

"""),_display_(/*10.2*/form(controllers.account.routes.Signup.save())/*10.48*/ {_display_(Seq[Any](format.raw/*10.50*/("""

    """),format.raw/*12.5*/("""<fieldset>
        """),_display_(/*13.10*/inputText(
            signupForm("email"),
            'placeholder -> Messages("email"),
            '_label -> null,
            'class -> "form-control"
        )),format.raw/*18.10*/("""
        """),_display_(/*19.10*/inputText(
            signupForm("fullname"),
            'placeholder -> Messages("fullname"),
            '_label -> null,
            'class -> "form-control"
        )),format.raw/*24.10*/("""
        """),_display_(/*25.10*/inputPassword(
            signupForm("inputPassword"),
            '_label -> null,
            'placeholder -> Messages("password"),
            'class -> "form-control"
        )),format.raw/*30.10*/("""
    """),format.raw/*31.5*/("""</fieldset>

    <div class="form-actions">
        <input type="submit" class="btn btn-primary" value=""""),_display_(/*34.62*/Messages("signup.signup")),format.raw/*34.87*/("""">
    </div>
""")))}),format.raw/*36.2*/("""

"""))}
  }

  def render(signupForm:Form[Application.Register]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[Application.Register]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 00:36:09 IST 2015
                  SOURCE: F:/project/practise/marketplace-play/api/app/views/account/signup/createFormOnly.scala.html
                  HASH: 29e71bbc42517c896f0a149c00b43e20e12d777e
                  MATRIX: 767->1|902->68|934->92|1032->41|1062->63|1092->160|1122->164|1152->169|1194->191|1230->201|1285->247|1325->249|1360->257|1408->278|1600->449|1638->460|1836->637|1874->648|2081->834|2114->840|2249->948|2295->973|2342->990
                  LINES: 26->1|28->4|28->4|31->1|33->4|33->6|35->8|35->8|35->8|37->10|37->10|37->10|39->12|40->13|45->18|46->19|51->24|52->25|57->30|58->31|61->34|61->34|63->36
                  -- GENERATED --
              */
          