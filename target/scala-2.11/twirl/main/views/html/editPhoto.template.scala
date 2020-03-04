
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editPhoto_Scope0 {
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

class editPhoto extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.users.Customer,Form[models.users.editProfileForm],play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentCustomer : models.users.Customer,editProfilePhoto : Form[models.users.editProfileForm],env : play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.124*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Edit Profile Picture",currentCustomer)/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""

			"""),_display_(/*7.5*/helper/*7.11*/.form(action = controllers.security.routes.LoginSignUpController.editProfilePhotoSubmit(),'class ->"form-horizontal",'role -> "form",'enctype -> "multipart/form-data")/*7.178*/ {_display_(Seq[Any](format.raw/*7.180*/("""
				"""),format.raw/*8.5*/("""<div class="col-sm-2">
				</div>
				<div class="col-sm-8">
					
					<div class="col-sm-2">
					</div>
					
					<div class="col-sm-8" id="SignIn-UpWrapper">
						
						<div id="SignIn-UpHeader">
							<span id="TextAlignCenter"><h2 id="textLightRed"> Profile </h2></span>
						</div>		
						<div id="SignIn-UpBody">
						"""),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
							"""),format.raw/*22.8*/("""<div class="alert alert-success TextAlignCenter">
								"""),_display_(/*23.10*/flash/*23.15*/.get("success")),format.raw/*23.30*/("""
							"""),format.raw/*24.8*/("""</div>
						""")))}),format.raw/*25.8*/("""
						"""),_display_(/*26.8*/if(flash.containsKey("error"))/*26.38*/ {_display_(Seq[Any](format.raw/*26.40*/("""
							"""),format.raw/*27.8*/("""<div class="alert alert-warning TextAlignCenter">
								"""),_display_(/*28.10*/flash/*28.15*/.get("error")),format.raw/*28.28*/("""
							"""),format.raw/*29.8*/("""</div>
						""")))}),format.raw/*30.8*/("""
						
								"""),format.raw/*32.9*/("""<div class="page-header TextAlignCenter">
									<h3>Edit Profile Picture</h3>
								</div>
								<div class="row">
									<div class="col-sm-3">
									</div>
									<div class="col-sm-6">								
										"""),_display_(/*39.12*/if(env.resource("public/images/userImages/"+currentCustomer.getName()+".jpg").isDefined)/*39.100*/ {_display_(Seq[Any](format.raw/*39.102*/("""
											"""),format.raw/*40.12*/("""<img src="/assets/images/userImages/"""),_display_(/*40.49*/(currentCustomer.getName()+".jpg")),format.raw/*40.83*/("""" class="img-responsive" id="ProfilePhoto" alt="Members Personal Image"/>
										""")))}/*41.12*/else/*41.17*/{_display_(Seq[Any](format.raw/*41.18*/("""
											"""),format.raw/*42.12*/("""<img src="/assets/images/userImages/thumbnails/default.png" class="img-responsive" alt="Members Personal Image"/>		
										""")))}),format.raw/*43.12*/("""
										
										"""),format.raw/*45.11*/("""<br>
										<input  type="file" class="btn-xs btn-default" name="upload" >
									</div>	
									<div class="col-sm-3">
									</div>
								</div>
				""")))}),format.raw/*51.6*/("""				
							"""),format.raw/*52.8*/("""<input type="submit" value="Save" class="btn" id="Buttons">
							<a href=""""),_display_(/*53.18*/controllers/*53.29*/.security.routes.LoginSignUpController.editProfile()),format.raw/*53.81*/("""" class="btn btn-warning">Cancel</a>
						
				
							
							

						</div>	
					</div>
					<div class="co-sm-2">
					</div>				
				</div>
				<div class="col-sm-2">
				</div>
					
""")))}),format.raw/*67.2*/("""
"""))
      }
    }
  }

  def render(currentCustomer:models.users.Customer,editProfilePhoto:Form[models.users.editProfileForm],env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(currentCustomer,editProfilePhoto,env)

  def f:((models.users.Customer,Form[models.users.editProfileForm],play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (currentCustomer,editProfilePhoto,env) => apply(currentCustomer,editProfilePhoto,env)

  def ref: this.type = this

}


}

/**/
object editPhoto extends editPhoto_Scope0.editPhoto
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/editPhoto.scala.html
                  HASH: 4f66fe4649793fbf5cf4e59a548a3de4e9473a4c
                  MATRIX: 824->1|1057->123|1085->142|1112->144|1164->188|1203->190|1234->196|1248->202|1424->369|1464->371|1495->376|1855->710|1896->742|1936->744|1971->752|2057->811|2071->816|2107->831|2142->839|2186->853|2220->861|2259->891|2299->893|2334->901|2420->960|2434->965|2468->978|2503->986|2547->1000|2590->1016|2838->1237|2936->1325|2977->1327|3017->1339|3081->1376|3136->1410|3240->1495|3253->1500|3292->1501|3332->1513|3490->1640|3540->1662|3733->1825|3772->1837|3876->1914|3896->1925|3969->1977|4190->2168
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|37->7|37->7|37->7|37->7|38->8|51->21|51->21|51->21|52->22|53->23|53->23|53->23|54->24|55->25|56->26|56->26|56->26|57->27|58->28|58->28|58->28|59->29|60->30|62->32|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|71->41|72->42|73->43|75->45|81->51|82->52|83->53|83->53|83->53|97->67
                  -- GENERATED --
              */
          