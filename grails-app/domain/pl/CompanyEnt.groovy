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
    int companyId
    String name
    String email
    String number
    String blurb
    String password
    String address
    String geoCoor
    String logo
    String status
    Boolean isActivated
    String tempActivationToken
    String tokenSent
    Boolean isActivationTokenExpired
    String tempResetToken
    String resetTokenSent
    Boolean isResetTokenExpired
    int version

}