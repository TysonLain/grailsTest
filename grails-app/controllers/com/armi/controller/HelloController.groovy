package com.armi.controller

import helloworld.SimpleService

class HelloController {

    SimpleService simpleService

    def index() {
       def p =  simpleService.listPerson()
        render p
    }

    def create() {
        def p =  simpleService.createPerson()
        render p
    }

    def test() {
        render 'test'
    }
}
