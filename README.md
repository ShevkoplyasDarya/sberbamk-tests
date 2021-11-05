# Проект автотестов для сайта
<img src="resources/images/sber logo.PNG" width="80" height="60" title="sber">
<a target="_blank" href="www.sberbank.ru"/> www.sberbank.ru 

### Создана задача для запуска тестов в CI Jenkins 
<a target="_blank" href="https://jenkins.autotests.cloud/job/08-Daria_Shevkoplyas_sberbank_tests/">https://jenkins.autotests.cloud/job/08-Daria_Shevkoplyas_sberbank_tests/
<img src="resources/images/jenkins job.PNG" width="800" height="600" title="jenkins">

Команда для запуска автотестов:
```bash
gradle clean test
```

Запустить автотесты:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -Dthreads=1 test
```

### Реализована возможность генерации отчета в Allure:
В отчетах сохранаются скриншоты и видео, записанные во время прохождения тестов, а также логи консоли браузера

<img src="resources/images/allure report.PNG" width="800" height="600" title="allure">

```bash
allure serve build/allure-results
```
### Созданы ручные и автоматизированные тесты в TMS Allure TestOps:
На Dashboard'е можно увидеть количество ручных и автоматизированных тестов, а также статистику запусков
<img src="resources/images/Allure TestOps dashboard.PNG" width="800" height="600" title="dashboard">

Запуски тестов (на вкладке Launches) отображаются автоматически в реальном времени при запуске задачи в Jenkins
<img src="resources/images/Allure TestOps launches.PNG" width="800" height="600" title="launches">

Детальная информация по Запуску тестов
<img src="resources/images/Allure TestOps launch result.PNG" width="800" height="600" title="launch details">

Ручные и автоматизированные тесты отображаются на вкладке Tests
<img src="resources/images/Allure TestOps Tests.PNG" width="800" height="600" title="tests">


### Добавлена функция оповещений о запуске тестов в Telegram:
Оповещение с отчетом из Allure направляется в закрытый телеграм-канал при завершении прохождения тестов.

<img src="resources/images/telegram notification.PNG" width="800" height="600" title="telegram">

### Применяемый стек:
| Java | Selenide | Selenoid | Allure Report | Allure TestOps | JUnit5 | Jenkins | Gradle |  Telegram |
|:----:|:----:|:------:|:------:|:------:|:----:|:----:|:------:|:------:|:------:|:------:|
| <img src="https://starchenkov.pro/qa-guru/img/skills/Java.svg" width="30" height="30"> | <img src="https://starchenkov.pro/qa-guru/img/skills/Selenide.svg" width="30" height="30"> | <img src="https://starchenkov.pro/qa-guru/img/skills/Selenoid.svg" width="30" height="30"> |<img src="https://starchenkov.pro/qa-guru/img/skills/Allure_Report.svg" width="30" height="30"> | <img src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg" width="30" height="30"> | <img src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg" width="30" height="30"> | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/jenkins/jenkins-original.svg" width="40" height="40"> | <img src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg" width="30" height="30"> | <img src="https://starchenkov.pro/qa-guru/img/skills/Telegram.svg" width="30" height="30"> |



