# HR Portal QA Test Project (Selenium + Java)

This is a mock QA testing project for an HR Portal, using Selenium WebDriver with Java.

## Features Tested
- ✅ Valid Login
- ❌ Invalid Password Handling
- ⚠️ Empty Field Validation
- 👥 Add Employee
- 🧹 Form Validations
- 🚨 SQL Injection Simulation

## Tools Used
- Java
- Selenium WebDriver
- VSCode
- ChromeDriver

## Files Included
- `HRPortalTestSuite.java`: Automation script
- `TestCases.csv`: Manual test cases (10)
- `BugReport.txt`: Sample bug report
- `ProjectSummary.txt`: Description & scope

## Setup Instructions
1. Install Java and ChromeDriver.
2. Clone the repo.
3. Compile using:
   ```bash
   javac -cp "lib/*" HRPortalTestSuite.java
   java -cp ".;lib/*" HRPortalTestSuite
