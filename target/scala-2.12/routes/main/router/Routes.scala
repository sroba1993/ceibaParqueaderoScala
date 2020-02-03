// @GENERATOR:play-routes-compiler
// @SOURCE:D:/ProyectosScala/Retos/ParqueaderoCeiba/conf/routes
// @DATE:Fri Nov 15 11:50:04 COT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  ComandoVehiculo_0: parqueadero.aplicacion.controladores.comando.ComandoVehiculo,
  // @LINE:9
  ConsultaVehiculo_1: parqueadero.aplicacion.controladores.consulta.ConsultaVehiculo,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    ComandoVehiculo_0: parqueadero.aplicacion.controladores.comando.ComandoVehiculo,
    // @LINE:9
    ConsultaVehiculo_1: parqueadero.aplicacion.controladores.consulta.ConsultaVehiculo
  ) = this(errorHandler, ComandoVehiculo_0, ConsultaVehiculo_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ComandoVehiculo_0, ConsultaVehiculo_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingresar/vehiculo""", """parqueadero.aplicacion.controladores.comando.ComandoVehiculo.ingresarVehiculo"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """retirar/vehiculo""", """parqueadero.aplicacion.controladores.comando.ComandoVehiculo.retirarVehiculo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """consultas/vehiculo/""" + "$" + """placa<[^/]+>""", """parqueadero.aplicacion.controladores.consulta.ConsultaVehiculo.consultarVehiculo(placa:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """consultas/listavehiculos""", """parqueadero.aplicacion.controladores.consulta.ConsultaVehiculo.consultarListaVehiculosEnParqueadero"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val parqueadero_aplicacion_controladores_comando_ComandoVehiculo_ingresarVehiculo0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingresar/vehiculo")))
  )
  private[this] lazy val parqueadero_aplicacion_controladores_comando_ComandoVehiculo_ingresarVehiculo0_invoker = createInvoker(
    ComandoVehiculo_0.ingresarVehiculo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "parqueadero.aplicacion.controladores.comando.ComandoVehiculo",
      "ingresarVehiculo",
      Nil,
      "POST",
      this.prefix + """ingresar/vehiculo""",
      """ An vehicle controller, which consult, save or remove a vehicle of the parking""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val parqueadero_aplicacion_controladores_comando_ComandoVehiculo_retirarVehiculo1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("retirar/vehiculo")))
  )
  private[this] lazy val parqueadero_aplicacion_controladores_comando_ComandoVehiculo_retirarVehiculo1_invoker = createInvoker(
    ComandoVehiculo_0.retirarVehiculo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "parqueadero.aplicacion.controladores.comando.ComandoVehiculo",
      "retirarVehiculo",
      Nil,
      "POST",
      this.prefix + """retirar/vehiculo""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val parqueadero_aplicacion_controladores_consulta_ConsultaVehiculo_consultarVehiculo2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consultas/vehiculo/"), DynamicPart("placa", """[^/]+""",true)))
  )
  private[this] lazy val parqueadero_aplicacion_controladores_consulta_ConsultaVehiculo_consultarVehiculo2_invoker = createInvoker(
    ConsultaVehiculo_1.consultarVehiculo(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "parqueadero.aplicacion.controladores.consulta.ConsultaVehiculo",
      "consultarVehiculo",
      Seq(classOf[String]),
      "GET",
      this.prefix + """consultas/vehiculo/""" + "$" + """placa<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val parqueadero_aplicacion_controladores_consulta_ConsultaVehiculo_consultarListaVehiculosEnParqueadero3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consultas/listavehiculos")))
  )
  private[this] lazy val parqueadero_aplicacion_controladores_consulta_ConsultaVehiculo_consultarListaVehiculosEnParqueadero3_invoker = createInvoker(
    ConsultaVehiculo_1.consultarListaVehiculosEnParqueadero,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "parqueadero.aplicacion.controladores.consulta.ConsultaVehiculo",
      "consultarListaVehiculosEnParqueadero",
      Nil,
      "GET",
      this.prefix + """consultas/listavehiculos""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case parqueadero_aplicacion_controladores_comando_ComandoVehiculo_ingresarVehiculo0_route(params@_) =>
      call { 
        parqueadero_aplicacion_controladores_comando_ComandoVehiculo_ingresarVehiculo0_invoker.call(ComandoVehiculo_0.ingresarVehiculo)
      }
  
    // @LINE:8
    case parqueadero_aplicacion_controladores_comando_ComandoVehiculo_retirarVehiculo1_route(params@_) =>
      call { 
        parqueadero_aplicacion_controladores_comando_ComandoVehiculo_retirarVehiculo1_invoker.call(ComandoVehiculo_0.retirarVehiculo)
      }
  
    // @LINE:9
    case parqueadero_aplicacion_controladores_consulta_ConsultaVehiculo_consultarVehiculo2_route(params@_) =>
      call(params.fromPath[String]("placa", None)) { (placa) =>
        parqueadero_aplicacion_controladores_consulta_ConsultaVehiculo_consultarVehiculo2_invoker.call(ConsultaVehiculo_1.consultarVehiculo(placa))
      }
  
    // @LINE:10
    case parqueadero_aplicacion_controladores_consulta_ConsultaVehiculo_consultarListaVehiculosEnParqueadero3_route(params@_) =>
      call { 
        parqueadero_aplicacion_controladores_consulta_ConsultaVehiculo_consultarListaVehiculosEnParqueadero3_invoker.call(ConsultaVehiculo_1.consultarListaVehiculosEnParqueadero)
      }
  }
}
