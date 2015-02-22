
package views.html.account.settings

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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/("""

"""),_display_(/*3.2*/main(user)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

    """),format.raw/*5.5*/("""<div class="row">
        <div class="col col-lg-4">
            <ul class="nav nav-pills nav-stacked">
                <li>
                    <a href=""""),_display_(/*9.31*/controllers/*9.42*/.account.settings.routes.Password.index),format.raw/*9.81*/("""">"""),_display_(/*9.84*/Messages("password")),format.raw/*9.104*/("""</a>
                </li>
                <li>
                    <a href=""""),_display_(/*12.31*/controllers/*12.42*/.account.settings.routes.Email.index),format.raw/*12.78*/("""">"""),_display_(/*12.81*/Messages("email")),format.raw/*12.98*/("""</a>
                </li>
            </ul>
        </div>
        <div class="col col-lg-8">
        """),_display_(/*17.10*/content),format.raw/*17.17*/("""
        """),format.raw/*18.9*/("""</div>
    </div>
""")))}))}
  }

  def render(user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(user)(content)

  def f:((User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (user) => (content) => apply(user)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 00:36:09 IST 2015
                  SOURCE: F:/project/practise/marketplace-play/api/app/views/account/settings/index.scala.html
                  HASH: 0581f6c348c92cf471ed2731745c690dac59e9e6
                  MATRIX: 743->1|858->28|888->33|906->43|945->45|979->53|1164->212|1183->223|1242->262|1271->265|1312->285|1420->366|1440->377|1497->413|1527->416|1565->433|1701->542|1729->549|1766->559
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|37->9|37->9|37->9|37->9|37->9|40->12|40->12|40->12|40->12|40->12|45->17|45->17|46->18
                  -- GENERATED --
              */
          