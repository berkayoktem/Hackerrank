select company.company_code, max(founder), count(distinct lead_manager_code), count(distinct senior_manager_code), count(distinct manager_code), count(distinct employee_code) 
from employee inner join company on employee.company_code=company.company_code 
group by company.company_code 
order by company.company_code;