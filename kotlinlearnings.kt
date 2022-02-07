// Example: Hello World
package basics

fun main() {
  println("Hello World!")
}


// Lecture 1: Variables
// In Kotlin, there are two keywords for declaring a variable: "var" and "val". Vars are mutable variables, which means they can be reassigned.
// Vals, however are immutable. If you know Java, there the keyword "final" has the same effect.
// Note that despite the fact that Kotlin is statically typed, you dont have to declare a type as long as the compiler can infer it. 
// Example: 
package basics

fun main() {
  // Mutable
  var x = 1
  x = 5
  // Immutable
  val y = 2
  // This is not possible: y = 3
  print(x)  // 5
  print(y)  // 2
}


// Lecture 2: Strings
// Strings can be assigned using String literals *"* as in the first example. 
// Further, you can iterate over the chars inside a String with a for-in loop and the third example illustrates String concatenation with "+".
// Finally, Kotlin has string templates, which means you can access variables inside Strings as in JS. The last example shows how this is done.
// Example:
package basics

fun main() {
  // String
  val sl = "Hi"
  
  // Iterating over it
  for (c in sl) {
    println(c)        
  }
  
  // Concatenation
  val s2 = s1 + "!"
  println(s2)
  
  // String templates
  val i = 3
  val s3 = "${i}rd String"
  println(s3)         
}
// H
// i
// Hi!
// 3rd String


// Lecture 3: Booleans
// Similar to other programming languages, Booleans can be either true or false. Further, there are conjunction (logical and) and disjunction (logical or).
// Both can be evaluated normally or lazy. Normal means, the expressions are evaluated completely.
// Lazy, however, means that expressions are only evaluated until the evaluation of the expression is clear.
// That is, for an conjunction, if the first expression evaluates to false, the overall expression cannot evaluate to true anymore and hence is not evaluated further.
// The result is false. Analogously, if the first expression of a disjunction evaluates to true the overall expression cannot evaluate to false anymore and hence is not evaluated further.
// The result is true. Ofc both cases can be genneralized for more complex boolean expressions.
// Example:
package basics

fun main() {
  // Boolean
  val t = true
  val f = false
  
  // Conjunction
  println(t.and(f))     // false
  // Lazy Conjunction
  println(t && f)       // false
  
  // Disjunction
  println(t.or(f))      // true
  // Lazy Disjunction
  println(t || f)       // true
}


// Lecture 4: Two further methods for Booleans
// Negation and XOR
// Negation can be done in two ways. Either by using the "not" method or by using the "!" operator. For XOR there is a method called "xor".
// Example:
package basics

fun main() {
  // Boolean
  val t = true
  val f = false
  
  // Negation
  println(t.not())      // false
  println(!f)           // true
  
  // Xor
  println(t.xor(f))      // true
}


// Lecture 5: Integers
// As in other programming languages, integer values can be assigned to variables.
// One special thing is that you can use underscore "_" to make the numbers more readable (see oneMillion).
// Basic operations, such as addition, subtraction, multiplication and division, are available via the operators +, -, /, *
// Example:
package basics

fun main() {
  // Integer
  val one = 1
  val two = 2
  val oneMillion = 1_000_000
  
  // Operators
  println(one + two)              // 3
  println(oneMillion - one)       // 999999
  println(two * oneMillion)       // 2000000
  println(oneMillion / two)       // 500000
}


// Lecture 5: Doubles
// Doubles have a primitive a type and are the standard representation for floating point numbers in Kotlin.
// As with Integers, you can use underscores '_' to make the numbers more readable.
// Basic operations, such as addition, substraction, multiplication and division, are available via the operators +, -, *, /
// Example:
package basics

fun main() {
  // Double
  val x = 1.25
  val y = 5.0
  val z = 1_000_000.0
  
  // Operators
  println(x + y)       // 6.25
  println(y - x)       // 3.75
  println(z * x)       // 1250000.0
  println(z / y)       // 200000.0
}


// Lecture 6: Arrays
// Arrays are ordered, constant-sized sets of elements. Double and Integer arrays can be crated with the corresponding utility function.
// With the "reversedArray" function, you can reverse an array. Further, you can use for-in loops to iterate over the elements of an array.
// The indexOf method return the index of an element inside an array. You can use the index operator"[...]" to access the elements of an array.
// Finally, "size" returns the number of elements of the array (3 in this example)
// Example:








