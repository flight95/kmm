package pe.richard.shared

import pe.richard.library.domain.DomainMockup

class Greeting {

    private val domain: DomainMockup = DomainMockup()

    fun greeting(): String {
        domain.print()
        return "Hello, ${Platform().platform}!"
    }
}
