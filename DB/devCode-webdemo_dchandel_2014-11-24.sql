CREATE DATABASE  IF NOT EXISTS `dchandel` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `dchandel`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: dchandel
-- ------------------------------------------------------
-- Server version	5.6.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer_order`
--

DROP TABLE IF EXISTS `customer_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_order` (
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `oredrNumber` varchar(200) DEFAULT NULL,
  `date_order_placed` date DEFAULT NULL,
  `customerId` varchar(60) DEFAULT NULL,
  `total_order_price` double DEFAULT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_order`
--

LOCK TABLES `customer_order` WRITE;
/*!40000 ALTER TABLE `customer_order` DISABLE KEYS */;
INSERT INTO `customer_order` VALUES (29,'6c7ab5bd-cc65-460f-a0fd-4906e5e8fa7d','2014-10-21','semaneiro',5470),(30,'31b7c1bc-3571-461b-93a9-25675a0e2149','2014-10-21','semaneiro',650),(31,'5a3f13ca-d3ad-4e40-85c1-f6e3186546f4','2014-10-21','semaneiro',1240),(32,'8abbf5c2-ce43-428f-b37b-d871195a3f22','2014-10-21','semaneiro',270),(33,'75ddfce6-7603-4f77-9e17-dd0ea13ad395','2014-10-22','markbe',650),(34,'e70b4291-6d67-4be5-ad07-47397d70b511','2014-10-22','markbe',142),(35,'2502108f-2e43-407e-b728-27e34f9d6473','2014-10-23','markbe',210),(36,'d97dd88d-2243-44e0-83bc-0ac75b152ab8','2014-10-23','markbe',0),(37,'90dc115c-47ed-4fd0-bdc8-15c6711679d6','2014-10-23','markbe',183),(38,'5dbdee14-0c6f-4b9d-8c1f-358d36fc3004','2014-10-23','markbe',120),(39,'94ecfaed-ce51-4652-90ed-3f9c84e7ebc7','2014-10-23','markbe',210),(40,'74b8aa0a-fd50-4e07-9bc2-5e3b0d142648','2014-10-23','markbe',120),(41,'0c66d433-5913-424a-a714-99f3c74d2789','2014-10-27','celsius',210),(42,'fb6274d4-35f2-4b0a-a272-a58cc190170a','2014-10-29','markbe',215),(43,'5d48c410-c1a9-49ab-83d7-6dd93f02df94','2014-10-31','markbe',300),(44,'34ca4e1c-df92-456f-ad71-08bb892c7e9d','2014-10-31','markbe',145),(45,'f2fe6d6c-4546-4271-bd0a-d920d17542e5','2014-10-31','semaneiro',242),(46,'120b3cda-7673-4955-b15c-5660630ed596','2014-11-10','markbe',120),(47,'c45abaf4-e621-4840-a441-e1e70be9360a','2014-11-10','markbe',158),(48,'87a3b23f-748e-4dd2-bb95-1c3d0d0da60a','2014-11-10','markbe',158),(49,'39c86e11-b577-4fd6-b49a-4496f1b91ab5','2014-11-10','markbe',158),(50,'61de557e-b964-4ac0-86dd-7464d7bd7d84','2014-11-10','markbe',158),(51,'4a37fbe1-cce4-4518-bb3b-504a1fc1d846','2014-11-10','markbe',158),(52,'4dbbaa32-e6e5-4d8f-ba9d-5c1af09cced6','2014-11-11','Hanna88',180),(53,'25979ebe-4fe1-466f-a20a-c69bd2109e7b','2014-11-17','markbe',248),(54,'db903021-a8fa-4afe-9a7a-22a4b8aa7322','2014-11-17','markbe',248),(55,'b4d885d0-13b5-470a-a01b-06f218f27f96','2014-11-17','markbe',210),(56,'619a3813-e655-4a6c-a883-ba2d5c458a88','2014-11-17','markbe',420),(57,'9f43d275-a125-44b1-bf93-afe79e841756','2014-11-17','markbe',145);
/*!40000 ALTER TABLE `customer_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderline`
--

DROP TABLE IF EXISTS `orderline`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderline` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderId` varchar(200) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `productId` int(11) DEFAULT NULL,
  `quantity` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderline`
--

LOCK TABLES `orderline` WRITE;
/*!40000 ALTER TABLE `orderline` DISABLE KEYS */;
INSERT INTO `orderline` VALUES (6,'6c7ab5bd-cc65-460f-a0fd-4906e5e8fa7d',1240,2,3),(7,'6c7ab5bd-cc65-460f-a0fd-4906e5e8fa7d',890,8,1),(8,'6c7ab5bd-cc65-460f-a0fd-4906e5e8fa7d',860,9,1),(9,'31b7c1bc-3571-461b-93a9-25675a0e2149',650,1,1),(10,'5a3f13ca-d3ad-4e40-85c1-f6e3186546f4',1240,2,1),(11,'8abbf5c2-ce43-428f-b37b-d871195a3f22',270,7,1),(12,'75ddfce6-7603-4f77-9e17-dd0ea13ad395',650,1,1),(13,'e70b4291-6d67-4be5-ad07-47397d70b511',32,2,1),(14,'e70b4291-6d67-4be5-ad07-47397d70b511',65,6,1),(15,'e70b4291-6d67-4be5-ad07-47397d70b511',45,1,1),(16,'2502108f-2e43-407e-b728-27e34f9d6473',210,9,1),(17,'90dc115c-47ed-4fd0-bdc8-15c6711679d6',38,4,1),(18,'90dc115c-47ed-4fd0-bdc8-15c6711679d6',145,8,1),(19,'5dbdee14-0c6f-4b9d-8c1f-358d36fc3004',120,7,1),(20,'94ecfaed-ce51-4652-90ed-3f9c84e7ebc7',210,9,1),(21,'74b8aa0a-fd50-4e07-9bc2-5e3b0d142648',120,7,1),(22,'0c66d433-5913-424a-a714-99f3c74d2789',210,9,1),(23,'fb6274d4-35f2-4b0a-a272-a58cc190170a',145,8,1),(24,'fb6274d4-35f2-4b0a-a272-a58cc190170a',32,2,1),(25,'fb6274d4-35f2-4b0a-a272-a58cc190170a',38,4,1),(26,'5d48c410-c1a9-49ab-83d7-6dd93f02df94',300,10,1),(27,'34ca4e1c-df92-456f-ad71-08bb892c7e9d',145,8,1),(28,'f2fe6d6c-4546-4271-bd0a-d920d17542e5',210,9,1),(29,'f2fe6d6c-4546-4271-bd0a-d920d17542e5',32,2,1),(30,'120b3cda-7673-4955-b15c-5660630ed596',120,7,1),(31,'c45abaf4-e621-4840-a441-e1e70be9360a',120,7,1),(32,'c45abaf4-e621-4840-a441-e1e70be9360a',38,4,1),(33,'87a3b23f-748e-4dd2-bb95-1c3d0d0da60a',120,7,1),(34,'87a3b23f-748e-4dd2-bb95-1c3d0d0da60a',38,4,1),(35,'39c86e11-b577-4fd6-b49a-4496f1b91ab5',120,7,1),(36,'39c86e11-b577-4fd6-b49a-4496f1b91ab5',38,4,1),(37,'61de557e-b964-4ac0-86dd-7464d7bd7d84',120,7,1),(38,'61de557e-b964-4ac0-86dd-7464d7bd7d84',38,4,1),(39,'4a37fbe1-cce4-4518-bb3b-504a1fc1d846',120,7,1),(40,'4a37fbe1-cce4-4518-bb3b-504a1fc1d846',38,4,1),(41,'4dbbaa32-e6e5-4d8f-ba9d-5c1af09cced6',32,2,1),(42,'4dbbaa32-e6e5-4d8f-ba9d-5c1af09cced6',45,1,1),(43,'4dbbaa32-e6e5-4d8f-ba9d-5c1af09cced6',38,4,1),(44,'4dbbaa32-e6e5-4d8f-ba9d-5c1af09cced6',65,6,1),(45,'25979ebe-4fe1-466f-a20a-c69bd2109e7b',38,4,1),(46,'25979ebe-4fe1-466f-a20a-c69bd2109e7b',210,9,1),(47,'db903021-a8fa-4afe-9a7a-22a4b8aa7322',38,4,1),(48,'db903021-a8fa-4afe-9a7a-22a4b8aa7322',210,9,1),(49,'b4d885d0-13b5-470a-a01b-06f218f27f96',210,9,1),(50,'619a3813-e655-4a6c-a883-ba2d5c458a88',210,9,2),(51,'9f43d275-a125-44b1-bf93-afe79e841756',145,8,1);
/*!40000 ALTER TABLE `orderline` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(60) NOT NULL,
  `brand` varchar(60) NOT NULL,
  `name` varchar(60) NOT NULL,
  `origin` varchar(100) NOT NULL,
  `code` varchar(100) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `description` text,
  `img` text,
  PRIMARY KEY (`id`),
  UNIQUE KEY `code_UNIQUE` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'shoe','Nike','Google Shoe','China','1',120,45,'Running shoes. ','resources/img/NikeGoogle.jpg'),(2,'clothing','Adidas','Running Jacket','Indonesia','2',450,32,'Response Wind Jacket.','resources/img/adidasRunningJacket.jpg'),(4,'shoe','Sneake Steve','Formal Street','Indonesia','3',2800,38,'Formal Street Shoes.','resources/img/sneackySteve.jpg'),(6,'shoe','Nike','Basket Prof','China','4',200,65,'Original NBA basket shoes.','resources/img/nike.jpg'),(7,'cloathing','Diadora','Spring Jacket','Indonesia','5',33,120,'Running throw the winter.','resources/img/diadorajacket.jpg'),(8,'cloathing','GrenadeArmyCorpsYellow','Snowboardbyxor','USA','6',120,145,'Snowboardbyxor','resources/img/byxor.jpg'),(9,'sport & training','Royal oak','Haversack','China','7',2020,210,'Running people haversack.','resources/img/RoyalOaknaranja.png'),(11,'harware','Macintosh','Time Capsule','China','893w28773ns',340,139,'Time Capsule is basically an Airport Extreme WiFi base station.','resources/img/off.jpg');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `username` varchar(60) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(60) NOT NULL,
  `enabled` tinyint(1) DEFAULT '1',
  `firstname` varchar(60) DEFAULT NULL,
  `lastname` varchar(60) DEFAULT NULL,
  `dob` varchar(25) DEFAULT NULL,
  `country` varchar(60) DEFAULT NULL,
  `city` varchar(60) DEFAULT NULL,
  `zipcode` varchar(60) DEFAULT NULL,
  `street` varchar(60) DEFAULT NULL,
  `phone` varchar(60) DEFAULT NULL,
  `authority` varchar(60) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('administrator','33fcd487701db14725ca2de456ab8bd5a0175678ad23f51ec3f2ab32d03890494f977d0698e12e88','admin@devcode.se',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'ROLE_USER'),('brutomar','d85fa420a29fba79a5a13add0a7eecdcadcac4a3d54811158086acd36456b3b2fcc56d8dae525e4a','marco@gmail.com',1,'Marcos','Bruto',NULL,'Sweden','Gotenburgo','1652771','björkhagen 17','09281821234','ROLE_USER'),('cangrejo','15667e841ef3d04926c5ea56b2ed600d939976ff6d58035ddbb61589bce8dbf350adda8c168828e6','siri@lanka.com',1,'Martin','Siri',NULL,'Ecuador','Quito','19820','quinoa street 19','00239289188732','ROLE_USER'),('celsius','af909b61a9e6bfe6a95d08531cb8083b54473b3df6da73c32d6ecec39a405df6ffb432bccfb38471','celsius@gmaol.com',1,'Martin','Sellius','1978-3-28','Uganda','asdas','sdasd','asd','asdasd','ROLE_USER'),('clavelli','d875a14c618ed60f7413f38efd91b0149cadd77dddebf44cf5bb7f15819af11bb52d2c57c16586de','marclav@gmail.com',1,'Marcelo','Clavelli',NULL,'Italy','Roma city','12789287','Pondero di Monssetti 289 tr','00892736515722','ROLE_USER'),('eloso','01e53d1226367264188ee1bcf7f4fbea2db87d09def875ed6e1b090ac2eaa32f6126d04fe3647632','jorguito@gmail.com',1,'Jorhge ','Galloso',NULL,'Paraguay','Asuncion','1829810','pedregallo 19','092912134324','ROLE_USER'),('Grajales','f3aa45fd97874f82a20dac8a449c08b3e7c199bfbc71e8c1edffda7a606b7587b31368b8720a2771','MarkusMiller@gmail.com',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'ROLE_ADMIN'),('Hanna88','b391521a632ef785adae2f0017bb693def516f9025b60b7143dd663362c5b8b1c63ff9e1a503ac1e','hanna88@gmail.com',1,'Maria','Montana','2011-3-15','Bangladesh','Snmoias','12321','hanetenm der 2343','09982928128128','ROLE_USER'),('levis','3e471e7a2ec5d5fa9e7f48c983a55b0312e7b1a8691a3ef7243bc702b376f94ebb09a9e4ebf1d5b9','Mil@gmail.com',1,'Marcos','Levin','1992-5-9','Portugal','Oporto','1981112','Obligado 28','002827827172','ROLE_USER'),('marce','a4dfc1f49342848a868bace7ded9b198577adb255a3edf8652f96fe789f1afa021b8082fd653ebb3','marcel@gmail.com',1,'Marcelo','Millan','','Uganda','Makullo','12891','mozambique 287','0034 82728 19212123','ROLE_USER'),('marcelo','aae57e76394d2024e93984de7aad185a9ab14da6c47347e1cba986eef137284bc364f1740aa6bbc0','marcelo@gmail.com',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'ROLE_ADMIN'),('Mario','359d550705905fb53af0f2d4ddd60720e746e1d539bea6c7d0d7db1f7016d9724a947273f461157c','mariollo@gmail.com',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'ROLE_USER'),('markbe','36958ebaca670472fb9d5fa4b44c7d9aae849a2a724ace53f11ff4ce75b57381e72d0b16fe0b976d','elias@sidenbladh.com',1,'Makus','Åberg',NULL,'Sweden','Stockholm','17828','Sveavägen 78','004673 287 8273','ROLE_USER'),('maximus','fa449db493fa20f0951062233028cd416f4f54a9a0c6f90c07489d2cb750138ac57ea9a031dfede1','emilisano.zapatta@gmail.com',1,'maximus','Cirkuro','','Mexico','Guadalajara','12345','Speede Gonzales 1234','0078 982 812 8732','ROLE_USER'),('maximus78','9065ea82cd601a6b6013a5b1e2b875ecfd42489da59dd9f1cd1560cdabb0055eba1634f73d3a2cfd','emilisano.zapatta@gmail.com',1,'maximus','Cirkuro','','Mexico','Guadalajara','12345','Speede Gonzales 1234','0078 982 812 8732','ROLE_USER'),('paturusu','fcafc47bbb2ea0676c59456b0b553d24c09bb74fa1127942f51a5aa7a16959b6f62833f3f71a101c','paturu@gmail.com',1,'Serafin','Rodriguez','1991 7, 8','Germany','Dushäint','134242','Mark Klauss 123','0056 928 727 27 72','ROLE_USER'),('paturusu2','58c736868f0cdbe1552c26777fb69505a5e5f5d58bd786ec21695e106927bc9b800789cafcab9dd7','paturu@gmail.com',1,'Serafin','Rodriguez','1972-5-17','Germany','Dushäint','134242','Mark Klauss 123','0056 928 727 27 72','ROLE_USER'),('pereno','dd81509c56b41069a90b1530e861694858bb01c121757b3584cf752b13a88f7ba9795d0c438ee920','perano@gmail.com',1,'Mariano','Perez','2014-03-13','Portugal','Porto','17827','Maria betanhia 198','0062 872 98182','ROLE_USER'),('quehace','83ee2d2f5c483b0105c92c02a56f1b8b4f8db27a5252bdcf1903ba62fb6250ff058b81c7ada0a99d','comilona@gmail.com',1,'Mario','Comilona',NULL,'Uruguay','Montevideo','11256','Fleming 1768','081726162123','ROLE_USER'),('rubi98','9c282484434070ffb2e99777187e2bcf879359922fa53689498b271b1e7dbcb75847d95f19ba4ff7','rubilarsson@gmail.com',1,'Marcos','Rubilarte',NULL,'GReek','Popalaparus','13425','klartudius 1829','08 (2199) 73628923 ','ROLE_USER'),('samjack','39ff23e45e3255f5e6cfb9a613030ed9b30a9e3602a40839085ead214a847830064ae6c4662cb1be','smuelel@gmail.com',1,'Samuel','Jackson',NULL,'Usa','Los Angeles','726189','avd. Sant Ferdino 1928','0012032 982 9182','ROLE_USER'),('semaneiro','04b9d13506d953ec97736b4a038258e84c4d65b99733f487dc850a20b781f0abf621aadab5ea045b','sebylou@gmail.com',1,'Sebastian','Maneiro',NULL,'Uruguay','Montevideo','11400','Felipe Cardozo 1731','02 619 57 05','ROLE_ADMIN'),('TestUser','f7b18127fcb34f98ec23ae899a7a5ba210fbaf9947c158d805ed9a6d03c4de00b99f8476f00410a5','brutaldo@gmail.com',1,'Macos','Brutaldo','-1 -1, -1','Nigeria','Matambre','198989','khula 198','002781221 2212 12','ROLE_USER'),('TestUser2','4209121427a6c510b71088a9bc439bdba7918e02aa20650ae2a710727a8b08e4a3cc4ebbf36d58e4','brutaldo@gmail.com',1,'Macos','Brutaldo','1991 7, 8','Nigeria','Matambre','198989','khula 198','002781221 2212 12','ROLE_USER');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-11-24 15:10:55
