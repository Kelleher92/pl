package pl

import grails.gorm.transactions.Transactional

@Transactional
class TestService {

    def index() {
        //def company = CompanyEnt.get(5)
        def company = CompanyEnt.findByName('iancode')
        company.name = 'iancom'
        company.save(failOnError: true)
        return company
    }
}
