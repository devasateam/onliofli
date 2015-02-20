
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
object emailValidate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/index(user)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""

    """),_display_(/*7.6*/wflash()),format.raw/*7.14*/("""

""")))}))}
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 20 04:02:53 IST 2015
                  SOURCE: /home/samir/personal/api/app/views/account/settings/emailValidate.scala.html
                  HASH: ef606d4cf07efdec7723a80c7a6b3fb3fbbb1037
                  MATRIX: 746->1|861->13|889->32|916->34|935->45|974->47|1006->54|1034->62
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|34->7
                  -- GENERATED --
              */
          