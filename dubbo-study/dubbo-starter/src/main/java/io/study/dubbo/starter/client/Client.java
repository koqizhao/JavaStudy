package io.study.dubbo.starter.client;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.MonitorConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

import io.study.dubbo.starter.api.HelloService;

public class Client {

    private RegistryConfig _registryConfig;
    
    public Client(RegistryConfig registryConfig) {
        _registryConfig = registryConfig;
    }

    @SuppressWarnings("deprecation")
    public void invoke() {
        ReferenceConfig<HelloService> reference = new ReferenceConfig<>();
        reference.setApplication(new ApplicationConfig("first-dubbo-consumer"));
        reference.setRegistry(_registryConfig);
        reference.setInterface(HelloService.class);
        reference.setMonitor(new MonitorConfig());
        HelloService service = reference.get();
        String message = service.hello("Dubbo");
        //System.out.println(message);
    }

}
