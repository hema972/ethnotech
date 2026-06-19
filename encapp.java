package ethno.encapsulation;
class Person {
    private String name;
    private int age;
    private String country;
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getCountry()
    {
        return country;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }
    
}

class encapp1 {
    public static void main(String[] args) {
        Person p=new Person();
        p.setName("John");
        p.setAge(30);
        p.setCountry("USA");
        System.out.println("Name: "+p.getName());
        System.out.println("Age: "+p.getAge());
        System.out.println("Country: "+p.getCountry());
    }
    
}
