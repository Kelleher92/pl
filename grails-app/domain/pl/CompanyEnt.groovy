package pl

class CompanyEnt {
    static mapping = {
        table 'company'
        id column: 'id'
        id generator: 'uuid'
    }

    static constraints = {

    }

    int id
    String name

}
