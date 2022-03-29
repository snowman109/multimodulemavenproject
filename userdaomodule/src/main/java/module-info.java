module com.test.userdao {
    requires com.test.dao;
    requires com.test.entity;
    provides com.test.dao.Dao with com.test.userdao.UserDao;
    exports com.test.userdao;
}