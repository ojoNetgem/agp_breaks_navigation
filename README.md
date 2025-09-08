When using AGP 8.12.2, everything's fine

```
$ ./gradlew build

> Task :app:lintReportDebug
Wrote HTML report to file:///path/agp_breaks_navigation/app/build/reports/lint-results-debug.html

BUILD SUCCESSFUL in 13s
174 actionable tasks: 170 executed, 4 up-to-date
```


When using AGP 8.13.0, it fails to build

```
$ ./gradlew build
> Task :module:verifyReleaseResources FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':module:verifyReleaseResources'.
> A failure occurred while executing com.android.build.gradle.tasks.VerifyLibraryResourcesTask$Action
   > Android resource linking failed
     ERROR: /path/agp_breaks_navigation/module/build/intermediates/merged_res/release/mergeReleaseResources/layout/activity_module.xml:13: AAPT: error: resource navigation/nav_graph (aka com.github.ojonetgem.agp_breaks_navigation.module:navigation/nav_graph) not found.
         

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.
> Get more help at https://help.gradle.org.

BUILD FAILED in 12s
171 actionable tasks: 169 executed, 2 up-to-date
```
