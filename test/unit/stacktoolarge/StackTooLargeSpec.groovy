package stacktoolarge

import grails.test.mixin.*
import spock.lang.*

@TestFor(A)
@Mock([B])
class StackTooLargeSpec extends Specification {
	def 'failure demonstration'() {
		when:
			def a = new A(name:'a', bees: [new B(date:new Date(), inthing:true, string:'12345')])
		then:
			a.validate()
		when:
			a.addToBees(new B())
		then:
			true
	}
}

