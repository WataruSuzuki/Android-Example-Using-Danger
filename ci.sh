cd HogeFuga
./gradlew build check -PdisablePreDex --stacktrace
cd -
bundle exec danger
