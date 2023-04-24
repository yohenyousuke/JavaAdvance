package record;

public class PersonTest{
    public static void main(String[] args) {
        Person[] Person ={
                new Person("ato","ato",20),
                new Person("ito","ito",40),
                new Person("uto","uto",19),
                new Person("eto","eto",15),
                new Person("oto","oto",24),
        };//変数の宣言だから「;」セミコロンがついてるよ。
        var a = Person[0].age();
        var b =Person[0].age();
        for (var i= 1; i<Person.length;i++){
            if(a>Person[i].age()){//年齢同士を比較するには、Person[i].age()にする。
                a=Person[i].age();
            }
            if(b<Person[i].age()){
                b=Person[i].age();
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
