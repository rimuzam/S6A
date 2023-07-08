-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 08, 2023 at 11:35 AM
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
('D2', 'Richard', 'Laki - Laki', 'Jakarta', 'O'),
('D3', 'Tsunade', 'perempuan', 'Konoha', 'A');

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
  `tgl` date DEFAULT NULL,
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
('2023-06-27', 'D1', 'P2', 169, 98, 'SAKIT'),
('2023-06-29', 'D3', 'P4', 181, 81, 'MENINGGAL'),
('2023-07-18', 'D2', 'P1', 178, 74, 'SEHAT');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
