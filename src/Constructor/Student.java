package Constructor;

public class Student {
    int id;
    String name;

    Student(){

    }
    Student(int id){
        this();
        this.id = id;
    }
    Student(int id, String name){
        this(id);
        this.id = id;
        this.name = name;
    }
}

//Constructor Chaining is process of callimh one Constructor into another Constructor.
//It can be achieve by 2 typees:
// 1. this() calling statement.
// 2. super() calling statement.

// this() is use to call constructor in same class constructor.
//It is written in first line of constructor.
// LOI is removed.
// it can only be used in Constructor