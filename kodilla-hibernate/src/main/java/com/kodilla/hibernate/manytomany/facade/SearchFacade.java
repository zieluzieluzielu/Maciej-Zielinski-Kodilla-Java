package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public final class SearchFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);


    public List<Company> searchCompany(String companyName) throws SearchFacadeException {
        LOGGER.info("Search for company with name like : " + companyName);
        List<Company> companies = companyDao.retrieveCompaniesNameLike(companyName);
        int resultsSize = companies.size();

        if (companies.size() < 1) {
            LOGGER.error(SearchFacadeException.ERR_COMPANY_NOT_FOUND);
            throw new SearchFacadeException(SearchFacadeException.ERR_COMPANY_NOT_FOUND);
        } else {
            String companiesList = companies.stream().map(o -> o.getName()).collect(Collectors.joining(", "));
            LOGGER.info(resultsSize + (resultsSize == 1 ? " company" : " companies") + " found: " + companiesList);
        }
        return companies;

    }

    public List<Employee> searchEmployee(String employeeName) throws SearchFacadeException {
        LOGGER.info("Search for employee with name like : " + employeeName);
        //employeeDao.retrieveEmployeeNameLike(employeeName);
        List<Employee> employees = employeeDao.retrieveEmployeeNameLike(employeeName);
        int resultsSize = employees.size();

        if (employees.size() < 1) {
            LOGGER.error(SearchFacadeException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchFacadeException(SearchFacadeException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            String employeesList = employees.stream().map(o -> o.getLastname()).collect(Collectors.joining(", "));
            LOGGER.info(resultsSize + (resultsSize == 1 ? " employee" : " employees") + " found: " + employeesList);
        }

        return employees;
    }


}
