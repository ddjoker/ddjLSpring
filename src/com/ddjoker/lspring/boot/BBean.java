package com.ddjoker.lspring.boot;

public class BBean {

  private String name;
  private ABean aBean;

  public String getName() {
    return name;
  }

  public ABean getaBean() {
    return aBean;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setaBean(ABean aBean) {
    this.aBean = aBean;
  }
}
