

object raizcuadrada {
  
  var resultado = 0.0
  
  def cuociente(x:Double, y:Double): Double = {
    print("Estimación: "+y+"				Cuociente:"+x / y)
    
    x / y
    
     
  }
  
  def promedio(cuociente:Double, y:Double): Double = {
    print("				promedio: "+(cuociente + y) / 2 +"			") 
    println()
    (cuociente + y) / 2 
  }
  
  def dif(promedio:Double, x:Double): Boolean = {
    var estimacion = promedio * promedio
    var dif = estimacion - x
    
    if(dif<0.0001)
      true
    else
      false
  }
    
  def raizCuadrada(x:Double, y:Double): Unit = {
    var prom = promedio(cuociente(x,y),y)
    
    if(dif(prom, x))
      resultado = prom
    else
      raizCuadrada(x,prom)
  }
  
  def main(args: Array[String]): Unit = {
    
    print("Ingrese el numero para obtener la raiz: ")
    val raiz = readInt()
    println("Ingrese la estimación: ")
    val estimacion=readInt()
    
    raizCuadrada(raiz, estimacion)
    println("El resultado es: "+resultado)
  }
}
