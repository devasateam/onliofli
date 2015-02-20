
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
                  DATE: Fri Feb 20 04:02:54 IST 2015
                  SOURCE: /home/samir/personal/api/app/views/account/reset/reset.scala.html
                  HASH: e410e2a4d4ff96b4407ed4648f0ec0a42d648c57
                  MATRIX: 779->1|934->191|949->198|1029->202|1064->211|1104->225|1118->231|1175->268|1246->94|1278->118|1374->70|1402->89|1432->184|1465->308|1494->311|1522->330|1562->332|1595->338|1627->343|1681->376|1719->388|1748->396|1781->402|1844->438|1903->476|1941->487|2004->541|2044->543|2086->557|2155->599|2396->819|2441->836|2473->841|2530->877|2749->1069|2790->1089|2842->1114|2857->1120|2896->1138|2950->1165|2989->1183|3035->1198|3067->1203|3106->1212
                  LINES: 26->1|28->8|28->8|30->8|31->9|31->9|31->9|31->9|32->4|32->4|35->1|37->4|37->6|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|45->16|47->18|48->19|48->19|50->21|50->21|50->21|52->23|53->24|58->29|59->30|59->30|59->30|66->37|66->37|67->38|67->38|67->38|67->38|67->38|69->40|70->41|72->43
                  -- GENERATED --
              */
          