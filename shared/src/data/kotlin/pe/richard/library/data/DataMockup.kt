package pe.richard.library.data

import pe.richard.library.core.Log
import pe.richard.library.data.cache.DataCacheMockup
import pe.richard.library.data.core.DataCoreMockup
import pe.richard.library.data.remote.DataRemoteMockup

class DataMockup(
    private val core: DataCoreMockup = DataCoreMockup(),
    private val cache: DataCacheMockup = DataCacheMockup(),
    private val remote: DataRemoteMockup = DataRemoteMockup()
) {
    fun print() {
        Log.e("DataMockup", "print", IllegalStateException())
        core.print("DataMockup")
        cache.print()
        remote.print()
    }
}
