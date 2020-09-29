# Spring Cloud Alibaba Demo

## Nacos Config - 分布式配置

使用 Nacos Config 作为外部化配置源
- 动态配置更新：演示 @RefreshScope 特性，实现 Bean 动态刷新

## Nacos Discovery - 服务注册&发现

Nacos Discovery 可以将服务自动注册到 Nacos 服务端并且能够动态感知和刷新某个服务实例的服务列表。

Nacos Discovery 也将服务实例自身的一些元数据信息，例如 host，port, 健康检查URL，主页等内容注册到 Nacos。
