-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-02-2025 a las 12:16:41
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

DROP DATABASE IF EXISTS inmobiliaria;
CREATE DATABASE inmobiliaria;
USE inmobiliaria;


SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inmobiliaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `noticias`
--

CREATE TABLE `noticias` (
  `id` smallint(5) UNSIGNED NOT NULL,
  `titulo` varchar(100) NOT NULL DEFAULT '',
  `texto` text NOT NULL,
  `categoria` enum('promociones','ofertas','costas') NOT NULL DEFAULT 'promociones',
  `fecha` date NOT NULL DEFAULT '2020-01-01',
  `imagen` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `noticias`
--

INSERT INTO `noticias` (`id`, `titulo`, `texto`, `categoria`, `fecha`, `imagen`) VALUES
(1, 'Nueva promocion en Nervion', '145 viviendas de lujo en urbanizacion ajardinada situadas en un entorno privilegiado', 'promociones', '2004-02-04', NULL),
(2, 'Ultimas viviendas junto al rio', 'Apartamentos de 1 y 2 dormitorios, con fantasticas vistas. Excelentes condiciones de financiacion.', 'ofertas', '2004-02-05', NULL),
(3, 'Apartamentos en el Puerto de Sta Maria', 'En la playa de Valdelagrana, en primera linea de playa. Pisos reformados y completamente amueblados.', 'costas', '2004-02-06', 'apartamento8.jpg'),
(4, 'Casa reformada en el barrio de la Juderia', 'Dos plantas y atico, 5 habitaciones, patio interior, amplio garaje. Situada en una calle tranquila y a un paso del centro historico.', 'promociones', '2004-02-07', NULL),
(5, 'Promocion en Costa Ballena', 'Con vistas al campo de golf, magnificas calidades, entorno ajardinado con piscina y servicio de vigilancia.', 'costas', '2004-02-09', 'apartamento9.jpg'),
(18, '#TS #TS #TS #TS #TS #TS #TS #TS #TS #TS #TS', '#PMO #PMO #PMO #PMO #PMO #PMO #PMO #PMO #PMO #PMO #PMO #PMO #PMO #PMO #PMO #PMO #ICL #ICL #ICL #ICL #ICL #ICL #ICL #ICL #ICL #ICL', 'costas', '2025-02-19', 'barrita.gif'),
(19, 'Kayne West', 'Are We employed 😭😭😭😭😭😭😭??????', 'costas', '2025-02-19', 'squid-game-squid-game-2.gif'),
(20, 'We re fucking DeadAsss', '#sybau #pmo #icl #ts #fr #fn #nm #cya', 'ofertas', '2025-02-19', ''),
(21, '#TS #TS #TS #TS #TS #TS #TS #TS #TS #TS #TS', '#TS #TS #TS #TS #TS #TS #TS #TS #TS #TS #TS	#TS #TS #TS #TS #TS #TS #TS #TS #TS #TS #TS	#TS #TS #TS #TS #TS #TS #TS #TS #TS #TS #TS', 'costas', '2025-02-19', 'a74d56f7-eda9-48ea-ad96-33a3eda21152-1738930467673.webp');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `noticias`
--
ALTER TABLE `noticias`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `noticias`
--
ALTER TABLE `noticias`
  MODIFY `id` smallint(5) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
