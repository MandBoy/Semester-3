package Fitness;

import Services.Inputhandler;
import java.util.LinkedList;

public class Create implements Reader{
    public LinkedList<Person> all = new LinkedList<>();
    public LinkedList<Person> persons = new LinkedList<>();
    public LinkedList<Member> members = new LinkedList<>();
    public LinkedList<Employee> employees = new LinkedList<>();
    public LinkedList<Administration> admins = new LinkedList<>();
    public LinkedList<Instructor> instructors = new LinkedList<>();

    public Create(boolean go){
        while(go){
            helper();
            switch(Inputhandler.intChoice()){
                case 1:
                    Person newPerson = new Person();
                    all.add(newPerson);
                    persons.add(newPerson);
                    break;
                case 2:
                    Member newMember = new Member();
                    all.add(newMember);
                    members.add(newMember);
                    break;
                case 3:
                    Employee newEmployee = new Employee();
                    all.add(newEmployee);
                    employees.add(newEmployee);
                    break;
                case 4:
                    Administration newAdmin = new Administration();
                    all.add(newAdmin);
                    admins.add(newAdmin);
                    break;
                case 5:
                    Instructor newInstructor = new Instructor();
                    all.add(newInstructor);
                    instructors.add(newInstructor);
                    break;
                case 9:
                    go = false;
                    break;
            }
        }
    }
    public void helper(){
        String help =
                "1: All\n"+
                "2: Member\n"+
                "3: Employee\n"+
                "4: Administrator\n"+
                "5: Instructor\n"+
                "9: Exit/Stop\n";
        System.out.println(help);
    }
    public void readAll() {
        System.out.printf("%s %s", "Person Name", "Person Cpr");
        for(Person pr : all){
            System.out.printf("%s %s", pr.name, pr.cpr);
        }
    }
    public void readMembers() {
        System.out.printf("%s %s %s %s", "Persons Name", "Persons Cpr","Persons Membership", "Persons MonthlyFee");
        for(Member mb : members){
            System.out.printf("%s %s %s %s", mb.name, mb.cpr, mb.getMemberType(), mb.getMonthleyFee());
        }
    }
    public void readEmployees() {
        System.out.printf("%s %s %s %s", "Person Name", "Person Cpr","Person Hours","Person Salary");
        for(Employee em : employees){
            System.out.printf("%s %s %s %s",em.name, em.cpr, em.getHours(), em.getSalary());
        }
    }
    public void readAdministrators() {
        System.out.printf("%s %s %s %s %s","Persons Name","Persons Cpr","Persons Hours","Persons Salary","Persons Vacation");
        for(Administration ad : admins){
            System.out.printf("%s %s %s %s %s",ad.name, ad.cpr, ad.getHours(), ad.getSalary(), ad.getVacation());
        }
    }
    public void readInstructors() {
        System.out.printf("%s %s %s %s","Persons Name", "Persons Cpr","Persons Hours","Persons Salary");
        for(Instructor in : instructors){
            System.out.printf("%s %s %s %s", in.name, in.cpr, in.getHours(),in.getSalary());
        }
    }
}
