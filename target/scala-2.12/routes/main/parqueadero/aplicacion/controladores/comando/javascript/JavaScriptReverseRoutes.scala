// @GENERATOR:play-routes-compiler
// @SOURCE:D:/ProyectosScala/Retos/ParqueaderoCeiba/conf/routes
// @DATE:Fri Nov 15 11:50:04 COT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package parqueadero.aplicacion.controladores.comando.javascript {

  // @LINE:7
  class ReverseComandoVehiculo(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def ingresarVehiculo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "parqueadero.aplicacion.controladores.comando.ComandoVehiculo.ingresarVehiculo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ingresar/vehiculo"})
        }
      """
    )
  
    // @LINE:8
    def retirarVehiculo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "parqueadero.aplicacion.controladores.comando.ComandoVehiculo.retirarVehiculo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "retirar/vehiculo"})
        }
      """
    )
  
  }


}
