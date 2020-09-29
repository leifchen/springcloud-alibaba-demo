# Spring Cloud Alibaba Demo

## Nacos Config - 分布式配置

使用 Nacos Config 作为外部化配置源
- 动态配置更新：演示 @RefreshScope 特性，实现 Bean 动态刷新

## Nacos Discovery - 服务注册&发现

Nacos Discovery 可以将服务自动注册到 Nacos 服务端并且能够动态感知和刷新某个服务实例的服务列表。

Nacos Discovery 也将服务实例自身的一些元数据信息，例如 host，port, 健康检查URL，主页等内容注册到 Nacos。

## Dubbo - 分布式服务调用

Dubbo Spring Cloud 扩展了分布式服务调用能力，不仅能使 Apache Dubbo 和 OpenFeign 共存，还允许 Spring Cloud 标准调用底层通过 Dubbo 支持的通讯协议传输。

## Sentinel - 服务熔断和限流

Sentinel 是面向分布式服务架构的高可用防护组件，主要以流量为切入点，从流量控制、流量整形、熔断降级、系统自适应保护、热点防护等多个维度保障微服务的稳定性。
