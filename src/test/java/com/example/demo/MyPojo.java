package com.example.demo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Message")
public class MyPojo
{

  private Message Message;

  public Message getMessage ()
  {
    return Message;
  }

  public void setMessage (Message Message)
  {
    this.Message = Message;
  }

  @Override
  public String toString()
  {
    return "ClassPojo [Message = "+Message+"]";
  }
}
