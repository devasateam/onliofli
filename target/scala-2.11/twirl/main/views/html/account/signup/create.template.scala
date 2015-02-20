
package views.html.account.signup

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
object create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Register],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*3.6*/scripts/*3.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.17*/("""
        """),format.raw/*4.9*/("""<script src=""""),_display_(/*4.23*/routes/*4.29*/.Assets.at("javascripts/password.js")),format.raw/*4.66*/("""" type="text/javascript"></script>
    """)))};
Seq[Any](format.raw/*1.42*/("""

    """),format.raw/*5.6*/("""

"""),_display_(/*7.2*/main(null, scripts)/*7.21*/ {_display_(Seq[Any](format.raw/*7.23*/("""
    """),format.raw/*8.5*/("""<div class="span3">
            &nbsp;
    </div>

    <div class="span12">
        <div class="well">
        """),_display_(/*14.10*/createFormOnly(signupForm)),format.raw/*14.36*/("""
        """),format.raw/*15.9*/("""</div>
    </div>
""")))}))}
  }

  def render(signupForm:Form[Application.Register]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[Application.Register]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 20 04:02:53 IST 2015
                  SOURCE: /home/samir/personal/api/app/views/account/signup/create.scala.html
                  HASH: b8d25ebd10c14dc791a9d7587de82504c03ced73
                  MATRIX: 759->1|870->48|885->55|965->59|1000->68|1040->82|1054->88|1111->125|1190->41|1222->165|1250->168|1277->187|1316->189|1347->194|1486->306|1533->332|1569->341
                  LINES: 26->1|28->3|28->3|30->3|31->4|31->4|31->4|31->4|33->1|35->5|37->7|37->7|37->7|38->8|44->14|44->14|45->15
                  -- GENERATED --
              */
          