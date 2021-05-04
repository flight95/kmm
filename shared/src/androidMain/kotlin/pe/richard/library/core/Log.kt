package pe.richard.library.core

actual object Log {

    actual fun e(tag: String, msg: String, throwable: Throwable?) {
        android.util.Log.e(tag, msg, throwable)
    }
}