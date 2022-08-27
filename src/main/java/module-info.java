module com.aaronhowser1.chess {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aaronhowser1.chess to javafx.fxml;
    exports com.aaronhowser1.chess;
    exports com.aaronhowser1.chess.logic;
    opens com.aaronhowser1.chess.logic to javafx.fxml;
}