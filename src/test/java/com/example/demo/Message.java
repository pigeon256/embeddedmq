package com.example.demo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Message")
public class Message
{
  private String Id;

  private Result Result;

  public String getId ()
  {
    return Id;
  }

  public void setId (String Id)
  {
    this.Id = Id;
  }

  public Result getResult ()
  {
    return Result;
  }

  public void setResult (Result Result)
  {
    this.Result = Result;
  }

  @Override
  public String toString()
  {
    return "ClassPojo [Id = "+Id+", Result = "+Result+"]";
  }
}
