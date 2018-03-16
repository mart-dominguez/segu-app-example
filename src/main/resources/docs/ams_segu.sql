-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 15-03-2018 a las 13:47:56
-- Versión del servidor: 5.5.58-0ubuntu0.14.04.1
-- Versión de PHP: 5.5.9-1ubuntu4.22
use AMS_SEGU;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `ams_segu`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `USUARIOS`
--

CREATE TABLE IF NOT EXISTS `USUARIOS` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CORREO` varchar(512) NOT NULL,
  `CLAVE` varchar(512) NOT NULL,
  `CLAVE_PLANA` varchar(512) NOT NULL,
  `CLAVE_SHA` varchar(512) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Volcado de datos para la tabla `USUARIOS`
--

INSERT INTO `USUARIOS` (`ID`, `CORREO`, `CLAVE`, `CLAVE_PLANA`, `CLAVE_SHA`) VALUES
(1, 'mdo@mail.com', 'ZWY3OTdjODExOGYwMmRmYjY0OTYwN2RkNWQzZjhjNzYyMzA0OGM5YzA2M2Q1MzJjYzk1YzVlZDdhODk4YTY0Zg==', '12345678', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f'),
(2, 'sfe2@mail.com', 'MDNhYzY3NDIxNmYzZTE1Yzc2MWVlMWE1ZTI1NWYwNjc5NTM2MjNjOGIzODhiNDQ1OWUxM2Y5NzhkN2M4NDZmNA==', '1234', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
(3, 'sfe1@mail.com', 'MDNhYzY3NDIxNmYzZTE1Yzc2MWVlMWE1ZTI1NWYwNjc5NTM2MjNjOGIzODhiNDQ1OWUxM2Y5NzhkN2M4NDZmNA==', '1234', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
(4, 'sfe3@mail.com', 'MDNhYzY3NDIxNmYzZTE1Yzc2MWVlMWE1ZTI1NWYwNjc5NTM2MjNjOGIzODhiNDQ1OWUxM2Y5NzhkN2M4NDZmNA==', '1234', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
(6, 'director1@mail.com', 'MDNhYzY3NDIxNmYzZTE1Yzc2MWVlMWE1ZTI1NWYwNjc5NTM2MjNjOGIzODhiNDQ1OWUxM2Y5NzhkN2M4NDZmNA==', '1234', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
(7, 'director2@mail.com', 'MDNhYzY3NDIxNmYzZTE1Yzc2MWVlMWE1ZTI1NWYwNjc5NTM2MjNjOGIzODhiNDQ1OWUxM2Y5NzhkN2M4NDZmNA==', '1234', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
(8, 'cba1@mail.com', 'MDNhYzY3NDIxNmYzZTE1Yzc2MWVlMWE1ZTI1NWYwNjc5NTM2MjNjOGIzODhiNDQ1OWUxM2Y5NzhkN2M4NDZmNA==', '1234', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
(9, 'cba2@mail.com', 'MDNhYzY3NDIxNmYzZTE1Yzc2MWVlMWE1ZTI1NWYwNjc5NTM2MjNjOGIzODhiNDQ1OWUxM2Y5NzhkN2M4NDZmNA==', '1234', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `USUARIO_GRUPO`
--

CREATE TABLE IF NOT EXISTS `USUARIO_GRUPO` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USUARIO` varchar(512) NOT NULL,
  `GRUPO` varchar(512) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Volcado de datos para la tabla `USUARIO_GRUPO`
--

INSERT INTO `USUARIO_GRUPO` (`ID`, `USUARIO`, `GRUPO`) VALUES
(1, 'mdo@mail.com', 'admin'),
(2, 'director1@mail.com', 'director'),
(3, 'director2@mail.com', 'director'),
(4, 'sfe1@mail.com', 'administrativos_sfe'),
(5, 'sfe2@mail.com', 'administrativos_sfe'),
(6, 'cba1@mail.com', 'administrativos_cba'),
(7, 'sfe3@mail.com', 'administrativos_sfe'),
(8, 'cba2@mail.com', 'administrativos_cba');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
