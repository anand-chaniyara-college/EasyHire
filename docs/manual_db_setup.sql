SET FOREIGN_KEY_CHECKS = 0;

-- Clean existing data
TRUNCATE TABLE easyhire_candidate;
TRUNCATE TABLE easyhire_candidate_interview;
TRUNCATE TABLE easyhire_candidate_status;
TRUNCATE TABLE easyhire_department;
TRUNCATE TABLE easyhire_interview;
TRUNCATE TABLE easyhire_mail_history;
TRUNCATE TABLE easyhire_notifications;
TRUNCATE TABLE easyhire_password_reset;
TRUNCATE TABLE easyhire_position;
TRUNCATE TABLE easyhire_reviews;
TRUNCATE TABLE easyhire_status;
TRUNCATE TABLE easyhire_user;
TRUNCATE TABLE easyhire_vacancy;
TRUNCATE TABLE easyhire_interview_user;
TRUNCATE TABLE easyhire_notification_user;

-- 1. Departments (12 records)
INSERT INTO easyhire_department (department_id, department_name, department_address, department_created_datetime, department_created_user_id) VALUES
(1, 'Human Resources', 'Building A, Floor 2', '2025-01-01 00:00:00', 1),
(2, 'Software Development', 'Building B, Floor 3', '2025-01-01 00:00:00', 1),
(3, 'Sales', 'Building C, Floor 1', '2025-01-01 00:00:00', 1),
(4, 'Marketing', 'Building A, Floor 1', '2025-01-01 00:00:00', 1),
(5, 'Finance', 'Building D, Floor 2', '2025-01-01 00:00:00', 1),
(6, 'Legal', 'Building D, Floor 3', '2025-01-01 00:00:00', 1),
(7, 'Operations', 'Building E, Floor 1', '2025-01-01 00:00:00', 1),
(8, 'Customer Support', 'Building E, Floor 2', '2025-01-01 00:00:00', 1),
(9, 'Research & Development', 'Building B, Floor 4', '2025-01-01 00:00:00', 1),
(10, 'IT Infrastructure', 'Building B, Floor 1', '2025-01-01 00:00:00', 1),
(11, 'Product Management', 'Building A, Floor 3', '2025-01-01 00:00:00', 1),
(12, 'Security', 'Building F, Floor 1', '2025-01-01 00:00:00', 1);

-- 2. Positions (12 records)
INSERT INTO easyhire_position (position_id, position_name, position_created_datetime, position_created_user_id) VALUES
(1, 'HR Manager', '2025-01-01 00:00:00', 1),
(2, 'HR Assistant', '2025-01-01 00:00:00', 1),
(3, 'Senior Java Developer', '2025-01-01 00:00:00', 1),
(4, 'Frontend Developer', '2025-01-01 00:00:00', 1),
(5, 'Sales Representative', '2025-01-01 00:00:00', 1),
(6, 'Marketing Intern', '2025-01-01 00:00:00', 1),
(7, 'Financial Analyst', '2025-01-01 00:00:00', 1),
(8, 'Legal Counsel', '2025-01-01 00:00:00', 1),
(9, 'Operations Manager', '2025-01-01 00:00:00', 1),
(10, 'Support Specialist', '2025-01-01 00:00:00', 1),
(11, 'DevOps Engineer', '2025-01-01 00:00:00', 1),
(12, 'Product Owner', '2025-01-01 00:00:00', 1);

