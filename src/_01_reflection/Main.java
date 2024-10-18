package _01_reflection;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //для приватного поля
        var obj = new testReflection();
        Field field = obj.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(obj, "some value");
        System.out.println(obj);

        // для приватного методжа
        var method = obj.getClass().getDeclaredMethod("someMethod");
        method.setAccessible(true);
        method.invoke(obj,null);

        var method1 = obj.getClass().getDeclaredMethod("methodWithArgs",String.class);
        method1.setAccessible(true);
        method1.invoke(obj,new String[]{"qwerti"});

    }
}
