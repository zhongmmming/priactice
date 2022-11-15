package com.shuai.cofig_fatory;

import com.shuai.factorymethod.Coffee;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

    private static Map<String, Coffee> map = new HashMap<>();

    static {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("Bean.properties");
        try {
            p.load(is);
            //遍历Properties
            Set<Object> keys = p.keySet();
            for (Object key:keys
                 ) {
                String className = p.getProperty((String) key);
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                map.put((String) key,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Coffee createCoffee(String name){
        return map.get(name);
    }


}
