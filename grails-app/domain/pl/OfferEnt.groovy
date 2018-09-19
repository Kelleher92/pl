package pl

class OfferEnt {
    static mapping = {
        table 'offer'
        id column: 'id'
        id generator: 'uuid'
    }

    static constraints = {

    }

    int id
    String companyId
    String offerName
    String requirements
    String expiryDate

}
