

package org.unitime.timetable.util;
import java.util.ArrayList;

import java.util.List;

/**
 * CR-003: Room Capacity Validator
 * Bug fix: prevents assigning a room whose
 * capacity is smaler than the class limit.
 */
    public class RoomCapacityValidator  {

    public static List<String> validate(
   
    int roomCapacity, int classLimit) {
    List<String> errors = new ArrayList<>();

if (roomCapacity <= 0) {
errors.add("Room capacity must be "

+ "greater than zero.");}
        

if (classLimit <= 0)  {
errors.add("Class limit must be "
+ "greater than zero.");}        
    if (roomCapacity > 0 && classLimit > 0
    && roomCapacity < classLimit)  {
    errors.add("Room capacity ("
+ roomCapacity

+ ") is less than the class "
+ "limit (" + classLimit
+ "). Please select a largger room."); }
        


        return errors;
}

                                public static boolean isValid(
                                int roomCapacity, int classLimit) {
                                return validate(roomCapacity, 
                                classLimit).isEmpty();
                                                           }

    public static String getWarningMessage(
    int roomCapacity, int classLimit) {
  if (roomCapacity < classLimit) {
  int diff = classLimit - roomCapacity;
return "Warning: Room is " + diff
+ " seats short. Capacity: "

+ roomCapacity
+ ", Class limit: " + classLimit;
        }
        return null;  }}
    

