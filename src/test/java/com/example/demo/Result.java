package com.example.demo;

public class Result
{
  private String recordNumber;

  private Function function;

  public String getRecordNumber ()
  {
    return recordNumber;
  }

  public void setRecordNumber (String recordNumber)
  {
    this.recordNumber = recordNumber;
  }

  public Function getFunction ()
  {
    return function;
  }

  public void setFunction (Function function)
  {
    this.function = function;
  }

  @Override
  public String toString()
  {
    return "ClassPojo [recordNumber = "+recordNumber+", function = "+function+"]";
  }
}

