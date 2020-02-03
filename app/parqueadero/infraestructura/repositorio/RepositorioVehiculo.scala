package parqueadero.infraestructura.repositorio

import java.sql.Date
import javax.inject.Inject
import parqueadero.dominio.modelos.Vehiculo
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import scala.concurrent.{ExecutionContext, Future}

class RepositorioVehiculo @Inject()(protected val dbConfigProvider: DatabaseConfigProvider)(implicit executionContext: ExecutionContext) extends HasDatabaseConfigProvider[JdbcProfile]{

  import profile.api._

  private val vehiculos = TableQuery[TablaVehiculos]

  def insertarVehiculo(vehiculo: Vehiculo): Future[Int] = db.run(vehiculos += vehiculo)

  def eliminarVehiculo(placa: String): Future[Int] = {
    val queryDelete = vehiculos.filter(vehiculo => vehiculo.placa === placa).delete
    db.run(queryDelete)
  }

  def buscarVehiculo(placa: String): Future[Option[Vehiculo]] = {
    val query = vehiculos.filter(vehiculo => vehiculo.placa === placa)
    db.run(query.result).map(s => s.headOption)
  }

  def obtenerListadoVehiculos: Future[List[Vehiculo]] = {
    db.run(vehiculos.result).map(s => s.toList)
  }

  class TablaVehiculos(tag: Tag) extends Table[Vehiculo](tag, "VEHICULO") {

    def id = column[Int]("ID", O.PrimaryKey)
    def placa = column[String]("PLACA")
    def tipoVehiculo = column[String]("TIPO_VEHICULO")
    def fechaEntrada = column[Date]("FECHA_ENTRADA")
    def fechaSalida = column[Date]("FECHA_SALIDA")
    def costo = column[Int]("COSTO")

    def * = (id, placa, tipoVehiculo, fechaEntrada, fechaSalida,costo) <> ((Vehiculo.apply _).tupled, Vehiculo.unapply)
  }
}

