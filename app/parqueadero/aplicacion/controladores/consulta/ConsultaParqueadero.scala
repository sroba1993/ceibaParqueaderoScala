package parqueadero.aplicacion.controladores.consulta

import javax.inject._
import parqueadero.aplicacion.servicios.ServicioParqueadero
import parqueadero.infraestructura.repositorio.RepositorioVehiculo
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext

@Singleton
class ConsultaParqueadero @Inject()(cc: ControllerComponents, repositorioVehiculo: RepositorioVehiculo)(implicit exec: ExecutionContext) extends AbstractController(cc){

  def consultarVehiculo(placa: String): Action[AnyContent] = Action.async {
    ServicioParqueadero.obtenerVehiculo(placa).run(repositorioVehiculo).map(vehiculo =>
      vehiculo match {
        case Some(vehiculo)=> Ok(Json.toJson(vehiculo).toString())
        case None => Ok("El vehiculo no se encuentra en el parqueadero")
      }
    )
  }

  def consultarListaVehiculosEnParqueadero: Action[AnyContent] = Action.async {
    ServicioParqueadero.obtenerListaVehiculos.run(repositorioVehiculo).map(listaVehiculo => Ok(Json.toJson(listaVehiculo).toString()))
  }
}
