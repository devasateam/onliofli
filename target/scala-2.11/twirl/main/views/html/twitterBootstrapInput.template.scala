
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
object twitterBootstrapInput extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.4*/("""
"""),format.raw/*6.1*/("""<div class="form-group """),_display_(/*6.25*/if(elements.hasErrors)/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""error""")))}),format.raw/*6.55*/("""">
    <label for=""""),_display_(/*7.18*/elements/*7.26*/.id),format.raw/*7.29*/("""">"""),_display_(/*7.32*/elements/*7.40*/.label),format.raw/*7.46*/("""</label>
    """),_display_(/*8.6*/elements/*8.14*/.input),format.raw/*8.20*/("""
    """),format.raw/*9.5*/("""<p class="help-inline">"""),_display_(/*9.29*/elements/*9.37*/.infos.mkString(", ")),format.raw/*9.58*/("""</p>
    """),_display_(/*10.6*/if(elements.hasErrors)/*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
        """),format.raw/*11.9*/("""<p class="help-inline">"""),_display_(/*11.33*/elements/*11.41*/.errors.mkString(", ")),format.raw/*11.63*/("""</p>
    """)))}),format.raw/*12.6*/("""
"""),format.raw/*13.1*/("""</div>"""))}
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 00:36:09 IST 2015
                  SOURCE: F:/project/practise/marketplace-play/api/app/views/twitterBootstrapInput.scala.html
                  HASH: 92f857ea33ae9356e359a7fe71b957b577bbe753
                  MATRIX: 753->1|873->33|903->100|931->102|981->126|1011->148|1050->150|1086->156|1133->177|1149->185|1172->188|1201->191|1217->199|1243->205|1283->220|1299->228|1325->234|1357->240|1407->264|1423->272|1464->293|1501->304|1532->326|1572->328|1609->338|1660->362|1677->370|1720->392|1761->403|1790->405
                  LINES: 26->1|29->1|31->5|32->6|32->6|32->6|32->6|32->6|33->7|33->7|33->7|33->7|33->7|33->7|34->8|34->8|34->8|35->9|35->9|35->9|35->9|36->10|36->10|36->10|37->11|37->11|37->11|37->11|38->12|39->13
                  -- GENERATED --
              */
          