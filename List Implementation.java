/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;
import java.util.*;
/**
 *
 * @author shsaini
 */

class ChangeStructure<T>{
    T obj;
    ChangeStructure(T obj){
        this.obj = obj;
    }
    T get_obj(){
        return this.obj;
    }
}

class listStructure {
    int capacity;
    Vector <ChangeStructure> arr = new Vector<ChangeStructure>(this.capacity);
    
    void addElement(ChangeStructure obj){
        if(this.arr.size() < this.capacity){
            this.arr.add(obj);
        }
    }
    
    void deleteElement(ChangeStructure obj){
        if(this.arr.size() != 0){
            this.arr.removeElement(obj);
        }
    }
    
    ChangeStructure retriveElement(int index){
        return this.arr.get(index);
    }
}

 class hacker {
        public static void main(String args[]) {
            String str = new String();
            str = "abc";
            ChangeStructure<String> st = new ChangeStructure<String>(str);
            listStructure ls = new listStructure();
            ls.capacity = 10;
            ls.addElement(st);

            int b = 5;
            Integer in = new Integer(b);
            
            ChangeStructure<Integer> it = new ChangeStructure<Integer>(in);
            ls.addElement(it);
            int ret = 1;
            if(ls.retriveElement(ret).get_obj() instanceof String){
               System.out.println((String)ls.retriveElement(ret).get_obj());
            }
            else{
                 System.out.println((Integer)ls.retriveElement(ret).get_obj());
            }
              
            
        }
    
}

