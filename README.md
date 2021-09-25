# cook-server-spring-boot-2021
## Инструкция по сборке
## (и подробный пример, как можно работать с этим кодом)
<br>
Инструкция расчитана нанулевые знания<br>
<br>
1)Установите OpenJDK 16<br>
Для Windows:<br>
* Скачайте архив, распакуйте в папку C:\Program Files\Java\jdk-11\bin:<br>
https://jdk.java.net/16/<br>
* Выберите: Панель управления->Система->«Дополнительно»->«Переменные среды».<br>
* Добавьте расположение папки bin для установки JDK в переменную PATH в системных переменных (допишите в конец "C:\Program Files\Java\jdk-11\bin").<br>
* Ниже приведено типичное значение для переменной PATH :<br>
  C:\WINDOWS\system32;C:\WINDOWS;"C:\Program Files\Java\jdk-11\bin"<br>
<br>
Для Linux Ubuntu можно просто скачать из пакета:<br>
<br>
2) Установите Eclipce <br>
https://www.eclipse.org/downloads/<br>
* Там программа установщик откройте её, выбирите в ней "Eclipse IDE for Enterprise Java and Web Developers"<br>
<br>
3) Установите Spring Tools for Spring Boot<br>
https://betacode.net/10249/install-spring-tool-suite-for-eclipse<br>
Для этого:
* Нажмите Help->Eclipce_Marketplace<br>
* В строке поиска введите Spring<br>
* Выбирите нужный плагин (Spring Tools for Spring Boot)<br>
<br>
4) Скачайте Git (установится Git и Git Bash)<br>
https://git-scm.com/download/win<br>
Затем:<br>
* Откройте Git Bash<br>
* Введите в нем имя и email:<br>
git config --global user.name "John"<br>
git config --global user.email johndoe@example.com<br>
<br>
* Зарегистрируйтесь на GitHub, создайте токен для управления своим аккаунтом GitHub из консоли (это касается всех), попроситесь, чтобы я добавил вас в коллабораторы (это касается определенных людей, с которыми я делаю проект)<br>
Подробнее в инструкции:<br>
https://github.com/Bogdanov-Viktor/test/blob/master/%D0%98%D0%BD%D1%81%D1%82%D1%80%D1%83%D0%BA%D1%86%D0%B8%D1%8F%20Git%20%D0%B8%20GitHub.pdf<br>
<br>
5) Далее скачайте наше backend приложение (весь его репозиторий)<br>
Например, в эту папку (предварительно создайте эту папку):<br>
...Documents\eclipse-workspace\cook-server-spring-boot-2021<br>
<br>
*Откройте Git Bash<br>
*Введите в нем, чтобы перейти в папку "cook-server-spring-boot-2021":<br>
cd "C:\Users\Имя_Пользователя\Documents\eclipse-workspace\cook-server-spring-boot-2021"<br>
<br>
далее вводите:<br>
git init<br>
git remote add origin https://github.com/Bogdanov-Viktor/cook-server-spring-boot-2021.git<br>
git pull origin master<br>
<br>
Проект скачался<br>
<br>
Когда внесете изменения:<br>
git add .<br>
git commit -m "переделали то-то и то-то"<br>
git push origin master<br>
<br>
Объяснение этих команд см. в файле:<br>
https://github.com/Bogdanov-Viktor/test/blob/master/%D0%98%D0%BD%D1%81%D1%82%D1%80%D1%83%D0%BA%D1%86%D0%B8%D1%8F%20Git%20%D0%B8%20GitHub.pdf<br>
также прочитайте там, что выводится командой:<br>
git status<br>
 это пригодится<br>
<br>
6) Установите MySQL Server и MySQL Workbrench на локальный компьютер<br>
https://dev.mysql.com/downloads/installer/<br>
https://dev.mysql.com/downloads/workbench/<br>
<br>
7) Загрузите мою БД на свой локальный MySQL Server<br>
Для этого:<br>
* Откройте папку "переместить в другое место" в моем репозитории, скопируйте оттуда файл "Dump_cook_1_готова_шапка.sql" в папку C:\Users\Имя_Пользователя\Documents\dumps<br>
* Откройте Mysql Workbrench, войдите в систему, введя пароль, который вы указывали при установке<br>
* Создайте БД с именем "cook"<br>
* Затем нажмите "Импорт"<br>
* В окне импорта выбирете:<br>
Import from Self-Contained File адрес/файла/который/вы/скопировали/в/папку/dumps;<br>
Default Target Schema -- cook<br>
* Назмите Start Import<br>
Вуаля<br>
<br>
8) Создайте пользователя cook_site с паролем cook_site и доступом к БД cook:<br>
* Для этого сосоздайте скрипт в MySQL Workbench:<br>
CREATE USER 'cook_site'@'localhost' IDENTIFIED BY 'cook_site';<br>
GRANT ALL PRIVILEGES ON cook . * TO 'cook_site'@'%';<br>
SELECT User, Host FROM mysql.user;<br>
* запустите его<br>
<br>
localhost значит, что прользователь cook_site может заходить в БД только с вашего компьютера<br>
% можно написать вместо localhost, если вы хотите заходить с других компьютеров (с любыми ip адресами)<br>
<br>
<br>
9) Запустите приложение на отладку<br>
Для этого:<br>
* Откройте Eclipce<br>
* Нажмите File->Open_projects_from_file_system<br>
* Справа у вас вкладка Project Explorer, там нажмите cook-server-spring-boot-2021-->src/main/java-->api.mysql (api.mysql должен выделиться синим)<br>
* Затем Run->Run_As->Spring_Boot_App<br>
* Откройте браузер, введите в адресную строку:<br>
 http://localhost:8080/dishes.search?product=7&productQuaFrom=5&productQuaTo=6&cookTimeTo=4<br>
