package pl

import grails.converters.JSON

class AdminController {
    def login() {
        if(request.method == 'POST') {
            def jsonObject = request.JSON
            String username = jsonObject.username
            String password = jsonObject.password

            def response = username+password

            render response as JSON

        }
        else {

        }
    }
}