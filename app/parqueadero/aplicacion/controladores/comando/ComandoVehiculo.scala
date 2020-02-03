package parqueadero.aplicacion.controladores.comando

import javax.inject._
import parqueadero.aplicacion.servicios.ServicioVehiculo
import parqueadero.dominio.modelos.Vehiculo
import parqueadero.infraestructura.repositorio.RepositorioVehiculo
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Promise}

@Singleton
class ComandoVehiculo @Inject()(cc: ControllerComponents, repositorioVehiculo: RepositorioVehiculo)(implicit exec: ExecutionContext) extends AbstractController(cc){

  def ingresarVehiculo: Action[Vehiculo] = Action.async(parse.json[Vehiculo])  {
    request => ServicioVehiculo.almacenarVehiculo(request.body).run(repositorioVehiculo).map(r => Ok(r.toString))
  }

  def retirarVehiculo = Action.async {
    val promise: Promise[String] = Promise[String]()
    promise.success("bien").future.map(msg => Ok(msg))
  }
}