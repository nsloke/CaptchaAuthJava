-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 24, 2018 at 10:14 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `captchdb`
--
CREATE DATABASE captchdb;
use captchdb;
-- --------------------------------------------------------

--
-- Table structure for table `animaltbl`
--

CREATE TABLE `animaltbl` (
  `userid` varchar(100) NOT NULL,
  `passwd` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `animaltbl`
--

INSERT INTO `animaltbl` (`userid`, `passwd`) VALUES
('arklon', 'Cheetah18Dog69Horse43Hippo');

-- --------------------------------------------------------

--
-- Table structure for table `cltusertbl`
--

CREATE TABLE `cltusertbl` (
  `userid` varchar(100) NOT NULL,
  `passwd` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cltusertbl`
--

INSERT INTO `cltusertbl` (`userid`, `passwd`) VALUES
('abc', 'ROCKY'),
('rocky', 'RAMBO');

-- --------------------------------------------------------

--
-- Table structure for table `texpointstbl`
--

CREATE TABLE `texpointstbl` (
  `userid` varchar(100) NOT NULL,
  `passwd` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `texpointstbl`
--

INSERT INTO `texpointstbl` (`userid`, `passwd`) VALUES
('adre', '197AND190 126AND190 160AND92 ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `animaltbl`
--
ALTER TABLE `animaltbl`
  ADD PRIMARY KEY (`userid`);

--
-- Indexes for table `cltusertbl`
--
ALTER TABLE `cltusertbl`
  ADD PRIMARY KEY (`userid`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
