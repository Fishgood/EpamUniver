package task3.ex2.model;

import task3.ex2.Utility.InputUtility;
import task3.ex2.model.Entity.Item;

import java.util.*;

public class Shop<T> {
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();

    public Shop(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartments(){
        return departments;
    }

    public void addDepartment() {
        departments.add(new Department(InputUtility.strValInp("Enter dep name")));
    }

    public void deleteDepartment(String departmentName){
        departments.removeIf(item -> item.getDepartmentName().equals(departmentName));
    }

    public ArrayList<T> getItems(){
        return getItems();
    }

    public void sortDepartments(){
        departments.sort(Comparator.comparing(Department::getDepartmentName));
    }



    private class Department<T extends Item> implements Comparator {
        private String departmentName;
        private ArrayList<T> items;

        public Department() {
        }

        public Department(String departmentName) {
            this.departmentName = departmentName;
        }

        public Department(String departmentName, ArrayList<T> items) {
            this.departmentName = departmentName;
            this.items = items;
        }

        public ArrayList<T> getItems() {
            return items;
        }

        public void setItems(ArrayList<T> items) {
            this.items = items;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        @Override
        public int compare(Object o1, Object o2) {
            return ((Department) o1).getDepartmentName()
                    .compareTo(((Department) o2).getDepartmentName());
        }



        @Override
        public String toString() {
            return "Department{" +
                    "departmentName='" + departmentName + '\'' +
                    ", items=" + items +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                '}';
    }
}
