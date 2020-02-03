package parqueadero.aplicacion.controladores

trait Config

case class RequestInfo( userName: Option[String], appTag: Option[String], dni: Option[String] )

class EmptyConf extends Config
