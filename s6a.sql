-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2023 at 01:18 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `s6a`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kode` varchar(30) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `model` varchar(50) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `kadar` varchar(20) NOT NULL,
  `berat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kode`, `nama`, `model`, `jenis`, `kadar`, `berat`) VALUES
('001', 'Rosemery Ring', 'Cincin', 'Emas pink', '99%', '3'),
('002', 'Diamond Ring', 'Cincin', 'Emas Putih', '90%', '4'),
('003', 'Kalung Putih', 'Kalung', 'Emas Putih', '80%', '4');

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `id` varchar(30) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jk` varchar(20) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `goldar` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`id`, `nama`, `jk`, `alamat`, `goldar`) VALUES
('D1', 'Chopper', 'Laki - Laki', 'Grand Blue', 'AB'),
('D2', 'Richard', 'Laki - Laki', 'Jakarta', 'O');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `kode` varchar(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jenis` varchar(100) NOT NULL,
  `stok` varchar(10) NOT NULL,
  `lapangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`kode`, `nama`, `jenis`, `stok`, `lapangan`) VALUES
('FB02', 'Gawang Futsal', 'Gawang', '3', 'Futsal'),
('BB01', 'Bola Basket', 'Bola', '5', 'Basket'),
('BB02', 'Ring Basket', 'Tiang', '3', 'Basket'),
('VB01', 'Bola Voli', 'Bola', '5', 'Voli');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` varchar(50) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
('AD001', 'unindra', 'jakarta'),
('AD002', 'admin', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `mhs`
--

CREATE TABLE `mhs` (
  `npm` int(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `noHP` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `kode` varchar(10) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `jenis_obat` varchar(100) NOT NULL,
  `satuan` varchar(100) NOT NULL,
  `harga_beli` int(100) NOT NULL,
  `harga_jual` int(100) NOT NULL,
  `stok` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`kode`, `nama_obat`, `jenis_obat`, `satuan`, `harga_beli`, `harga_jual`, `stok`) VALUES
('001', 'Paracetamol', 'Analgesik', 'Botol', 35000, 56000, 100),
('003', 'Omeprazole	', 'Antasid', 'Botol', 42000, 77000, 75),
('004', 'Loratadine', 'Antihistamin', 'Strip', 25000, 45000, 200);

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `id` varchar(30) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jk` varchar(20) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `goldar` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`id`, `nama`, `jk`, `alamat`, `goldar`) VALUES
('P1', 'Jokowi', 'Laki - Laki', 'Solo', 'O'),
('P2', 'Megawati', 'perempuan', 'Jakarta', 'AO'),
('P3', 'Ujang', 'Laki - Laki', 'Jonggol', 'AB'),
('P4', 'Alex Bhizer', 'Laki - Laki', 'Bekasi', 'A');

-- --------------------------------------------------------

--
-- Table structure for table `rekam`
--

CREATE TABLE `rekam` (
  `tgl` varchar(30) NOT NULL,
  `id_dok` varchar(50) NOT NULL,
  `id_pas` varchar(50) NOT NULL,
  `tb` int(11) NOT NULL,
  `bb` int(11) NOT NULL,
  `diagnosa` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rekam`
--

INSERT INTO `rekam` (`tgl`, `id_dok`, `id_pas`, `tb`, `bb`, `diagnosa`) VALUES
('0000-00-00', 'D1', 'P2', 178, 100, 'SAKIT JANTUNG'),
('0000-00-00', 'D1', 'P1', 179, 89, 'SEHAT'),
('0000-00-00', 'D2', 'P4', 190, 99, 'Geger Otak'),
('MMM d, y', 'D2', 'P1', 178, 100, 'Sehat');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `pekerjaan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nama`, `alamat`, `pekerjaan`) VALUES
(6, 'Samsul', 'Sumedang', 'Admin'),
(64, 'Ridho multazam', 'Bogor', 'Software Enginner'),
(65, 'Rizky', 'Jakarta', 'Office Boy');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mhs`
--
ALTER TABLE `mhs`
  ADD KEY `npm` (`npm`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
