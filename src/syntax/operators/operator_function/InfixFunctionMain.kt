package syntax.operators.operator_function

enum class HttpCodeInfix(val code: Int)
/* : Comparable<HttpCode> */ {
    OK(200),
    BAD_REQUEST(400),
    FORBIDDEN(403),
    I_AM_A_TEAPOT(418) {
        override fun isOfficial() = false
    },
    INTERNAL_SERVER_ERROR(500);

    open fun isOfficial() = true

    operator fun rangeTo(other: HttpCode) = HttpCode.values().slice(ordinal..other.ordinal)

    // Infix Function
    infix fun until(other: HttpCode) = HttpCode.values().slice(ordinal..other.ordinal - 1)
}