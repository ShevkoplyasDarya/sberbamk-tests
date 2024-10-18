# A test project is designed for a website 
![logo](src/test/resources/images/sber.PNG)
<a target="_blank" href="www.sberbank.ru"/> www.sberbank.ru
________

### A task for running tests in CI Jenkins is created: 
<a target="_blank" href="https://jenkins.autotests.cloud/job/08-Daria_Shevkoplyas_sberbank_tests/">https://jenkins.autotests.cloud/job/08-Daria_Shevkoplyas_sberbank_tests/

![jenkins](src/test/resources/images/jenkins.PNG)
Command to run the tests:
```bash
gradle clean test
```

Run the tests:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -Dthreads=1 test
```
____________

### Implemented the ability to generate a report in Allure:
The reports contain screenshots and videos recorded during the test execution, as well as browser console logs.

[Allure Report](https://jenkins.autotests.cloud/job/08-Daria_Shevkoplyas_sberbank_tests/6/allure/#)

![Allure](src/test/resources/images/allure.PNG)
```bash
allure serve build/allure-results
```
______________

### Manual and automated tests are designed in TMS Allure TestOps:
On the Dashboard, you can see the number of manual and automated tests, as well as the execution statistics.

![Dashboard](src/test/resources/images/dashboard.PNG)


Test runs are displayed automatically on the Launches tab in real-time when a task is executed in Jenkins.

![Launches](src/test/resources/images/launches.PNG)


Detailed information on the test run includes:
![Detail Info](src/test/resources/images/result.PNG)


Manual and automated tests are displayed on the Tests tab
![Tests](src/test/resources/images/Tests.PNG)


________________

### A test run notification via Telegram feature has been added:
A notification with the Allure report is sent to a private Telegram channel upon test completion.

![Telegram](src/test/resources/images/telegram.PNG)

_____________

### The technology stack used includes:

| Java | Selenide | Allure Report | Allure TestOps | JUnit5 | Jenkins | Gradle | Telegram |
|:----:|:----:|:------:|:------:|:----:|:----:|:------:|:------:|
| <img src="https://cdn.worldvectorlogo.com/logos/java.svg" width="30" height="30"> | <img src="https://avatars.githubusercontent.com/u/43955696?s=200&v=4" width="30" height="30"> | <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAXbhiWOeHSbW44Y2aWhVJmMYHF_k9gW7dNQ&s" width="30" height="30"> | <img src="https://img.stackshare.io/service/40438/default_a9d9f8f8546d65b5f12a32106e6d03e6921e11fa.png" width="30" height="30"> | <img src="https://junit.org/junit5/assets/img/junit5-logo.png" width="30" height="30"> | <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/jenkins/jenkins-original.svg" width="40" height="40"> | <img src="https://vscjava.gallerycdn.vsassets.io/extensions/vscjava/vscode-gradle/3.16.2024100900/1728440757621/Microsoft.VisualStudio.Services.Icons.Default" width="30" height="30"> | <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Telegram_2019_Logo.svg/1200px-Telegram_2019_Logo.svg.png" width="30" height="30"> |

