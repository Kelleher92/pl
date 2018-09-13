package pl

import grails.converters.JSON

class TestController {
    def testService

    def index() {
        def response = testService.index()

        render response as JSON
    }

    def count() {
        def response = [
                '1' : 'one',
                '2' : 'two'
        ]

        render response as JSON
    }
}
