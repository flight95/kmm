package pe.richard.library.data.core

import pe.richard.library.core.Log

class DataCoreMockup {
    fun print(from: String) {
        Log.e("DataCoreMockup", "print < $from", IllegalStateException())
    }
}
