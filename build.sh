#!/usr/bin/env bash
set -e
./gradlew clean test jacocoTestReport pitest
start build/jacocoHtml/index.html
start build/reports/pitest
