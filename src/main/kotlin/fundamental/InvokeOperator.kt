package fundamental

import org.w3c.dom.html.HTMLElement
import java.lang.Exception
import java.security.Provider.Service
import javax.management.loading.ClassLoaderRepository
import javax.print.attribute.standard.MediaSize.Other

class InvokeOperator {

    private val elements = mutableListOf<HtmlElement>()

    operator fun invoke(block: InvokeOperator.() -> Unit): InvokeOperator {
        this.block()
        return this
    }

    fun element(tag: String, content: String) {
        val htmlElement = HtmlElement(tag, content)
        elements.add(htmlElement)
    }

    override fun toString(): String {
        return elements.joinToString("\n") { it.toString() }
    }
}

data class HtmlElement(val tag: String, val content: String) {
    override fun toString(): String {
        return "<$tag>$content</$tag>"
    }
}

fun main() {
    val invokeOperator = InvokeOperator()

    invokeOperator {
        element("div", "hello")
        element("p", "world !!")
        element("a", "Click me")
    }
    println(invokeOperator)

    val f1 = MathFunction(listOf(1.0, 2.0, 3.0))
    val f2 = MathFunction(listOf(0.5, -1.0, 2.0))
    println("Function f1(x): $f1")
    println("Function f2(x): $f2")

    val sumFunction = f1 + f2
    println("sum of f1(x) and f2(x) : $sumFunction")

    val xValue = 2.0
    val result = sumFunction(xValue)
    println("result for x = $xValue: $result")


    val userRepository = UserRepository()
    val authService = AuthService()
    val autheticateUser = AuthenticateUserUseCase(userRepository,authService)
    val resultAuth = autheticateUser("john doe","passowrd")


}

class MathFunction(private val coefficients: List<Double>) {
    operator fun invoke(x: Double): Double {
        return coefficients.foldIndexed(0.0) { index, acc, coeff ->
            acc + coeff * Math.pow(x, index.toDouble())
        }
    }

    operator fun plus(other: MathFunction): MathFunction {
        val resultCoefficient = mutableListOf<Double>()
        val maxDegree = maxOf(coefficients.size, other.coefficients.size)
        for (i in 0 until maxDegree) {
            val coeff1 = if (i < coefficients.size) coefficients[i] else 0.0
            val coeff2 = if (i < other.coefficients.size) other.coefficients[i] else 0.0
            resultCoefficient.add(coeff1 + coeff2)
        }
        return MathFunction(resultCoefficient)
    }

    override fun toString(): String {
        val terms = coefficients.mapIndexed { index, coeff ->
            if (index == 0) "$coeff" else "${coeff}x^$index"
        }
        return terms.joinToString(" + ")
    }

}

class AuthenticateUserUseCase(
    private val userRepository: UserRepository,
    private val authService: AuthService
) {
    operator fun invoke(username: String, password: String): Result<Boolean> {
        val user = userRepository.getUserByUserName()
        return if (user != null && authService.authenticate(user, password)) {
            Result.success(true)
        } else {
            Result.failure(Exception("Authentication failure"))
        }
    }
}

class AuthService {
    fun authenticate(user: String, password: String): Boolean {
        return true
    }

}

class UserRepository {
    fun getUserByUserName(): String {
        return "User"
    }

}
/*
1- function like syntax= it provides a way to treat an object as if it were a function allowing you
to use a function-like syntax when working with instance of a class
2- conciseness = it can make your code more concise and readable especially in scenarios where the primary
purpose of an object is to perform some operation
3- DSLs = the invoke operator is often used in the creation of DSL's , this allows you to design API's
that resembles  a natural language or a specific domain , making your code more expressive
4- Flexibility = it gives you the flexibility to design classes that can be called in  a way
that makes sense for the specific context of your application
 */