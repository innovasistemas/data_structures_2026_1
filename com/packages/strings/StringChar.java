package com.packages.strings;

public class StringChar 
{
    String text;

    public StringChar()
    {
        text = "";
    }

    public StringChar(String text)
    {
        this.text = text;
    }

    public String getText() 
    {
        return text;
    }

    public void setText(String text) 
    {
        this.text = text;
    }

    public int lengthString()
    {
        return this.text.length();
    }

    public String upperString()
    {
        return this.text.toUpperCase();
    }
    
    public String lowerString()
    {
        return this.text.toLowerCase();
    }
    


}
