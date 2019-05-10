package com.boot.datasource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

public class DataSourceComponent {

    @Resource
    private MasterDataSourceConfig masterDataSourceConfig;

    @Resource
    private SlaveDataSourceConfig slaveDataSourceConfig;


    @Bean(name = "master")
    public MasterDataSourceConfig masterDataSource() {
        MasterDataSourceConfig dataSource = new MasterDataSourceConfig();
        dataSource.setUrl(masterDataSourceConfig.getUrl());
        dataSource.setUsername(masterDataSourceConfig.getUsername());
        dataSource.setPassword(masterDataSourceConfig.getPassword());
        dataSource.setDriverClassName(masterDataSourceConfig.getDriverClassName());
        return dataSource;
    }

    @Bean(name = "slave")
    public SlaveDataSourceConfig slaveDataSource() {
        SlaveDataSourceConfig dataSource = new SlaveDataSourceConfig();
        dataSource.setUrl(slaveDataSourceConfig.getUrl());
        dataSource.setUsername(slaveDataSourceConfig.getUsername());
        dataSource.setPassword(slaveDataSourceConfig.getPassword());
        dataSource.setDriverClassName(slaveDataSourceConfig.getDriverClassName());
        return dataSource;
    }

    @Primary//不加这个会报错。
    @Bean(name = "multiDataSource")
    public MultiRouteDataSource exampleRouteDataSource() {
        MultiRouteDataSource multiDataSource = new MultiRouteDataSource();
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put("master", masterDataSource());
        targetDataSources.put("slave", slaveDataSource());
        multiDataSource.setTargetDataSources(targetDataSources);
        multiDataSource.setDefaultTargetDataSource(masterDataSource());
        return multiDataSource;
    }

}
