
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/websiteFrame(2.6.7)/conf/routes
// @DATE:Mon Apr 24 12:05:02 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:137
package controllers.security.javascript {
  import ReverseRouteContext.empty

  // @LINE:137
  class ReverseLoginSignUpController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:138
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginSignUpController.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:144
    def editProfilePhoto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginSignUpController.editProfilePhoto",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editProfilePhoto"})
        }
      """
    )
  
    // @LINE:141
    def signUpSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginSignUpController.signUpSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUpSubmit"})
        }
      """
    )
  
    // @LINE:139
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginSignUpController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:145
    def editProfilePhotoSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginSignUpController.editProfilePhotoSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editProfilePhotoSubmit"})
        }
      """
    )
  
    // @LINE:143
    def editProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginSignUpController.editProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editProfile"})
        }
      """
    )
  
    // @LINE:137
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginSignUpController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
