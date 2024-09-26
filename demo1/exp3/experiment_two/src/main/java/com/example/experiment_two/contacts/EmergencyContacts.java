package com.example.experiment_two.contacts;

public class EmergencyContacts implements Contacts{
    /**
     *
     *
     * @author Sihoon Lee
     */

        private String name;

        private String address;

        private String telephone;

        public EmergencyContacts(){

        }

        public EmergencyContacts(String name, String address, String telephone){
            this.name = name;
            this.address = address;
            this.telephone = telephone;
        }


        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return this.address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTelephone() {
            return this.telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        @Override
        public String toString() {
            return name + " "
                    + address + " "
                    + telephone;

    }
}
