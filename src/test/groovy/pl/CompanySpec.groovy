package pl

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CompanySpec extends Specification implements DomainUnitTest<CompanyEnt> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == true
    }
}
