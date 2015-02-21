
package views.html.account

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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE HTML>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href=""""),_display_(/*5.49*/routes/*5.55*/.Assets.at("stylesheets/account/main.css")),format.raw/*5.97*/("""">
		<script type="text/javascript" src=""""),_display_(/*6.40*/routes/*6.46*/.Assets.at("javascripts/jquery/jquery-1.11.2.js")),format.raw/*6.95*/(""""></script>
		<script type="text/javascript" src=""""),_display_(/*7.40*/routes/*7.46*/.Assets.at("javascripts/account/main.js")),format.raw/*7.87*/(""""></script>
	</head>
	<body>
		<header>
		</header>
		<section>
			<div class="sign-container">
				<div class="sign-in">
					<!-- <div>
						<button>Sign In with Google+</button>
					</div>
					<label>E-Mail address:</label>
					<input type="email" name="username" id="username"/><br/>
					<label>Password:</label>
					<input type="password" id="password"/><br/>
					<button id="sign_in">Sign In</button><br/>
					<a href="#">Forgot your password?</a><br/> -->
					<div class="sign-title">Sign in to your account</div>
					<form name="sign_in" method="post" id="signIn">
						<label>E-Mail address:</label>
	                    <input type="text" name="email"/><br>
	                    <label>Password:</label>
	                    <input type="password" name="password"/><br>
	                    <!-- <input type="checkbox" name="autologin"/><span>Login Automatically</span> -->
	                    <button type="submit" id="" >Login</button><br>
	                    <a href="password/reset">Forgot Your Password?</a>
	                </form>
				</div>
				<div class="sign-up">
					<!-- <div>
						<button>Sign Up with Google+</button>
					</div>
					<label>E-Mail address:</label>
					<input type="email" name="newusername" id="newusername"/><br/>
					<label>Password:</label>
					<input type="password" id="pass"/><br/>
					<label>Confirm Password:</label>
					<input type="password" id="confm_pass"/><br/>
					<button id="sign_up">Sign Up</button><br/> -->
					<div class="sign-title">New user ?? Register Now </div>
						<label>Name:</label>
                        <input type="text" name="full_name" id="full_name"/><br>
                        <label>E-Mail address:</label>
                        <input type="text" name="email" id="email"/><br>
                        <label>Password:</label>
                        <input type="password" name="password" value="" id="password"/><br>
                        <label>Confirm Password:</label>
                        <input type="password" name="password_confirmation" value="" id="confirm_password"/><br>                 
                        <button type="submit" id="submit" value="submit " name="submit">Register</button>
				</div>
			</div>
		</section>
		<footer>
		</footer>
	</body>
</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Feb 22 02:41:29 IST 2015
                  SOURCE: /home/samir/personal/api/app/views/account/login.scala.html
                  HASH: b6f2c9057bfdea5d9e69ad94e6105b0850e0709c
                  MATRIX: 724->1|813->3|840->4|945->83|959->89|1021->131|1089->173|1103->179|1172->228|1249->279|1263->285|1324->326
                  LINES: 26->1|29->1|30->2|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7
                  -- GENERATED --
              */
          