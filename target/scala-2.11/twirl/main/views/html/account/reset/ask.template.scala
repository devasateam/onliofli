
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

/**/
object ask extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.account.Reset.AskForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(askForm: Form[controllers.account.Reset.AskForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*4.6*/implicitFieldConstructor/*4.30*/ = {{
        FieldConstructor(twitterBootstrapInput.render)
    }};
Seq[Any](format.raw/*1.52*/("""

"""),format.raw/*4.1*/("""    """),format.raw/*6.6*/("""


"""),_display_(/*9.2*/main()/*9.8*/ {_display_(Seq[Any](format.raw/*9.10*/("""

    """),format.raw/*11.5*/("""<div class="col col-lg-8">
        <h3>"""),_display_(/*12.14*/Messages("resetpassword")),format.raw/*12.39*/("""</h3>

        """),_display_(/*14.10*/wflash()),format.raw/*14.18*/("""

        """),_display_(/*16.10*/form(controllers.account.routes.Reset.runAsk())/*16.57*/ {_display_(Seq[Any](format.raw/*16.59*/("""

            """),format.raw/*18.13*/("""<div class="form-group">
            """),_display_(/*19.14*/inputText(
                askForm("email"),
                'placeholder -> Messages("email"),
                '_label -> null,
                'class -> "form-control"
            )),format.raw/*24.14*/("""
            """),format.raw/*25.13*/("""</div>

            <hr>
            <input type="submit" class="btn btn-primary" value=""""),_display_(/*28.66*/Messages("reset")),format.raw/*28.83*/("""">

            <a href=""""),_display_(/*30.23*/routes/*30.29*/.Application.index),format.raw/*30.47*/("""" class="btn btn-default">"""),_display_(/*30.74*/Messages("goback")),format.raw/*30.92*/("""</a>

        """)))}),format.raw/*32.10*/("""

    """),format.raw/*34.5*/("""</div>


""")))}),format.raw/*37.2*/("""
"""))}
  }

  def render(askForm:Form[controllers.account.Reset.AskForm]): play.twirl.api.HtmlFormat.Appendable = apply(askForm)

  def f:((Form[controllers.account.Reset.AskForm]) => play.twirl.api.HtmlFormat.Appendable) = (askForm) => apply(askForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Feb 22 00:49:32 IST 2015
                  SOURCE: /home/samir/personal/api/app/views/account/reset/ask.scala.html
                  HASH: ce7927e99c2b41aab7abb83081c813c31e0f5b0c
                  MATRIX: 768->1|913->75|945->99|1041->51|1069->70|1099->165|1128->169|1141->175|1180->177|1213->183|1280->223|1326->248|1369->264|1398->272|1436->283|1492->330|1532->332|1574->346|1639->384|1843->567|1884->580|2001->670|2039->687|2092->713|2107->719|2146->737|2200->764|2239->782|2285->797|2318->803|2358->813
                  LINES: 26->1|28->4|28->4|31->1|33->4|33->6|36->9|36->9|36->9|38->11|39->12|39->12|41->14|41->14|43->16|43->16|43->16|45->18|46->19|51->24|52->25|55->28|55->28|57->30|57->30|57->30|57->30|57->30|59->32|61->34|64->37
                  -- GENERATED --
              */
          