## Weka Package Template
This repository serves as template for custom Weka packages.

## Template Structure
### Dependencies
If the package depends on a third party library which is available via maven,
 it can be added in the `build.gradle` dependency section:
 ```groovy
dependencies {
    implementation group:"group-id", name:"artifact-id", 
    version:"version"
}
```
 
### Tests
JUnit test cases that reside in `src/test/java` can be started by running:
```bash
$ ./gradlew test
```

### Generating an Installable Zip File
The Gradle build script provides the task `makeZip` to generate a zip file in
 `./dist/` via:

```bash
$ ./gradlew makeZip
```
