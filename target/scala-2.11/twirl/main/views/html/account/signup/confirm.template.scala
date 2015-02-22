
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
object confirm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main()/*1.8*/ {_display_(Seq[Any](format.raw/*1.10*/("""

    """),format.raw/*3.5*/("""<h3>"""),_display_(/*3.10*/Messages("signup.signup")),format.raw/*3.35*/(""" """),format.raw/*3.36*/("""- """),_display_(/*3.39*/Messages("confirmation")),format.raw/*3.63*/("""</h3>

    """),_display_(/*5.6*/wflash()),format.raw/*5.14*/("""

    """),format.raw/*7.5*/("""<div class="form-actions">
        <a href=""""),_display_(/*8.19*/routes/*8.25*/.Application.index),format.raw/*8.43*/("""" class="btn btn-default">"""),_display_(/*8.70*/Messages("goback")),format.raw/*8.88*/("""</a>
    </div>
""")))}),format.raw/*10.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 00:36:09 IST 2015
                  SOURCE: F:/project/practise/marketplace-play/api/app/views/account/signup/confirm.scala.html
                  HASH: 30a55fc40210a9eaad4f5e93779bdf4db0399cca
                  MATRIX: 815->1|828->7|867->9|901->17|932->22|977->47|1005->48|1034->51|1078->75|1117->89|1145->97|1179->105|1251->151|1265->157|1303->175|1356->202|1394->220|1443->239
                  LINES: 29->1|29->1|29->1|31->3|31->3|31->3|31->3|31->3|31->3|33->5|33->5|35->7|36->8|36->8|36->8|36->8|36->8|38->10
                  -- GENERATED --
              */
          