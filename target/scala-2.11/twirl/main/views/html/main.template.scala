
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

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/Messages("title")),format.raw/*7.34*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css")),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png")),format.raw/*10.97*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery/jquery-2.1.0.min.js")),format.raw/*11.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/bootstrap.js")),format.raw/*12.67*/("""" type="text/javascript"></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.at("stylesheets/font-awesome.min.css")),format.raw/*13.106*/("""">
        """),_display_(/*14.10*/scripts),format.raw/*14.17*/("""
    """),format.raw/*15.5*/("""</head>
    <body>

        <div ng-controller="MenuCtrl" class="navbar navbar-inverse navbar-default" role="navigation">

            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="fa fa-bars fa-lg fa-inverse"></span>
                </button>
                <a class="navbar-brand" href=""""),_display_(/*25.48*/routes/*25.54*/.Application.index()),format.raw/*25.74*/("""">
                    <i class="fa fa-rocket"></i> Project name
                </a>
                <ul class="nav navbar-nav navbar-right">
                    <li class=""><a href=""""),_display_(/*29.44*/routes/*29.50*/.Application.index()),format.raw/*29.70*/("""">Home</a></li>
                </ul>
            </div>
            """),_display_(/*32.14*/logged(user)),format.raw/*32.26*/("""
        """),format.raw/*33.9*/("""</div>

        <div class="container">
            <div class="row">
                """),_display_(/*37.18*/content),format.raw/*37.25*/("""
            """),format.raw/*38.13*/("""</div>
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
                  DATE: Mon Feb 23 00:36:09 IST 2015
                  SOURCE: F:/project/practise/marketplace-play/api/app/views/main.scala.html
                  HASH: 8be041f424fe0b8001a830e8fbb41f1424bfe486
                  MATRIX: 730->1|878->61|908->65|989->120|1026->137|1115->200|1129->206|1188->245|1271->302|1285->308|1339->342|1428->404|1443->410|1496->442|1549->468|1564->474|1637->526|1722->584|1737->590|1796->628|1912->717|1927->723|1995->769|2035->782|2063->789|2096->795|2625->1297|2640->1303|2681->1323|2898->1513|2913->1519|2954->1539|3054->1612|3087->1624|3124->1634|3242->1725|3270->1732|3312->1746
                  LINES: 26->1|29->1|31->3|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|43->15|53->25|53->25|53->25|57->29|57->29|57->29|60->32|60->32|61->33|65->37|65->37|66->38
                  -- GENERATED --
              */
          