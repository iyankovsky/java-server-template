@echo off
set version=%1
if not defined version (
  echo No version supplied
  exit /b 1
)

@rem Upgrade the wrapper properties file
gradlew.bat wrapper --gradle-version %*

@rem Download a new version
gradlew.bat wrapper --gradle-version %*
