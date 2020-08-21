-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 16, 2020 at 10:31 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

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
-- Table structure for table `0to1`
--

CREATE TABLE `0to1` (
  `DirectNo` int(10) NOT NULL,
  `DirectDesc` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `0to1`
--

INSERT INTO `0to1` (`DirectNo`, `DirectDesc`) VALUES
(1, '<html><div style=\\\"text-align:center\\\"><b>Step 1:</b><br>Proceed straight through main entrance and turn right walking towards the B block</div></html>'),
(2, '<html><div style=\\\"text-align:center\\\"><b>Step 2:</b><br>When entering the B block proceed to the stairs to walk up two flights up stairs</div></html>'),
(3, '<html><div style=\\\"text-align:center\\\"><b>Step 3:</b><br>Turn right in to the passage way,The academic office will be on your right, then left left in to the second passage way and B201 is located at the end of the passage way</div></html>');

-- --------------------------------------------------------

--
-- Table structure for table `0to3`
--

CREATE TABLE `0to3` (
  `DirectNo` int(10) NOT NULL,
  `DirectDesc` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `0to3`
--

INSERT INTO `0to3` (`DirectNo`, `DirectDesc`) VALUES
(1, '<html><div style=\\\"text-align:center\\\"><b>Step 1:</b><br>Proceed straight through main entrance and turn right walking towards the B block</div></html>'),
(2, '<html><div style=\\\"text-align:center\\\"><b>Step 2:</b><br>When entering the B block proceed to the stairs to walk up a single  flight of stairs</div></html>'),
(3, '<html><div style=\\\"text-align:center\\\"><b>Step 3:</b><br>Turn right and head down the small hallway. B105 will be to your immediate right</div></html>');

-- --------------------------------------------------------

--
-- Table structure for table `0to4`
--

CREATE TABLE `0to4` (
  `DirectNo` int(10) NOT NULL,
  `DirectDesc` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `0to4`
--

INSERT INTO `0to4` (`DirectNo`, `DirectDesc`) VALUES
(1, '<html><div style=\\\"text-align:center\\\"><b>Step 1:</b><br>Proceed stright through the main entrance and turn left.</div></html>'),
(2, '<html><div style=\\\"text-align:center\\\"><b>Step 2:</b><br>Enter the A block through the entrance on your left</div></html>'),
(3, '<html><div style=\\\"text-align:center\\\"><b>Step 3:</b><br>Go through the glass door on your right and head left in the small hallway. A001 will be directly infront of you</div></html>');

-- --------------------------------------------------------

--
-- Table structure for table `1to2`
--

CREATE TABLE `1to2` (
  `DirectNo` int(10) NOT NULL,
  `DirectDesc` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `1to2`
--

INSERT INTO `1to2` (`DirectNo`, `DirectDesc`) VALUES
(1, '<html><div style=\\\"text-align:center\\\"><b>Step 1:</b><br>Proceed straight to the emergency stairs and turn right and proceed up the emergency stairs to reach the highest floor of the building</div></html>'),
(2, '<html><div style=\\\"text-align:center\\\"><b>Step 1:</b><br>Turn left into the passage way and proceed straight and B301 will be located at the end of the passage way</div></html>');

-- --------------------------------------------------------

--
-- Table structure for table `2to3`
--

CREATE TABLE `2to3` (
  `DirectNo` int(10) NOT NULL,
  `DirectDesc` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `2to3`
--

INSERT INTO `2to3` (`DirectNo`, `DirectDesc`) VALUES
(1, 'Proceed straight towards the emergency stairs, turn left and proceed down two flights of stairs'),
(2, 'When exiting the emergency stair corridor, turn right into the passage way'),
(3, 'Proceed straight then left into a smaller passage way and B105 is located at the end of the passage way');

-- --------------------------------------------------------

--
-- Table structure for table `3to4`
--

CREATE TABLE `3to4` (
  `DirectNo` int(10) NOT NULL,
  `DirectDesc` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `3to4`
--

INSERT INTO `3to4` (`DirectNo`, `DirectDesc`) VALUES
(1, 'Proceed straight through the small passage way and take an immediate left into the main passage way'),
(2, 'Proceed straight towards the stairs, turn left and proceed down to ground level of the building'),
(3, 'Proceed straight to exit the building and turn left in to the outside parking area'),
(4, 'Proceed straight towards the A block, walk towards the left hand side of the building'),
(5, 'Proceed straight through the main entrance door and turn right into the classroom passage way'),
(6, 'Turn left immediately and proceed straight and A001 will be located at the end of the passage way ');

-- --------------------------------------------------------

--
-- Table structure for table `4to5`
--

CREATE TABLE `4to5` (
  `DirectNo` int(10) NOT NULL,
  `DirectDesc` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `4to5`
--

INSERT INTO `4to5` (`DirectNo`, `DirectDesc`) VALUES
(1, '<html><div style=\\\"text-align:center\\\"><b>Step 1:</b><br>Exit the A Block and turn right. Head across the parking area to the entrance of B block</div></html>'),
(2, '<html><div style=\\\"text-align:center\\\"><b>Step 2:</b><br>Enter the B block and proceed to the right of the stairway</div></html>'),
(3, '<html><div style=\\\"text-align:center\\\"><b>Step 3:</b><br>Proceed through the glass door. B001 will be directly infront of you</div></html>');

-- --------------------------------------------------------

--
-- Table structure for table `eventstable`
--

CREATE TABLE `eventstable` (
  `EventType` varchar(50) NOT NULL,
  `EventDesc` varchar(50) NOT NULL,
  `Time` varchar(25) NOT NULL,
  `DateDay` varchar(10) NOT NULL,
  `DateMonth` varchar(10) NOT NULL,
  `DateYear` int(5) NOT NULL,
  `ID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `eventstable`
--

INSERT INTO `eventstable` (`EventType`, `EventDesc`, `Time`, `DateDay`, `DateMonth`, `DateYear`, `ID`) VALUES
('Assessment ', 'ITDS221 Test 1', '10:00 - 12:00', '8', 'August', 2020, 1),
('Assessment ', 'ITDA221 Presentation', '12:00 - 15:00', '12', 'August', 2020, 2),
('Event', 'Lan Evening', '18:00 - 22:00', '22', 'August', 2020, 3),
('Assessment ', 'ITPM221 Test 2', '09:00 - 11:00', '7', 'September', 2020, 4),
('Assessment ', 'ITCO221 Semester Test', '14:00 - 16:00', '16', 'September', 2020, 5),
('Event', 'JuniorBall', '15:00 - 18:00', '21', 'September', 2020, 6),
('Assessment', 'ITDA221 Semester 2 Assignment', '23:59', '5', 'October', 2020, 7);

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
('Keith', 'Francis', '9101abc', 'Steez', 3),
('Shaun', 'Bishop', '2505abc', 'Steez', 4),
('Deric', 'Bukuru', '4567abc', 'Steez', 5);

-- --------------------------------------------------------

--
-- Table structure for table `timetableyear1`
--

CREATE TABLE `timetableyear1` (
  `Lesson` int(5) NOT NULL,
  `Venue` varchar(10) NOT NULL,
  `SubjectCode` varchar(15) NOT NULL,
  `SubjectName` varchar(50) NOT NULL,
  `StartTime` time DEFAULT NULL,
  `EndTime` time DEFAULT NULL,
  `Day` varchar(20) NOT NULL,
  `ID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `timetableyear1`
--

INSERT INTO `timetableyear1` (`Lesson`, `Venue`, `SubjectCode`, `SubjectName`, `StartTime`, `EndTime`, `Day`, `ID`) VALUES
(1, 'B201', 'ITDS221', 'Data Structures and Algorithms', '09:00:00', '11:00:00', 'Monday', 1),
(2, 'B301', 'ITDA221', 'Data Analysis and Design', '12:00:00', '14:00:00', 'Monday', 2),
(3, 'B105', 'ITSP200', 'Software Development Project 2', '12:00:00', '14:00:00', 'Wednesday', 3),
(4, 'A001', 'ITCO221', 'Internet Server Management', '09:00:00', '11:00:00', 'Thursday', 4),
(5, 'B001', 'ITPM221', 'IT Project Management', '13:00:00', '16:00:00', 'Thursday', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `0to1`
--
ALTER TABLE `0to1`
  ADD PRIMARY KEY (`DirectNo`);

--
-- Indexes for table `0to3`
--
ALTER TABLE `0to3`
  ADD PRIMARY KEY (`DirectNo`);

--
-- Indexes for table `0to4`
--
ALTER TABLE `0to4`
  ADD PRIMARY KEY (`DirectNo`);

--
-- Indexes for table `1to2`
--
ALTER TABLE `1to2`
  ADD PRIMARY KEY (`DirectNo`);

--
-- Indexes for table `2to3`
--
ALTER TABLE `2to3`
  ADD PRIMARY KEY (`DirectNo`);

--
-- Indexes for table `3to4`
--
ALTER TABLE `3to4`
  ADD PRIMARY KEY (`DirectNo`);

--
-- Indexes for table `4to5`
--
ALTER TABLE `4to5`
  ADD PRIMARY KEY (`DirectNo`);

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
-- AUTO_INCREMENT for table `0to1`
--
ALTER TABLE `0to1`
  MODIFY `DirectNo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `0to3`
--
ALTER TABLE `0to3`
  MODIFY `DirectNo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `0to4`
--
ALTER TABLE `0to4`
  MODIFY `DirectNo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `1to2`
--
ALTER TABLE `1to2`
  MODIFY `DirectNo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `2to3`
--
ALTER TABLE `2to3`
  MODIFY `DirectNo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `3to4`
--
ALTER TABLE `3to4`
  MODIFY `DirectNo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `4to5`
--
ALTER TABLE `4to5`
  MODIFY `DirectNo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `eventstable`
--
ALTER TABLE `eventstable`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `timetableyear1`
--
ALTER TABLE `timetableyear1`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
