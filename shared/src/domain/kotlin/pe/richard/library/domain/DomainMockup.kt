package pe.richard.library.domain

import pe.richard.library.core.Log
import pe.richard.library.data.DataMockup

class DomainMockup(
    private val data: DataMockup = DataMockup()
) {
    fun print() {
        Log.e("DomainMockup", "print", IllegalStateException())
        data.print()
    }
}
