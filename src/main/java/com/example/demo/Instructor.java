package com.example.demo;

public class Instructor extends Person implements Teacher{


    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int learnerCount = 0;
        for (Learner learner : learners){
            learnerCount++;
        }

        double numberOfHoursPerLearner = numberOfHours / learnerCount;

        for (Learner learner : learners){
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