-- 3. Users (15 records)
INSERT INTO easyhire_user (user_id, user_name, user_email, user_password, user_role, user_status, user_department_id) VALUES
(1, 'System Admin', 'admin@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'Admin', 1, 2),
(2, 'Sarah HR', 'sarah.hr@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'Interviewer', 1, 1),
(3, 'John Dev', 'john.dev@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'Interviewer', 1, 2),
(4, 'Mike Sales', 'mike.sales@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'Interviewer', 1, 3),
(5, 'Emily Marketing', 'emily.mkt@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'Interviewer', 1, 4),
(6, 'Super HR', 'hr@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'HR', 1, 1),
(7, 'David Finance', 'david.fin@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'Interviewer', 1, 5),
(8, 'Lisa Legal', 'lisa.legal@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'Interviewer', 1, 6),
(9, 'Tom Ops', 'tom.ops@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'Interviewer', 1, 7),
(10, 'Anna Support', 'anna.support@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'Interviewer', 1, 8),
(11, 'Chris DevOps', 'chris.devops@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'Interviewer', 1, 10),
(12, 'Kate Product', 'kate.product@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'Interviewer', 1, 11),
(13, 'James Security', 'james.sec@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'Interviewer', 1, 12),
(14, 'Recruiter One', 'recruiter1@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'HR', 1, 1),
(15, 'Recruiter Two', 'recruiter2@gmail.com', '$2a$10$CJowS/FKp57h7Y3YDVxude5hnu6QroHc6tNT3xsrwAf94a.CrBlOW', 'HR', 1, 1);

-- 4. Status (10 records)
INSERT INTO easyhire_status (status_id, status_name) VALUES
(1, 'Received'),
(2, 'Viewed'),
(3, 'Considering'),
(4, 'Interview'),
(5, 'Offer'),
(6, 'Hired'),
(7, 'Rejected'),
(8, 'Pending'),
(9, 'On Hold'),
(10, 'Background Check');

-- 5. Vacancies (12 records)
INSERT INTO easyhire_vacancy (vacancy_id, vacancy_requirement, vacancy_responsibility, vacancy_description, vacancy_preference, vacancy_start_working_day, vacancy_end_working_day, vacancy_start_working_hour, vacancy_end_working_hour, vacancy_salary, vacancy_count, vacancy_type, vacancy_created_date, vacancy_created_time, vacancy_created_user_id, vacancy_due_date, vacancy_active, vacancy_urgent, vacancy_department_id, vacancy_position_id, vacancy_reopen_status, vacancy_reopened) VALUES
(1, 'Strong Java, Spring Boot', 'Backend Dev', 'Join core team', 'Cloud exp', 'Monday', 'Friday', '09:00', '18:00', 'High', 3, 'Full-Time', CURDATE(), CURTIME(), 1, DATE_ADD(CURDATE(), INTERVAL 2 MONTH), 1, 1, 2, 3, 0, 0),
(2, 'Admin skills', 'Assist HR Manager', 'HR Support', 'Excel', 'Monday', 'Friday', '08:00', '17:00', 'Medium', 1, 'Full-Time', CURDATE(), CURTIME(), 1, DATE_ADD(CURDATE(), INTERVAL 1 MONTH), 1, 0, 1, 2, 0, 0),
(3, 'Selling skills', 'Sell products', 'Sales team', 'Charisma', 'Monday', 'Friday', '09:00', '18:00', 'Commission', 5, 'Contract', DATE_SUB(CURDATE(), INTERVAL 2 MONTH), CURTIME(), 1, DATE_SUB(CURDATE(), INTERVAL 1 MONTH), 0, 0, 3, 5, 0, 0),
(4, 'Social Media', 'Post content', 'Marketing team', 'Canva', 'Monday', 'Friday', '10:00', '16:00', 'Low', 2, 'Part-Time', CURDATE(), CURTIME(), 1, DATE_ADD(CURDATE(), INTERVAL 3 MONTH), 1, 0, 4, 6, 0, 0),
(5, 'Financial modeling', 'Budget analysis', 'Finance team', 'CPA', 'Monday', 'Friday', '09:00', '17:00', 'High', 2, 'Full-Time', CURDATE(), CURTIME(), 1, DATE_ADD(CURDATE(), INTERVAL 2 MONTH), 1, 0, 5, 7, 0, 0),
(6, 'Contract law', 'Review contracts', 'Legal team', 'Bar passed', 'Monday', 'Friday', '09:00', '17:00', 'High', 1, 'Full-Time', CURDATE(), CURTIME(), 1, DATE_ADD(CURDATE(), INTERVAL 2 MONTH), 1, 1, 6, 8, 0, 0),
(7, 'Process optimization', 'Manage ops', 'Ops team', 'Six Sigma', 'Monday', 'Friday', '08:00', '17:00', 'Medium', 2, 'Full-Time', CURDATE(), CURTIME(), 1, DATE_ADD(CURDATE(), INTERVAL 1 MONTH), 1, 0, 7, 9, 0, 0),
(8, 'Customer service', 'Answer tickets', 'Support team', 'Patience', 'Monday', 'Friday', '24h', 'Shift', 'Low', 10, 'Shift', CURDATE(), CURTIME(), 1, DATE_ADD(CURDATE(), INTERVAL 4 MONTH), 1, 1, 8, 10, 0, 0),
(9, 'AWS, Docker', 'CI/CD pipeline', 'DevOps team', 'Kubernetes', 'Monday', 'Friday', '09:00', '18:00', 'Very High', 2, 'Full-Time', CURDATE(), CURTIME(), 1, DATE_ADD(CURDATE(), INTERVAL 2 MONTH), 1, 1, 10, 11, 0, 0),
(10, 'Agile, Scrum', 'Manage product', 'Product team', 'CSPO', 'Monday', 'Friday', '09:00', '18:00', 'High', 1, 'Full-Time', CURDATE(), CURTIME(), 1, DATE_ADD(CURDATE(), INTERVAL 2 MONTH), 1, 0, 11, 12, 0, 0),
(11, 'Java, React', 'Fullstack Dev', 'Feature squad', 'NodeJS', 'Monday', 'Friday', '09:00', '18:00', 'High', 5, 'Full-Time', DATE_SUB(CURDATE(), INTERVAL 1 MONTH), CURTIME(), 1, DATE_ADD(CURDATE(), INTERVAL 1 MONTH), 1, 0, 2, 3, 0, 0),
(12, 'Python, ML', 'AI projects', 'R&D team', 'PhD', 'Monday', 'Friday', '10:00', '18:00', 'Very High', 2, 'Contract', CURDATE(), CURTIME(), 1, DATE_ADD(CURDATE(), INTERVAL 6 MONTH), 1, 1, 9, 3, 0, 0);

-- 6. Candidates (20 records)
INSERT INTO easyhire_candidate (candidate_id, candidate_name, candidate_dob, candidate_gender, candidate_phone, candidate_education, candidate_email, candidate_tech_skill, candidate_language_skill, candidate_main_tech, candidate_exp, candidate_level, candidate_expected_salary, candidate_submit_date, candidate_submit_time, candidate_filetype, candidate_is_employ, candidate_is_mail_sent, candidate_vacancy_id) VALUES
(1, 'Alice Coder', '1995-05-12', 0, '0912345678', 'BS CS', 'alice@coder.com', 'Java, Spring', 'English', 'Java', '3 Years', 'Senior', '5000', DATE_SUB(CURDATE(), INTERVAL 5 DAY), CURTIME(), 'pdf', 0, 1, 1),
(2, 'Bob Basic', '1998-01-01', 1, '0987654321', 'Bootcamp', 'bob@basic.com', 'HTML, CSS', 'English', 'Web', '1 Year', 'Junior', '2000', DATE_SUB(CURDATE(), INTERVAL 10 DAY), CURTIME(), 'pdf', 0, 0, 1),
(3, 'Charlie HR', '1990-03-15', 1, '0911223344', 'MBA', 'charlie@hr.com', 'Management', 'Spanish', 'Admin', '5 Years', 'Manager', '4000', DATE_SUB(CURDATE(), INTERVAL 20 DAY), CURTIME(), 'docx', 1, 1, 2),
(4, 'Dave Design', '2000-06-10', 1, '0900000001', 'BA Arts', 'dave@design.com', 'Photoshop', 'English', 'Design', '0 Years', 'Fresh', '1000', CURDATE(), CURTIME(), 'pdf', 0, 0, 4),
(5, 'Eve Sales', '1992-12-12', 0, '0900000002', 'BBA', 'eve@sales.com', 'Salesforce', 'English', 'Sales', '4 Years', 'Mid', '3000', DATE_SUB(CURDATE(), INTERVAL 40 DAY), CURTIME(), 'docx', 0, 0, 3),
(6, 'Frank Front', '1996-07-20', 1, '0900000003', 'BS IT', 'frank@front.com', 'React, Angular', 'English', 'JS', '2 Years', 'Mid', '3500', DATE_SUB(CURDATE(), INTERVAL 2 DAY), CURTIME(), 'pdf', 0, 0, 1),
(7, 'Grace Finance', '1993-02-28', 0, '0900000004', 'MS Finance', 'grace@fin.com', 'Excel, SAP', 'English', 'Finance', '5 Years', 'Senior', '6000', CURDATE(), CURTIME(), 'pdf', 0, 0, 5),
(8, 'Harry Legal', '1989-11-11', 1, '0900000005', 'JD Law', 'harry@legal.com', 'Contracts', 'English', 'Legal', '8 Years', 'Senior', '9000', CURDATE(), CURTIME(), 'pdf', 0, 0, 6),
(9, 'Ivy Ops', '1994-08-08', 0, '0900000006', 'BS BA', 'ivy@ops.com', 'Logistics', 'German', 'Ops', '4 Years', 'Mid', '4500', CURDATE(), CURTIME(), 'pdf', 0, 0, 7),
(10, 'Jack Support', '1999-09-09', 1, '0900000007', 'High School', 'jack@sup.com', 'Communicator', 'English', 'Support', '1 Year', 'Junior', '2500', CURDATE(), CURTIME(), 'docx', 0, 0, 8),
(11, 'Kevin DevOps', '1991-04-04', 1, '0900000008', 'BS CS', 'kevin@devops.com', 'AWS, Linux', 'English', 'Cloud', '6 Years', 'Senior', '8000', CURDATE(), CURTIME(), 'pdf', 0, 1, 9),
(12, 'Laura Product', '1990-10-10', 0, '0900000009', 'MBA', 'laura@prod.com', 'Jira', 'English', 'Product', '7 Years', 'Senior', '8500', CURDATE(), CURTIME(), 'pdf', 0, 0, 10),
(13, 'Mike ML', '1995-01-01', 1, '0900000010', 'MS AI', 'mike@ml.com', 'Python, PyTorch', 'English', 'AI', '3 Years', 'Mid', '7000', CURDATE(), CURTIME(), 'pdf', 0, 1, 12),
(14, 'Nancy Node', '1997-03-03', 0, '0900000011', 'BS CS', 'nancy@node.com', 'NodeJS, Express', 'English', 'JS', '2 Years', 'Junior', '4000', CURDATE(), CURTIME(), 'pdf', 0, 0, 11),
(15, 'Oscar Java', '1994-05-05', 1, '0900000012', 'BS CS', 'oscar@java.com', 'Java, EE', 'French', 'Java', '4 Years', 'Mid', '5500', CURDATE(), CURTIME(), 'pdf', 0, 0, 1),
(16, 'Paul Python', '1993-06-06', 1, '0900000013', 'BS Math', 'paul@py.com', 'Python, Django', 'English', 'Python', '5 Years', 'Senior', '6000', CURDATE(), CURTIME(), 'pdf', 0, 0, 12),
(17, 'Quinn QA', '1996-07-07', 0, '0900000014', 'BS IT', 'quinn@qa.com', 'Selenium', 'English', 'Testing', '3 Years', 'Mid', '4000', CURDATE(), CURTIME(), 'docx', 0, 0, 11),
(18, 'Rachel React', '1998-08-08', 0, '0900000015', 'Bootcamp', 'rachel@react.com', 'React, Redux', 'English', 'JS', '1 Year', 'Junior', '3000', CURDATE(), CURTIME(), 'pdf', 0, 0, 11),
(19, 'Steve Sec', '1990-12-12', 1, '0900000016', 'BS CS', 'steve@sec.com', 'CyberSec', 'English', 'Security', '8 Years', 'Senior', '9500', CURDATE(), CURTIME(), 'pdf', 0, 0, 9),
(20, 'Tina Tech', '1999-01-20', 0, '0900000017', 'BS IT', 'tina@tech.com', 'IT Support', 'English', 'Support', '1 Year', 'Junior', '2500', CURDATE(), CURTIME(), 'docx', 0, 0, 8);

-- 7. Candidate Status
INSERT INTO easyhire_candidate_status (candidate_status_candidate_id, candidate_status_status_id, candidate_status_change_status_user_id, candidate_status_date) VALUES
(1, 1, 1, '2025-01-20'),
(1, 2, 1, '2025-01-21'),
(1, 4, 1, '2025-01-22'),
(2, 1, 1, '2025-01-15'),
(2, 7, 1, '2025-01-16'),
(3, 1, 1, '2025-01-01'),
(3, 2, 1, '2025-01-02'),
(3, 3, 1, '2025-01-03'),
(3, 4, 1, '2025-01-05'),
(3, 5, 1, '2025-01-10'),
(3, 6, 1, '2025-01-12'),
(11, 1, 11, '2025-01-10'),
(11, 2, 11, '2025-01-11'),
(11, 4, 11, '2025-01-15'),
(11, 5, 11, '2025-01-20'),
(13, 1, 1, '2025-01-18'),
(13, 2, 1, '2025-01-19'),
(13, 4, 1, '2025-01-22'),
(4, 1, 1, '2025-02-01'),
(5, 1, 1, '2025-01-01'),
(5, 2, 1, '2025-01-02'),
(6, 1, 1, '2025-02-01'),
(7, 1, 1, '2025-02-02'),
(8, 1, 1, '2025-02-03'),
(9, 1, 1, '2025-02-03'),
(10, 1, 1, '2025-02-04'),
(12, 1, 1, '2025-02-01'),
(14, 1, 1, '2025-02-02'),
(15, 1, 1, '2025-02-02'),
(16, 1, 1, '2025-02-02'),
(17, 1, 1, '2025-02-03'),
(18, 1, 1, '2025-02-03'),
(19, 1, 1, '2025-02-04'),
(20, 1, 1, '2025-02-04');

-- 8. Interviews
INSERT INTO easyhire_interview (interview_id, interview_start_date, interview_start_time, interview_end_time, interview_type, interview_location, interview_stage, interview_status, interview_created_datetime, interview_created_user_id, interview_vacany_id) VALUES
(1, DATE_ADD(CURDATE(), INTERVAL 2 DAY), '10:00', '11:00', 'Online', 'Zoom', 1, 1, '2025-01-22', 1, 1),
(2, DATE_SUB(CURDATE(), INTERVAL 15 DAY), '14:00', '15:00', 'In-Person', 'Room 101', 1, 0, '2025-01-05', 1, 2),
(3, DATE_ADD(CURDATE(), INTERVAL 1 DAY), '16:00', '17:00', 'Phone', 'N/A', 1, 1, '2025-02-01', 1, 1),
(4, DATE_SUB(CURDATE(), INTERVAL 10 DAY), '10:00', '11:00', 'Online', 'Meet', 1, 0, '2025-01-15', 11, 9),
(5, DATE_ADD(CURDATE(), INTERVAL 3 DAY), '11:00', '12:00', 'Online', 'Teams', 1, 1, '2025-01-22', 1, 12),
(6, DATE_ADD(CURDATE(), INTERVAL 5 DAY), '09:00', '10:00', 'In-Person', 'Office', 1, 1, '2025-02-03', 3, 1),
(7, DATE_ADD(CURDATE(), INTERVAL 6 DAY), '10:00', '11:00', 'Online', 'Zoom', 1, 1, '2025-02-03', 1, 12),
(8, DATE_ADD(CURDATE(), INTERVAL 4 DAY), '13:00', '14:00', 'Online', 'Meet', 1, 1, '2025-02-04', 11, 9),
(9, DATE_ADD(CURDATE(), INTERVAL 10 DAY), '10:00', '11:00', 'In-Person', 'HQ', 2, 1, '2025-01-30', 1, 1),
(10, DATE_SUB(CURDATE(), INTERVAL 5 DAY), '14:00', '15:00', 'In-Person', 'HQ', 2, 0, '2025-01-20', 11, 9);

-- 9. Interview Users
INSERT INTO easyhire_interview_user (interview_id, user_id) VALUES
(1, 3), (2, 2), (3, 3), (4, 11), (5, 3), (6, 3), (7, 3), (8, 13), (9, 3), (9, 6), (10, 11), (10, 6);

-- 10. Candidate Interview
INSERT INTO easyhire_candidate_interview (candidate_interview_status, candidate_interview_date, candidate_interview_status_changed_user_id, candidate_interview_interview_id, candidate_interview_candidate_id) VALUES
('Active', DATE_ADD(CURDATE(), INTERVAL 2 DAY), 1, 1, 1),
('Passed', DATE_SUB(CURDATE(), INTERVAL 15 DAY), 1, 2, 3),
('Cancel', DATE_ADD(CURDATE(), INTERVAL 1 DAY), 1, 3, 6),
('Passed', DATE_SUB(CURDATE(), INTERVAL 10 DAY), 11, 4, 11),
('Active', DATE_ADD(CURDATE(), INTERVAL 3 DAY), 1, 5, 13),
('Active', DATE_ADD(CURDATE(), INTERVAL 5 DAY), 3, 6, 15),
('Active', DATE_ADD(CURDATE(), INTERVAL 6 DAY), 1, 7, 16),
('Active', DATE_ADD(CURDATE(), INTERVAL 4 DAY), 13, 8, 19),
('Active', DATE_ADD(CURDATE(), INTERVAL 10 DAY), 1, 9, 1),
('Passed', DATE_SUB(CURDATE(), INTERVAL 5 DAY), 11, 10, 11);

-- 11. Mail History
INSERT INTO easyhire_mail_history (mail_history_mail_subject, mail_history_sent_datetime, mail_history_user_id, mail_history_candidate_id) VALUES
('Interview Invitation', '2025-01-22', 1, 1),
('Offer Letter', '2025-01-10', 1, 3),
('Interview Invitation', '2025-01-15', 11, 11),
('Offer Letter', '2025-01-20', 11, 11),
('Interview Invitation', '2025-01-22', 1, 13),
('Rejection Letter', '2025-01-16', 1, 2),
('Interview Invitation', '2025-02-03', 3, 15),
('Acknowledgment', '2025-02-01', 1, 12),
('Acknowledgment', '2025-02-03', 1, 17),
('Acknowledgment', '2025-02-04', 1, 20);

-- 12. Reviews
INSERT INTO easyhire_reviews (reviews_review, reviews_review_by, reviews_reviewed_datetime, reviews_candidate_interview_id) VALUES
('Great candidate, very technical.', 3, '2025-01-22', 1),
('Perfect fit for HR role.', 2, '2025-01-05', 2),
('Strong DevOps skills.', 11, '2025-01-15', 4),
('Good potential but raw.', 3, '2025-01-25', 9),
('Excellent AI knowledge.', 3, '2025-01-23', 5),
('Not suitable for current role.', 3, '2025-02-01', 3),
('Culturally good fit.', 6, '2025-01-20', 10),
('Needs more experience.', 13, '2025-02-05', 8),
('Technically sound.', 3, '2025-02-03', 6),
('Average communication.', 3, '2025-02-03', 7);

-- 13. Notifications
INSERT INTO easyhire_notifications (notification_message, notification_created_at, notification_status, notification_vacancy_id) VALUES
('New Candidate Applied for Java Dev', NOW(), 0, 1),
('Interview Scheduled for Alice', NOW(), 0, 1),
('New Candidate Applied for DevOps', NOW(), 0, 9),
('Interview Scheduled for Kevin', NOW(), 1, 9),
('New Candidate Applied for AI', NOW(), 0, 12),
('Offer Sent to Charlie', NOW(), 1, 2),
('New Candidate Applied for Support', NOW(), 0, 8),
('New Candidate Applied for Legal', NOW(), 0, 6),
('Vacancy Expiring Soon: Sales Rep', NOW(), 0, 3),
('New Candidate Applied for Finance', NOW(), 0, 5);

SET FOREIGN_KEY_CHECKS = 1;

-- Stored Procedures
DROP PROCEDURE IF EXISTS interview_process_date_filter;

DELIMITER //

CREATE PROCEDURE interview_process_date_filter(
    IN startDate DATE,
    IN endDate DATE,
    IN departmentId INT,
    IN positionId INT,
    IN active INT,
    IN reopen INT,
    IN urgent INT
)
BEGIN
    SELECT
        DATE_FORMAT(v.vacancy_created_date, '%d/%m/%Y') AS from_date,
        DATE_FORMAT(v.vacancy_due_date, '%d/%m/%Y') AS to_date,
        p.position_name AS position_name,
        COUNT(c.candidate_vacancy_id) AS total_received_candidate,
        COALESCE(CAST(SUM(c.candidate_is_employ = 1) AS SIGNED), 0) AS offer_mail,
        COALESCE(CAST(SUM(c.candidate_is_mail_sent = 1) AS SIGNED), 0) AS accepted_mail,
        SUM(CASE WHEN last_interview.candidate_interview_status = 'Passed' THEN 1 ELSE 0 END) AS passed_interview_count,
        SUM(CASE WHEN last_interview.candidate_interview_status = 'Pending' THEN 1 ELSE 0 END) AS pending_interview_count,
        SUM(CASE WHEN last_interview.candidate_interview_status = 'Cancel' THEN 1 ELSE 0 END) AS cancel_interview_count,
        SUM(CASE WHEN last_interview.candidate_interview_status = 'Reached' THEN 1 ELSE 0 END) AS reached_interview_count,
        SUM(CASE WHEN last_interview.candidate_interview_status IN ('Passed', 'Pending', 'Cancel') THEN 1 ELSE 0 END) AS interviewed_candidate,
        COUNT(c.candidate_vacancy_id) - SUM(CASE WHEN last_interview.candidate_interview_status IN ('Passed', 'Pending', 'Cancel') THEN 1 ELSE 0 END) AS left_to_view
    FROM easyhire_vacancy v
    LEFT JOIN easyhire_position p ON v.vacancy_position_id = p.position_id
    LEFT JOIN easyhire_candidate c ON v.vacancy_id = c.candidate_vacancy_id
    LEFT JOIN (
        SELECT ci.candidate_interview_candidate_id, ci.candidate_interview_status
        FROM easyhire_candidate_interview ci
        WHERE (ci.candidate_interview_candidate_id, ci.candidate_interview_id) IN (
            SELECT candidate_interview_candidate_id, MAX(candidate_interview_id)
            FROM easyhire_candidate_interview
            GROUP BY candidate_interview_candidate_id
        )
    ) AS last_interview ON c.candidate_id = last_interview.candidate_interview_candidate_id
    WHERE (departmentId IS NULL OR departmentId = 0 OR v.vacancy_department_id = departmentId)
      AND (positionId IS NULL OR positionId = 0 OR v.vacancy_position_id = positionId)
      AND (startDate IS NULL OR v.vacancy_created_date >= startDate)
      AND (endDate IS NULL OR v.vacancy_created_date <= endDate)
      AND (active IS NULL OR v.vacancy_active = active)
      AND (reopen IS NULL OR v.vacancy_reopen_status = reopen)
      AND (urgent IS NULL OR v.vacancy_urgent = urgent)
    GROUP BY v.vacancy_id
    ORDER BY v.vacancy_created_date;
END //

DELIMITER ;

DROP PROCEDURE IF EXISTS candidate_summary_combined_filter;

DELIMITER //

CREATE PROCEDURE candidate_summary_combined_filter(
    IN vacancyId BIGINT,
    IN positionId INT,
    IN departmentId INT,
    IN interviewStage INT,
    IN selectionStatus VARCHAR(255),
    IN interviewStatus VARCHAR(255),
    IN startDate DATE,
    IN endDate DATE,
    IN isEmploy INT,
    IN isRecall INT
)
BEGIN
    SELECT
        ROW_NUMBER() OVER (ORDER BY c.candidate_id) AS no,
        c.*,
        d.department_name AS department_name,
        CASE
            WHEN c.candidate_gender = 0 THEN 'Male'
            WHEN c.candidate_gender = 1 THEN 'Female'
            ELSE '-'
        END AS gender_text,
        CASE i.interview_stage
            WHEN 1 THEN 'Stage 1'
            WHEN 2 THEN 'Stage 2'
            WHEN 3 THEN 'Stage 3'
            WHEN 4 THEN 'Stage 4'
            ELSE '-'
        END AS interview_stage,
        CASE
            WHEN ci.candidate_interview_date IS NULL THEN '-'
            ELSE ci.candidate_interview_date
        END AS interview_date,
        p.position_name AS position_name,
        CASE
            WHEN ci.candidate_interview_id IS NULL THEN s.status_name
            ELSE ci.candidate_interview_status
        END AS combine_status,
        CASE
            WHEN c.candidate_is_employ = 1 THEN 'Employed'
            WHEN c.candidate_is_recall = 1 THEN 'Recalled'
            ELSE '-'
        END AS candidate_special_status
    FROM easyhire_candidate c
    LEFT JOIN (
        SELECT c.candidate_id AS cand_id, MAX(ci.candidate_interview_id) AS last_interview_id
        FROM easyhire_candidate c
        LEFT JOIN easyhire_candidate_interview ci ON c.candidate_id = ci.candidate_interview_candidate_id
        GROUP BY c.candidate_id
    ) AS last_interviews ON c.candidate_id = last_interviews.cand_id
    LEFT JOIN (
        SELECT cs1.candidate_status_candidate_id, MAX(cs1.candidate_status_id) AS last_status_id
        FROM easyhire_candidate_status cs1
        GROUP BY cs1.candidate_status_candidate_id
    ) AS last_statuses ON c.candidate_id = last_statuses.candidate_status_candidate_id
    LEFT JOIN easyhire_candidate_status cs ON last_statuses.last_status_id = cs.candidate_status_id
    LEFT JOIN easyhire_status s ON cs.candidate_status_status_id = s.status_id
    LEFT JOIN easyhire_candidate_interview ci ON last_interviews.last_interview_id = ci.candidate_interview_id
    LEFT JOIN easyhire_interview i ON ci.candidate_interview_interview_id = i.interview_id
    LEFT JOIN easyhire_vacancy v ON c.candidate_vacancy_id = v.vacancy_id
    LEFT JOIN easyhire_department d ON v.vacancy_department_id = d.department_id
    LEFT JOIN easyhire_position p ON v.vacancy_position_id = p.position_id
    WHERE (vacancyId IS NULL OR vacancyId = 0 OR v.vacancy_id = vacancyId)
      AND (positionId IS NULL OR positionId = 0 OR p.position_id = positionId)
      AND (departmentId IS NULL OR departmentId = 0 OR d.department_id = departmentId)
      AND (interviewStage IS NULL OR interviewStage = 0 OR i.interview_stage = interviewStage)
      AND (interviewStatus IS NULL OR interviewStatus = '-' OR ci.candidate_interview_status = interviewStatus)
      AND (selectionStatus IS NULL OR selectionStatus = '-' OR s.status_name = selectionStatus)
      AND (
          (startDate IS NULL AND endDate IS NULL) OR
          (endDate IS NULL AND c.candidate_submit_date = startDate) OR
          (startDate IS NULL AND c.candidate_submit_date = endDate) OR
          (startDate IS NOT NULL AND endDate IS NOT NULL AND c.candidate_submit_date BETWEEN startDate AND endDate)
      )
      AND (isEmploy IS NULL OR c.candidate_is_employ = isEmploy)
      AND (isRecall IS NULL OR c.candidate_is_recall = isRecall);
END //

DELIMITER ;
