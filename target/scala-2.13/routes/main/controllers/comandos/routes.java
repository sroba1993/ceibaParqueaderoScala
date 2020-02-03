// @GENERATOR:play-routes-compiler
// @SOURCE:D:/ProyectosScala/Retos/ParqueaderoCeiba/conf/routes
// @DATE:Thu Oct 31 11:37:32 COT 2019

package controllers.comandos;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.comandos.ReverseVehicleController VehicleController = new controllers.comandos.ReverseVehicleController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.comandos.javascript.ReverseVehicleController VehicleController = new controllers.comandos.javascript.ReverseVehicleController(RoutesPrefix.byNamePrefix());
  }

}
