package controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessControllerTest {
    @Test
    void start_test() {
        Command cc = new Command();
        cc.start();
    }

}