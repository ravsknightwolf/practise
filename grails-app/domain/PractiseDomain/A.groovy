package PractiseDomain

class A {
    String name
   //B bobj
    //static belongsTo = [bbt: B]
    //static hasOne = [bho: B]
    static hasMany = [b: B]
    static constraints = {
    }
    static  mapping = {
        //b cascade: "all-delete-orphan"
        //bho unique: true
    }
}
