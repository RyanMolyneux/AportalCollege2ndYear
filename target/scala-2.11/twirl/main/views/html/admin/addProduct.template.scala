
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

     object addProduct_Scope1 {
import helper._

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addProductForm: play.data.Form[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.102*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/admin/*8.7*/.adminMain("Add Product", user)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
	"""),format.raw/*9.2*/("""<div class="col-sm-2">
	</div>
	<div class="col-sm-8">
		<div class="col-sm-2">
		</div>
		<div class="col-sm-8" id="adminProductsWrapper">
			<div id="adminProductsHeader">
				<h2>Add a new Product</h2>
			</div>
			<div id="adminProductsBody">
				"""),_display_(/*19.6*/if(flash.containsKey("error"))/*19.36*/{_display_(Seq[Any](format.raw/*19.37*/("""
					"""),format.raw/*20.6*/("""<div class="alert alert-warning" id="TextAlignCenter">
					"""),_display_(/*21.7*/flash/*21.12*/.get("error")),format.raw/*21.25*/("""					
					"""),format.raw/*22.6*/("""</div>
				""")))}),format.raw/*23.6*/(""" 
				"""),_display_(/*24.6*/if(flash.containsKey("exception"))/*24.40*/ {_display_(Seq[Any](format.raw/*24.42*/("""
					"""),format.raw/*25.6*/("""<div class="alert alert-warning" id="TextAlignCenter">
					"""),_display_(/*26.7*/flash/*26.12*/.get("exception")),format.raw/*26.29*/("""					
					"""),format.raw/*27.6*/("""</div>				
				""")))}),format.raw/*28.6*/("""
	
			"""),format.raw/*30.4*/("""<!-- Use the views.html.helpers package to create the form -->
				"""),_display_(/*31.6*/form(action = routes.AdminController.addProductSubmit(), 'class -> "form-horizontal",
				'role->"form", 'enctype -> "multipart/form-data")/*32.54*/ {_display_(Seq[Any](format.raw/*32.56*/("""
		
				"""),format.raw/*34.5*/("""<!-- Build the form, adding an input for each field -->
				<!-- Note the label parameter -->
				"""),_display_(/*36.6*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*36.83*/("""
		
				"""),format.raw/*38.5*/("""<label id="FormLabel">Description</label>
				<textarea row="5" name="description" class="form-control"  required>"""),_display_(/*39.74*/addProductForm("description")/*39.103*/.value),format.raw/*39.109*/("""</textarea>
				"""),_display_(/*40.6*/for((value,name) <- Category.options) yield /*40.43*/ {_display_(Seq[Any](format.raw/*40.45*/("""
				"""),format.raw/*41.5*/("""<br>
				<label id="FormLabel">"""),_display_(/*42.28*/name),format.raw/*42.32*/("""</label>
				<input type="checkbox" name="catSelect[]" value=""""),_display_(/*43.55*/value),format.raw/*43.60*/(""""
					"""),_display_(/*44.7*/if(addProductForm("id").value != null)/*44.45*/ {_display_(Seq[Any](format.raw/*44.47*/("""
						"""),_display_(/*45.8*/if(Category.inCategory(value.toLong,addProductForm("id").value.toLong))/*45.79*/ {_display_(Seq[Any](format.raw/*45.81*/("""
							"""),format.raw/*46.8*/("""checked
						""")))}),format.raw/*47.8*/("""				
					""")))}),format.raw/*48.7*/("""
	
				"""),format.raw/*50.5*/("""/>
				""")))}),format.raw/*51.6*/("""
				"""),_display_(/*52.6*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*52.85*/("""
				"""),_display_(/*53.6*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*53.85*/("""

				"""),format.raw/*55.5*/("""<!-- Image upload input -->
				<div class="container-fluid">
				<div class="row">
					<label>Image</label>
				</div>
				<div class="row">
					"""),_display_(/*61.7*/if(env.resource("public/images/productImages/thumbnails/" + addProductForm("id").value() + ".jpg").isDefined)/*61.116*/ {_display_(Seq[Any](format.raw/*61.118*/("""
						"""),format.raw/*62.7*/("""<p><img src="/assets/images/productImages/thumbnails/"""),_display_(/*62.61*/(addProductForm("id").value() + ".jpg")),format.raw/*62.100*/(""""/></p>
					""")))}/*63.8*/else/*63.13*/{_display_(Seq[Any](format.raw/*63.14*/("""
						"""),format.raw/*64.7*/("""<p><img src="/assets/images/productImages/thumbnails/noImage.png"/></p>
					""")))}),format.raw/*65.7*/("""
				"""),format.raw/*66.5*/("""</div>
				<div class="row">
					<input class="btn-sm btn-default" type="file" name="upload">
				</div>
			</div>

			<!-- Hidden ID field - required for product updates -->
			"""),_display_(/*73.5*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*73.72*/("""

			"""),format.raw/*75.4*/("""<!-- Add a submit button -->
  			<div class="actions">
      				<input type="submit" value="Save" class="btn" id="Buttons">
				<a href=""""),_display_(/*78.15*/routes/*78.21*/.AdminController.products()),format.raw/*78.48*/(""""><button class="btn btn-warning">Cancel</button>
	  			</a>
  			</div>
			""")))}),format.raw/*81.5*/(""" """),format.raw/*81.6*/("""<!-- End Form definition -->
			</div>
  </div>
  <div class="col-sm-2">
  </div>
  </div>
  <div class="col-sm-2">
  </div>
""")))}),format.raw/*89.2*/(""" """),format.raw/*89.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:play.data.Form[models.Product],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user,env)

  def f:((play.data.Form[models.Product],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user,env) => apply(addProductForm,user,env)

  def ref: this.type = this

}


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/admin/addProduct.scala.html
                  HASH: 16e7d25de427fdc50fc27f0c08d85b3d66fd1673
                  MATRIX: 873->109|1069->209|1099->312|1127->315|1139->320|1178->351|1217->353|1245->355|1523->607|1562->637|1601->638|1634->644|1721->705|1735->710|1769->723|1807->734|1849->746|1882->753|1925->787|1965->789|1998->795|2085->856|2099->861|2137->878|2175->889|2221->905|2254->911|2348->979|2496->1118|2536->1120|2571->1128|2696->1227|2794->1304|2829->1312|2971->1427|3010->1456|3038->1462|3081->1479|3134->1516|3174->1518|3206->1523|3265->1555|3290->1559|3380->1622|3406->1627|3440->1635|3487->1673|3527->1675|3561->1683|3641->1754|3681->1756|3716->1764|3761->1779|3802->1790|3836->1797|3874->1805|3906->1811|4006->1890|4038->1896|4138->1975|4171->1981|4346->2130|4465->2239|4506->2241|4540->2248|4621->2302|4682->2341|4714->2356|4727->2361|4766->2362|4800->2369|4908->2447|4940->2452|5146->2632|5234->2699|5266->2704|5433->2844|5448->2850|5496->2877|5603->2954|5631->2955|5787->3081|5815->3082
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|39->8|40->9|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|54->23|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|61->30|62->31|63->32|63->32|65->34|67->36|67->36|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|73->42|73->42|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|78->47|79->48|81->50|82->51|83->52|83->52|84->53|84->53|86->55|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|96->65|97->66|104->73|104->73|106->75|109->78|109->78|109->78|112->81|112->81|120->89|120->89
                  -- GENERATED --
              */
          