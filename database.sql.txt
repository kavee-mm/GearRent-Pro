-- ===============================
-- Database: GearRentPro
-- ===============================

CREATE DATABASE IF NOT EXISTS gearrentpro;
USE gearrentpro;

-- ===============================
-- BRANCH (3 branches)
-- ===============================
INSERT INTO branch (code, name, location) VALUES
('B001', 'Colombo Branch', 'Colombo'),
('B002', 'Kandy Branch', 'Kandy'),
('B003', 'Galle Branch', 'Galle');

-- ===============================
-- CATEGORY (5 categories)
-- ===============================
INSERT INTO category (code, name) VALUES
('C001', 'Construction'),
('C002', 'Electrical'),
('C003', 'Gardening'),
('C004', 'Cleaning'),
('C005', 'Event Equipment');

-- ===============================
-- CUSTOMER (10+ customers)
-- ===============================
INSERT INTO customer (code, name, address, contact) VALUES
('CU001', 'John Silva', 'Colombo', '0771111111'),
('CU002', 'Nimal Perera', 'Kandy', '0772222222'),
('CU003', 'Saman Jayasuriya', 'Galle', '0773333333'),
('CU004', 'Kamal Fernando', 'Negombo', '0774444444'),
('CU005', 'Ruwan Wijesinghe', 'Kurunegala', '0775555555'),
('CU006', 'Sunil Dias', 'Matara', '0776666666'),
('CU007', 'Pradeep Kumara', 'Jaffna', '0777777777'),
('CU008', 'Chathura Lakshan', 'Anuradhapura', '0778888888'),
('CU009', 'Tharindu Bandara', 'Badulla', '0779999999'),
('CU010', 'Isuru Perera', 'Kalutara', '0760000000');

-- ===============================
-- EQUIPMENT (20+ items)
-- ===============================
INSERT INTO equipment (code, name, categoryCode, qty, pricePerDay) VALUES
('E001', 'Concrete Mixer', 'C001', 5, 3500),
('E002', 'Jack Hammer', 'C001', 4, 4500),
('E003', 'Electric Drill', 'C002', 10, 1200),
('E004', 'Angle Grinder', 'C002', 8, 1500),
('E005', 'Lawn Mower', 'C003', 6, 2500),
('E006', 'Hedge Trimmer', 'C003', 5, 2000),
('E007', 'Vacuum Cleaner', 'C004', 7, 1800),
('E008', 'Pressure Washer', 'C004', 4, 3000),
('E009', 'Stage Lights', 'C005', 12, 2200),
('E010', 'Sound System', 'C005', 3, 5000),
('E011', 'Power Generator', 'C002', 2, 6500),
('E012', 'Cement Cutter', 'C001', 3, 4800),
('E013', 'Leaf Blower', 'C003', 6, 1700),
('E014', 'Floor Polisher', 'C004', 4, 2600),
('E015', 'Portable Speaker', 'C005', 8, 1900),
('E016', 'Electric Saw', 'C001', 5, 4200),
('E017', 'Cable Extension', 'C002', 15, 600),
('E018', 'Water Pump', 'C003', 4, 3100),
('E019', 'Carpet Cleaner', 'C004', 3, 3400),
('E020', 'LED Display Panel', 'C005', 2, 7000);

-- ===============================
-- RENTAL (sample rentals, including totals)
-- ===============================
INSERT INTO rental (code, customerCode, date, total) VALUES
('R001', 'CU001', '2024-11-01', 7000),
('R002', 'CU002', '2024-11-05', 4500),
('R003', 'CU003', '2024-11-10', 12000),
('R004', 'CU004', '2024-11-12', 3000),
('R005', 'CU005', '2024-11-15', 9500);

-- ===============================
-- RESERVATION (sample reservations)
-- ===============================
INSERT INTO reservation (code, customerCode, equipmentCode, fromDate, toDate) VALUES
('RS001', 'CU001', 'E001', '2024-12-01', '2024-12-03'),
('RS002', 'CU002', 'E003', '2024-12-05', '2024-12-06'),
('RS003', 'CU003', 'E010', '2024-12-10', '2024-12-12'),
('RS004', 'CU006', 'E005', '2024-12-15', '2024-12-18'),
('RS005', 'CU008', 'E008', '2024-12-20', '2024-12-22');
