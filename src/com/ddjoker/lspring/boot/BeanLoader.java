package com.ddjoker.lspring.boot;

public class BeanLoader {

  private BeanContainer beanContainer = null;

  public BeanLoader() {
    beanContainer = new BeanContainer();

    try {
      loadBean();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void registryBeans() throws Exception {

    beanContainer.registryBean(ABean.class);
    beanContainer.registryBean(BBean.class);
    beanContainer.registryBean(CBean.class);
  }


  private void consturctorBean() throws Exception {

    beanContainer.getBean(BBean.class).setaBean(beanContainer.getBean(ABean.class));
    System.out.println(ABean.class.getName() + " has be set into " + BBean.class.getName());
    beanContainer.getBean(ABean.class).setcBean(beanContainer.getBean(CBean.class));
    System.out.println(CBean.class.getName() + " has be set into " + ABean.class.getName());
  }

  public  <T> T getBean(Class<T> classes) {
    try {
      return beanContainer.getBean(classes);
    } catch (Exception e) {
      return null;
    }
  }


  private void loadBean() throws Exception {
    registryBeans();
    consturctorBean();

  }

}
