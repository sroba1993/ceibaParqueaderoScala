package parqueadero.dominio.modelos

import java.sql.Date

import play.api.libs.json.Json

case class Vehiculo (
                      id: Int,
                      placa: String,
                      tipoVehiculo: String,
                      fechaEntrada: Date,
                      fechaSalida: Date,
                      costo: Int
)

object Vehiculo {
  implicit val formatoVehiculo = Json.format[Vehiculo]
}