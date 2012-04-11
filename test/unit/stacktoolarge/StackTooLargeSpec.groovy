package stacktoolarge

class StackTooLargeSpec extends grails.plugin.spock.UnitSpec {
	def 'failure demonstration'() {
		given:
			mockDomain A
			mockDomain B
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

