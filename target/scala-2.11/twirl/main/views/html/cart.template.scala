
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cart_Scope0 {
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

class cart extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.Customer,Double,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer,total : Double):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Cart", customer)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
    """),format.raw/*5.5*/("""<div class="col-sm-2">
    </div>
    <div class="col-sm-8">
	<br>
	"""),_display_(/*9.3*/if(flash.containsKey("success"))/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""
		"""),format.raw/*10.3*/("""<div class="alert alert-success" id="TextAlignCenter">
		 """),_display_(/*11.5*/flash/*11.10*/.get("success")),format.raw/*11.25*/("""
		"""),format.raw/*12.3*/("""</div>
	""")))}),format.raw/*13.3*/("""
	"""),_display_(/*14.3*/if(flash.containsKey("error"))/*14.33*/ {_display_(Seq[Any](format.raw/*14.35*/("""
		"""),format.raw/*15.3*/("""<div class="alert alert-warning" id="TextAlignCenter">
		 """),_display_(/*16.5*/flash/*16.10*/.get("error")),format.raw/*16.23*/("""	
		"""),format.raw/*17.3*/("""</div>	
	
	""")))}),format.raw/*19.3*/("""

        """),format.raw/*21.9*/("""<!-- HTML content for the index view -->
        <div class="table-responsive">
            <table class="table table-bordered table-condensed">
                <thead>
                    <tr>
                        <th>Picture</th>
                        <th>Name</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Item Total</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*34.22*/if(customer.getBasket() != null)/*34.54*/{_display_(Seq[Any](format.raw/*34.55*/("""
                        """),_display_(/*35.26*/for(i<-customer.getBasket().getBasketItems()) yield /*35.71*/{_display_(Seq[Any](format.raw/*35.72*/("""
                            """),format.raw/*36.29*/("""<tr>
                                <td><img src="Figure.jpg" alt="Figure" style="width:20%"></td>
                                <td>"""),_display_(/*38.38*/i/*38.39*/.getProduct().getName()),format.raw/*38.62*/("""</td>
                                <td><a href=""""),_display_(/*39.47*/routes/*39.53*/.ShoppingController.removeOne(i.getId)),format.raw/*39.91*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a>
                                    """),_display_(/*40.38*/i/*40.39*/.getQuantity()),format.raw/*40.53*/("""
                                    """),format.raw/*41.37*/("""<a href=""""),_display_(/*41.47*/routes/*41.53*/.ShoppingController.addOne(i.getId)),format.raw/*41.88*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a>
                                </td>
                                <td>€ """),_display_(/*43.40*/("%.2f".format(i.getPrice))),format.raw/*43.67*/("""</td>
                                <td>€ """),_display_(/*44.40*/("%.2f".format(i.getItemTotal))),format.raw/*44.71*/("""</td>
                            </tr>
                        """)))}),format.raw/*46.26*/("""
                    """)))}),format.raw/*47.22*/("""
                """),format.raw/*48.17*/("""</tbody>
            </table>
        </div>

        <p id="FloatRight">Total: € """),_display_(/*52.38*/customer/*52.46*/.getBasket().getBasketTotal()),format.raw/*52.75*/("""</p>
        <br>
        <br>
        <form action="/confirmBasketOrder" method="GET">
            <div id="FloatRight">
                <script
                        src="https://checkout.stripe.com/checkout.js" class="stripe-button"
                        data-key="pk_test_h0fpm1RYECu3Ai5dz8QXDoDX"
                        data-amount=""""),_display_(/*60.39*/total),format.raw/*60.44*/(""""
                        data-name="APortal"
                        data-description="Widget"
                        data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
                        data-locale="auto"
                        data-zip-code="true"
                        data-currency="eur">
                </script>
            </div>

        </form>
        <br>
        <br>

        <!-- End of content for main -->
    </div>
    <div class="col-sm-2">
    </div>
""")))}),format.raw/*78.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer,total:Double): play.twirl.api.HtmlFormat.Appendable = apply(customer,total)

  def f:((models.users.Customer,Double) => play.twirl.api.HtmlFormat.Appendable) = (customer,total) => apply(customer,total)

  def ref: this.type = this

}


}

/**/
object cart extends cart_Scope0.cart
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:05:03 IST 2017
                  SOURCE: /home/wdd/webapps/websiteFrame(2.6.7)/app/views/cart.scala.html
                  HASH: 381e4e9fe5b5c463729e7b7b486c53f67f07fe16
                  MATRIX: 765->1|908->49|936->51|996->84|1024->85|1070->104|1098->105|1126->106|1173->128|1203->150|1242->152|1273->157|1367->226|1407->258|1446->260|1476->263|1561->322|1575->327|1611->342|1641->345|1680->354|1709->357|1748->387|1788->389|1818->392|1903->451|1917->456|1951->469|1982->473|2024->485|2061->495|2582->989|2623->1021|2662->1022|2715->1048|2776->1093|2815->1094|2872->1123|3036->1260|3046->1261|3090->1284|3169->1336|3184->1342|3243->1380|3366->1476|3376->1477|3411->1491|3476->1528|3513->1538|3528->1544|3584->1579|3746->1714|3794->1741|3866->1786|3918->1817|4014->1882|4067->1904|4112->1921|4222->2004|4239->2012|4289->2041|4660->2385|4686->2390|5224->2898
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|50->19|52->21|65->34|65->34|65->34|66->35|66->35|66->35|67->36|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|72->41|74->43|74->43|75->44|75->44|77->46|78->47|79->48|83->52|83->52|83->52|91->60|91->60|109->78
                  -- GENERATED --
              */
          