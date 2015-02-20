
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
object logged extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/if(user != null)/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> """),_display_(/*6.100*/user/*6.104*/.fullname),format.raw/*6.113*/(""" """),format.raw/*6.114*/("""<b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li><a href=""""),_display_(/*8.31*/controllers/*8.42*/.account.settings.routes.Index.index()),format.raw/*8.80*/(""""><i class="fa fa-wrench"></i> """),_display_(/*8.112*/Messages("settings")),format.raw/*8.132*/("""</a></li>
                <li class="divider"></li>
                <li><a href=""""),_display_(/*10.31*/routes/*10.37*/.Application.logout()),format.raw/*10.58*/(""""><i class="fa fa-power-off"></i> """),_display_(/*10.93*/Messages("logout")),format.raw/*10.111*/("""</a></li>
            </ul>
        </li>
    </ul>
""")))}),format.raw/*14.2*/("""
"""))}
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 20 04:02:53 IST 2015
                  SOURCE: /home/samir/personal/api/app/views/logged.scala.html
                  HASH: 0c38ab586d15a8f45534f520986ee6b18547ff07
                  MATRIX: 722->1|822->13|850->16|874->32|913->34|944->39|1141->209|1154->213|1184->222|1213->223|1334->318|1353->329|1411->367|1470->399|1511->419|1620->501|1635->507|1677->528|1739->563|1779->581|1862->634
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|34->6|34->6|34->6|34->6|36->8|36->8|36->8|36->8|36->8|38->10|38->10|38->10|38->10|38->10|42->14
                  -- GENERATED --
              */
          