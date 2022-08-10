package parqueadero.aplicacion.servicios

import cats.data.Reader
import parqueadero.dominio.modelos.Vehiculo
import parqueadero.infraestructura.repositorio.RepositorioVehiculo

import scala.concurrent.{ExecutionContext, Future}

trait ServicioParqueadero {

  def almacenarVehiculo(vehiculo: Vehiculo)(implicit ec: ExecutionContext): Reader[RepositorioVehiculo, Future[Either[String, String]]] = Reader {
    repositorioVehiculo: RepositorioVehiculo => repositorioVehiculo.insertarVehiculo(vehiculo).map(s => Right("Se ingresó el vehículo correctamente"))
        .recoverWith {
          case exception => Future.successful(Left(s"Error guardando el ingreso del vehículo: $exception"))
        }
  }

  def actualizarVehiculo(vehiculo: Vehiculo)(implicit ec: ExecutionContext): Reader[RepositorioVehiculo, Future[Either[String, String]]] = Reader {
    repositorioVehiculo: RepositorioVehiculo => repositorioVehiculo.actualizarVehiculo(vehiculo).map(s => Right("Se retiró el vehículo correctamente"))
        .recoverWith {
          case exception => Future.successful(Left(s"Error actualizando el retiro del vehículo: $exception"))
        }
  }

  def obtenerVehiculo(placa: String): Reader[RepositorioVehiculo, Future[Option[Vehiculo]]] = Reader {
    repositorioVehiculo: RepositorioVehiculo => repositorioVehiculo.buscarVehiculo(placa)
  }

  def obtenerListaVehiculos: Reader[RepositorioVehiculo, Future[List[Vehiculo]]] = Reader {
    repositorioVehiculo: RepositorioVehiculo => repositorioVehiculo.obtenerListadoVehiculos
  }
}

object ServicioParqueadero extends ServicioParqueadero
