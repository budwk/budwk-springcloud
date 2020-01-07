package com.budwk.spring.boot.dao;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * @author kerbores(kerbores@gmail.com)
 */
@Data
@ConfigurationProperties(prefix = "nutz.dao")
public class NutzDaoAutoConfigurationProperties {

    /**
     * 运行期配置
     */
    Runtime runtime = new Runtime();

    /**
     * sql管理器配置
     */
    SqlManager sqlManager = new SqlManager();

    /**
     * sql 模板处理插件配置
     */
    SqlTemplate sqlTemplate = new SqlTemplate();

    @Data
    public static class SqlTemplate {
        public enum Type {
            BEETL, FREEMARKER, JETBRICK, VELOCITY
        }

        /**
         * 模版引擎类型
         */
        Type type = Type.BEETL;

        /**
         * 是否启用标识
         */
        boolean enabled = false;
    }

    @Data
    public static class SqlManager {
        /**
         * 模式
         */
        private Mode mode;

        /**
         * 路径列表
         */
        private String[] paths;

        public enum Mode {
            FILE, XML
        }
    }

    @Data
    public class Runtime {
        /**
         * 自动建表
         */
        private boolean create = true;

        /**
         * 自动变更
         */
        private boolean migration = true;

        /**
         * 实体包名
         */
        private String[] basepackage;

        /**
         * 强制创建<删表重建>
         */
        private boolean foceCreate = false;

        /**
         * 是否增加列
         */
        private boolean addColumn = true;

        /**
         * 是否删除列
         */
        private boolean deleteColumn = true;

        /**
         * 检查索引
         */
        private boolean checkIndex = true;

    }

}
