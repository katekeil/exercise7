package com.kate;

    /**
     * Created by 016006 on 2/28/2019.
     */
    class Contact {
        public String name;
        public String email;

        public Contact(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void display(){
            System.out.println("Person's name: " + name + ", Person's email: " + email);
        }
    }

    /* extends the contact class and stores the contact's phone number
                * should override the base class's method that displays the name and email address
                * so that it displays the phone number in addition to the name and email address*/
    class Business extends Contact {
        private String phoneNumber;


        public Business(String name, String email, String phoneNumber) {
            super(name, email);
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public void display() {
            String message;
            message = "Person's name: " + name + ", Person's email: " + email + ", Person's Phone number: " + phoneNumber;
            System.out.println(message);

        }
    }

    public class Main {
        public static void main(String[] args) {
            Contact person = new Contact("Charlie", "charlie@yahoo.com");
            Business business = new Business("Charles", "charles@gmail.com", "614-996-7524");


            person.display();
            business.display();
        }
    }
