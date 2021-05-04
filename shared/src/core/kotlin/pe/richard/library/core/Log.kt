package pe.richard.library.core

expect object Log {
    fun e(tag: String, msg: String, throwable: Throwable? = null)
}