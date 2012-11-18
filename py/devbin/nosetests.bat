@ECHO OFF
SET PYTHONPATH=%~dp0\..\src;%~dp0\..\test
nosetests %*