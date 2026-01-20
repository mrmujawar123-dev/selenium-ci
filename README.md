# CI with Jenkins for Automated Tests

## 📌 Project Description
This project demonstrates Continuous Integration (CI) using Jenkins Freestyle jobs.  
It automatically runs automated tests (Selenium WebDriver) whenever code is committed to the GitHub repository.

## 🛠 Tools & Technologies
- Jenkins (CI/CD)
- Selenium WebDriver (Java + TestNG)
- Git & GitHub (version control)
- Maven (build automation)
- Jenkins Plugins: Git, Maven, TestNG

## 🚀 Project Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/mrmujawar123-dev/selenium-ci.git
cd selenium-ci

##Run Tests Locally
- Selenium Tests:
mvn clean test

Reports will be generated in target/surefire-reports.

##Jenkins Freestyle Job Setup
- Open Jenkins → New Item → Freestyle project.
- Configure Source Code Management:
- Select Git.
- Enter repo URL: https://github.com/mrmujawar123-dev/selenium-ci.git.
- Branch: main.
- Configure Build Steps:
- Add build step → Invoke top-level Maven targets → Goals: clean test.

##- Configure Post-build Actions:
- Add Publish TestNG Results → **/target/surefire-reports/testng-results.xml.

##Run the Job
- Click Build Now.
- Jenkins will:
- Clone the GitHub repo.
- Run Selenium tests.
- Show results in Jenkins dashboard.

##Test Reports
- Selenium TestNG reports → target/surefire-reports
- Jenkins dashboard shows pass/fail metrics.


