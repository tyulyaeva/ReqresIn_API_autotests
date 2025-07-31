# Проект по автоматизации тестирования API сервиса Reqres
<img  src="media/logo/reqresin.jpg">

## :man_student:: Содержание:

- <a href="#tools"> Технологии и инструменты</a>
- <a href="#checking"> Реализованные проверки</a>
- <a href="#console"> Запуск тестов из терминала</a>
- <a href="#jenkins"> Сборка в Jenkins</a>
- <a href="#allureReport"> Allure отчет</a>
- <a href="#allure"> Интеграция с Allure TestOps</a>
- <a href="#jira"> Интеграция с Jira</a>  
- <a href="#tg"> Уведомления в Telegram с использованием бота</a>
---

<a id="tools"></a>
## 🔨 Технологии и инструменты:


| Java                                                                                                    | IntelliJ  <br>  Idea                                                                                              | GitHub                                                                                                    | JUnit 5                                                                                                          | Gradle                                                                                                    | Rest Assured                                                                                                        | Allure <br> Report                                                                                                        | Jenkins                                                                                                         | Jira                                                                                                                                   | Telegram                                                                                                           |                                                                                               Allure <br> TestOps |
|:--------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50"  alt="Java"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="media/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="media/logo/rest-assured.jpg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://github.com/allure-framework"><img src="media/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> | <a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://www.atlassian.com/software/jira/"><img src="media/logo/Jira.svg" width="50" height="50" alt="Java" title="Java"/></a> | <a href="https://web.telegram.org/"><img src="media/logo/Telegram.svg" width="50" height="50" alt="Telegram"/></a> | <a href="https://qameta.io/"><img src="media/logo/AllureTestOps.svg" width="50" height="50" alt="Allure_TO"/></a> |

Автотесты написаны на языке `Java` с использованием `JUnit 5`, `Selenide`, `Rest-Assured`. Сборщик проекта - `Gradle`. Для удаленного запуска реализована задача в `Jenkins` с формированием `Allure-отчета` и
отправкой результатов в `Telegram канал` при помощи бота. Так же осуществлена интеграция с `Allure TestOps` и `Jira`.

---

<a id="checking"></a>
## :male_detective:: Реализованные проверки

- ✓ Проверка валидации пароля
- ✓ Проверка наличия выбранного email
- ✓ Проверка наличия выбранного наименования цвета
- ✓ Проверка данных пользователя
- ✓ Создание нового пользователя
- ✓ Проверка отсутствия ресурса
- ✓ Удаление данных


<a id="console"></a>
### Локальный запуск тестов из терминала
`gradle clean test`

---

<a id="jenkins"></a>
## <img src="media/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Сборка в <a target="_blank" href="https://jenkins.autotests.cloud/job/021-Melnikov_A-Reqres_autotests/"> Jenkins </a>
Для запуска сборки необходимо перейти в раздел <code>Собрать с параметрами</code>, выбрать необходимые параметры и нажать кнопку <code>Собрать</code>.
<p align="center">
<a href="https://jenkins.autotests.cloud/job/ReqresIn_API_autotests/"><img src="media/screens/jenkins_main.png" alt="Jenkins1"/></a>
</p>
После выполнения сборки, в блоке История сборок напротив номера сборки появятся значки Allure Report и Allure TestOps, при клике на которые откроется страница с сформированным html-отчетом и тестовой документацией соответственно.

---
<a id="allureReport"></a>
## <img src="media/logo/Allure.svg" width="25" height="25"/> [Allure](https://jenkins.autotests.cloud/job/ReqresIn_API_autotests/19/allure/) отчет

### 🖨️ Главная страница отчета

<p align="center">
<img src="media/screens/allure_auto_main.png" alt="Allure report" width="1000" height="400">
</p>

### 📄 Тест-кейсы

<p align="center">
<img src="media/screens/allure_auto_2.png" alt="Test Case" width="1000" height="400">
</p>

---
<a id="allure"></a>
## <img alt="Allure_TO" height="25" src="media/logo/AllureTestOps.svg" width="25"/> </a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/4844/dashboards">Allure TestOps</a>
На *Dashboard* в <code>Allure TestOps</code> видна статистика количества тестов. Новые тесты, а так же результаты прогона приходят по интеграции при каждом запуске сборки.
## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure TestOps Dashboard" src="media/screens/allure_to_main.png" width="850">  
</p>  

## :pinching_hand:: Пример тест-кейса
<p align="center">
<img title="AllureTC" src="media/screens/allure_to_manual.png">
</p>

---

<a id="jira"></a>
## <img src="media/logo/Jira.svg" width="25" height="25"/> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-1480)

Реализована интеграция <code>Allure TestOps</code> с <code>Jira</code>, в тикете отображается, какие тест-кейсы были написаны в рамках задачи и результат их прогона.
### Задача в Jira

<p align="center">
<img src="media/screens/jira_main.png" alt="TestOps launch" width="1000" height="400">
</p>

#### Содержание задачи

- :heavy_check_mark: Цель
- :heavy_check_mark: Задачи для выполнения
- :heavy_check_mark: Тест-кейсы из Allure TestOps
- :heavy_check_mark: Результат прогона тестов в Allure TestOps

---

<a id="tg"></a>
## <img src="media/logo/Telegram.svg" width="25" height="35"/> Уведомления в Telegram чат с ботом

После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

### Уведомление из переписки с чат ботом

<p align="center">
<img src="media/screens/telegram_main.png" alt="TestOps launch" width="500" height="400">
</p>


#### Содержание уведомления в Telegram

- :heavy_check_mark: Окружение
- :heavy_check_mark: Комментарий
- :heavy_check_mark: Длительность прохождения тестов
- :heavy_check_mark: Общее количество сценариев
- :heavy_check_mark: Процент прохождения тестов
- :heavy_check_mark: Ссылка на Allure отчет

---
