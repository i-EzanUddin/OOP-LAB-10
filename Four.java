class Vehicle {
    String vehicleName;
    int engineCC;
    String model;

    Vehicle(String vehicleName, int engineCC, String model) {
        this.vehicleName = vehicleName;
        this.engineCC = engineCC;
        this.model = model;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public String getModel() {
        return model;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    public void setModel(String model) {
        this.model = model;
    }

    void display() {
        class Owner {
            String ownerName;
            String CNIC;
            String phoneNumber;

            Owner(String ownerName, String CNIC, String phoneNumber) {
                this.ownerName = ownerName;
                this.CNIC = CNIC;
                this.phoneNumber = phoneNumber;
            }

            String getOwnerName() {
                return ownerName;
            }

            String getCNIC() {
                return CNIC;
            }

            String getPhoneNumber() {
                return phoneNumber;
            }

            void setOwnerName(String ownerName) {
                this.ownerName = ownerName;
            }

            void setCNIC(String CNIC) {
                this.CNIC = CNIC;
            }

            void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }
        }

        Owner o = new Owner("Ali", "12345-1234567-1", "03001234567");

        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Engine CC: " + engineCC);
        System.out.println("Model: " + model);
        System.out.println("Owner Name: " + o.getOwnerName());
        System.out.println("CNIC: " + o.getCNIC());
    }
}

public class Four {
    public static void main(String[] args) {

        Vehicle v = new Vehicle("Civic", 1800, "2022") {
            void display() {
                class Owner {
                    String ownerName;
                    String CNIC;
                    String phoneNumber;

                    Owner(String ownerName, String CNIC, String phoneNumber) {
                        this.ownerName = ownerName;
                        this.CNIC = CNIC;
                        this.phoneNumber = phoneNumber;
                    }

                    String getOwnerName() {
                        return ownerName;
                    }

                    String getCNIC() {
                        return CNIC;
                    }
                }

                Owner o = new Owner("Ahmed", "42101-1234567-8", "03111234567");

                System.out.println("Vehicle Name: " + vehicleName);
                System.out.println("Engine CC: " + engineCC);
                System.out.println("Model: " + model);
                System.out.println("Owner Name: " + o.getOwnerName());
                System.out.println("CNIC: " + o.getCNIC());
            }
        };

        v.display();
    }
}