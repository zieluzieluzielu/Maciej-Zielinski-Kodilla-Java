package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.SearchFacade;
import com.kodilla.hibernate.manytomany.facade.SearchFacadeException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {

    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSearchEmployee() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);

        //When & Then
        try {
            List<Employee> employeeList = searchFacade.searchEmployee("mit");
            Assert.assertEquals(employeeList.size(), 1);
            Assert.assertEquals(employeeList.get(0).getFirstname(), "John");

        } catch (SearchFacadeException e) {
            //business exception - should be handled in real application
        } finally {
            employeeDao.deleteAll();
        }

    }

    @Test
    public void testSearchCompany() {
        //Given
        Company dataMaesters = new Company("Data Maesters");
        Company bigData = new Company("Big Data");
        companyDao.save(dataMaesters);
        companyDao.save(bigData);

        //When & Then
        try {
            List<Company> companiesList = searchFacade.searchCompany("ata");
            Assert.assertEquals(companiesList.size(), 2);
            Assert.assertEquals(companiesList.get(0).getName(), "Big Data");
            Assert.assertEquals(companiesList.get(1).getName(), "Data Maesters");
        } catch (SearchFacadeException e) {
            //business exception - should be handled in real application
        } finally {
            companyDao.deleteAll();
        }

    }


}
