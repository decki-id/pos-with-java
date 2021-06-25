-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 20 Jan 2018 pada 08.24
-- Versi Server: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_jual`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`ID`, `Username`, `Password`) VALUES
(1, 'Decki', '1993');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE IF NOT EXISTS `barang` (
  `Kode_Barang` varchar(5) NOT NULL,
  `Nama_Barang` varchar(35) NOT NULL,
  `Stock_Barang` int(11) NOT NULL,
  `Harga_Barang` int(11) NOT NULL,
  PRIMARY KEY (`Kode_Barang`),
  UNIQUE KEY `Nama_Barang` (`Nama_Barang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`Kode_Barang`, `Nama_Barang`, `Stock_Barang`, `Harga_Barang`) VALUES
('C001', 'CPU', 15, 1700000),
('F001', 'Flashdisk', 40, 100000),
('H001', 'Harddisk', 32, 230000),
('K001', 'Keyboard', 21, 55000),
('M001', 'Mouse', 50, 25000),
('M002', 'Monitor', 13, 750000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `detailjual`
--

CREATE TABLE IF NOT EXISTS `detailjual` (
  `Nomor_Faktur` varchar(10) CHARACTER SET latin1 COLLATE latin1_general_ci NOT NULL,
  `Nama_Barang` varchar(35) CHARACTER SET latin1 COLLATE latin1_general_ci NOT NULL,
  `Jumlah_Barang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `detailjual`
--

INSERT INTO `detailjual` (`Nomor_Faktur`, `Nama_Barang`, `Jumlah_Barang`) VALUES
('FJ001', 'Monitor', 3),
('FJ002', 'Mouse', 2),
('FJ002', 'Keyboard', 2),
('FJ003', 'Mouse', 4),
('FJ004', 'CPU', 1),
('FJ005', 'Harddisk', 2),
('FJ006', 'Keyboard', 3),
('FJ007', 'Monitor', 1),
('FJ008', 'Flashdisk', 5);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE IF NOT EXISTS `pelanggan` (
  `ID_Pelanggan` varchar(5) NOT NULL,
  `Nama_Pelanggan` varchar(35) NOT NULL,
  `Jenis_Kelamin` varchar(11) NOT NULL,
  `Alamat_Rumah` varchar(35) NOT NULL,
  `Nomor_Telepon` varchar(15) NOT NULL,
  PRIMARY KEY (`ID_Pelanggan`),
  UNIQUE KEY `Nama_Pelanggan` (`Nama_Pelanggan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`ID_Pelanggan`, `Nama_Pelanggan`, `Jenis_Kelamin`, `Alamat_Rumah`, `Nomor_Telepon`) VALUES
('P001', 'Novi Rahmayanti', 'Perempuan', 'Jl. Aceh No. 21 Bandung', '+622220120'),
('P002', 'Ghulam Guntara', 'Laki-Laki', 'Jl. Lebak Bulus No. 1 Jakarta', '+622252243435'),
('P003', 'Mugi Astuti', 'Perempuan', 'Jl. Buah Batu No. 5 Bandung', '+6285722484884'),
('P004', 'Decki Herdiawan Soepandi', 'Laki-Laki', 'Padalarang', '+6282216668131'),
('P005', 'Novia Afifah', 'Perempuan', 'Ciparay, Bandung', '+61899432678');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE IF NOT EXISTS `penjualan` (
  `Nomor_Faktur` varchar(10) CHARACTER SET latin1 COLLATE latin1_general_ci NOT NULL,
  `Nama_Pelanggan` varchar(35) NOT NULL,
  `Tanggal_Penjualan` date NOT NULL,
  PRIMARY KEY (`Nomor_Faktur`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penjualan`
--

INSERT INTO `penjualan` (`Nomor_Faktur`, `Nama_Pelanggan`, `Tanggal_Penjualan`) VALUES
('FJ001', 'Ghulam Guntara', '2010-03-19'),
('FJ002', 'Mugi Astuti', '2010-03-21'),
('FJ003', 'Novi Rahmayanti', '2010-03-21'),
('FJ004', 'Decki Herdiawan Soepandi', '2018-01-18'),
('FJ005', 'Ghulam Guntara', '2018-01-20'),
('FJ006', 'Novia Afifah', '2018-01-20'),
('FJ007', 'Novia Afifah', '2018-01-20'),
('FJ008', 'Novi Rahmayanti', '2018-01-20');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
