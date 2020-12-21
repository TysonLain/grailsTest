package helloworld


class Person {
    String name   //db欄位
    Integer age
    Date lastVisit

    static mapping = {
        table 'person'
        id column: 'id', generator: 'sequence'
        version false
        autoTimestamp false
        name column: 'name'
        age column: 'age'
        lastVisit column:'lastVisit'
    }

    static constraints = {
    }
}
