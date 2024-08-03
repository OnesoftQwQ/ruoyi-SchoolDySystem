## 一个自用的中学德育管理系统
克隆自[https://gitee.com/rahman/SchoolDySystem](https://gitee.com/rahman/SchoolDySystem)，改了一些小bug

## 怎么用
首先Fork这个项目，然后在你Fork的项目点击左上角的Actions，输入必要信息并运行pack.yml，就可以获得主程序ruoyi.jar和数据库查询脚本ruoyi.sql

在你要部署的服务器上安好MySQL和Java(Linux/Windows均可，理论上只要系统能运行这俩就都可以用)，创建一个名为"ruoyi"的数据库并在其中执行ruoyi.sql脚本

数据库部署好后直接java -jar ruoyi.jar即可运行

或者也可以跟着[原版教程](doc.ruoyi.vip)来部署，把文件换成本仓库的就行了，略麻烦，记得创建的数据库要叫"ruoyi"而不是"ry"，查询脚本记得也要用[仓库里的](https://github.com/OnesoftQwQ/ruoyi-SchoolDySystem/blob/master/sql/ruoyi.sql)
