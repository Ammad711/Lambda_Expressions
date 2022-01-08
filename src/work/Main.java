package work;

public class Main {
    public static void main(String[] args) {
        System.out.println("My System starts");
//        Runnable

//        MyInterface ob= new MyInterfaceImpl();
//        ob.sayHello();
//        MyInterface i=new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is first anonymous class");
//            }
//        };
//        i.sayHello();
//
//        MyInterface i2=new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is second anonymous class");
//            }
//        };
//        i2.sayHello();

        // Using our interface with help of lambda (Very important)
        // one way
//        MyInterface i=()->{
//            System.out.println("This is first time using lambda");
//        };
        // second way both same
        MyInterface i=()->System.out.println("This is first time using lambda");
        i.sayHello();

        MyInterface i2=()-> System.out.println("This is second time using lambda");
        i2.sayHello();

        SumInterface suminter=(int a , int b)->{
          return (a+b);
        };

        System.out.println(suminter.sum(5,6));
        System.out.println(suminter.sum(4,3));

        SumInterface suminter2=(a,b)-> a+b;

        System.out.println(suminter2.sum(3,4));

        LengthInterface lengthInterface=(str->str.length());
        System.out.println("length of string is "+lengthInterface.getlength("hello world"));



    }
}
