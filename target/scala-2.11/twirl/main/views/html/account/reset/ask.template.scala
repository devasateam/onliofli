
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
                  DATE: Mon Feb 23 00:36:09 IST 2015
                  SOURCE: F:/project/practise/marketplace-play/api/app/views/account/reset/ask.scala.html
                  HASH: f1afad8ee2127d8d9014f6fc6c3f7f9dcb645191
                  MATRIX: 768->1|913->78|945->102|1043->51|1073->73|1103->170|1135->177|1148->183|1187->185|1222->193|1290->234|1336->259|1381->277|1410->285|1450->298|1506->345|1546->347|1590->363|1656->402|1865->590|1907->604|2027->697|2065->714|2120->742|2135->748|2174->766|2228->793|2267->811|2315->828|2350->836|2393->849
                  LINES: 26->1|28->4|28->4|31->1|33->4|33->6|36->9|36->9|36->9|38->11|39->12|39->12|41->14|41->14|43->16|43->16|43->16|45->18|46->19|51->24|52->25|55->28|55->28|57->30|57->30|57->30|57->30|57->30|59->32|61->34|64->37
                  -- GENERATED --
              */
          