package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of the shapes tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #"+testCounter);
    }

    @Test
    //Test 1 : 0 posts
    public void testCalculateStatistics1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<String>();
        statisticsList.add("Mike");
        statisticsList.add("Tom");
        statisticsList.add("John");
        statisticsList.add("Alan");

        int numberOfPosts = 0;
        int numberOfComments = 0;

        when(statisticsMock.userNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statisticsCounter.getAveragePostsPerUser(),0.0);
    }

    @Test
    //Test 2 : 1000 posts
    public void testCalculateStatistics2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<String>();
        statisticsList.add("Mike");
        statisticsList.add("Tom");
        int numberOfPosts = 1000;
        int numberOfComments = 0;

        when(statisticsMock.userNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals((1000/2), statisticsCounter.getAveragePostsPerUser(),0.0);
    }

    @Test
    //Test 3 : 0 comments
    public void testCalculateStatistics3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<String>();
        statisticsList.add("Mike");
        statisticsList.add("Tom");
        statisticsList.add("John");
        statisticsList.add("Alan");

        int numberOfPosts = 0;
        int numberOfComments = 0;

        when(statisticsMock.userNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statisticsCounter.getAverageCommentsPerUser(),0.0);
    }

    @Test
    //Test 4 : comments < posts
    public void testCalculateStatistics4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<String>();
        statisticsList.add("Mike");
        statisticsList.add("Tom");
        statisticsList.add("John");
        statisticsList.add("Alan");

        int numberOfPosts = 20;
        int numberOfComments = 10;

        when(statisticsMock.userNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals((0.5), statisticsCounter.getAverageCommentsPerPost(),0.0);
    }

    @Test
    //Test 5 : comments > posts
    public void testCalculateStatistics5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<String>();
        statisticsList.add("Mike");
        statisticsList.add("Tom");
        statisticsList.add("John");
        statisticsList.add("Alan");

        int numberOfPosts = 50;
        int numberOfComments = 100;

        when(statisticsMock.userNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2, statisticsCounter.getAverageCommentsPerPost(),0.0);
    }

    @Test
    //Test 6 : 0 Users
    public void testCalculateStatistics6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<String>();
        statisticsList.add("Mike");
        statisticsList.add("Tom");
        statisticsList.add("John");
        statisticsList.add("Alan");

        int numberOfPosts = 50;
        int numberOfComments = 100;

        when(statisticsMock.userNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsList.clear();
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCounter.getAveragePostsPerUser(),0.0);
    }

    @Test
    //Test 7 : 100 Users
    public void testCalculateStatistics7() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<String>();
        for (int i=0; i<100; i++) {
            statisticsList.add("John"+i);
        }
        int numberOfPosts = 100;
        int numberOfComments = 10;

        when(statisticsMock.userNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1, statisticsCounter.getAveragePostsPerUser(),0.0);
    }
}

