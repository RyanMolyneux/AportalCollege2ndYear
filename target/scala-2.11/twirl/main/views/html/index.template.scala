
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,List[models.Advert],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User,adverts : List[models.Advert]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title, user, and content """),format.raw/*3.41*/("""{"""),format.raw/*3.42*/("""html between braces"""),format.raw/*3.61*/("""}"""),format.raw/*3.62*/(""" """),format.raw/*3.63*/("""to the main view -->
"""),_display_(/*4.2*/main("Home", user)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
	<div class="col-sm-2">
	</div>
	<div class="col-sm-8">	
	    """),_display_(/*9.7*/if(flash.containsKey("error"))/*9.37*/ {_display_(Seq[Any](format.raw/*9.39*/("""
		"""),format.raw/*10.3*/("""<div class="alert alert-warning" id="TextAlignCenter">
			"""),_display_(/*11.5*/flash/*11.10*/.get("error")),format.raw/*11.23*/("""		
		"""),format.raw/*12.3*/("""</div>
	    """)))}),format.raw/*13.7*/("""
	    """),format.raw/*14.6*/("""<div class="row">
	        <div class="col-sm-12">
	            <div class="col-sm-12">
	                <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="0">
	                        <!-- Indicators -->


	                        <!-- Wrapper for slides -->
			    
	                    <div class="carousel-inner" role="listbox">
				 
				 	                       
				 <div class="item active">
				    	"""),_display_(/*27.11*/if(adverts.isEmpty()==false)/*27.39*/ {_display_(Seq[Any](format.raw/*27.41*/("""
	                            	"""),format.raw/*28.31*/("""<img src="/assets/images/advertImages/"""),_display_(/*28.70*/(adverts.get(0).getAdvertId()+".jpg")),format.raw/*28.107*/(""""  alt="Image of advertisement.">
				        """)))}),format.raw/*29.14*/("""
	                       	 """),format.raw/*30.27*/("""</div>
				
				"""),_display_(/*32.6*/for(advert<- adverts) yield /*32.27*/ {_display_(Seq[Any](format.raw/*32.29*/("""
				 """),format.raw/*33.6*/("""<div class="item">
					"""),_display_(/*34.7*/if(advert.getAdvertId>adverts.get(0).getAdvertId())/*34.58*/ {_display_(Seq[Any](format.raw/*34.60*/("""
					"""),format.raw/*35.6*/("""<img 
					src="/assets/images/advertImages/"""),_display_(/*36.40*/(advert.getAdvertId()+".jpg")),format.raw/*36.69*/(""""
					
					/>
				 	""")))}),format.raw/*39.8*/("""
				"""),format.raw/*40.5*/("""</div>
				""")))}),format.raw/*41.6*/("""
				
	                    """),format.raw/*43.22*/("""</div>
			    
                        <!-- Left and right controls -->
	                    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
	                        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
	                        <span class="sr-only">Previous</span>
	                    </a>
	                    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
	                        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
	                        <span class="sr-only">Next</span>
	                    </a>
	                </div>
	            </div>

	        </div>
	    </div>

	        <!---Product/Anime/Mange Preview Image Section.--->
	    <br>
	    <div class="row">
	        <div class="panel panel-warning">
	            <div class="panel-heading" id="mediaTitleBanner" >Top of the week</div>
	            <div class="panel-body" id="mediaBorder">
	                <br>
			"""),_display_(/*67.5*/for(media <- Media.findTopMedia()) yield /*67.39*/ {_display_(Seq[Any](format.raw/*67.41*/("""
	                """),format.raw/*68.18*/("""<div class="col-sm-4">
	                    <div class="panel-heading" id="mediaTitleBanner"><h4>"""),_display_(/*69.76*/media/*69.81*/.getTitle()),format.raw/*69.92*/("""</h4></div>
	                    <div class="panel-body" id="mediaBorder">
	                        <div class="col-sm-12">
	                            <img src="assets/images/mediaImages/"""),_display_(/*72.67*/(media.getMedia_ID()+".jpg")),format.raw/*72.95*/("""" class="image-responsive" id="setWidth" alt="Image of Product/Media.">
	                        </div>
	                    </div>
	                </div>
	                """)))}),format.raw/*76.19*/("""

	            """),format.raw/*78.14*/("""</div>
	        </div>
	        </div>
  <!-- End of content for main -->
	</div>
	<div class="col-sm-2">
	</div>


""")))}),format.raw/*87.2*/("""

"""))
      }
    }
  }

  def render(user:models.users.User,adverts:List[models.Advert]): play.twirl.api.HtmlFormat.Appendable = apply(user,adverts)

  def f:((models.users.User,List[models.Advert]) => play.twirl.api.HtmlFormat.Appendable) = (user,adverts) => apply(user,adverts)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/index.scala.html
                  HASH: 56d4ab8bc8865d799d7a8f7871895f5e1d3e37ca
                  MATRIX: 776->1|926->56|954->58|1021->98|1049->99|1095->118|1123->119|1151->120|1198->142|1224->160|1263->162|1292->165|1421->269|1459->299|1498->301|1528->304|1613->363|1627->368|1661->381|1693->386|1736->399|1769->405|2235->844|2272->872|2312->874|2371->905|2437->944|2496->981|2574->1028|2629->1055|2672->1072|2709->1093|2749->1095|2782->1101|2833->1126|2893->1177|2933->1179|2966->1185|3038->1230|3088->1259|3141->1282|3173->1287|3215->1299|3270->1326|4331->2361|4381->2395|4421->2397|4467->2415|4592->2513|4606->2518|4638->2529|4855->2719|4904->2747|5109->2921|5152->2936|5299->3053
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|45->14|58->27|58->27|58->27|59->28|59->28|59->28|60->29|61->30|63->32|63->32|63->32|64->33|65->34|65->34|65->34|66->35|67->36|67->36|70->39|71->40|72->41|74->43|98->67|98->67|98->67|99->68|100->69|100->69|100->69|103->72|103->72|107->76|109->78|118->87
                  -- GENERATED --
              */
          