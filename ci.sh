cd AndroidStudioProject
./gradlew build check lint -PdisablePreDex --stacktrace
cd -
bundle exec danger
