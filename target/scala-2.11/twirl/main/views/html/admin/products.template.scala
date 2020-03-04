
package views.html.admin

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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.121*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/admin/*4.7*/.adminMain("Products", user)/*4.35*/ {_display_(Seq[Any](format.raw/*4.37*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
	<div class="col-sm-2">
	</div>
	<div class="col-sm-8">
		"""),_display_(/*9.4*/if(flash.containsKey("error"))/*9.34*/ {_display_(Seq[Any](format.raw/*9.36*/("""
			"""),format.raw/*10.4*/("""<div class="alert alert-warning">
				"""),_display_(/*11.6*/flash/*11.11*/.get("error")),format.raw/*11.24*/("""			
			"""),format.raw/*12.4*/("""</div>
		""")))}),format.raw/*13.4*/(""" 


	  """),format.raw/*16.4*/("""<div class="row">
	      <div class="col-sm-2">
	          <h4>Product Categories</h4>
		             <ul class="nav nav-pills nav-stacked">
        			 """),_display_(/*20.14*/for(cat <-categories) yield /*20.35*/ {_display_(Seq[Any](format.raw/*20.37*/("""
            			    """),format.raw/*21.20*/("""<li id="TextAlignCenter"><a id="OptionalSecondaryNavbar" href=""""),_display_(/*21.84*/controllers/*21.95*/.routes.AdminController.products(cat.getId)),format.raw/*21.138*/("""">"""),_display_(/*21.141*/cat/*21.144*/.getName()),format.raw/*21.154*/("""<span class="badge" id="Badge">"""),_display_(/*21.186*/cat/*21.189*/.getProducts.size()),format.raw/*21.208*/("""</span></a></li>
           			  """)))}),format.raw/*22.18*/("""
       			     """),format.raw/*23.16*/("""</ul>
	      </div>
	      <div class="col-sm-8" id="adminProductsWrapper">

	          
		<div id="adminProductsHeader">
			<h2>Edit Products</h2>		
		</div>
		<div id="adminProductsBody">
		

	          	<table class="table table-bordered table-hover table-condensed">
	          		     <thead>
	          			<!-- The header row-->
	          				<tr>
	            					<th>ID</th>
	            					<th>Name</th>
	            					<th>Description</th>
	           					<th>Stock</th>
            						<th>Price</th>
            						<th>Edit</th>
	    						<th>Delete</th>
	         				 </tr>
	          		     </thead>
	          		     <tbody>
	           			 <!-- Product row(s) -->
						<!-- Start of For loop - For each p in products add a row -->
	          		"""),_display_(/*50.15*/for(p <- products) yield /*50.33*/ {_display_(Seq[Any](format.raw/*50.35*/("""
				        	  """),format.raw/*51.16*/("""<tr>
	                  				  <td>"""),_display_(/*52.31*/p/*52.32*/.getId),format.raw/*52.38*/("""</td>
					                  <td>"""),_display_(/*53.29*/p/*53.30*/.getName),format.raw/*53.38*/("""</td>	                 
					                  <td>"""),_display_(/*54.29*/p/*54.30*/.getDescription),format.raw/*54.45*/("""</td>
					                  <td>"""),_display_(/*55.29*/p/*55.30*/.getStock),format.raw/*55.39*/("""</td>
					                  <td>&euro; """),_display_(/*56.36*/("%.2f".format(p.getPrice))),format.raw/*56.63*/("""</td>
	
				                  <!-- Edit product button -->
					                  <td>
					                      <a href=""""),_display_(/*60.38*/routes/*60.44*/.AdminController.updateProduct(p.getId)),format.raw/*60.83*/("""" class="btn-xs btn-danger">
		          				            <span class="glyphicon glyphicon-pencil"></span>
								</a>
	                  				 </td>
	                			  <!-- Delete product button -->
	                				  <td>
	                      					<a href=""""),_display_(/*66.39*/routes/*66.45*/.AdminController.deleteProduct(p.getId)),format.raw/*66.84*/("""" class="btn-xs btn-danger"
	                        				onclick="return confirmDel();">
	                        					<span class="glyphicon glyphicon-trash"></span>
	                      					</a>
	                  				</td>
						    </tr>
							""")))}),format.raw/*72.9*/(""" """),format.raw/*72.10*/("""<!-- End of For loop -->
	          			</tbody>
	        		</table>
				<a href=""""),_display_(/*75.15*/routes/*75.21*/.AdminController.addProduct()),format.raw/*75.50*/("""" class="btn" id="Buttons">
	           		 Add a Product
	         		</a>
			</div>
		</div>
	        
	          
	        
	      </div>
	  </div>

	</div>
	<div class="col-sm-2">
	</div>
	  <script>
	    // JavaScript function returns true if user clicks yes, otherwise, false
	    function confirmDel() """),format.raw/*91.28*/("""{"""),format.raw/*91.29*/("""
	        """),format.raw/*92.10*/("""return confirm('Are you sure?');
	    """),format.raw/*93.6*/("""}"""),format.raw/*93.7*/("""
	  """),format.raw/*94.4*/("""</script>

	  <!-- End of content for main -->
	""")))}),format.raw/*97.3*/("""

"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/admin/products.scala.html
                  HASH: 3cd80ee06f6d59a68f9f4a3269a122eee935e8dd
                  MATRIX: 832->1|1047->120|1075->122|1135->155|1163->156|1209->175|1237->176|1265->177|1312->199|1324->204|1360->232|1399->234|1428->237|1553->337|1591->367|1630->369|1661->373|1726->412|1740->417|1774->430|1808->437|1848->447|1882->454|2063->608|2100->629|2140->631|2188->651|2279->715|2299->726|2364->769|2395->772|2408->775|2440->785|2500->817|2513->820|2554->839|2619->873|2663->889|3465->1664|3499->1682|3539->1684|3583->1700|3645->1735|3655->1736|3682->1742|3743->1776|3753->1777|3782->1785|3861->1837|3871->1838|3907->1853|3968->1887|3978->1888|4008->1897|4076->1938|4124->1965|4275->2089|4290->2095|4350->2134|4645->2402|4660->2408|4720->2447|5003->2700|5032->2701|5141->2783|5156->2789|5206->2818|5541->3125|5570->3126|5608->3136|5673->3174|5701->3175|5732->3179|5811->3228
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|47->16|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|54->23|81->50|81->50|81->50|82->51|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|91->60|91->60|91->60|97->66|97->66|97->66|103->72|103->72|106->75|106->75|106->75|122->91|122->91|123->92|124->93|124->93|125->94|128->97
                  -- GENERATED --
              */
          