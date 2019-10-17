package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {

    private double usersCount;
    private double postsCount;
    private double commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){

        usersCount = statistics.userNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (usersCount != 0 && postsCount != 0) {
            averagePostsPerUser  =  postsCount / usersCount;
            averageCommentsPerUser = commentsCount / usersCount;
            averageCommentsPerPost = commentsCount / postsCount;
        }

    }

    public String showStatistics(){
        return "Average posts per user: "+averagePostsPerUser+"\nAverage comments per user: "+averageCommentsPerUser+"\nAverage Comments per post: "+averageCommentsPerPost;
    }

    public double getUsersCount() {
        return usersCount;
    }

    public double getPostsCount() {
        return postsCount;
    }

    public double getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
