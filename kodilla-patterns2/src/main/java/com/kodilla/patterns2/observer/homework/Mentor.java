package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Task task, Student student) {
            updateCount++;
            System.out.println("Mentor: " + mentorName + " - New tasks in " + task.getName() + ", author: " + student.getName() + "\n"
                    + "[total: " + getUpdateCount() + (getUpdateCount() == 1 ? " task" : " tasks") + " to check by this mentor; " + task.getTasks().size() + (task.getTasks().size() == 1 ? " task" : " tasks") + " within this module] ");

    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }
}
