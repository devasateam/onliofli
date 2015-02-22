
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
object reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[controllers.account.Reset.ResetForm],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resetForm: Form[controllers.account.Reset.ResetForm], token: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*8.6*/scripts/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
        """),format.raw/*9.9*/("""<script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.at("javascripts/password.js")),format.raw/*9.66*/("""" type="text/javascript"></script>
    """)))};implicit def /*4.6*/implicitFieldConstructor/*4.30*/ = {{
        FieldConstructor(twitterBootstrapInput.render)
    }};
Seq[Any](format.raw/*1.71*/("""

"""),format.raw/*4.1*/("""    """),format.raw/*6.6*/("""

    """),format.raw/*10.6*/("""

"""),_display_(/*12.2*/main(null, scripts)/*12.21*/ {_display_(Seq[Any](format.raw/*12.23*/("""

    """),format.raw/*14.5*/("""<h3>"""),_display_(/*14.10*/Messages("signup.reset.password")),format.raw/*14.43*/("""</h3>

    """),_display_(/*16.6*/wflash()),format.raw/*16.14*/("""

    """),format.raw/*18.5*/("""<div class="col col-lg-8">
        """),_display_(/*19.10*/Messages("resetpassword.new.password")),format.raw/*19.48*/("""

        """),_display_(/*21.10*/form(controllers.account.routes.Reset.runReset(token))/*21.64*/ {_display_(Seq[Any](format.raw/*21.66*/("""

            """),format.raw/*23.13*/("""<div class="form-group">
                """),_display_(/*24.18*/inputPassword(
                    resetForm("inputPassword"),
                    'placeholder -> Messages("password"),
                    '_label -> null,
                    'class -> "form-control"
                )),format.raw/*29.18*/("""
                """),format.raw/*30.17*/("""<h6>"""),_display_(/*30.22*/Messages("signup.generate.password")),format.raw/*30.58*/("""</h6>
                <input type="text" name="passwordGenerated" class="form-control">

            </div>

            <hr>

            <input type="submit" class="btn btn-primary" value=""""),_display_(/*37.66*/Messages("validate")),format.raw/*37.86*/("""">
            <a href=""""),_display_(/*38.23*/routes/*38.29*/.Application.index),format.raw/*38.47*/("""" class="btn btn-default">"""),_display_(/*38.74*/Messages("goback")),format.raw/*38.92*/("""</a>

        """)))}),format.raw/*40.10*/("""
    """),format.raw/*41.5*/("""</div>

""")))}),format.raw/*43.2*/("""
"""))}
  }

  def render(resetForm:Form[controllers.account.Reset.ResetForm],token:String): play.twirl.api.HtmlFormat.Appendable = apply(resetForm,token)

  def f:((Form[controllers.account.Reset.ResetForm],String) => play.twirl.api.HtmlFormat.Appendable) = (resetForm,token) => apply(resetForm,token)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 00:36:09 IST 2015
                  SOURCE: F:/project/practise/marketplace-play/api/app/views/account/reset/reset.scala.html
                  HASH: 16f729fc64e342b70a466bd3932e6a06c43954c2
                  MATRIX: 779->1|934->198|949->205|1029->209|1065->219|1105->233|1119->239|1176->276|1248->97|1280->121|1378->70|1408->92|1438->189|1473->317|1504->322|1532->341|1572->343|1607->351|1639->356|1693->389|1733->403|1762->411|1797->419|1861->456|1920->494|1960->507|2023->561|2063->563|2107->579|2177->622|2423->847|2469->865|2501->870|2558->906|2784->1105|2825->1125|2878->1151|2893->1157|2932->1175|2986->1202|3025->1220|3073->1237|3106->1243|3147->1254
                  LINES: 26->1|28->8|28->8|30->8|31->9|31->9|31->9|31->9|32->4|32->4|35->1|37->4|37->6|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|45->16|47->18|48->19|48->19|50->21|50->21|50->21|52->23|53->24|58->29|59->30|59->30|59->30|66->37|66->37|67->38|67->38|67->38|67->38|67->38|69->40|70->41|72->43
                  -- GENERATED --
              */
          