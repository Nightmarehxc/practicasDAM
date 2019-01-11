//actividad 1.1
//Diseña un algoritmo que calcule el valor absoluto de un numero.

using System;

public class Example
{
   public static void Main()
   {
      short[] values = { Int16.MaxValue, 10328, 0, -1476, Int16.MinValue };
      foreach (short value in values)
      {
         try {
            Console.WriteLine("Abs({0}) = {1}", value, Math.Abs(value));
         }   
         catch (OverflowException) {
            Console.WriteLine("No se puede calcular el valor de  {0}.",
                              value);
         }
      }
   }
}

//Daniel Camarero 
