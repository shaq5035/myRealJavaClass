package reviewSession6;

public abstract class StaffPerson {
	String name;
    String adress;
    int salary;
    String vehicleType;
    String hireDate;
    int tellNum;

    public StaffPerson(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
        super();
        this.name = name;
        this.adress = adress;
        this.salary = salary;
        this.vehicleType = vehicleType;
        this.hireDate = hireDate;
        this.tellNum = tellNum;
    }

    public abstract String getVehicleType();

    public abstract String getName();

    public abstract String getAddress();

    public abstract double getSalary();

    public abstract int getTellNum();

}

class Secretary extends StaffPerson {

    public Secretary(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
        super(name, adress, salary, vehicleType, hireDate, tellNum);
    }

    @Override
    public String getVehicleType() {
        return super.vehicleType;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public String getAddress() {
        return super.adress;
    }

    @Override
    public double getSalary() {
        return super.salary;
    }

    @Override
    public int getTellNum() {
        return super.tellNum;
    }

}

class Professor extends StaffPerson {

    public Professor(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
        super(name, adress, salary, vehicleType, hireDate, tellNum);
    }

    @Override
    public String getVehicleType() {
        return super.vehicleType;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public String getAddress() {
        return super.adress;
    }

    @Override
    public double getSalary() {
        return super.salary;
    }

    @Override
    public int getTellNum() {
        return super.tellNum;
    }
}