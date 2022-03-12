package com.simplilearn.fileHandle;

import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class fileMechDemo {
	
	public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	      lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
	    }
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace();
	    } 
	    return lines;
	  }
	  public static void main(String[] args) {
		  
		  List<String> l  = readFileInList("c://temp//testFile2.txt"); 
	  
		  Iterator<String> itr = l.iterator(); 
		  while (itr.hasNext()) 
	      System.out.println(itr.next()); 
	  } 

}

