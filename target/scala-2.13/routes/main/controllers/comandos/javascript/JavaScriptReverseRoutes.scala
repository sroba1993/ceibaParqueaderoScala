// @GENERATOR:play-routes-compiler
// @SOURCE:D:/ProyectosScala/Retos/ParqueaderoCeiba/conf/routes
// @DATE:Thu Oct 31 11:37:32 COT 2019

import play.api.routing.JavaScriptReverseRoute


// @LINE:17
package controllers.comandos.javascript {

  // @LINE:17
  class ReverseVehicleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def saveVehicle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.commands.VehicleController.saveVehicle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "guardar"})
        }
      """
    )
  
    // @LINE:18
    def removeVehicle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.commands.VehicleController.removeVehicle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "retirar"})
        }
      """
    )
  
  }


}
