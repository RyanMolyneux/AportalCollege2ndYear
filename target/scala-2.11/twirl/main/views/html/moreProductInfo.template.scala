
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object moreProductInfo_Scope0 {
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

class moreProductInfo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.Product,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(selectedProduct: models.Product, user : models.users.User,env : play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.88*/("""


"""),_display_(/*4.2*/main("Product Info",user)/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""

				"""),format.raw/*6.5*/("""<div class="col-sm-3">
				</div>
				<div class="col-sm-6" id="productInfoWrapper">

							<div id="productInfoHeader" id="TextAlignCenter">							
								<h3>"""),_display_(/*11.14*/selectedProduct/*11.29*/.getName()),format.raw/*11.39*/("""</h3>
							</div>							
							<div id="productInfoBody">							
								<div class="row">
									<div class="col-sm-4">
										"""),_display_(/*16.12*/if(env.resource("public/images/productImages/"+selectedProduct.getId()+".jpg").isDefined)/*16.101*/ {_display_(Seq[Any](format.raw/*16.103*/("""
											"""),format.raw/*17.12*/("""<img src="/assets/images/productImages/"""),_display_(/*17.52*/(selectedProduct.getId() +".jpg")),format.raw/*17.85*/("""" class="img-responsive img-rounded" alt="Image of Product/Manga/Anime.">
										""")))}/*18.13*/else/*18.18*/{_display_(Seq[Any](format.raw/*18.19*/("""
											"""),format.raw/*19.12*/("""<img src="/assets/images/productImages/thumbnails/noImage.png" class="img-responsive"/>
										""")))}),format.raw/*20.12*/("""
							 		"""),format.raw/*21.11*/("""</div>
								
									<div class="col-sm-6">
								
								
										<h4 class="page-header TextAlignCenter">About Product</h4>
										<p class="BreakWord">"""),_display_(/*27.33*/selectedProduct/*27.48*/.getDescription()),format.raw/*27.65*/("""</p>
										<pre id="FloatLeft"><span id="textLightRed">CATEGORY : </span>"""),_display_(/*28.74*/selectedProduct/*28.89*/.printCatList()),format.raw/*28.104*/("""</pre>
										<pre id="FloatLeft"><span id="textLightRed">PRICE :</span> """),_display_(/*29.71*/selectedProduct/*29.86*/.getPrice()),format.raw/*29.97*/("""</pre>
										
		

										"""),_display_(/*33.12*/if(selectedProduct.getStock() != 0)/*33.47*/ {_display_(Seq[Any](format.raw/*33.49*/("""
											"""),format.raw/*34.12*/("""<a href=""""),_display_(/*34.22*/routes/*34.28*/.ShoppingController.addToBasket(selectedProduct.getId())),format.raw/*34.84*/("""" alt="Add to cart button." class="btn" id="Buttons">Add To Cart</a>
											<br>
											<br>
										""")))}/*37.13*/else/*37.18*/{_display_(Seq[Any](format.raw/*37.19*/("""
											"""),format.raw/*38.12*/("""<br>
											<br>
											<br>
											<br>
										
									
										
											<h4 class="alert alert-warning TextAlignCenter">Out Of Stock</h4>
									
	
										""")))}),format.raw/*48.12*/("""
									"""),format.raw/*49.10*/("""</div>
								<!---EndOfRow--->
								</div>
							</div>
							
	
						
					

				</div>
				<div class="col-sm-3">
				</div>
				


""")))}),format.raw/*64.2*/("""
"""))
      }
    }
  }

  def render(selectedProduct:models.Product,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(selectedProduct,user,env)

  def f:((models.Product,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (selectedProduct,user,env) => apply(selectedProduct,user,env)

  def ref: this.type = this

}


}

/**/
object moreProductInfo extends moreProductInfo_Scope0.moreProductInfo
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/moreProductInfo.scala.html
                  HASH: 025fb42d22b5daae6236accf2c6144b2fa580766
                  MATRIX: 812->1|993->87|1022->91|1055->116|1094->118|1126->124|1316->287|1340->302|1371->312|1535->449|1634->538|1675->540|1715->552|1782->592|1836->625|1940->711|1953->716|1992->717|2032->729|2162->828|2201->839|2395->1006|2419->1021|2457->1038|2562->1116|2586->1131|2623->1146|2727->1223|2751->1238|2783->1249|2843->1282|2887->1317|2927->1319|2967->1331|3004->1341|3019->1347|3096->1403|3227->1516|3240->1521|3279->1522|3319->1534|3535->1719|3573->1729|3746->1872
                  LINES: 27->1|32->1|35->4|35->4|35->4|37->6|42->11|42->11|42->11|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|51->20|52->21|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|64->33|64->33|64->33|65->34|65->34|65->34|65->34|68->37|68->37|68->37|69->38|79->48|80->49|95->64
                  -- GENERATED --
              */
          