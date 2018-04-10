github.dismiss_out_of_range_messages

modules = ["app", "library"]
# Findbugs
findbugs.gradle_modules = modules
# findbugs.gradle_project = "HogeFuga/"
findbugs.gradle_task = "findbugs"
findbugs.report_file = "build/reports/findbugs_report.xml"
findbugs.report(true)

# Android Lint
android_lint.gradle_modules = modules
# android_lint.gradle_project = "HogeFuga/"
android_lint.gradle_task = "lint"
android_lint.report_file = "build/reports/lint-results.xml"
android_lint.filtering = true
android_lint.lint(inline_mode: true)
