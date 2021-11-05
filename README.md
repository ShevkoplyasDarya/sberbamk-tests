# Проект автотестов для сайта
![logo](src/test/resources/images/sber.PNG)
<a target="_blank" href="www.sberbank.ru"/> www.sberbank.ru
________

### Создана задача для запуска тестов в CI Jenkins: 
<a target="_blank" href="https://jenkins.autotests.cloud/job/08-Daria_Shevkoplyas_sberbank_tests/">https://jenkins.autotests.cloud/job/08-Daria_Shevkoplyas_sberbank_tests/

![jenkins](src/test/resources/images/jenkins.PNG)
Команда для запуска автотестов:
```bash
gradle clean test
```

Запустить автотесты:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -Dthreads=1 test
```
____________

### Реализована возможность генерации отчета в Allure:
В отчетах сохранаются скриншоты и видео, записанные во время прохождения тестов, а также логи консоли браузера

[Отчет Allure](https://jenkins.autotests.cloud/job/08-Daria_Shevkoplyas_sberbank_tests/6/allure/#)

![Allure](src/test/resources/images/allure.PNG)
```bash
allure serve build/allure-results
```
______________

### Созданы ручные и автоматизированные тесты в TMS Allure TestOps:
На Dashboard'е можно увидеть количество ручных и автоматизированных тестов, а также статистику запусков

![Dashboard](src/test/resources/images/dashboard.PNG)


Запуски тестов (на вкладке Launches) отображаются автоматически в реальном времени при запуске задачи в Jenkins

![Launches](src/test/resources/images/launches.PNG)


Детальная информация по Запуску тестов
![Detail Info](src/test/resources/images/result.PNG)


Ручные и автоматизированные тесты отображаются на вкладке Tests
![Tests](src/test/resources/images/Tests.PNG)


________________

### Добавлена функция оповещений о запуске тестов в Telegram:
Оповещение с отчетом из Allure направляется в закрытый телеграм-канал при завершении прохождения тестов.

![Telegram](src/test/resources/images/telegram.PNG)

_____________

### Применяемый стек:

| Java | Selenide | Selenoid | Allure Report | Allure TestOps | JUnit5 | Jenkins | Gradle | Telegram |
|:----:|:----:|:------:|:------:|:------:|:----:|:----:|:------:|:------:|
| <img src="https://starchenkov.pro/qa-guru/img/skills/Java.svg" width="30" height="30"> | <img src="https://starchenkov.pro/qa-guru/img/skills/Selenide.svg" width="30" height="30"> | <img src="https://starchenkov.pro/qa-guru/img/skills/Selenoid.svg" width="30" height="30"> |<img src="https://starchenkov.pro/qa-guru/img/skills/Allure_Report.svg" width="30" height="30"> | <img src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg" width="30" height="30"> | <img src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg" width="30" height="30"> | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/jenkins/jenkins-original.svg" width="40" height="40"> | <img src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg" width="30" height="30"> | <img src="https://starchenkov.pro/qa-guru/img/skills/Telegram.svg" width="30" height="30"> |

