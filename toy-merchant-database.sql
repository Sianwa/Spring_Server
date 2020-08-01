-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 01, 2020 at 09:37 PM
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
-- Database: `toy-merchant-database`
--

-- --------------------------------------------------------

--
-- Table structure for table `toy_identification_details`
--

CREATE TABLE `toy_identification_details` (
  `id` int(11) NOT NULL,
  `toy_code` int(11) NOT NULL,
  `toy_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `toy_identification_details`
--

INSERT INTO `toy_identification_details` (`id`, `toy_code`, `toy_name`) VALUES
(0, 23456, 'test');

-- --------------------------------------------------------

--
-- Table structure for table `toy_information`
--

CREATE TABLE `toy_information` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `description` varchar(255) NOT NULL,
  `price` int(11) NOT NULL,
  `date_of_ manufacture` date NOT NULL,
  `batch_number` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `toy_manufacturer_details`
--

CREATE TABLE `toy_manufacturer_details` (
  `id` int(11) NOT NULL,
  `company_name` text NOT NULL,
  `street_address` varchar(255) NOT NULL,
  `zip_code` int(11) NOT NULL,
  `country` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `toy_identification_details`
--
ALTER TABLE `toy_identification_details`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `toy_code` (`toy_code`);

--
-- Indexes for table `toy_information`
--
ALTER TABLE `toy_information`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `toy_manufacturer_details`
--
ALTER TABLE `toy_manufacturer_details`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
