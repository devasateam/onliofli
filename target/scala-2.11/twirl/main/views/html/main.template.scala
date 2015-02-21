
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User = null, scripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>"""),_display_(/*5.17*/Messages("title")),format.raw/*5.34*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*6.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.at("stylesheets/main.css")),format.raw/*7.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png")),format.raw/*8.97*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.at("javascripts/jquery/jquery-2.1.0.min.js")),format.raw/*9.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("javascripts/bootstrap.js")),format.raw/*10.67*/("""" type="text/javascript"></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.at("stylesheets/font-awesome.min.css")),format.raw/*11.106*/("""">
        """),_display_(/*12.10*/scripts),format.raw/*12.17*/("""
    """),format.raw/*13.5*/("""</head>
    <body>

        <div ng-controller="MenuCtrl" class="navbar navbar-inverse navbar-default" role="navigation">

            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="fa fa-bars fa-lg fa-inverse"></span>
                </button>
                <a class="navbar-brand" href=""""),_display_(/*23.48*/routes/*23.54*/.Application.index()),format.raw/*23.74*/("""">
                    <i class="fa fa-rocket"></i> Project name
                </a>
                <ul class="nav navbar-nav navbar-right">
                    <li class=""><a href=""""),_display_(/*27.44*/routes/*27.50*/.Application.index()),format.raw/*27.70*/("""">Home</a></li>
                </ul>
            </div>
            """),_display_(/*30.14*/logged(user)),format.raw/*30.26*/("""
        """),format.raw/*31.9*/("""</div>

        <div class="container">
            <div class="row">
                """),_display_(/*35.18*/content),format.raw/*35.25*/("""
            """),format.raw/*36.13*/("""</div>
        </div>

        <hr>
        <div class="footer text-center">
            <div>
                <small>
                </small>
            </div>
        </div>
    </body>
</html>
"""))}
  }

  def render(user:User,scripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(user,scripts)(content)

  def f:((User,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (user,scripts) => (content) => apply(user,scripts)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Feb 22 00:49:31 IST 2015
                  SOURCE: /home/samir/personal/api/app/views/main.scala.html
                  HASH: 2c348274d4d0dfea4d5fbb3f4b5ed17ad34a4434
                  MATRIX: 730->1|878->61|905->62|981->112|1018->129|1106->191|1120->197|1179->236|1261->292|1275->298|1329->332|1416->393|1430->399|1482->431|1533->456|1547->462|1619->514|1703->571|1718->577|1777->615|1892->703|1907->709|1975->755|2014->767|2042->774|2074->779|2593->1271|2608->1277|2649->1297|2862->1483|2877->1489|2918->1509|3015->1579|3048->1591|3084->1600|3198->1687|3226->1694|3267->1707
                  LINES: 26->1|29->1|30->2|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|41->13|51->23|51->23|51->23|55->27|55->27|55->27|58->30|58->30|59->31|63->35|63->35|64->36
                  -- GENERATED --
              */
          