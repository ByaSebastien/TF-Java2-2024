package demoAnnotation;

public class DemoAnnotation {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Class<MyClass> valueClass = MyClass.class;
        if(valueClass.isAnnotationPresent(MyAnnotation.class)){
            System.out.println("Ma class est annoté");
        }
    }
}
