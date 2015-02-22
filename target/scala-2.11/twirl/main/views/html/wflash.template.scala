
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
import helper._
import helper.twitterBootstrap._
/**/
object wflash extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*4.2*/flash/*4.7*/.map/*4.11*/ {/*5.5*/case (key, value) =>/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
        """),format.raw/*6.9*/("""<p class="">
            <span class="label label-"""),_display_(/*7.39*/key),format.raw/*7.42*/("""">"""),_display_(/*7.45*/value),format.raw/*7.50*/("""</span>
        </p>
    """)))}}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 00:36:09 IST 2015
                  SOURCE: F:/project/practise/marketplace-play/api/app/views/wflash.scala.html
                  HASH: 703fd5a4deff5622bcaa988777da1cf92abe2dab
                  MATRIX: 847->56|859->61|871->65|880->73|908->93|947->95|983->105|1061->157|1084->160|1113->163|1138->168
                  LINES: 30->4|30->4|30->4|30->5|30->5|30->5|31->6|32->7|32->7|32->7|32->7
                  -- GENERATED --
              */
          