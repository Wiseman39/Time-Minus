-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307
-- Generation Time: Aug 11, 2020 at 06:07 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `timeminus`
--

-- --------------------------------------------------------

--
-- Table structure for table `eventstable`
--

CREATE TABLE `eventstable` (
  `EventType` varchar(50) NOT NULL,
  `EventDesc` varchar(50) NOT NULL,
  `DateDay` varchar(10) NOT NULL,
  `DateMonth` varchar(10) NOT NULL,
  `DateYear` int(5) NOT NULL,
  `ID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `eventstable`
--

INSERT INTO `eventstable` (`EventType`, `EventDesc`, `DateDay`, `DateMonth`, `DateYear`, `ID`) VALUES
('Test', 'ITDS221', '8', 'August', 2020, 1),
('Test', 'ITDA221', '12', 'August', 2020, 2),
('Event', 'Lan Evening', '22', 'August', 2020, 3),
('Test', 'ITPM221', '7', 'September', 2020, 4),
('Test', 'ITCO221', '16', 'September', 2020, 5),
('Event', 'JuniorBall', '21', 'September', 2020, 6);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `StudentName` varchar(50) NOT NULL,
  `StudentSurname` varchar(50) NOT NULL,
  `StudentUserName` varchar(50) NOT NULL,
  `StudentPassword` varchar(50) NOT NULL,
  `ID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`StudentName`, `StudentSurname`, `StudentUserName`, `StudentPassword`, `ID`) VALUES
('Kieran', 'Conradie', '1234abc', 'Steez', 1),
('Justin', 'Els', '5678abc', 'Steez', 2),
('Keith', 'Francis', '91011abc', 'Steez', 3);

-- --------------------------------------------------------

--
-- Table structure for table `timetableyear1`
--

CREATE TABLE `timetableyear1` (
  `Lesson` int(5) NOT NULL,
  `Venue` varchar(10) NOT NULL,
  `Subject` varchar(50) NOT NULL,
  `ID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `timetableyear1`
--

INSERT INTO `timetableyear1` (`Lesson`, `Venue`, `Subject`, `ID`) VALUES
(1, 'B201', 'ITDS221', 1),
(2, 'B301', 'ITDA221', 2),
(3, 'B105', 'ITSP200', 3),
(4, 'A001', 'ITCO221', 4),
(5, 'B203', 'ITPM221', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `eventstable`
--
ALTER TABLE `eventstable`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `timetableyear1`
--
ALTER TABLE `timetableyear1`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `eventstable`
--
ALTER TABLE `eventstable`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `timetableyear1`
--
ALTER TABLE `timetableyear1`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
