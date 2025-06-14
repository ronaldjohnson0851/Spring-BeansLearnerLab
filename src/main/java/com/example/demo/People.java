package com.example.demo;

import java.util.*;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    protected List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType person){
        personList.add(person);
    }

    public boolean remove(PersonType person){
        return personList.remove(person);
    }

    public int size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> persons){
        for (PersonType person : persons){
            personList.add(person);
        }
    }

    public PersonType findById(long id){
        for(PersonType person : personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return new ArrayList<>(personList);
    }
}
