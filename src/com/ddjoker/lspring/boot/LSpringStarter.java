package com.ddjoker.lspring.boot;

public class LSpringStarter {

  private BeanLoader beanLoader;

  public LSpringStarter() {
    beanLoader = new BeanLoader();
  }

  public BeanLoader getBeanLoader() {
    return beanLoader;
  }

  public static void main(String[] args) {
    BBean bBean = new LSpringStarter().getBeanLoader().getBean(BBean.class);

    System.out.println(null != bBean.getaBean());
    System.out.println(null != bBean.getaBean().getcBean());
  }
}
