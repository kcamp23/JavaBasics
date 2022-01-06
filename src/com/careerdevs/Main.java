package com.careerdevs;

//class JavaBasics {
//    public static void main(String [] args ) {
//        String FirstName = "Kat";
//        String LastName = "Camp";
//        String FullName = FirstName +"," + LastName;
//
//
//
//        System.out.println(FullName );
//    }
//}

class JavaBasics {
    public static void main(String[] args) {
        User user = new User();
        user.firstName = "Kat";
        user.lastName = "Camp";
        System.out.println(user.getFullName());

    }
}
    public class User{
        public String firstName;
        public String lastName;

        public String getFullName(){
            return firstName + "" + lastName;
        }
    }

//
//    public String FirstName;
//    public String LastName;
//public CreateFullName (String FirstName, String LastName)
//
//    }
//        public static String concatName(String firstName, String lastName) {
//
//        }
//    System.out.println(CreateFullName)
//
//    createFullName( "First", "Last")
//    createFullName( "Gabriel", "Sherman")
//
//public static String concatName(String firstName, String lastName) {
//        return String.format("%s, %s", lastName, firstName);
//        }