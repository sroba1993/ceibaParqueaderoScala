// @GENERATOR:play-routes-compiler
// @SOURCE:D:/ProyectosScala/Retos/ParqueaderoCeiba/conf/routes
// @DATE:Fri Nov 15 11:50:04 COT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package parqueadero.aplicacion.controladores.comando {

  // @LINE:7
  class ReverseComandoVehiculo(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def ingresarVehiculo(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "ingresar/vehiculo")
    }
  
    // @LINE:8
    def retirarVehiculo(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "retirar/vehiculo")
    }
  
  }


}
