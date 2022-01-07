//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************

public class Address implements Comparable
{

   private String streetAddress, city, state;
   private int zipCode;
   
   //-----------------------------------------------------------------
   //  Sets up this Address object with the specified data.
   //-----------------------------------------------------------------

   public Address(){}

   public Address (String street, String town, String st, int zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   }

   public int compareTo(Object obj)
   {
       Address other = (Address) obj;
       String number = this.streetAddress.substring(0, this.streetAddress.indexOf(" "));
       String othernum = other.streetAddress.substring(0, other.streetAddress.indexOf(" "));
       int int1 = Integer.parseInt(number);
       int int2 = Integer.parseInt(othernum);
       String street1 = this.streetAddress.substring(0, this.streetAddress.indexOf(" "));
       String street2 = other.streetAddress.substring(0, other.streetAddress.indexOf(" "));
       if(this.streetAddress.equals(other.streetAddress))
        return 0;
       if(street1.compareTo(street2)==0)
        return int1-int2;
       else
        return street1.compareTo(street2);
   }


   //-----------------------------------------------------------------
   //  Returns this Address object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
}
