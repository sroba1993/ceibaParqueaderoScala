package parqueadero.aplicacion.servicios

import cats.data.Reader
import parqueadero.dominio.modelos.Vehiculo
import parqueadero.infraestructura.repositorio.RepositorioVehiculo

import scala.concurrent.Future

trait ServicioVehiculo {

  def almacenarVehiculo(vehiculo: Vehiculo): Reader[RepositorioVehiculo, Future[Int]] = Reader {
    case repositorioVehiculo: RepositorioVehiculo => repositorioVehiculo.insertarVehiculo(vehiculo)
  }

  def eliminarVehiculo(vehiculo: Vehiculo): Reader[RepositorioVehiculo, Future[Int]] = Reader {
    case repositorioVehiculo: RepositorioVehiculo => repositorioVehiculo.eliminarVehiculo(vehiculo.placa)
  }

  def obtenerVehiculo(placa: String): Reader[RepositorioVehiculo, Future[Option[Vehiculo]]] = Reader {
    case repositorioVehiculo: RepositorioVehiculo => repositorioVehiculo.buscarVehiculo(placa)
  }

  def obtenerListaVehiculos: Reader[RepositorioVehiculo, Future[List[Vehiculo]]] = Reader {
    case repositorioVehiculo: RepositorioVehiculo => repositorioVehiculo.obtenerListadoVehiculos
  }
}

object ServicioVehiculo extends ServicioVehiculo
