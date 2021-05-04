package pe.richard.library.data.cache

import pe.richard.library.core.Log
import pe.richard.library.data.core.DataCoreMockup

class DataCacheMockup(
    private val core: DataCoreMockup = DataCoreMockup()
) {
    fun print() {
        Log.e("DataCacheMockup", "print", IllegalStateException())
        core.print("DataCacheMockup")
    }
}