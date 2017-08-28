package edu.byu.koapi.defn

/**
 * Created by jmooreoa on 6/30/17.
 */

class Info: Extensible() {
    var title: String? = null
    var version: String? = null
    var description: String? = null
    var termsOfService: String? = null
    var contact: Contact? = null
    var license: License = APACHE_2_LICENSE

    fun contact(init: Contact.() -> Unit) {
        val contact = Contact()
        contact.init()
        this.contact = contact
    }

    fun license(init: License.() -> Unit) {
        val l = License()
        l.init()
        this.license = l
    }
}

class License(
        var name: String = "",
        var url: String = ""
) : Extensible()

val APACHE_2_LICENSE = License("Apache 2.0", "https://www.apache.org/licenses/LICENSE-2.0")

class Contact(
) : Extensible() {
    var name: String? = null
    var url: String? = null
    var email: String? = null
}
