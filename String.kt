import kotlin.concurrent.fixedRateTimer

fun main() {
    var firstname: String = "Rohmat"
    var lastname: String = "Star"
    var fullname: String = firstname + " " + lastname

    var address: String = """
       -Jl. XYX No. 123
        -Banten - ID
    """.trimMargin(marginPrefix = "-")

    println(fullname)
}