В браузере должно вывестись что-то в этом духе:<br>
 [ {"id":1,"name":"qwer","cookTime":"00:00:02","numOfPeople":3}, {"id":1,"name":"qwer2","cookTime":"00:00:02","numOfPeople":3} ]<br>
<br>
10) Соберите программу и разверните на сервере<br>
Для этого<br>
* Скачайте мою настроенную виртуальную машину (На ней Ubuntu, MySQL, Apache Tomcat-9, Nginx, готовые для размещения бекэнда и фронтенда)<br>
(подробнее в том репозитории, где она размещена)<br>
* Запустите ту самую виртуальную машину<br>
* А в этом репозитории (cook-server-spring-boot-2021) возьмите в папке "переместить в другое место" файл "mvn spr boo.launch"<br>
скопируйте его в папку "C:\Users\bogan\Documents\eclipse-workspace\.metadata\.plugins\org.eclipse.debug.core\.launches"<br>
* Зайдите в Eclipce<br>
* Откройте файл pom.xml, найдите там "cargo-maven3-plugin" замените в нем 192.168.1.10 на ip_адрес_виртуальной_машины<br>
* Run->Run_Configurations->Maven_Build->"mvn spr boo"->Run<br>
<br>
cм папку .../cook-server-spring-boot-2021/target Там находится собранный файл приложения (от имеет расширение .war)<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
## Доп. инф (далее необязательно к прочтению)<br>
<br>
еше в той вкладке есть поле, где<br>
cargo:undeploy clean install cargo:deploy<br>
<br>
если на вашей виртуальной машине еще не стоит приложение по адресу http://ip_адрес_виртуальной_машины:8080/api, то надо убрать cargo:undeploy <br>
<br>
см. файл pom.xml<br>
там есть строчка:<br>
&ltbuild&gt    <br>
&ltfinalName&gt api##1 &lt/finalName&gt   <br>
...<br>
Если бы вместо api##1 было api#url#addr##2, то приложение работало бы по адресу http://ip_адрес_виртуальной_машины:8080/api/url/addr и имело бы версию 2<br>
----<br>
<br>
Вуаля!!!<br>
Вбейте в браузер<br>
http://ip_адрес_виртуальной_машины/api/dishes.search?product=7&productQuaFrom=5&productQuaTo=6&cookTimeTo=4<br>
Вы увидете, что приложение работает, на виртуальной машине<br>
<br>
Вы также можете войти в Tomcat Manager с номинальным паролем и быстро удалить оттуда свое приложение<br>
Вбейте в браузер http://192.168.1.10:8080/manager<br>
Затем авторизуйтесь:<br>
Username: bogdanov<br>
Password: bogdanov<br>
<br>
Еще можно подключиться по SSH и удалить по другому (просто зайти в папку /opt/tomcat/webapps/ и удалить файл api##1.war)<br>
SSH ключи создайте свои (определенным людям я могу скинуть свой)<br>
<br>
Подключение по SSH из консоли:<br>
ssh vagrant@192.168.1.10 -i "C:\Users\т.д.т.п\VagrantVMs\prog2-Ubuntu-Spring-cookApp\.vagrant\machines\default\virtualbox\private_key"<br>
или в зависимости от того от имени какого пользователя вы заходите<br>
ssh root@192.168.1.10 -i "C:\Users\т.д.т.п\VagrantVMs\prog2-Ubuntu-Spring-cookApp\.vagrant\machines\default\virtualbox\private_key"<br>
<br>
подробно рассписывать не буду<br>
<br>
Еще советую программу WinSCP<br>
https://winscp.net/eng/download.php<br>
Это аналог проводника c помощью которого можно гулять по папкам другой машины, подключившись к ней по ssh;<br>
<br>
<br>
Пароли пользователей Linux, которые понадобятся при включении виртуальной машины (все пароли здесь тоже номинальные)<br>
login:vagrant<br>
password:vagrant<br>
<br>
login:root<br>
password:root<br>
<br>
<br>
Удачных вам экспириментов!!!
