package com.adm.fremontguide;

public class LocationInfo {

    /** Name of the location */
    private String fName;

    /** Phone Number of the location */

    private String fPhoneNumber = NO_PHONE_PROVIDED;

    /** Address of the Location */
    private String fAddress;

    /** */

    private int fImage = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    /** Constant value that represents no phone was provided for this location */
    private static final String NO_PHONE_PROVIDED = "NO PHONE";


   /** Constructor for LocationInfo */
    public LocationInfo(String Name, String Address, String PhoneNumber){
        fName = Name;
        fPhoneNumber = PhoneNumber;
        fAddress = Address;
    }

    public LocationInfo(String Name, String Address, int image){
        fName = Name;
        fAddress = Address;
        fImage = image;
    }

    public LocationInfo(String Name, String Address, String PhoneNumber, int image){
        fName = Name;
        fAddress = Address;
        fPhoneNumber = PhoneNumber;
        fImage = image;
    }

    public String getPhoneNumber() {
        return fPhoneNumber;
    }

    public String getName(){
        return fName;
    }

    public String getAddress(){
        return fAddress;
    }

    public int getImage(){
        return fImage;
    }

    public Boolean hasPhone(){
        return !(fPhoneNumber.equals(NO_PHONE_PROVIDED));
    }
    public Boolean hasImage(){
        return fImage != NO_IMAGE;
    }



}
