package PractiseDomain

class B {
    String title
    //A aobj
   static belongsTo = [A,C]
    //static belongsTo = [abt: A]
    //static hasOne = [a: A]
    //static hasMany = [a: A]
    static constraints = {
    }
}
