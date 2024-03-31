package Made_in_Fri_Mar.abstractTest

class keyboardTest {
    static void main(String[] args) {
        USB kb = new Keyboard();
        kb.connect();
        kb.disconnect();
        USB mouse = new Mouse();
        mouse.connect();
        mouse.disconnect();
        kb.hello();
        USB.helloStatic();
    }
}
