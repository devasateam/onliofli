
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
                  DATE: Sun Feb 22 00:49:31 IST 2015
                  SOURCE: /home/samir/personal/api/app/views/twitterBootstrapInput.scala.html
                  HASH: 74b78340616f37df9d2aeb3e14be7be962e51986
                  MATRIX: 753->1|873->33|901->96|928->97|978->121|1008->143|1047->145|1083->151|1129->171|1145->179|1168->182|1197->185|1213->193|1239->199|1278->213|1294->221|1320->227|1351->232|1401->256|1417->264|1458->285|1494->295|1525->317|1565->319|1601->328|1652->352|1669->360|1712->382|1752->392|1780->393
                  LINES: 26->1|29->1|31->5|32->6|32->6|32->6|32->6|32->6|33->7|33->7|33->7|33->7|33->7|33->7|34->8|34->8|34->8|35->9|35->9|35->9|35->9|36->10|36->10|36->10|37->11|37->11|37->11|37->11|38->12|39->13
                  -- GENERATED --
              */
          