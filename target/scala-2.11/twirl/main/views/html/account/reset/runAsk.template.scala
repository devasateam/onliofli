
package views.html.account.reset

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
import helper._
/**/
object runAsk extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
implicit def /*2.2*/implicitFieldConstructor/*2.26*/ = {{
    FieldConstructor(twitterBootstrapInput.render)
}};
Seq[Any](format.raw/*4.2*/("""


"""),_display_(/*7.2*/main()/*7.8*/ {_display_(Seq[Any](format.raw/*7.10*/("""

    """),format.raw/*9.5*/("""<h3>"""),_display_(/*9.10*/Messages("resetpassword")),format.raw/*9.35*/("""</h3>

    """),_display_(/*11.6*/wflash()),format.raw/*11.14*/("""

    """),_display_(/*13.6*/Messages("resetpassword.mailsent")),format.raw/*13.40*/("""
    """),format.raw/*14.5*/("""<div class="form-actions">
        <a href=""""),_display_(/*15.19*/routes/*15.25*/.Application.index),format.raw/*15.43*/("""" class="btn btn-default">"""),_display_(/*15.70*/Messages("goback")),format.raw/*15.88*/("""</a>
    </div>

""")))}),format.raw/*18.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Feb 22 00:49:32 IST 2015
                  SOURCE: /home/samir/personal/api/app/views/account/reset/runAsk.scala.html
                  HASH: 0e45f6e6efaf41daf50d7f51be644760b77fd191
                  MATRIX: 821->18|853->42|940->100|969->104|982->110|1021->112|1053->118|1084->123|1129->148|1167->160|1196->168|1229->175|1284->209|1316->214|1388->259|1403->265|1442->283|1496->310|1535->328|1583->346
                  LINES: 28->2|28->2|31->4|34->7|34->7|34->7|36->9|36->9|36->9|38->11|38->11|40->13|40->13|41->14|42->15|42->15|42->15|42->15|42->15|45->18
                  -- GENERATED --
              */
          