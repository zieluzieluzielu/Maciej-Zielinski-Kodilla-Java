package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.SearchFacade;
import com.kodilla.hibernate.manytomany.facade.SearchFacadeException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);

        try {
            searchFacade.searchEmployee("mit");
        } catch (SearchFacadeException e) {
            //business exception - should be handled in real application
        } finally {
            employeeDao.deleteAll();
        }

    }

    @Test
    public void testSearchCompany() {
        Company dataMaesters = new Company("Data Maesters");
        Company bigData = new Company("Big Data");
        companyDao.save(dataMaesters);
        companyDao.save(bigData);

        try {
            searchFacade.searchCompany("ata");
        } catch (SearchFacadeException e) {
            //business exception - should be handled in real application
        } finally {
            companyDao.deleteAll();
        }

    }


}
