package lesson9.MyService;
//Придумать и написать собственную аннотацию @Version, которая бует хранить информацию о версии класса сервиса
// (поле обязательное) MyService и кодовое название версии (поле не обязательное) - (например номер версии = 7.1,
// а кодовое название версии = Nougat).

//Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию, get и set методы,
// переопределенные методы equals и hashcode, а так же private метод (private thisClassInfo),
// который будет просто печатать данные о самом классе (данные любые на ваш выбор), в котором он определен.

//Написать программу, которая будет анализировать присутствие аннотации над классом MyService и если она
// присутствует - создавать экземпляр этого класса, задавать значения его полям и вызывать метод thisClassInfo
// (использовать возможности пакета reflection).

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationRunner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        inspectService(MyService.class);
    }

    static void inspectService(Class<?> serviceClass) throws IllegalAccessException, InvocationTargetException {
        if (serviceClass.isAnnotationPresent(Version.class)) {
            Version ver = (Version) serviceClass.getAnnotation(Version.class);
            System.out.println(ver);
            MyService service = new MyService();
            service.setFirstValue(1);
            service.setSecondValue(2);
            Method[] methods = serviceClass.getDeclaredMethods();
            for (Method m : methods) {
                if (m.getAnnotation(MethodService.class) != null) {
                    if (m.getAnnotation(MethodService.class).value() == true) {
                        m.setAccessible(true);
                        m.invoke(service, null);
                    }
                }
            }
        }
    }
}
