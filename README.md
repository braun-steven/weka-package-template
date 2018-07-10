## Weka Package Template
This repository serves as template for custom Weka packages.

## Template Structure
### Dependencies
If the package depends on a third party library which is available via maven,
 it can be added in the `build.gradle` dependency section:
 ```groovy
dependencies {
    implementation group:"group-id", name:"artifact-id", version:"version"
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

#### ZIP content

The zip content is as follows:
```
.
├── Description.props
├── GenericPropertiesCreator.props
├── GUIEditors.props
├── lib
│   ├── ...
│   └── ...
├── src
│   └── main
│       └── java
│           └── weka
│               └── ...
└── weka-package-name-0.1.0.jar
```


If further files need to be included/excluded, the `copyMisc` task has to be 
extended with additional `include` and `exclude` statements.

#### Excluding Unnecessary Transitive Dependencies
The `lib` directory contains all dependencies specified in the `gradle.build` file. If, for some reason, a certain jar file is included in the `lib` directory that 
is not needed during runtime, it is possible to simply add an `exclude` statement 
in the `copyLibs` gradle task.
