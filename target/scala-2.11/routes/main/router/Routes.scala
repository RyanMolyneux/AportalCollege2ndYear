
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/websiteFrame(2.6.7)/conf/routes
// @DATE:Mon Apr 24 12:05:02 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:10
  HomeController_3: controllers.HomeController,
  // @LINE:63
  AdminController_0: controllers.AdminController,
  // @LINE:137
  LoginSignUpController_1: controllers.security.LoginSignUpController,
  // @LINE:151
  ShoppingController_5: controllers.ShoppingController,
  // @LINE:159
  CountController_2: controllers.CountController,
  // @LINE:161
  AsyncController_4: controllers.AsyncController,
  // @LINE:164
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:10
    HomeController_3: controllers.HomeController,
    // @LINE:63
    AdminController_0: controllers.AdminController,
    // @LINE:137
    LoginSignUpController_1: controllers.security.LoginSignUpController,
    // @LINE:151
    ShoppingController_5: controllers.ShoppingController,
    // @LINE:159
    CountController_2: controllers.CountController,
    // @LINE:161
    AsyncController_4: controllers.AsyncController,
    // @LINE:164
    Assets_6: controllers.Assets
  ) = this(errorHandler, HomeController_3, AdminController_0, LoginSignUpController_1, ShoppingController_5, CountController_2, AsyncController_4, Assets_6, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, AdminController_0, LoginSignUpController_1, ShoppingController_5, CountController_2, AsyncController_4, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userSupport""", """controllers.HomeController.userSupport"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submitQuery""", """controllers.HomeController.submitQuery"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.HomeController.products(cat:Long ?= 0L, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """moreProductInfo""", """controllers.HomeController.moreProductInfo(prodID:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """media""", """controllers.HomeController.media(gen:Long ?= 0L, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """moreMediaInfo""", """controllers.HomeController.moreMediaInfo(medId:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """UhOh""", """controllers.HomeController.UhOh"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forum""", """controllers.HomeController.forum(filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTopic""", """controllers.HomeController.addTopic"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTopicSubmit""", """controllers.HomeController.addTopicSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic""", """controllers.HomeController.topic(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletePost""", """controllers.HomeController.deletePost(postId:Long, topicId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPost""", """controllers.HomeController.addPost(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPostSubmit""", """controllers.HomeController.addPostSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteTopic""", """controllers.HomeController.deleteTopic(topicId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/indexAdmin""", """controllers.AdminController.indexAdmin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/products""", """controllers.AdminController.products(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addproduct""", """controllers.AdminController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addProductSubmit""", """controllers.AdminController.addProductSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adminSupport""", """controllers.AdminController.adminSupport(queryType:Long ?= 0L, queryStatus:Boolean ?= false)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/changeQueryStatus""", """controllers.AdminController.changeQueryStatus(queryId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adminMedia""", """controllers.AdminController.adminMedia(gen:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addmedia""", """controllers.AdminController.addMedia"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addMediaSubmit""", """controllers.AdminController.addMediaSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delMedia/""" + "$" + """id<[^/]+>""", """controllers.AdminController.deleteMedia(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateMedia/""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateMedia(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adminAdvert""", """controllers.AdminController.adminAdvert"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adminAdvert/addAdvert""", """controllers.AdminController.addAdvert"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/adminAdvert/addAdvertSubmit""", """controllers.AdminController.addAdvertSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delAdvert""", """controllers.AdminController.deleteAdvert(advertId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/UhOh""", """controllers.AdminController.UhOh"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """FriendPortal""", """controllers.HomeController.findFriends(name:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """FriendPortal/SendRequest""", """controllers.HomeController.sendRequest(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ChatPortal""", """controllers.HomeController.Chat(option:Long ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ChatPortal/AcceptRequest""", """controllers.HomeController.addFriend(option:Long ?= 0L, pendingFriendId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ChatPortal/DeclineRequest""", """controllers.HomeController.declineRequest(declinedCustomer:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ChatPortal/MessageFriend/""" + "$" + """name<[^/]+>""", """controllers.HomeController.MessageFriend(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ChatPortal/MessageFriendSubmit""", """controllers.HomeController.MessageFriendSubmit(chatId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginSignUpController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.security.LoginSignUpController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.security.LoginSignUpController.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUpSubmit""", """controllers.security.LoginSignUpController.signUpSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editProfile""", """controllers.security.LoginSignUpController.editProfile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editProfilePhoto""", """controllers.security.LoginSignUpController.editProfilePhoto"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editProfilePhotoSubmit""", """controllers.security.LoginSignUpController.editProfilePhotoSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingController.showBasket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addBasket""", """controllers.ShoppingController.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne""", """controllers.ShoppingController.addOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne""", """controllers.ShoppingController.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirmBasketOrder""", """controllers.ShoppingController.placeOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrders""", """controllers.ShoppingController.viewOrders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """######################
 Puvlic Site  Routes #
######################""",
      this.prefix + """"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about1_invoker = createInvoker(
    HomeController_3.about,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      """ This is a http route used to get to the about page on our website.""",
      this.prefix + """about"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_userSupport2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userSupport")))
  )
  private[this] lazy val controllers_HomeController_userSupport2_invoker = createInvoker(
    HomeController_3.userSupport,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "userSupport",
      Nil,
      "GET",
      """""",
      this.prefix + """userSupport"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_submitQuery3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitQuery")))
  )
  private[this] lazy val controllers_HomeController_submitQuery3_invoker = createInvoker(
    HomeController_3.submitQuery,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "submitQuery",
      Nil,
      "POST",
      """""",
      this.prefix + """submitQuery"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_products4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_HomeController_products4_invoker = createInvoker(
    HomeController_3.products(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "products",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """ products accepts a parameter default to 0 (Long)""",
      this.prefix + """products"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_moreProductInfo5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("moreProductInfo")))
  )
  private[this] lazy val controllers_HomeController_moreProductInfo5_invoker = createInvoker(
    HomeController_3.moreProductInfo(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "moreProductInfo",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """moreProductInfo"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_media6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("media")))
  )
  private[this] lazy val controllers_HomeController_media6_invoker = createInvoker(
    HomeController_3.media(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "media",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """ media page route.""",
      this.prefix + """media"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_moreMediaInfo7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("moreMediaInfo")))
  )
  private[this] lazy val controllers_HomeController_moreMediaInfo7_invoker = createInvoker(
    HomeController_3.moreMediaInfo(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "moreMediaInfo",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """moreMediaInfo"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_UhOh8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("UhOh")))
  )
  private[this] lazy val controllers_HomeController_UhOh8_invoker = createInvoker(
    HomeController_3.UhOh,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "UhOh",
      Nil,
      "GET",
      """""",
      this.prefix + """UhOh"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_forum9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forum")))
  )
  private[this] lazy val controllers_HomeController_forum9_invoker = createInvoker(
    HomeController_3.forum(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "forum",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """forum"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_addTopic10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTopic")))
  )
  private[this] lazy val controllers_HomeController_addTopic10_invoker = createInvoker(
    HomeController_3.addTopic,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addTopic",
      Nil,
      "GET",
      """""",
      this.prefix + """addTopic"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_HomeController_addTopicSubmit11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTopicSubmit")))
  )
  private[this] lazy val controllers_HomeController_addTopicSubmit11_invoker = createInvoker(
    HomeController_3.addTopicSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addTopicSubmit",
      Nil,
      "GET",
      """""",
      this.prefix + """addTopicSubmit"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_HomeController_topic12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic")))
  )
  private[this] lazy val controllers_HomeController_topic12_invoker = createInvoker(
    HomeController_3.topic(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topic",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """topic"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_HomeController_deletePost13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletePost")))
  )
  private[this] lazy val controllers_HomeController_deletePost13_invoker = createInvoker(
    HomeController_3.deletePost(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deletePost",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """deletePost"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_HomeController_addPost14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPost")))
  )
  private[this] lazy val controllers_HomeController_addPost14_invoker = createInvoker(
    HomeController_3.addPost(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addPost",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """addPost"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_HomeController_addPostSubmit15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPostSubmit")))
  )
  private[this] lazy val controllers_HomeController_addPostSubmit15_invoker = createInvoker(
    HomeController_3.addPostSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addPostSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addPostSubmit"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_HomeController_deleteTopic16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteTopic")))
  )
  private[this] lazy val controllers_HomeController_deleteTopic16_invoker = createInvoker(
    HomeController_3.deleteTopic(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteTopic",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deleteTopic"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_AdminController_indexAdmin17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/indexAdmin")))
  )
  private[this] lazy val controllers_AdminController_indexAdmin17_invoker = createInvoker(
    AdminController_0.indexAdmin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "indexAdmin",
      Nil,
      "GET",
      """###############
 Admin Routes #
###############
This is used to generate the Administrators index page for the admin.""",
      this.prefix + """admin/indexAdmin"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_AdminController_products18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/products")))
  )
  private[this] lazy val controllers_AdminController_products18_invoker = createInvoker(
    AdminController_0.products(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "products",
      Seq(classOf[Long]),
      "GET",
      """ products accepts a parameter default to 0 (Long)""",
      this.prefix + """admin/products"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_AdminController_addProduct19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addproduct")))
  )
  private[this] lazy val controllers_AdminController_addProduct19_invoker = createInvoker(
    AdminController_0.addProduct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addProduct",
      Nil,
      "GET",
      """ Request to load the add product form""",
      this.prefix + """admin/addproduct"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_AdminController_addProductSubmit20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminController_addProductSubmit20_invoker = createInvoker(
    AdminController_0.addProductSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addProductSubmit",
      Nil,
      "POST",
      """ Data submitted by the form""",
      this.prefix + """admin/addProductSubmit"""
    )
  )

  // @LINE:74
  private[this] lazy val controllers_AdminController_deleteProduct21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteProduct21_invoker = createInvoker(
    AdminController_0.deleteProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      """ Delete a product by an id passed as a parameter""",
      this.prefix + """admin/delProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:77
  private[this] lazy val controllers_AdminController_updateProduct22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateProduct22_invoker = createInvoker(
    AdminController_0.updateProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      """ Update a product by id""",
      this.prefix + """admin/updateProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_AdminController_adminSupport23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adminSupport")))
  )
  private[this] lazy val controllers_AdminController_adminSupport23_invoker = createInvoker(
    AdminController_0.adminSupport(fakeValue[Long], fakeValue[Boolean]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "adminSupport",
      Seq(classOf[Long], classOf[Boolean]),
      "GET",
      """This generates the administrators view of the support page were he can view queries.""",
      this.prefix + """admin/adminSupport"""
    )
  )

  // @LINE:83
  private[this] lazy val controllers_AdminController_changeQueryStatus24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/changeQueryStatus")))
  )
  private[this] lazy val controllers_AdminController_changeQueryStatus24_invoker = createInvoker(
    AdminController_0.changeQueryStatus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "changeQueryStatus",
      Seq(classOf[Long]),
      "GET",
      """This is may be a post function in the future but at the moment it has been set to a simple get function using the url bar""",
      this.prefix + """admin/changeQueryStatus"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_AdminController_adminMedia25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adminMedia")))
  )
  private[this] lazy val controllers_AdminController_adminMedia25_invoker = createInvoker(
    AdminController_0.adminMedia(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "adminMedia",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/adminMedia"""
    )
  )

  // @LINE:88
  private[this] lazy val controllers_AdminController_addMedia26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addmedia")))
  )
  private[this] lazy val controllers_AdminController_addMedia26_invoker = createInvoker(
    AdminController_0.addMedia,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addMedia",
      Nil,
      "GET",
      """ Request to load the add product form""",
      this.prefix + """admin/addmedia"""
    )
  )

  // @LINE:91
  private[this] lazy val controllers_AdminController_addMediaSubmit27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addMediaSubmit")))
  )
  private[this] lazy val controllers_AdminController_addMediaSubmit27_invoker = createInvoker(
    AdminController_0.addMediaSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addMediaSubmit",
      Nil,
      "POST",
      """ Data submitted by the form""",
      this.prefix + """admin/addMediaSubmit"""
    )
  )

  // @LINE:94
  private[this] lazy val controllers_AdminController_deleteMedia28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delMedia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteMedia28_invoker = createInvoker(
    AdminController_0.deleteMedia(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteMedia",
      Seq(classOf[Long]),
      "GET",
      """ Delete a product by an id passed as a parameter""",
      this.prefix + """admin/delMedia/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:97
  private[this] lazy val controllers_AdminController_updateMedia29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateMedia/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateMedia29_invoker = createInvoker(
    AdminController_0.updateMedia(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateMedia",
      Seq(classOf[Long]),
      "GET",
      """ Update a product by id""",
      this.prefix + """admin/updateMedia/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:102
  private[this] lazy val controllers_AdminController_adminAdvert30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adminAdvert")))
  )
  private[this] lazy val controllers_AdminController_adminAdvert30_invoker = createInvoker(
    AdminController_0.adminAdvert,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "adminAdvert",
      Nil,
      "GET",
      """This is the route for the Admin to the adverts page they can reach it through the adminIndex page.""",
      this.prefix + """admin/adminAdvert"""
    )
  )

  // @LINE:105
  private[this] lazy val controllers_AdminController_addAdvert31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adminAdvert/addAdvert")))
  )
  private[this] lazy val controllers_AdminController_addAdvert31_invoker = createInvoker(
    AdminController_0.addAdvert,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addAdvert",
      Nil,
      "GET",
      """This is the route to the form page to add a new advert to the website.""",
      this.prefix + """admin/adminAdvert/addAdvert"""
    )
  )

  // @LINE:108
  private[this] lazy val controllers_AdminController_addAdvertSubmit32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/adminAdvert/addAdvertSubmit")))
  )
  private[this] lazy val controllers_AdminController_addAdvertSubmit32_invoker = createInvoker(
    AdminController_0.addAdvertSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addAdvertSubmit",
      Nil,
      "POST",
      """This is the route used to post the new advertisement to the website.""",
      this.prefix + """admin/adminAdvert/addAdvertSubmit"""
    )
  )

  // @LINE:111
  private[this] lazy val controllers_AdminController_deleteAdvert33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delAdvert")))
  )
  private[this] lazy val controllers_AdminController_deleteAdvert33_invoker = createInvoker(
    AdminController_0.deleteAdvert(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteAdvert",
      Seq(classOf[Long]),
      "GET",
      """This is the route to delete advert from the website.""",
      this.prefix + """admin/delAdvert"""
    )
  )

  // @LINE:114
  private[this] lazy val controllers_AdminController_UhOh34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/UhOh")))
  )
  private[this] lazy val controllers_AdminController_UhOh34_invoker = createInvoker(
    AdminController_0.UhOh,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "UhOh",
      Nil,
      "GET",
      """This is used when exception is triggered""",
      this.prefix + """admin/UhOh"""
    )
  )

  // @LINE:118
  private[this] lazy val controllers_HomeController_findFriends35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("FriendPortal")))
  )
  private[this] lazy val controllers_HomeController_findFriends35_invoker = createInvoker(
    HomeController_3.findFriends(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "findFriends",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """FriendPortal"""
    )
  )

  // @LINE:120
  private[this] lazy val controllers_HomeController_sendRequest36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("FriendPortal/SendRequest")))
  )
  private[this] lazy val controllers_HomeController_sendRequest36_invoker = createInvoker(
    HomeController_3.sendRequest(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "sendRequest",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """FriendPortal/SendRequest"""
    )
  )

  // @LINE:122
  private[this] lazy val controllers_HomeController_Chat37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ChatPortal")))
  )
  private[this] lazy val controllers_HomeController_Chat37_invoker = createInvoker(
    HomeController_3.Chat(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Chat",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """ChatPortal"""
    )
  )

  // @LINE:124
  private[this] lazy val controllers_HomeController_addFriend38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ChatPortal/AcceptRequest")))
  )
  private[this] lazy val controllers_HomeController_addFriend38_invoker = createInvoker(
    HomeController_3.addFriend(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addFriend",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """ChatPortal/AcceptRequest"""
    )
  )

  // @LINE:126
  private[this] lazy val controllers_HomeController_declineRequest39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ChatPortal/DeclineRequest")))
  )
  private[this] lazy val controllers_HomeController_declineRequest39_invoker = createInvoker(
    HomeController_3.declineRequest(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "declineRequest",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ChatPortal/DeclineRequest"""
    )
  )

  // @LINE:128
  private[this] lazy val controllers_HomeController_MessageFriend40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ChatPortal/MessageFriend/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_MessageFriend40_invoker = createInvoker(
    HomeController_3.MessageFriend(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "MessageFriend",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ChatPortal/MessageFriend/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:130
  private[this] lazy val controllers_HomeController_MessageFriendSubmit41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ChatPortal/MessageFriendSubmit")))
  )
  private[this] lazy val controllers_HomeController_MessageFriendSubmit41_invoker = createInvoker(
    HomeController_3.MessageFriendSubmit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "MessageFriendSubmit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """ChatPortal/MessageFriendSubmit"""
    )
  )

  // @LINE:137
  private[this] lazy val controllers_security_LoginSignUpController_login42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginSignUpController_login42_invoker = createInvoker(
    LoginSignUpController_1.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginSignUpController",
      "login",
      Nil,
      "GET",
      """#########################
 Login & Sign Up routes #
#########################
Login""",
      this.prefix + """login"""
    )
  )

  // @LINE:138
  private[this] lazy val controllers_security_LoginSignUpController_loginSubmit43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_security_LoginSignUpController_loginSubmit43_invoker = createInvoker(
    LoginSignUpController_1.loginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginSignUpController",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:139
  private[this] lazy val controllers_security_LoginSignUpController_logout44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_security_LoginSignUpController_logout44_invoker = createInvoker(
    LoginSignUpController_1.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginSignUpController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:141
  private[this] lazy val controllers_security_LoginSignUpController_signUpSubmit45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUpSubmit")))
  )
  private[this] lazy val controllers_security_LoginSignUpController_signUpSubmit45_invoker = createInvoker(
    LoginSignUpController_1.signUpSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginSignUpController",
      "signUpSubmit",
      Nil,
      "POST",
      """SignUp""",
      this.prefix + """signUpSubmit"""
    )
  )

  // @LINE:143
  private[this] lazy val controllers_security_LoginSignUpController_editProfile46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editProfile")))
  )
  private[this] lazy val controllers_security_LoginSignUpController_editProfile46_invoker = createInvoker(
    LoginSignUpController_1.editProfile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginSignUpController",
      "editProfile",
      Nil,
      "GET",
      """Profile Edit""",
      this.prefix + """editProfile"""
    )
  )

  // @LINE:144
  private[this] lazy val controllers_security_LoginSignUpController_editProfilePhoto47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editProfilePhoto")))
  )
  private[this] lazy val controllers_security_LoginSignUpController_editProfilePhoto47_invoker = createInvoker(
    LoginSignUpController_1.editProfilePhoto,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginSignUpController",
      "editProfilePhoto",
      Nil,
      "GET",
      """""",
      this.prefix + """editProfilePhoto"""
    )
  )

  // @LINE:145
  private[this] lazy val controllers_security_LoginSignUpController_editProfilePhotoSubmit48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editProfilePhotoSubmit")))
  )
  private[this] lazy val controllers_security_LoginSignUpController_editProfilePhotoSubmit48_invoker = createInvoker(
    LoginSignUpController_1.editProfilePhotoSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginSignUpController",
      "editProfilePhotoSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """editProfilePhotoSubmit"""
    )
  )

  // @LINE:151
  private[this] lazy val controllers_ShoppingController_showBasket49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingController_showBasket49_invoker = createInvoker(
    ShoppingController_5.showBasket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingController",
      "showBasket",
      Nil,
      "GET",
      """""",
      this.prefix + """showBasket"""
    )
  )

  // @LINE:152
  private[this] lazy val controllers_ShoppingController_addToBasket50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addBasket")))
  )
  private[this] lazy val controllers_ShoppingController_addToBasket50_invoker = createInvoker(
    ShoppingController_5.addToBasket(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingController",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """addBasket"""
    )
  )

  // @LINE:153
  private[this] lazy val controllers_ShoppingController_addOne51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne")))
  )
  private[this] lazy val controllers_ShoppingController_addOne51_invoker = createInvoker(
    ShoppingController_5.addOne(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingController",
      "addOne",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """addOne"""
    )
  )

  // @LINE:154
  private[this] lazy val controllers_ShoppingController_removeOne52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne")))
  )
  private[this] lazy val controllers_ShoppingController_removeOne52_invoker = createInvoker(
    ShoppingController_5.removeOne(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingController",
      "removeOne",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """removeOne"""
    )
  )

  // @LINE:155
  private[this] lazy val controllers_ShoppingController_placeOrder53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirmBasketOrder")))
  )
  private[this] lazy val controllers_ShoppingController_placeOrder53_invoker = createInvoker(
    ShoppingController_5.placeOrder,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingController",
      "placeOrder",
      Nil,
      "GET",
      """""",
      this.prefix + """confirmBasketOrder"""
    )
  )

  // @LINE:156
  private[this] lazy val controllers_ShoppingController_viewOrders54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrders")))
  )
  private[this] lazy val controllers_ShoppingController_viewOrders54_invoker = createInvoker(
    ShoppingController_5.viewOrders,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingController",
      "viewOrders",
      Nil,
      "GET",
      """""",
      this.prefix + """viewOrders"""
    )
  )

  // @LINE:159
  private[this] lazy val controllers_CountController_count55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count55_invoker = createInvoker(
    CountController_2.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:161
  private[this] lazy val controllers_AsyncController_message56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message56_invoker = createInvoker(
    AsyncController_4.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:164
  private[this] lazy val controllers_Assets_versioned57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned57_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:10
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index())
      }
  
    // @LINE:13
    case controllers_HomeController_about1_route(params) =>
      call { 
        controllers_HomeController_about1_invoker.call(HomeController_3.about)
      }
  
    // @LINE:15
    case controllers_HomeController_userSupport2_route(params) =>
      call { 
        controllers_HomeController_userSupport2_invoker.call(HomeController_3.userSupport)
      }
  
    // @LINE:17
    case controllers_HomeController_submitQuery3_route(params) =>
      call { 
        controllers_HomeController_submitQuery3_invoker.call(HomeController_3.submitQuery)
      }
  
    // @LINE:20
    case controllers_HomeController_products4_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_products4_invoker.call(HomeController_3.products(cat, filter))
      }
  
    // @LINE:22
    case controllers_HomeController_moreProductInfo5_route(params) =>
      call(params.fromQuery[Long]("prodID", Some(0L))) { (prodID) =>
        controllers_HomeController_moreProductInfo5_invoker.call(HomeController_3.moreProductInfo(prodID))
      }
  
    // @LINE:25
    case controllers_HomeController_media6_route(params) =>
      call(params.fromQuery[Long]("gen", Some(0L)), params.fromQuery[String]("filter", Some(""))) { (gen, filter) =>
        controllers_HomeController_media6_invoker.call(HomeController_3.media(gen, filter))
      }
  
    // @LINE:27
    case controllers_HomeController_moreMediaInfo7_route(params) =>
      call(params.fromQuery[Long]("medId", Some(0L))) { (medId) =>
        controllers_HomeController_moreMediaInfo7_invoker.call(HomeController_3.moreMediaInfo(medId))
      }
  
    // @LINE:29
    case controllers_HomeController_UhOh8_route(params) =>
      call { 
        controllers_HomeController_UhOh8_invoker.call(HomeController_3.UhOh)
      }
  
    // @LINE:34
    case controllers_HomeController_forum9_route(params) =>
      call(params.fromQuery[String]("filter", Some(""))) { (filter) =>
        controllers_HomeController_forum9_invoker.call(HomeController_3.forum(filter))
      }
  
    // @LINE:36
    case controllers_HomeController_addTopic10_route(params) =>
      call { 
        controllers_HomeController_addTopic10_invoker.call(HomeController_3.addTopic)
      }
  
    // @LINE:38
    case controllers_HomeController_addTopicSubmit11_route(params) =>
      call { 
        controllers_HomeController_addTopicSubmit11_invoker.call(HomeController_3.addTopicSubmit)
      }
  
    // @LINE:40
    case controllers_HomeController_topic12_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_HomeController_topic12_invoker.call(HomeController_3.topic(id))
      }
  
    // @LINE:42
    case controllers_HomeController_deletePost13_route(params) =>
      call(params.fromQuery[Long]("postId", None), params.fromQuery[Long]("topicId", None)) { (postId, topicId) =>
        controllers_HomeController_deletePost13_invoker.call(HomeController_3.deletePost(postId, topicId))
      }
  
    // @LINE:44
    case controllers_HomeController_addPost14_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_HomeController_addPost14_invoker.call(HomeController_3.addPost(id))
      }
  
    // @LINE:46
    case controllers_HomeController_addPostSubmit15_route(params) =>
      call { 
        controllers_HomeController_addPostSubmit15_invoker.call(HomeController_3.addPostSubmit)
      }
  
    // @LINE:48
    case controllers_HomeController_deleteTopic16_route(params) =>
      call(params.fromQuery[Long]("topicId", None)) { (topicId) =>
        controllers_HomeController_deleteTopic16_invoker.call(HomeController_3.deleteTopic(topicId))
      }
  
    // @LINE:63
    case controllers_AdminController_indexAdmin17_route(params) =>
      call { 
        controllers_AdminController_indexAdmin17_invoker.call(AdminController_0.indexAdmin)
      }
  
    // @LINE:65
    case controllers_AdminController_products18_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_AdminController_products18_invoker.call(AdminController_0.products(cat))
      }
  
    // @LINE:68
    case controllers_AdminController_addProduct19_route(params) =>
      call { 
        controllers_AdminController_addProduct19_invoker.call(AdminController_0.addProduct)
      }
  
    // @LINE:71
    case controllers_AdminController_addProductSubmit20_route(params) =>
      call { 
        controllers_AdminController_addProductSubmit20_invoker.call(AdminController_0.addProductSubmit)
      }
  
    // @LINE:74
    case controllers_AdminController_deleteProduct21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_deleteProduct21_invoker.call(AdminController_0.deleteProduct(id))
      }
  
    // @LINE:77
    case controllers_AdminController_updateProduct22_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateProduct22_invoker.call(AdminController_0.updateProduct(id))
      }
  
    // @LINE:80
    case controllers_AdminController_adminSupport23_route(params) =>
      call(params.fromQuery[Long]("queryType", Some(0L)), params.fromQuery[Boolean]("queryStatus", Some(false))) { (queryType, queryStatus) =>
        controllers_AdminController_adminSupport23_invoker.call(AdminController_0.adminSupport(queryType, queryStatus))
      }
  
    // @LINE:83
    case controllers_AdminController_changeQueryStatus24_route(params) =>
      call(params.fromQuery[Long]("queryId", None)) { (queryId) =>
        controllers_AdminController_changeQueryStatus24_invoker.call(AdminController_0.changeQueryStatus(queryId))
      }
  
    // @LINE:85
    case controllers_AdminController_adminMedia25_route(params) =>
      call(params.fromQuery[Long]("gen", Some(0L))) { (gen) =>
        controllers_AdminController_adminMedia25_invoker.call(AdminController_0.adminMedia(gen))
      }
  
    // @LINE:88
    case controllers_AdminController_addMedia26_route(params) =>
      call { 
        controllers_AdminController_addMedia26_invoker.call(AdminController_0.addMedia)
      }
  
    // @LINE:91
    case controllers_AdminController_addMediaSubmit27_route(params) =>
      call { 
        controllers_AdminController_addMediaSubmit27_invoker.call(AdminController_0.addMediaSubmit)
      }
  
    // @LINE:94
    case controllers_AdminController_deleteMedia28_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_deleteMedia28_invoker.call(AdminController_0.deleteMedia(id))
      }
  
    // @LINE:97
    case controllers_AdminController_updateMedia29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateMedia29_invoker.call(AdminController_0.updateMedia(id))
      }
  
    // @LINE:102
    case controllers_AdminController_adminAdvert30_route(params) =>
      call { 
        controllers_AdminController_adminAdvert30_invoker.call(AdminController_0.adminAdvert)
      }
  
    // @LINE:105
    case controllers_AdminController_addAdvert31_route(params) =>
      call { 
        controllers_AdminController_addAdvert31_invoker.call(AdminController_0.addAdvert)
      }
  
    // @LINE:108
    case controllers_AdminController_addAdvertSubmit32_route(params) =>
      call { 
        controllers_AdminController_addAdvertSubmit32_invoker.call(AdminController_0.addAdvertSubmit)
      }
  
    // @LINE:111
    case controllers_AdminController_deleteAdvert33_route(params) =>
      call(params.fromQuery[Long]("advertId", None)) { (advertId) =>
        controllers_AdminController_deleteAdvert33_invoker.call(AdminController_0.deleteAdvert(advertId))
      }
  
    // @LINE:114
    case controllers_AdminController_UhOh34_route(params) =>
      call { 
        controllers_AdminController_UhOh34_invoker.call(AdminController_0.UhOh)
      }
  
    // @LINE:118
    case controllers_HomeController_findFriends35_route(params) =>
      call(params.fromQuery[String]("name", Some(""))) { (name) =>
        controllers_HomeController_findFriends35_invoker.call(HomeController_3.findFriends(name))
      }
  
    // @LINE:120
    case controllers_HomeController_sendRequest36_route(params) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_HomeController_sendRequest36_invoker.call(HomeController_3.sendRequest(name))
      }
  
    // @LINE:122
    case controllers_HomeController_Chat37_route(params) =>
      call(params.fromQuery[Long]("option", Some(0))) { (option) =>
        controllers_HomeController_Chat37_invoker.call(HomeController_3.Chat(option))
      }
  
    // @LINE:124
    case controllers_HomeController_addFriend38_route(params) =>
      call(params.fromQuery[Long]("option", Some(0L)), params.fromQuery[String]("pendingFriendId", None)) { (option, pendingFriendId) =>
        controllers_HomeController_addFriend38_invoker.call(HomeController_3.addFriend(option, pendingFriendId))
      }
  
    // @LINE:126
    case controllers_HomeController_declineRequest39_route(params) =>
      call(params.fromQuery[String]("declinedCustomer", None)) { (declinedCustomer) =>
        controllers_HomeController_declineRequest39_invoker.call(HomeController_3.declineRequest(declinedCustomer))
      }
  
    // @LINE:128
    case controllers_HomeController_MessageFriend40_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_HomeController_MessageFriend40_invoker.call(HomeController_3.MessageFriend(name))
      }
  
    // @LINE:130
    case controllers_HomeController_MessageFriendSubmit41_route(params) =>
      call(params.fromQuery[Long]("chatId", None)) { (chatId) =>
        controllers_HomeController_MessageFriendSubmit41_invoker.call(HomeController_3.MessageFriendSubmit(chatId))
      }
  
    // @LINE:137
    case controllers_security_LoginSignUpController_login42_route(params) =>
      call { 
        controllers_security_LoginSignUpController_login42_invoker.call(LoginSignUpController_1.login)
      }
  
    // @LINE:138
    case controllers_security_LoginSignUpController_loginSubmit43_route(params) =>
      call { 
        controllers_security_LoginSignUpController_loginSubmit43_invoker.call(LoginSignUpController_1.loginSubmit)
      }
  
    // @LINE:139
    case controllers_security_LoginSignUpController_logout44_route(params) =>
      call { 
        controllers_security_LoginSignUpController_logout44_invoker.call(LoginSignUpController_1.logout)
      }
  
    // @LINE:141
    case controllers_security_LoginSignUpController_signUpSubmit45_route(params) =>
      call { 
        controllers_security_LoginSignUpController_signUpSubmit45_invoker.call(LoginSignUpController_1.signUpSubmit)
      }
  
    // @LINE:143
    case controllers_security_LoginSignUpController_editProfile46_route(params) =>
      call { 
        controllers_security_LoginSignUpController_editProfile46_invoker.call(LoginSignUpController_1.editProfile)
      }
  
    // @LINE:144
    case controllers_security_LoginSignUpController_editProfilePhoto47_route(params) =>
      call { 
        controllers_security_LoginSignUpController_editProfilePhoto47_invoker.call(LoginSignUpController_1.editProfilePhoto)
      }
  
    // @LINE:145
    case controllers_security_LoginSignUpController_editProfilePhotoSubmit48_route(params) =>
      call { 
        controllers_security_LoginSignUpController_editProfilePhotoSubmit48_invoker.call(LoginSignUpController_1.editProfilePhotoSubmit)
      }
  
    // @LINE:151
    case controllers_ShoppingController_showBasket49_route(params) =>
      call { 
        controllers_ShoppingController_showBasket49_invoker.call(ShoppingController_5.showBasket)
      }
  
    // @LINE:152
    case controllers_ShoppingController_addToBasket50_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ShoppingController_addToBasket50_invoker.call(ShoppingController_5.addToBasket(id))
      }
  
    // @LINE:153
    case controllers_ShoppingController_addOne51_route(params) =>
      call(params.fromQuery[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingController_addOne51_invoker.call(ShoppingController_5.addOne(itemId))
      }
  
    // @LINE:154
    case controllers_ShoppingController_removeOne52_route(params) =>
      call(params.fromQuery[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingController_removeOne52_invoker.call(ShoppingController_5.removeOne(itemId))
      }
  
    // @LINE:155
    case controllers_ShoppingController_placeOrder53_route(params) =>
      call { 
        controllers_ShoppingController_placeOrder53_invoker.call(ShoppingController_5.placeOrder)
      }
  
    // @LINE:156
    case controllers_ShoppingController_viewOrders54_route(params) =>
      call { 
        controllers_ShoppingController_viewOrders54_invoker.call(ShoppingController_5.viewOrders)
      }
  
    // @LINE:159
    case controllers_CountController_count55_route(params) =>
      call { 
        controllers_CountController_count55_invoker.call(CountController_2.count)
      }
  
    // @LINE:161
    case controllers_AsyncController_message56_route(params) =>
      call { 
        controllers_AsyncController_message56_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:164
    case controllers_Assets_versioned57_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned57_invoker.call(Assets_6.versioned(path, file))
      }
  }
}
