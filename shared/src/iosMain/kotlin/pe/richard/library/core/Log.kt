package pe.richard.library.core

actual object Log {

    actual fun e(tag: String, msg: String, throwable: Throwable?) {
        println("E/$tag: $msg")
        throwable?.printStackTrace()
    }
}