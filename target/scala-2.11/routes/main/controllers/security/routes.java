
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/websiteFrame(2.6.7)/conf/routes
// @DATE:Mon Apr 24 12:05:02 IST 2017

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginSignUpController LoginSignUpController = new controllers.security.ReverseLoginSignUpController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginSignUpController LoginSignUpController = new controllers.security.javascript.ReverseLoginSignUpController(RoutesPrefix.byNamePrefix());
  }

}
