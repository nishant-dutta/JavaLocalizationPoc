## README

### Run the application
$ ./gradlew bootRun

---

### Default Language
$ curl http://localhost:8080/greeting

### Vietnamese
$ curl -H "Accept-Language: vi" http://localhost:8080/greeting

---
* Debug failure of Default Language on Browser Tab
---

### Steps to use in any other application
* Add the locale specific files on the path configured in application.properties
* Autowire MessageSource
* Use the getMessage() and pass the key name in first argument & required locale in the third argument