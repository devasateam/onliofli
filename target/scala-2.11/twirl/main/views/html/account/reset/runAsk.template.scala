
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
                  DATE: Mon Feb 23 00:36:09 IST 2015
                  SOURCE: F:/project/practise/marketplace-play/api/app/views/account/reset/runAsk.scala.html
                  HASH: 937dd9843f115ceb90a77352f53d390a92309858
                  MATRIX: 821->19|853->43|942->103|974->110|987->116|1026->118|1060->126|1091->131|1136->156|1176->170|1205->178|1240->187|1295->221|1328->227|1401->273|1416->279|1455->297|1509->324|1548->342|1599->363
                  LINES: 28->2|28->2|31->4|34->7|34->7|34->7|36->9|36->9|36->9|38->11|38->11|40->13|40->13|41->14|42->15|42->15|42->15|42->15|42->15|45->18
                  -- GENERATED --
              */
          