
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/websiteFrame(2.6.7)/conf/routes
// @DATE:Mon Apr 24 12:05:02 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:10
package controllers {

  // @LINE:164
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:164
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:63
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:111
    def deleteAdvert(advertId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/delAdvert" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("advertId", advertId)))))
    }
  
    // @LINE:105
    def addAdvert(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adminAdvert/addAdvert")
    }
  
    // @LINE:71
    def addProductSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/addProductSubmit")
    }
  
    // @LINE:114
    def UhOh(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/UhOh")
    }
  
    // @LINE:65
    def products(cat:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/products" + queryString(List(if(cat == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:88
    def addMedia(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/addmedia")
    }
  
    // @LINE:102
    def adminAdvert(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adminAdvert")
    }
  
    // @LINE:85
    def adminMedia(gen:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adminMedia" + queryString(List(if(gen == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("gen", gen)))))
    }
  
    // @LINE:97
    def updateMedia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/updateMedia/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:74
    def deleteProduct(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/delProduct/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:80
    def adminSupport(queryType:Long = 0L, queryStatus:Boolean = false): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/adminSupport" + queryString(List(if(queryType == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("queryType", queryType)), if(queryStatus == false) None else Some(implicitly[QueryStringBindable[Boolean]].unbind("queryStatus", queryStatus)))))
    }
  
    // @LINE:94
    def deleteMedia(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/delMedia/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:77
    def updateProduct(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/updateProduct/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:63
    def indexAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/indexAdmin")
    }
  
    // @LINE:108
    def addAdvertSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/adminAdvert/addAdvertSubmit")
    }
  
    // @LINE:68
    def addProduct(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/addproduct")
    }
  
    // @LINE:91
    def addMediaSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/addMediaSubmit")
    }
  
    // @LINE:83
    def changeQueryStatus(queryId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/changeQueryStatus" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("queryId", queryId)))))
    }
  
  }

  // @LINE:159
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:159
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:151
  class ReverseShoppingController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:153
    def addOne(itemId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addOne" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("itemId", itemId)))))
    }
  
    // @LINE:152
    def addToBasket(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addBasket" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:156
    def viewOrders(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "viewOrders")
    }
  
    // @LINE:155
    def placeOrder(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "confirmBasketOrder")
    }
  
    // @LINE:154
    def removeOne(itemId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "removeOne" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("itemId", itemId)))))
    }
  
    // @LINE:151
    def showBasket(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "showBasket")
    }
  
  }

  // @LINE:10
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:122
    def Chat(option:Long = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ChatPortal" + queryString(List(if(option == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("option", option)))))
    }
  
    // @LINE:34
    def forum(filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "forum" + queryString(List(if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:27
    def moreMediaInfo(medId:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "moreMediaInfo" + queryString(List(if(medId == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("medId", medId)))))
    }
  
    // @LINE:29
    def UhOh(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "UhOh")
    }
  
    // @LINE:128
    def MessageFriend(name:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ChatPortal/MessageFriend/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
    }
  
    // @LINE:124
    def addFriend(option:Long = 0L, pendingFriendId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ChatPortal/AcceptRequest" + queryString(List(if(option == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("option", option)), Some(implicitly[QueryStringBindable[String]].unbind("pendingFriendId", pendingFriendId)))))
    }
  
    // @LINE:20
    def products(cat:Long = 0L, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "products" + queryString(List(if(cat == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:46
    def addPostSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addPostSubmit")
    }
  
    // @LINE:48
    def deleteTopic(topicId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deleteTopic" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("topicId", topicId)))))
    }
  
    // @LINE:42
    def deletePost(postId:Long, topicId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deletePost" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("postId", postId)), Some(implicitly[QueryStringBindable[Long]].unbind("topicId", topicId)))))
    }
  
    // @LINE:13
    def about(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:118
    def findFriends(name:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "FriendPortal" + queryString(List(if(name == "") None else Some(implicitly[QueryStringBindable[String]].unbind("name", name)))))
    }
  
    // @LINE:25
    def media(gen:Long = 0L, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "media" + queryString(List(if(gen == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("gen", gen)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:15
    def userSupport(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "userSupport")
    }
  
    // @LINE:44
    def addPost(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addPost" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:38
    def addTopicSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addTopicSubmit")
    }
  
    // @LINE:40
    def topic(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "topic" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:130
    def MessageFriendSubmit(chatId:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ChatPortal/MessageFriendSubmit" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("chatId", chatId)))))
    }
  
    // @LINE:22
    def moreProductInfo(prodID:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "moreProductInfo" + queryString(List(if(prodID == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("prodID", prodID)))))
    }
  
    // @LINE:17
    def submitQuery(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "submitQuery")
    }
  
    // @LINE:120
    def sendRequest(name:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "FriendPortal/SendRequest" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("name", name)))))
    }
  
    // @LINE:36
    def addTopic(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addTopic")
    }
  
    // @LINE:126
    def declineRequest(declinedCustomer:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ChatPortal/DeclineRequest" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("declinedCustomer", declinedCustomer)))))
    }
  
    // @LINE:10
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:161
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:161
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }


}
