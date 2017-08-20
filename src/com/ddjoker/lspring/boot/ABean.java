package com.ddjoker.lspring.boot;

public class ABean {
  private String name ;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private CBean cBean;

  public CBean getcBean() {
    return cBean;
  }

  public void setcBean(CBean cBean) {
    this.cBean = cBean;
  }
}
