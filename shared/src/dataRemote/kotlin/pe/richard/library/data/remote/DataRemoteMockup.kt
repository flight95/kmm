package pe.richard.library.data.remote

import pe.richard.library.core.Log
import pe.richard.library.data.core.DataCoreMockup

class DataRemoteMockup(
    private val core: DataCoreMockup = DataCoreMockup()
) {
    fun print() {
        Log.e("DataRemoteMockup", "print", IllegalStateException())
        core.print("DataRemoteMockup")
    }
}