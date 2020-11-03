package com.example.demo;

public class ResultItem
{
  private Property property;

  private String id;

  private String type;

  public Property getProperty ()
  {
    return property;
  }

  public void setProperty (Property property)
  {
    this.property = property;
  }

  public String getId ()
  {
    return id;
  }

  public void setId (String id)
  {
    this.id = id;
  }

  public String getType ()
  {
    return type;
  }

  public void setType (String type)
  {
    this.type = type;
  }

  @Override
  public String toString()
  {
    return "ClassPojo [property = "+property+", id = "+id+", type = "+type+"]";
  }
}
