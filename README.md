## 快速开始

### 关于spring cloud config 的各类demo，整合Eureka：Config配置中心作为Eureka注册中心的服务提供端，通过读取github或mysql数据库来获取配置。

#### 服务介绍
| 服务分类  | 服务名                    |               简介                  |     应用地址            | 
|----------|---------------------------|-------------------------------------|-------------------------|
|  center  | eureka-center             | Eureka注册中心                      |  http://localhost:3000  |      
|  center  | config-single-server      | 单机版配置中心服务端读取github       |  http://localhost:3301  |      
|  center  | config-single-client      | 单机版配置中心客户端                 |  http://localhost:3302  |      
|  auth    | config-eureka-server      | 整合Eureka配置中心服务端读取github   |  http://localhost:3012  |     
|  auth    | config-eureka-client      | 整合Eureka配置中心客户端             |  http://localhost:3011  | 
|  auth    | config-jdbc-server        | 整合Eureka配置中心服务端读取mysql    |  http://localhost:3021  | 
|  gateway | config-jdbc-client        | 整合Eureka配置中心客户端             |  http://localhost:8083  |      
