// @GENERATOR:play-routes-compiler
// @SOURCE:D:/ProyectosScala/Retos/ParqueaderoCeiba/conf/routes
// @DATE:Thu Oct 31 11:37:32 COT 2019

import play.api.mvc.Call


// @LINE:17
package controllers.comandos {

  // @LINE:17
  class ReverseVehicleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def saveVehicle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "guardar")
    }
  
    // @LINE:18
    def removeVehicle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "retirar")
    }
  
  }


}
