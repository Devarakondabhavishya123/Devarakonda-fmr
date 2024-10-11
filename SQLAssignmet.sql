CREATE TABLE worker (
    worker_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    
    salary DECIMAL(10, 2),
	
    joining_date DATE,
	department VARCHAR(50)
);

INSERT INTO worker (worker_id, first_name, last_name,  salary, joining_date,department)
VALUES 
(1, 'Monika', 'Arora', 100000.00, '2020-02-11','HR'),
(2,'Niharika', 'verma', 80000.00, '2020-04-21','Admin'),
(3,'Vishal', 'singhal', 300000.00, '2020-03-01','HR'),
(4,'Amitabh', 'Singh', 500000.00, '2020-02-10','Admin'),
(5,'Vivek', 'Bhati', 500000.00, '2020-02-17','Admin'),
(6,'Vipul', 'Diwan', 200000.00, '2020-02-18','Account'),
(7,'Satish', 'Kumar', 75000.00, '2020-02-19','Account'),
(8,'gheethija', 'Dihan', 90000.00, '2020-02-28','Admin');
select*from worker;

CREATE TABLE Bonus (
   
    worker_ref_id INT,
    bonus_amount DECIMAL(10, 2),
    bonus_date DATE,
    FOREIGN KEY (worker_ref_id) REFERENCES worker(worker_id)
);
INSERT INTO bonus (worker_ref_id, bonus_amount, bonus_date)
VALUES 
(1, 5000.00, '2024-01-15'),
(2, 3000.00, '2024-02-20'),
(3, 4000.00, '2024-03-10'),
(1, 4500.00, '2024-04-25'),
(2, 3500.00, '2024-05-30'),
(4, 4500.00, '2024-04-25'),
(5, 3500.00, '2024-05-30');

CREATE TABLE Title (
   
    worker_ref_id INT,
    worktitle varchar(25),
    Affectfrom DATE,
    FOREIGN KEY (worker_ref_id) REFERENCES worker(worker_id)
);
INSERT INTO title (worker_ref_id, worktitle,Affectfrom)
VALUES 
(1, 'Manger', '2024-01-15'),
(2, 'excecutive', '2024-02-20'),
(8, 'Manger', '2024-03-10'),
(5, 'excecutive', '2024-04-25'),
(4, 'asstManger', '2024-05-30'),
(7, 'excecutive', '2024-04-25'),
(6, 'lead', '2024-05-30'),
(3, 'lead', '2024-05-30');

SELECT w.first_name, w.salary, t.worktitle
FROM worker w
LEFT JOIN title t ON w.worker_id = t.worker_ref_id;

CREATE OR REPLACE FUNCTION get_worker_count_by_nth_highest_salary(n INTEGER)
RETURNS INTEGER AS $$
DECLARE
    nth_highest_salary Decimal(10,2);
    worker_count INTEGER;
BEGIN

    SELECT salary
    INTO nth_highest_salary
    FROM (
        SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) as salary_rank
        FROM worker
    ) ranked_salaries
    WHERE Salary_rank = n;

  
    SELECT COUNT(*)INTO worker_count
    FROM worker
    WHERE salary = nth_highest_salary;

    RETURN worker_count;
END;
$$ LANGUAGE plpgsql;

select get_worker_count_by_nth_highest_salary(1);



