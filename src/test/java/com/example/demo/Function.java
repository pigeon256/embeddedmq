package com.example.demo;

public class Function
{
  private ResultItem resultItem;

  private String name;

  private String order;

  public ResultItem getResultItem ()
  {
    return resultItem;
  }

  public void setResultItem (ResultItem resultItem)
  {
    this.resultItem = resultItem;
  }

  public String getName ()
  {
    return name;
  }

  public void setName (String name)
  {
    this.name = name;
  }

  public String getOrder ()
  {
    return order;
  }

  public void setOrder (String order)
  {
    this.order = order;
  }

  @Override
  public String toString()
  {
    return "ClassPojo [resultItem = "+resultItem+", name = "+name+", order = "+order+"]";
  }
}
