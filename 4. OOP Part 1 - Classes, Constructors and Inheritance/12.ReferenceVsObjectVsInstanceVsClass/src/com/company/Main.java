package com.company;

public class Main {

    /* class : a class is basically a blueprint for a objects, using blueprints we can create many different objects as
       we like base on those blueprints/classes.
     * object/instance : each house we create based on those blueprints/classes (instantiate using new operator) are called
       objects aka instances.
     * reference : memory location/address of the object we create based on the class is called reference. we can copy that
       reference as many times as you like but there is still just one object. we can pass reference as parameters to
       constructors & methods. in java always have reference to an object in memory. there is no way to access object directly.
       everything done using reference variables.                */

    public static void main(String[] args) {

        House blueHouse = new House("blue"); // *class: House  *object - new House("blue");  *reference: blueHouse
        House anotherHouse = blueHouse;  //set another reference to the same above object.
        System.out.println(blueHouse.getColor());    //blue
        System.out.println(anotherHouse.getColor()); //blue

        //we can copy that reference as many times as you like but there is still just one object. in here we create 2 reference
        //to the same object in memory. we can change object's fields using any reference, it will effect to that object.
        anotherHouse.setColor("yellow");
        System.out.println(blueHouse.getColor());    //yellow
        System.out.println(anotherHouse.getColor()); //yellow

        //now we have 2 objects & 3 references(blueHouse, anotherHouse, greenHouse). blueHouse points to the different object
        //in memory & greenHouse,anotherHouse are point to the same object in memory.
        House greenHouse = new House("green");
        anotherHouse = greenHouse;  //dereferencing anotherHouse
        System.out.println(blueHouse.getColor());    //yellow
        System.out.println(greenHouse.getColor());   //green
        System.out.println(anotherHouse.getColor()); //green


    }

}
