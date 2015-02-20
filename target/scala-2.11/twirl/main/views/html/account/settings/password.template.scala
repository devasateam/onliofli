
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
object password extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/index(user)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""

    """),_display_(/*7.6*/Messages("account.settings.password")),format.raw/*7.43*/("""

    """),_display_(/*9.6*/wflash()),format.raw/*9.14*/("""

    """),_display_(/*11.6*/form(controllers.account.settings.routes.Password.runPassword())/*11.70*/ {_display_(Seq[Any](format.raw/*11.72*/("""
        """),format.raw/*12.9*/("""<div class="form-actions">
            <input type="submit" class="btn btn-primary" value=""""),_display_(/*13.66*/Messages("reset")),format.raw/*13.83*/("""">
        </div>
    """)))}),format.raw/*15.6*/("""

""")))}))}
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 20 04:02:53 IST 2015
                  SOURCE: /home/samir/personal/api/app/views/account/settings/password.scala.html
                  HASH: 7002ce21b374df8b69ed7e2ec45ed938b56ef41d
                  MATRIX: 741->1|856->13|884->32|911->34|930->45|969->47|1001->54|1058->91|1090->98|1118->106|1151->113|1224->177|1264->179|1300->188|1419->280|1457->297|1510->320
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|34->7|36->9|36->9|38->11|38->11|38->11|39->12|40->13|40->13|42->15
                  -- GENERATED --
              */
          