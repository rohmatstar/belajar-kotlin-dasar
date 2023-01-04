import kotlin.concurrent.fixedRateTimer

fun main() {
    var firstname: String = "Rohmat"
    var lastname: String = "Star"
    var fullname: String = "$firstname $lastname"
    var description: String = "Total $fullname char = ${fullname.length}"

    var address: String = """
       -Jl. XYX No. 123
        -Banten - ID
    """.trimMargin(marginPrefix = "-")

    println(fullname)
    println(description)
}