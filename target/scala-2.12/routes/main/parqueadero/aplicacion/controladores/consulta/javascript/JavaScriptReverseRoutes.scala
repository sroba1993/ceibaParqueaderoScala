// @GENERATOR:play-routes-compiler
// @SOURCE:D:/ProyectosScala/Retos/ParqueaderoCeiba/conf/routes
// @DATE:Fri Nov 15 11:50:04 COT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:9
package parqueadero.aplicacion.controladores.consulta.javascript {

  // @LINE:9
  class ReverseConsultaVehiculo(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def consultarVehiculo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "parqueadero.aplicacion.controladores.consulta.ConsultaVehiculo.consultarVehiculo",
      """
        function(placa0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "consultas/vehiculo/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("placa", placa0))})
        }
      """
    )
  
    // @LINE:10
    def consultarListaVehiculosEnParqueadero: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "parqueadero.aplicacion.controladores.consulta.ConsultaVehiculo.consultarListaVehiculosEnParqueadero",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "consultas/listavehiculos"})
        }
      """
    )
  
  }


}
