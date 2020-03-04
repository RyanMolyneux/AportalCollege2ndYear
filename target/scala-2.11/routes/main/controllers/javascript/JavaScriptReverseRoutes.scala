
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/websiteFrame(2.6.7)/conf/routes
// @DATE:Mon Apr 24 12:05:02 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:10
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:164
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:164
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:63
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:111
    def deleteAdvert: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.deleteAdvert",
      """
        function(advertId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/delAdvert" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("advertId", advertId0)])})
        }
      """
    )
  
    // @LINE:105
    def addAdvert: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addAdvert",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adminAdvert/addAdvert"})
        }
      """
    )
  
    // @LINE:71
    def addProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addProductSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addProductSubmit"})
        }
      """
    )
  
    // @LINE:114
    def UhOh: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.UhOh",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/UhOh"})
        }
      """
    )
  
    // @LINE:65
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.products",
      """
        function(cat0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/products" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0))])})
        }
      """
    )
  
    // @LINE:88
    def addMedia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addMedia",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addmedia"})
        }
      """
    )
  
    // @LINE:102
    def adminAdvert: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.adminAdvert",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adminAdvert"})
        }
      """
    )
  
    // @LINE:85
    def adminMedia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.adminMedia",
      """
        function(gen0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adminMedia" + _qS([(gen0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("gen", gen0))])})
        }
      """
    )
  
    // @LINE:97
    def updateMedia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateMedia",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateMedia/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:74
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.deleteProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/delProduct/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:80
    def adminSupport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.adminSupport",
      """
        function(queryType0,queryStatus1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adminSupport" + _qS([(queryType0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("queryType", queryType0)), (queryStatus1 == null ? null : (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("queryStatus", queryStatus1))])})
        }
      """
    )
  
    // @LINE:94
    def deleteMedia: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.deleteMedia",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/delMedia/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:77
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateProduct/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:63
    def indexAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.indexAdmin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/indexAdmin"})
        }
      """
    )
  
    // @LINE:108
    def addAdvertSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addAdvertSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/adminAdvert/addAdvertSubmit"})
        }
      """
    )
  
    // @LINE:68
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addproduct"})
        }
      """
    )
  
    // @LINE:91
    def addMediaSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addMediaSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addMediaSubmit"})
        }
      """
    )
  
    // @LINE:83
    def changeQueryStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.changeQueryStatus",
      """
        function(queryId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/changeQueryStatus" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("queryId", queryId0)])})
        }
      """
    )
  
  }

  // @LINE:159
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:159
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:151
  class ReverseShoppingController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:153
    def addOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingController.addOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addOne" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("itemId", itemId0)])})
        }
      """
    )
  
    // @LINE:152
    def addToBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingController.addToBasket",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addBasket" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:156
    def viewOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingController.viewOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrders"})
        }
      """
    )
  
    // @LINE:155
    def placeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingController.placeOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "confirmBasketOrder"})
        }
      """
    )
  
    // @LINE:154
    def removeOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingController.removeOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeOne" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("itemId", itemId0)])})
        }
      """
    )
  
    // @LINE:151
    def showBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingController.showBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showBasket"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:122
    def Chat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Chat",
      """
        function(option0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ChatPortal" + _qS([(option0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("option", option0))])})
        }
      """
    )
  
    // @LINE:34
    def forum: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.forum",
      """
        function(filter0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forum" + _qS([(filter0 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter0))])})
        }
      """
    )
  
    // @LINE:27
    def moreMediaInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.moreMediaInfo",
      """
        function(medId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "moreMediaInfo" + _qS([(medId0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("medId", medId0))])})
        }
      """
    )
  
    // @LINE:29
    def UhOh: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.UhOh",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "UhOh"})
        }
      """
    )
  
    // @LINE:128
    def MessageFriend: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.MessageFriend",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ChatPortal/MessageFriend/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
    // @LINE:124
    def addFriend: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addFriend",
      """
        function(option0,pendingFriendId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ChatPortal/AcceptRequest" + _qS([(option0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("option", option0)), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pendingFriendId", pendingFriendId1)])})
        }
      """
    )
  
    // @LINE:20
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.products",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:46
    def addPostSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPostSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addPostSubmit"})
        }
      """
    )
  
    // @LINE:48
    def deleteTopic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteTopic",
      """
        function(topicId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteTopic" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("topicId", topicId0)])})
        }
      """
    )
  
    // @LINE:42
    def deletePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deletePost",
      """
        function(postId0,topicId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletePost" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("postId", postId0), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("topicId", topicId1)])})
        }
      """
    )
  
    // @LINE:13
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:118
    def findFriends: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.findFriends",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "FriendPortal" + _qS([(name0 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("name", name0))])})
        }
      """
    )
  
    // @LINE:25
    def media: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.media",
      """
        function(gen0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "media" + _qS([(gen0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("gen", gen0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:15
    def userSupport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.userSupport",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userSupport"})
        }
      """
    )
  
    // @LINE:44
    def addPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPost",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addPost" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:38
    def addTopicSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTopicSubmit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addTopicSubmit"})
        }
      """
    )
  
    // @LINE:40
    def topic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topic",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:130
    def MessageFriendSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.MessageFriendSubmit",
      """
        function(chatId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ChatPortal/MessageFriendSubmit" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("chatId", chatId0)])})
        }
      """
    )
  
    // @LINE:22
    def moreProductInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.moreProductInfo",
      """
        function(prodID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "moreProductInfo" + _qS([(prodID0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("prodID", prodID0))])})
        }
      """
    )
  
    // @LINE:17
    def submitQuery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.submitQuery",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submitQuery"})
        }
      """
    )
  
    // @LINE:120
    def sendRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.sendRequest",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "FriendPortal/SendRequest" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
    // @LINE:36
    def addTopic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTopic",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addTopic"})
        }
      """
    )
  
    // @LINE:126
    def declineRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.declineRequest",
      """
        function(declinedCustomer0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ChatPortal/DeclineRequest" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("declinedCustomer", declinedCustomer0)])})
        }
      """
    )
  
    // @LINE:10
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:161
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:161
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }


}
