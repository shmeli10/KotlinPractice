package data.type.classes.type.enum_class.example2

enum class HttpCode(val code: Int)
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

    infix fun until(other: HttpCode) = HttpCode.values().slice(ordinal..other.ordinal - 1)
}