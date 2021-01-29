package basics

object Functions extends App {

  def aFunction(a:String, b:Int):String = {
    a + " " + b;
  }

  println(aFunction("Hello", 32))

  def aParameterlessFunction():String = "aParameterlessFunction"
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  //  WHEN YOU NEED LOOP, IN SCALA. USE RECURSION
  def aRepeatFunction(aString:String, bInt:Int):String = {
    if(bInt == 1) aString
    else aString + " > "+ aRepeatFunction(aString, bInt-1);
  }

  println(aRepeatFunction("Hello",3))

  def aBigFunction(n:Int):Int = {
    def aSmallFunction(a:Int, b:Int) = a + b;

    aSmallFunction(n, n-1)
  }

  println(aBigFunction(10));

  def greeting(name:String, age:Int):String = {
    "Hi my name is " + name + " and I am " + age + " years old."
  }

  println(greeting("John", 12));

  def factorial(n: Int): Int = {
    if (n <=0 ) 1
    else n * factorial(n-1)
  }

  println(factorial(5))

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  println(fibonacci(8))

  def isPrime(n:Int): Boolean = {
    def isPrimeUntil(t:Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37+17))
}
