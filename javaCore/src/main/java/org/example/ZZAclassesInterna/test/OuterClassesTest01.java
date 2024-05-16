package org.example.ZZAclassesInterna.test;

public class OuterClassesTest01 {
    private String name = "Rafael";
    class Inner{
        public void printOuterAttribute(){
            OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();
            System.out.println(name);
            System.out.println(this);
        }

    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();
        System.out.println("type your name");
        outerClassesTest01.name = "JOSE";
        System.out.println("Click the button if you want to display the name");
        if(true){
            Inner inner = outerClassesTest01.new Inner();
            inner.printOuterAttribute();
        }


    }

}
