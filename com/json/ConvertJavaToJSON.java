package com.json;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJavaToJSON {
	public static void main(String[] a) 
    { 
  
        // Creating object of Doctor 
        Doctor doc = new Doctor(); 
  
        // Insert the data into the object 
        doc = getObjectData(doc); 
  
        // Creating Object of ObjectMapper define in Jakson Api 
        ObjectMapper Obj = new ObjectMapper(); 
  
        try { 
  
            // get Doctor object as a json string 
            String jsonStr = Obj.writeValueAsString(doc); 
  
            // Displaying JSON String 
            System.out.println(jsonStr); 
        } 
  
        catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
  
    // Get the data to be inserted into the object 
    public static Doctor getObjectData(Doctor doc) 
    { 
        // Insert the data
    	doc.setDoctor_id(1234);
    	doc.setFirst_name("Andy"); 
    	doc.setLast_name("Murray");
    	doc.setSpecialization("Neurologist"); 
    	doc.setGender('M');
  
        // Return the object 
        return doc; 
    } 
}
