// test/unit/demo/SomeHelperSpec.groovy
package demo

import spock.lang.Specification

@Mock(Person)
class SomeHelperSpec extends Specification {

    void "test gorm method"() {
        given:
        def helper = new SomeHelper()

        expect:
        helper.numberOfPeople == 0
    }
}
