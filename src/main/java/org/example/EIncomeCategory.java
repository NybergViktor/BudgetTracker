package org.example;

public enum EIncomeCategory {

    SALARY, SOLDITEM, SECONDSALARY, OTHER;

    @Override
    public String toString() {
        return super.toString();
    }

    public void printCategorys(){
        System.out.println("salary \n" +
                "solditem \n " +
                "secondsalary \n " +
                "other ");
    }
    /*
    enum categoryList {
        SALARY {
            @Override
            public String toString() {
                return "salary";
            }
        },
        SOLDITEM {
            @Override
            public String toString() {
                return "solditem";
            }
        },
        SECONDSALARY {
            @Override
            public String toString() {
                return "secondsalary";
            }
        },
        OTHER {
            @Override
            public String toString() {
                return "other";
            }
        }
    }*/

}
