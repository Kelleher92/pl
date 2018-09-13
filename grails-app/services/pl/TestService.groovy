package pl

import grails.gorm.transactions.Transactional

@Transactional
class TestService {

    def index() {
        return [
                'fromService': 'hi'
        ]
    }
}
