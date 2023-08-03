module edu.calculadora.calculadorparcial {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                        
    opens edu.calculadora.calculadorparcial to javafx.fxml;
    exports edu.calculadora.calculadorparcial;
}