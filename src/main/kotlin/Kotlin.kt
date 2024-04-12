@file:Suppress("UNUSED_EXPRESSION", "DANGEROUS_CHARACTERS")

val `THIS IS KOTLIN` = """

                ______                         _        _   _             
                | ___ \                       | |      | | (_)            
                | |_/ / __ ___  ___  ___ _ __ | |_ __ _| |_ _  ___  _ __  
                |  __/ '__/ _ \/ __|/ _ \ '_ \| __/ _` | __| |/ _ \| '_ \ 
                | |  | | |  __/\__ \  __/ | | | || (_| | |_| | (_) | | | |
                \_|  |_|  \___||___/\___|_| |_|\__\__,_|\__|_|\___/|_| |_|
                                                                          
                                                                          
                                        _____           _                         
                                       /  __ \         | |                        
                             __ _ ___  | /  \/ ___   __| | ___                    
                            / _` / __| | |    / _ \ / _` |/ _ \                   
                           | (_| \__ \ | \__/\ (_) | (_| |  __/                   
                            \__,_|___/  \____/\___/ \__,_|\___|                   
                                                              
"""

class `info and timeline` {
    val info = """
        
    * JVM based
    * by JetBrains
    * statically typed / multi-paradigmatic / TIOBE #17

    ---

    development
      begins                       Kotlin 1.0                           Kotlin 2.0.0-RC1
         |                             |                                       |
       2010                           2016                                 2020/04/09
         |         |         |         |         |         |         |         |
         -----------------------------------------------------------------------
              |         |         |         |         |         |         |
             2011                                    2019
              |                                       |
          official                          official recommendation
        announcement                        for Android development

    """
}

class functions {
    val `simple java function` = """
        
    public String hello(String name) {
        return "Hello " + name;
    }

    """

    // let's try it in Kotlin

    class Help {
        fun hello(name: String): String {
            return "Hello $name";
        }

        fun helloShort(name: String) = "Hello $name"
    }
}

class classes {
    val `classes in java` = """
        
    public class Foo {

    }

    public class Bar {

        private final int baz;

        public Bar(int baz) {
            this.baz = baz;
        }

        public int getBaz() {
            return baz;
        }

    }

    """

    // let's try it in Kotlin

    class Help {
        class Foo
        class Bar(val baz: Int)
    }

}

class `null safety - yes really` {
    val `tony hoare (2009)` = """
        I call it my billion-dollar mistake. It was the invention of the null reference in 1965. At that time, I was designing the first comprehensive type system for references in an object oriented language (ALGOL W). My goal was to ensure that all use of references should be absolutely safe, with checking performed automatically by the compiler. But I couldn't resist the temptation to put in a null reference, simply because it was so easy to implement. This has led to innumerable errors, vulnerabilities, and system crashes, which have probably caused a billion dollars of pain and damage in the last forty years.
    """

    val notes = { dyn inf def }

    class `void safe languages`(real:ly?) {
        fun early() { ""; """"
            * Self
            * Eiffel
            * Ceylon
        """ }
        fun retroactively() { ""; """"
            * TypeScript
            * C#
            * Dart
        """ }
        fun byDefault() { ""; """"
            * Swift
            * Rust
            * Kotlin
        """ }
    }

    val `go to Java` = ExampleNullSafety()
    val `and now in Kotlin` = { ecosystem: Ecosystem ->

        ecosystem.alternatives?.propositions?.getOrNull(0)?.value

    }

    val `null safe syntax` = {

        var `cannot be null`: String = "hi"

        val `may be null`: String? = null

        `cannot be null` = `may be null` ?: "elvis rocks"
    }

}

class immutability {

    val _1 = {

        val `means immutable` = "cannot be reassigned"
        // `means immutable` = "oops"

    }

    val _2 = {

        var `means mutable` = "can be reassigned"
        `means mutable` = "as demonstrated"

        val _1 = "you don't need an explicit modifier to make something 'final'"

        val _2 = "function arguments are always final"

    }

    val _3 = {

        class `classes are closed`

        open class `unless open`

        class `let's give it a try`  //: `classes_are_closed`()

    }

    val _4 = {

        // about collections...
        val list = listOf("1", "2", "3")
        // list.add("oops")

        // let's try something mutable below
        // val mutableSmth:

    }

}

class `primitive obsession` {

    fun updateData(firstName: String, lastName: String, address: String, city: String) { /* do smth */ }

    val name = "Pflugradt"
    val vorname = "Christian"
    val anschrift = "some street no 123"
    val ort = "Weddelbrook"

    val action = {

    }

    val notes = { namdef vali ext }

    class `let's talk a bit about (extension) functions` {
        val info = """
            
        * any existing Kotlin class can be extended
        * any existing Java class can be extended
        * this includes classes from standard library and third party packages
        * extension functions can be private, to a file e.g.
        * extension functions can be inherited
        * similar concepts exist in many dynamic languages, also in Swift, C#, Scala
            
        """
    }

    class Help {
        val h = """
        typealias Name = String

        @JvmInline value class Address(val value: String)
        fun String.toAddress() = Address(this)
            
        fun updateData(firstName: FirstName, lastName: LastName, address: String, city: String) { /* do smth */ }

        val name: LastName = "Pflugradt".toLastName()
        val vorname: FirstName = "Christian"
        val anschrift = "some street no 123"
        val ort = "Weddelbrook"

        fun String.toLastName() = LastName(this)
        fun LastName.asString() = this.value

        val action = {

            updateData(firstName = vorname, lastName = name, address = anschrift, city = ort)

        }"""
    }

}

class `domain specific languages` {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            `domain specific languages`().`fun with blocks`()
        }
    }

    fun `fun with blocks`() {

        val number1 = 10
        val number2 = 10

        If (number1 == number2) {
            println("numbers are the same")
        } Else {
            println("numbers are different")
        }

    }

}

class `but what about java???` {
    val j = JAVA()
}

class `what's next` {
    val `stuff to look out for` = """
    
    https://kotlinlang.org/docs/basic-types.html
    
    * Context Receivers
    * Coroutines
    * Data Classes
    * Delegation
    * Destructuring
    * Migration: Java -> Kotlin
    * KProperties
    * Object Expressions
    * Operator Overloading
    * Pattern Matching
    * Scope Functions
    * Reified Types
    * Tail Recursion
    * This Expressions
    
    """
}
