package helloworld

import grails.gorm.transactions.Transactional


@Transactional
class SimpleService {

    @Transactional(readOnly = true)
    def listPerson() {
        Person.list()
    }

    @Transactional
    def createPerson() {
        def p = new Person(name: "熊", age: 20, lastVisit: new Date())
        p.save()
    }

}
