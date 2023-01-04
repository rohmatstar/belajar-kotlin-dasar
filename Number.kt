fun main() {
    //integer
    var age: Byte = 57
    var height: Int = 120
    var distance: Short = 5_000
    var balance: Long = 5_000_000_000L //L is sign for Long Data Type

    //floating number
    var value: Float = 28.26F //F is sign for Float Data Type
    var radius: Double = 38_734_834.87383832

    //literals
    var decimalLiteral: Int = 200 //Default
    var hexaLiteral: Int = 0xFA659C //0x is sign for hexadecimal number
    var binaryLiteral: Int = 0b00101010010

    println(distance)
    println(balance)//will print hexa number in decimal type (16410012)
    println(radius)//will print binary number in decimal type (338)
}