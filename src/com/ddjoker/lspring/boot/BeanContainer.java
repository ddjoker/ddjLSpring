package com.ddjoker.lspring.boot;

import java.util.HashMap;
import java.util.Map;

public class BeanContainer {
  private Map<String,Object> map = new HashMap<>();

  public void registryBean(Class classes) throws Exception {
    try {
      map.put(classes.getSimpleName(),classes.newInstance());
      System.out.println(classes.getName() +" has been registry with name "+ classes.getSimpleName());
    }catch (Exception e ){
      throw new Exception("Bean "+classes.getSimpleName()+ " registry error ."+e.getMessage());
    }
  }
  public <T> T getBean(Class<T> classes) throws Exception{
    try {
      if(map.get(classes.getSimpleName()) == null)
        throw new NullPointerException();
      return (T)map.get(classes.getSimpleName());
    }catch (NullPointerException e ){
      throw new Exception("Bean "+classes.getSimpleName()+ " Can not be found .");
    }catch (ClassCastException e ){
      throw new Exception("Bean "+classes.getSimpleName()+ " is not a "+ classes.getName());
    }
  }

}
