// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton {
    
    private static Singleton instance;
    public String str = "hello world";
   
    private Singleton() {}
    
    public static Singleton getSingleInstance()
    {
    if (instance == null)
    {
      instance = new Singleton();
    }
    return instance; 
  }

}
