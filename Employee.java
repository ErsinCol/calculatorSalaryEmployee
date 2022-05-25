public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){
        if(this.salary<1000) {
            return 0;
        }
        return this.salary*0.03;
    }

    double bonus(){
        if(workHours>40){
            return (workHours-40)*30;
        }
        return 0;
    }

    double raiseSalary(){
        int howLongWork=2021-hireYear;
        if(howLongWork<10){
            return this.salary*0.5;
        }
        else if(howLongWork>=10 && howLongWork<20){
            return this.salary*0.10;
        }
        return this.salary*0.15;
    }

    int calculatorSalary(){
        return (int)(salary+bonus()+raiseSalary()-tax());

    }

    double tax_bonus_salary(){
        return (int) (this.salary+this.bonus()-this.tax());
    }
    @Override
    public String toString(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma saati: "+this.workHours);
        System.out.println("Başlangıç yılı: "+this.hireYear);
        System.out.println("Vergi: "+this.tax());
        System.out.println("Bonus: "+this.bonus());
        System.out.println("Maaş artışı: "+this.raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: "+tax_bonus_salary());
        System.out.println("Toplam maaş: "+this.calculatorSalary());
        return null;
    }
}
