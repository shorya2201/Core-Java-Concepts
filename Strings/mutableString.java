public class mutableString {
    /*
     * Mutable Strings can be created in two ways:
     * 1.StringBuffer Class
     * 2.StringBuilder Class
     * 
     * 
     * Using StringBuffer
     * StringBuffer s1 = new StringBuffer();
     * 
     * Using StringBuilder
     * StringBuilder s1 = new StringBuilder();
     * 
     * To add something to an existing string we use append() method
     * 
     * Many inbuild methods are also available in mutable strings can be found
     * online
     * 
     * We prefer to use mutable strings when we know that the value of string will
     * be changed on a frequent basis coz immutable will create a new object in
     * memory
     * 
     * DIFFERENCE BETWEEN STRINGBUFFER & STRINGBUILDER
     * 
     * StringBuilder & StringBuffer classes both are same there are only one
     * difference which is that STRINGBUFFER is synchronized means it is THREADSAFE
     * also means in no multithreading is possible in it whereas STRINGBUILDER
     * supports MultiThreading means high performance
     * 
     * The initial capacity of both the classes is 16 characters
     * If more than 16 char present the capacity will automatically changed using
     * formula of new capacity = (old capacity+1)*2
     * 
     * FINAL vs IMMUTABILITY
     * In strings if a string is declared as final means the address of string
     * cannot be changed also means you cannot add reference pointing to another
     * string in that string the address will be marked as final in it
     * It will point to same address as before means changing its value cannot be
     * possible as it will not point towards new address
     * 
     */
}
