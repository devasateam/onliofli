
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
object email extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,Form[controllers.account.settings.Email.AskForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User, askForm: Form[controllers.account.settings.Email.AskForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.73*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/index(user)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""

    """),_display_(/*7.6*/Messages("account.settings.email")),format.raw/*7.40*/("""

    """),_display_(/*9.6*/wflash()),format.raw/*9.14*/("""

    """),_display_(/*11.6*/form(controllers.account.settings.routes.Email.runEmail())/*11.64*/ {_display_(Seq[Any](format.raw/*11.66*/("""

        """),format.raw/*13.9*/("""<fieldset>
        """),_display_(/*14.10*/inputText(
            askForm("email"),
            'placeholder -> Messages("email"),
            '_label -> null,
            'class -> "form-control"
        )),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""</fieldset>

        <div class="form-actions">
            <input type="submit" class="btn btn-primary" value=""""),_display_(/*23.66*/Messages("validate")),format.raw/*23.86*/("""">
        </div>
    """)))}),format.raw/*25.6*/("""

""")))}))}
  }

  def render(user:User,askForm:Form[controllers.account.settings.Email.AskForm]): play.twirl.api.HtmlFormat.Appendable = apply(user,askForm)

  def f:((User,Form[controllers.account.settings.Email.AskForm]) => play.twirl.api.HtmlFormat.Appendable) = (user,askForm) => apply(user,askForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 00:36:09 IST 2015
                  SOURCE: F:/project/practise/marketplace-play/api/app/views/account/settings/email.scala.html
                  HASH: fd196c92112d04a9a0d2da99bfb5b9cfccd3f56e
                  MATRIX: 787->1|961->72|991->94|1019->97|1038->108|1077->110|1111->119|1165->153|1199->162|1227->170|1262->179|1329->237|1369->239|1408->251|1456->272|1645->440|1682->450|1825->566|1866->586|1921->611
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|34->7|36->9|36->9|38->11|38->11|38->11|40->13|41->14|46->19|47->20|50->23|50->23|52->25
                  -- GENERATED --
              */
          