package homework.lab2.nastasiaBuilder;

import lombok.ToString;

@ToString
public class Client {

    private final String name;
    private final int salary;
    private final int debt;
    private final int bonus;


    private Client(Builder builder) {
        this.name = builder.name;
        this.salary = builder.salary;
        this.debt = builder.debt;
        this.bonus = builder.bonus;
    }

    public static Builder builder(){
        return new Builder();
    }

    static class Builder{
        private  String name;
        private  Integer salary;
        private  Integer debt;
        private  Integer bonus;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder salary(int salary){
            this.salary = salary;
            return this;
        }

        public Builder debt(int debt){
            this.debt = debt;
            return this;
        }

        public Builder bonus(int bonus){
            this.bonus = bonus;
            return this;
        }

        public Client build(){
            return new Client(this);
        }
    }
}
