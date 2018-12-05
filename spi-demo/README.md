利用SPI机制实现在仅修改主工程的配置下调用不同的接口编程实现
interface：接口工程（只负责提供接口）
implement-one：接口实现类工程
implement-one：接口实现类工程
spi-main：主工程（通过修改pom配置实现动态调用）