
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
                  DATE: Sun Feb 22 00:49:31 IST 2015
                  SOURCE: /home/samir/personal/api/app/views/account/settings/index.scala.html
                  HASH: facbdf6e086da00dea7918edc815a5bdd1c8ebcc
                  MATRIX: 743->1|858->28|886->31|904->41|943->43|975->49|1156->204|1175->215|1234->254|1263->257|1304->277|1409->355|1429->366|1486->402|1516->405|1554->422|1685->526|1713->533|1749->542
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|37->9|37->9|37->9|37->9|37->9|40->12|40->12|40->12|40->12|40->12|45->17|45->17|46->18
                  -- GENERATED --
              */
          