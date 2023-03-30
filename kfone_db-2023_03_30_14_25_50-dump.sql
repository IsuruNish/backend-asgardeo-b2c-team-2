-- MySQL dump 10.13  Distrib 8.0.32, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: kfone
-- ------------------------------------------------------
-- Server version	8.0.32-0ubuntu0.22.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `email` varchar(255) NOT NULL,
  `name` text,
  `points` text,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('pasan@gmail.com','pasan',NULL),('pasan1@gmail.com','pasan',NULL),('pasan2@gmail.com','pasan',NULL),('pasan5@gmail.com','pasan',NULL);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `device`
--

DROP TABLE IF EXISTS `device`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `device` (
  `id` varchar(255) NOT NULL,
  `brand` text,
  `description` text,
  `name` text,
  `price` text,
  `type` text,
  `image_path` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `device`
--

LOCK TABLES `device` WRITE;
/*!40000 ALTER TABLE `device` DISABLE KEYS */;
INSERT INTO `device` VALUES ('10','Samsung','The Galaxy Watch 4 features a 1.2-inch AMOLED display, Exynos W920 chip, 5ATM water resistance, and a range of health and fitness tracking features.','Samsung Galaxy Watch 4','249','wearable',NULL),('11','Fitbit','The Charge 5 features a color AMOLED display, 7-day battery life, 5ATM water resistance, and a range of health and fitness tracking features.','Fitbit Charge 5','179','wearable',NULL),('4','Apple','The iPhone 13 features a 6.1-inch Super Retina XDR display, A15 Bionic chip, 5G ,connectivity, and a dual-camera system with night mode.','Apple iPhone 13','799','smartphone',NULL),('5','Samsung','The Galaxy S21 Ultra features a 6.8-inch Dynamic AMOLED 2X display, Snapdragon 888 processor, 5G connectivity, and a quad-camera system with 100x Space Zoom.','Samsung Galaxy S21 Ultra','1199','smartphone',NULL),('6','Google','The Pixel 6 Pro features a 6.7-inch OLED display, Google Tensor chip, 5G connectivity, and a triple-camera system with 4x optical zoom.','Google Pixel 6 Pro','899','smartphone',NULL),('8','Apple','The iPad Pro features an 11-inch Liquid Retina display, M1 chip, 5G connectivity, and a 12MP Ultra Wide front camera and 12MP Wide rear camera.','iPad Pro (2021)','799','tablet',NULL),('9','Microsoft','The Surface Duo 2 features dual 5.8-inch OLED displays, Snapdragon 888 processor, 5G connectivity, and a dual-camera system with 4K video recording.','Microsoft Surface Duo 2','1499','tablet',NULL);
/*!40000 ALTER TABLE `device` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `device_purchase`
--

DROP TABLE IF EXISTS `device_purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `device_purchase` (
  `customer_id` varchar(255) NOT NULL,
  `device_id` varchar(255) NOT NULL,
  PRIMARY KEY (`customer_id`,`device_id`),
  KEY `FK9vdboki0fta3yy5mq9cw6w5aj` (`device_id`),
  CONSTRAINT `FK6mf6bc2lk1gpyeue8u0ikboxt` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`email`),
  CONSTRAINT `FK9vdboki0fta3yy5mq9cw6w5aj` FOREIGN KEY (`device_id`) REFERENCES `device` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `device_purchase`
--

LOCK TABLES `device_purchase` WRITE;
/*!40000 ALTER TABLE `device_purchase` DISABLE KEYS */;
/*!40000 ALTER TABLE `device_purchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (16);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service` (
  `id` varchar(255) NOT NULL,
  `name` text,
  `price` text,
  `type` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES ('12','data_plan_1','20','wireless_service'),('13','Home Broadband','300','internet_service'),('14','Cloud Storage','300','cloud_service'),('15','Backup','1000','cloud_service');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_purchase`
--

DROP TABLE IF EXISTS `service_purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_purchase` (
  `customer_id` varchar(255) NOT NULL,
  `service_id` varchar(255) NOT NULL,
  PRIMARY KEY (`customer_id`,`service_id`),
  KEY `FKp8ao2bvg8wwqf0d5i7l6t1b3i` (`service_id`),
  CONSTRAINT `FK2w64g1mxs4yralb7nj5mm7095` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`email`),
  CONSTRAINT `FKp8ao2bvg8wwqf0d5i7l6t1b3i` FOREIGN KEY (`service_id`) REFERENCES `service` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_purchase`
--

LOCK TABLES `service_purchase` WRITE;
/*!40000 ALTER TABLE `service_purchase` DISABLE KEYS */;
/*!40000 ALTER TABLE `service_purchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `id` int NOT NULL,
  `age` int NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-30 14:25:50
