# Maven
[![Build Status](https://user-images.githubusercontent.com/94693119/169599124-6bbba31b-ca93-469d-886c-3e102d5ca6cc.png)](https://maven.apache.org/guides/getting-started/index.html#maven-getting-started-guide)


# SCMS (Simple Content Management System)
[![Build Status](https://user-images.githubusercontent.com/94693119/169599690-e303d3d8-c887-4dda-be55-35ac393853cb.png)](https://github.com/lhazlewood/scms/blob/master/README.md)


| Фаза | Действия | Описание |
|----------------|:---------|:----------------|
| prepare-resources | Копирование ресурсов | В этой фазе происходит копирование ресурсов, которое, также, может быть настроено. |
| compile	| Компиляция	|В этой фазе происходит компиляция исходного кода.|
|package	|Создание пакета	|В этой фазе, в зависимости от настроек создаётся архив JAR/WAR. Тип архива указывается в pom.xml файле.|
|install	|Установка	|В этой фазе происходит установка пакета в локальный/удалённый репозиторий maven.|
 
:shipit:**mvn clean** - Maven `удаляет` директорию сборки.
