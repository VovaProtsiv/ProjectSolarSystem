- 1 Open the project in IntelliJIDEA Ultimate Edition.
- 2 Install MySql: https://www.mysqltutorial.org/install-mysql/ and follow on-screen instructions.
- 3 Connect to a database: https://www.jetbrains.com/help/idea/connecting-to-a-database.html#
- 4 On schemas, mouse right click - Run Sql Script... and
choose /resources/init_db_schemas.sql 
- 5 After completing the above steps run main method  in package org.solarsystem.web.controller.PlanetController.java
- 6 Configure TomCat from Шаг 2. Конфигурируем Intellij IDEA для Deploy 
https://devcolibri.com/intellij-idea-%D0%B4%D0%B5%D0%BF%D0%BB%D0%BE%D0%B9-%D0%BD%D0%B0-tomcat/
- 6 Click Edit Configuration - on the left-side click - plus - TomCat
Local - on the right-side Deployment - plus - Artifact - ProjectSolarSystem_war
Application context set "/"
- 8 Add folders css and js (with bootstrap and jquery) 
click click - External Source and add folders css fonts and js
- 9 Otherwise ...
