// grails-app/services/demo/HelperService.groovy
package demo

class HelperService {

    int getNumberOfPeople() {
        Person.count()
    }
}
