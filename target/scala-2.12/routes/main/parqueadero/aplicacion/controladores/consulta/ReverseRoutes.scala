// @GENERATOR:play-routes-compiler
// @SOURCE:D:/ProyectosScala/Retos/ParqueaderoCeiba/conf/routes
// @DATE:Fri Nov 15 11:50:04 COT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:9
package parqueadero.aplicacion.controladores.consulta {

  // @LINE:9
  class ReverseConsultaVehiculo(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def consultarVehiculo(placa:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "consultas/vehiculo/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("placa", placa)))
    }
  
    // @LINE:10
    def consultarListaVehiculosEnParqueadero(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "consultas/listavehiculos")
    }
  
  }


}
