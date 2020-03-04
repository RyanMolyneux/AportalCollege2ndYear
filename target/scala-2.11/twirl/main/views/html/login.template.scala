
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[models.users.Login],models.users.User,Form[models.users.SignUp],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User,signUpForm: Form[models.users.SignUp]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.102*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
"""),_display_(/*5.2*/main("Login", user)/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
	"""),format.raw/*6.2*/("""<div class="col-sm-2">
	</div>
	<div class="col-sm-8">
  <!-- HTML content for the index view -->
 	   <div class="row">
	        <div class="col-sm-1">

	        </div>
	            <div  class="col-sm-5" id="SignIn-UpWrapper"><!---Start of Sign In Form--->
	              <div  id="SignIn-UpHeaders">
	                 <h2>Sign <span id="textLightRed">In</span></h2>
	             </div>
	            <!-- Display login errors if they exist -->
	              """),_display_(/*19.17*/if(loginForm.hasGlobalErrors)/*19.46*/ {_display_(Seq[Any](format.raw/*19.48*/("""
	               """),format.raw/*20.17*/("""<p class="alert alert-warning TextAlignCenter">
	               """),_display_(/*21.18*/loginForm/*21.27*/.globalError.message),format.raw/*21.47*/("""
	              """),format.raw/*22.16*/("""</p>
	                """)))}),format.raw/*23.19*/("""
	              """),_display_(/*24.17*/if(flash.containsKey("error"))/*24.47*/ {_display_(Seq[Any](format.raw/*24.49*/("""
	                """),format.raw/*25.18*/("""<div class="alert alert-warning TextAlignCenter">
	                """),_display_(/*26.19*/flash/*26.24*/.get("loginRequired")),format.raw/*26.45*/("""
	                """),format.raw/*27.18*/("""</div>
	                """)))}),format.raw/*28.19*/("""
	                """),format.raw/*29.18*/("""<!-- The login form -->
	                <div id="SignIn-UpBody">
	                    """),_display_(/*31.23*/helper/*31.29*/.form(action = controllers.security.routes.LoginSignUpController.loginSubmit())/*31.108*/ {_display_(Seq[Any](format.raw/*31.110*/("""

	                     """),format.raw/*33.23*/("""<div class="form-group">
	                       """),_display_(/*34.26*/inputText(loginForm("email"), '_label -> "Email",'id -> "FormLabel",'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*34.153*/("""
	                     """),format.raw/*35.23*/("""</div>
	                     <div class="form-group">
	                       """),_display_(/*37.26*/inputPassword(loginForm("password"), '_label -> "Password",'id -> "FormLabel",'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*37.166*/("""
	                     """),format.raw/*38.23*/("""</div>

	                    <!-- Add a submit button -->
	                    <input type="submit" value="Confirm" class="btn" id="Buttons"></input>
	                 </div>
	                """)))}),format.raw/*43.19*/("""
	             """),format.raw/*44.15*/("""</div>

	    <div class="col-sm-5" id="SignIn-UpWrapper">
	            <!---Start of SignUp Form--->
	        <div id="SignIn-UpHeaders">
	            <h2>Sign <span id="textLightRed">Up</span></h2>
	        </div>
		"""),_display_(/*51.4*/if(signUpForm.hasGlobalErrors)/*51.34*/ {_display_(Seq[Any](format.raw/*51.36*/("""
		  """),format.raw/*52.5*/("""<div class="alert alert-warning">
		  """),_display_(/*53.6*/signUpForm/*53.16*/.globalError.message),format.raw/*53.36*/("""
		  """),format.raw/*54.5*/("""</div>
		""")))}),format.raw/*55.4*/("""
		"""),_display_(/*56.4*/if(flash.containsKey("error"))/*56.34*/	{_display_(Seq[Any](format.raw/*56.36*/("""
		"""),format.raw/*57.3*/("""<div class="alert alert-warning">
		 """),_display_(/*58.5*/flash/*58.10*/.get("missing field")),format.raw/*58.31*/("""		
		"""),format.raw/*59.3*/("""</div>
		""")))}),format.raw/*60.4*/("""
	        """),_display_(/*61.11*/helper/*61.17*/.form(action = controllers.security.routes.LoginSignUpController.signUpSubmit(),'id-> "SignIn-UpBody")/*61.119*/ {_display_(Seq[Any](format.raw/*61.121*/("""

		    """),format.raw/*63.7*/("""<div class="form-group">
			<label id="form-group">Email</label>
	                <input type="text" name="email" required class="form-control" placeholder="Email">
	            </div>
		    <div class="form-group">
			<label id="FormLabel">User Name</label>
	                <input type="text" name="userName" required class="form-control" placeholder="Username">
	            </div>
	            <div class="form-group">
	                <label id="FormLabel">Password</label>
			<input type="password" name="password" required class="form-control" placeholder="Password">
	            </div>
		    <div class="form-group">
			<label id="FormLabel">Confirm Password</label>
			<input type="password" name="passwordConfirm"  class="form-control" placeholder="Confirm Password">
		    </div>

	           
	        

	            <input type="submit" value="Confirm" class="btn" id="Buttons"></input>
	
	        """)))}),format.raw/*85.11*/("""
	            """),format.raw/*86.14*/("""<!---End of Sign Up form--->
	    </div>
	    </div>
  <!-- End of content for main -->
	</div>
	<div class="col-sm-2">
	</div>
""")))}),format.raw/*93.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User,signUpForm:Form[models.users.SignUp]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user,signUpForm)

  def f:((Form[models.users.Login],models.users.User,Form[models.users.SignUp]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user,signUpForm) => apply(loginForm,user,signUpForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/login.scala.html
                  HASH: 8e5e5993a55b9bbd50a3a2a1c78d01481a86eef7
                  MATRIX: 807->1|1018->101|1045->119|1073->192|1100->194|1127->213|1166->215|1194->217|1684->680|1722->709|1762->711|1807->728|1899->793|1917->802|1958->822|2002->838|2056->861|2100->878|2139->908|2179->910|2225->928|2320->996|2334->1001|2376->1022|2422->1040|2478->1065|2524->1083|2639->1171|2654->1177|2743->1256|2784->1258|2836->1282|2913->1332|3062->1459|3113->1482|3219->1561|3381->1701|3432->1724|3656->1917|3699->1932|3943->2150|3982->2180|4022->2182|4054->2187|4119->2226|4138->2236|4179->2256|4211->2261|4251->2271|4281->2275|4320->2305|4360->2307|4390->2310|4454->2348|4468->2353|4510->2374|4542->2379|4582->2389|4620->2400|4635->2406|4747->2508|4788->2510|4823->2518|5767->3431|5809->3445|5968->3574
                  LINES: 27->1|32->1|33->3|34->4|35->5|35->5|35->5|36->6|49->19|49->19|49->19|50->20|51->21|51->21|51->21|52->22|53->23|54->24|54->24|54->24|55->25|56->26|56->26|56->26|57->27|58->28|59->29|61->31|61->31|61->31|61->31|63->33|64->34|64->34|65->35|67->37|67->37|68->38|73->43|74->44|81->51|81->51|81->51|82->52|83->53|83->53|83->53|84->54|85->55|86->56|86->56|86->56|87->57|88->58|88->58|88->58|89->59|90->60|91->61|91->61|91->61|91->61|93->63|115->85|116->86|123->93
                  -- GENERATED --
              */
          