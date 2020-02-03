// @GENERATOR:play-routes-compiler
// @SOURCE:D:/ProyectosScala/Retos/ParqueaderoCeiba/conf/routes
// @DATE:Fri Nov 15 11:50:04 COT 2019

package parqueadero.aplicacion.controladores.comando;

import router.RoutesPrefix;

public class routes {
  
  public static final parqueadero.aplicacion.controladores.comando.ReverseComandoVehiculo ComandoVehiculo = new parqueadero.aplicacion.controladores.comando.ReverseComandoVehiculo(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final parqueadero.aplicacion.controladores.comando.javascript.ReverseComandoVehiculo ComandoVehiculo = new parqueadero.aplicacion.controladores.comando.javascript.ReverseComandoVehiculo(RoutesPrefix.byNamePrefix());
  }

}
