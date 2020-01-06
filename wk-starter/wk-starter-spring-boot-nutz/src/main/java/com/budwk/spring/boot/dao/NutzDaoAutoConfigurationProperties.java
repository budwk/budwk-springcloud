package com.budwk.spring.boot.dao;

import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * @author kerbores(kerbores@gmail.com)
 */
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

    public Runtime getRuntime() {
        return runtime;
    }

    public void setRuntime(Runtime runtime) {
        this.runtime = runtime;
    }

    public SqlManager getSqlManager() {
        return sqlManager;
    }

    public void setSqlManager(SqlManager sqlManager) {
        this.sqlManager = sqlManager;
    }

    public SqlTemplate getSqlTemplate() {
        return sqlTemplate;
    }

    public void setSqlTemplate(SqlTemplate sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
    }

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
        boolean enable = false;

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }

        public boolean isEnable() {
            return enable;
        }

        public void setEnable(boolean enable) {
            this.enable = enable;
        }
    }

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

        public Mode getMode() {
            return mode;
        }

        public void setMode(Mode mode) {
            this.mode = mode;
        }

        public String[] getPaths() {
            return paths;
        }

        public void setPaths(String[] paths) {
            this.paths = paths;
        }
    }

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

        public boolean isCreate() {
            return create;
        }

        public void setCreate(boolean create) {
            this.create = create;
        }

        public boolean isMigration() {
            return migration;
        }

        public void setMigration(boolean migration) {
            this.migration = migration;
        }

        public String[] getBasepackage() {
            return basepackage;
        }

        public void setBasepackage(String[] basepackage) {
            this.basepackage = basepackage;
        }

        public boolean isFoceCreate() {
            return foceCreate;
        }

        public void setFoceCreate(boolean foceCreate) {
            this.foceCreate = foceCreate;
        }

        public boolean isAddColumn() {
            return addColumn;
        }

        public void setAddColumn(boolean addColumn) {
            this.addColumn = addColumn;
        }

        public boolean isDeleteColumn() {
            return deleteColumn;
        }

        public void setDeleteColumn(boolean deleteColumn) {
            this.deleteColumn = deleteColumn;
        }

        public boolean isCheckIndex() {
            return checkIndex;
        }

        public void setCheckIndex(boolean checkIndex) {
            this.checkIndex = checkIndex;
        }
    }

}
