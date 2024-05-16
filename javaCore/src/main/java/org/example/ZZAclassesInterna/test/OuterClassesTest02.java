package org.example.ZZAclassesInterna.test;

public class OuterClassesTest02 {
    private String name = "Rafael";
    void print(){
        class  LocalClass{
            public void printLocal(){
                System.out.println(name);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {

        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print();

    }

}
