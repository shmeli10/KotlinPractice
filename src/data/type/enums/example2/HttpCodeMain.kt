package data.type.enums.example2

fun main(args: Array<String>) {

}

// #1
// fun httpCodeToHttpMessage(code: HttpCode): String = code.name

// #2
fun httpCodeToHttpMessage(code: HttpCode): String =
        when (code) {
            HttpCode.OK -> "OK"
            HttpCode.BAD_REQUEST -> "Bad request"
            else -> "Unknown code"
        }

fun httpCodeToInternalCode(code: HttpCode): Int = code.ordinal

fun internalCodeToHttpCode(code: Int): HttpCode = HttpCode.values()[code]


fun httpMessageToHttpCode(msg: String): HttpCode = HttpCode.valueOf(msg)    // IllegalArgumentException

