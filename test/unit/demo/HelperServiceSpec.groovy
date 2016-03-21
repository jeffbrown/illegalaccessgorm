// test/unit/demo/HelperServiceSpec.grovy

package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(HelperService)
@Mock(Person)
class HelperServiceSpec extends Specification {


    void "test gorm method"() {
        expect:
        service.numberOfPeople == 0
    }
}
