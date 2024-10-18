package _01_reflection;

public class testReflection {
    private String  name;

    private void someMethod(){
        System.out.println("Hello!!!");
    }

    private void methodWithArgs(String str){
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "testReflection{" +
                "name='" + name + '\'' +
                '}';
    }
}
