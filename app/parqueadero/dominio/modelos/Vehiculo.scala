package parqueadero.dominio.modelos

import java.sql.Date

import play.api.libs.json.Json

case class Vehiculo (
                      id: Option[Int],
                      placa: String,
                      tipoVehiculo: String,
                      fechaEntrada: Option[Date],
                      fechaSalida: Option[Date],
                      costo: Option[Int]
)

object Vehiculo {
  implicit val formatoVehiculo = Json.format[Vehiculo]
}