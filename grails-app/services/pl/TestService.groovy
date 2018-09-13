package pl

import grails.gorm.transactions.Transactional

@Transactional
class TestService {

    def index() {
        def company = CompanyEnt.get(5)
        company.name = 'iancode'
        company.save(failOnError: true)
        return company
    }
}