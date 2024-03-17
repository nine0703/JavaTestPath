package Made_in_Fri_Mar.abstractTest

class Mouse implements USB{
    @Override
    void connect() {
        System.out.println("连接了鼠标")
    }

    @Override
    void disconnect() {
        System.out.println("断开了鼠标")
    }
}
