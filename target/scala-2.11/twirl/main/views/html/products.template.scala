
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Long,String,List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(catId: Long,filter: String,products: List[models.Product], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.148*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products", user)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="col-sm-2">
      <!---Optional Navigation Bar--->
      <h4 id="TextAlignCenter">Product Category</h4>
         <ul class="nav nav-pills nav-stacked">
		<li id="TextAlignCenter"><a id="OptionalSecondaryNavbar" href=""""),_display_(/*10.67*/routes/*10.73*/.HomeController.products(0)),format.raw/*10.100*/("""">All</a></li>
         	"""),_display_(/*11.12*/for(cat <-categories) yield /*11.33*/ {_display_(Seq[Any](format.raw/*11.35*/("""
               		 """),format.raw/*12.19*/("""<li id="TextAlignCenter"><a id="OptionalSecondaryNavbar" href=""""),_display_(/*12.83*/routes/*12.89*/.HomeController.products(cat.getId)),format.raw/*12.124*/("""">"""),_display_(/*12.127*/cat/*12.130*/.getName()),format.raw/*12.140*/("""</a></li>
            	 """)))}),format.raw/*13.16*/("""
         """),format.raw/*14.10*/("""</ul>
  </div>
  <div class="col-sm-8">
			    <!---Start of Search Bar Form--->
			<div class="row">

				<div class="col-sm-4">

				</div>
				<div class="col-sm-4" id="SearchBar">
					<!---Search Bar Form--->
					<div class="col-sm-12" id="setWidth">
					
						<form class="navbar-form" action=""""),_display_(/*27.42*/routes/*27.48*/.HomeController.products(catId)),format.raw/*27.79*/("""" method="GET" id="marginLeft">
							<div class="input-group" >
								<input type="search" name="filter"  class="form-control" placeholder="Search">
								
								<div class="input-group-btn">
									<button type="submit" class="btn btn-default" id="textDarkBrown">
										<i class="glyphicon glyphicon-search">
										</i>
									</button>
								</div>
							</div>
						</form>
						</div>
					 
					</div>
				<div class="col-sm-4">
				</div>
			</div>


			    <!---End of Search Bar Form--->





          <!--Products page-->
      <br>
      """),_display_(/*55.8*/for(prod <- products) yield /*55.29*/ {_display_(Seq[Any](format.raw/*55.31*/("""
      """),format.raw/*56.7*/("""<div class="panel panel-default">
		<div class="panel-heading" id="mediaTitleBanner">
			<h2>"""),_display_(/*58.9*/prod/*58.13*/.getName()),format.raw/*58.23*/("""</h2>
		</div>
      		<div class="panel-body" id="mediaBorder">
			<div class="row">
		              <div class="col-sm-2">
						  """),_display_(/*63.10*/if(env.resource("public/images/productImages/"+prod.getId()+".jpg").isDefined)/*63.88*/ {_display_(Seq[Any](format.raw/*63.90*/("""
				               		   """),format.raw/*64.25*/("""<img src="/assets/images/productImages/"""),_display_(/*64.65*/(prod.getId + ".jpg")),format.raw/*64.86*/("""" class="img-responsive img-rounded" id="setWidth" alt="Image of Product/Manga/Anime.">
						  """)))}/*65.11*/else/*65.16*/{_display_(Seq[Any](format.raw/*65.17*/("""
							   """),format.raw/*66.11*/("""<img src="/assets/images/productImages/thumbnails/noImage.png" class="img-responsive"/>
						  """)))}),format.raw/*67.10*/("""
			      """),format.raw/*68.10*/("""</div>
			      <div class="col-sm-10">
					<h3 class="page-header TextAlignCenter">About Product</h3>
					<p class="BreakWord">"""),_display_(/*71.28*/prod/*71.32*/.getDescription()),format.raw/*71.49*/("""</p>
					
			      </div>
			<!---End of Row---> 	
			</div>
			<a href=""""),_display_(/*76.14*/routes/*76.20*/.HomeController.moreProductInfo(prod.getId)),format.raw/*76.63*/("""" class="btn" id="Buttons">Read More</a>
		</div>
     	 </div>
      """)))}),format.raw/*79.8*/("""
     
      	"""),format.raw/*81.8*/("""<br>
      	<br>
  </div>
  <div class="col-sm-2">

  </div>
  <!-- End of content for main -->
""")))}),format.raw/*88.2*/("""
"""))
      }
    }
  }

  def render(catId:Long,filter:String,products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(catId,filter,products,categories,user,env)

  def f:((Long,String,List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (catId,filter,products,categories,user,env) => apply(catId,filter,products,categories,user,env)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/products.scala.html
                  HASH: 577afa16bb4ba2e01ca95888db76c41001010a23
                  MATRIX: 838->1|1080->147|1108->149|1168->182|1196->183|1242->202|1270->203|1298->204|1345->226|1375->248|1414->250|1443->253|1742->525|1757->531|1806->558|1859->584|1896->605|1936->607|1983->626|2074->690|2089->696|2146->731|2177->734|2190->737|2222->747|2278->772|2316->782|2647->1086|2662->1092|2714->1123|3316->1699|3353->1720|3393->1722|3427->1729|3547->1823|3560->1827|3591->1837|3752->1971|3839->2049|3879->2051|3932->2076|3999->2116|4041->2137|4157->2235|4170->2240|4209->2241|4248->2252|4376->2349|4414->2359|4572->2490|4585->2494|4623->2511|4725->2586|4740->2592|4804->2635|4905->2706|4946->2720|5073->2817
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|45->14|58->27|58->27|58->27|86->55|86->55|86->55|87->56|89->58|89->58|89->58|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|98->67|99->68|102->71|102->71|102->71|107->76|107->76|107->76|110->79|112->81|119->88
                  -- GENERATED --
              */
          