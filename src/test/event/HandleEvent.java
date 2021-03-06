package test.event;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application {

    private TextField tf = new TextField( "This is a textFiled.");

    public static void main ( String[] args ) {
        launch( args );
    }

    @Override
    public void start ( Stage primaryStage ) {
        HBox pane = new HBox( 10 );

        Button btOk = new Button( "Ok" );
//        OkHanddleClass hd_btOk = new OkHanddleClass();
        btOk.setOnAction( new OkHanddleClass() );

        Button btNo = new Button( "No" );
//        NoHanddleClass hd_btNo = new NoHanddleClass();
        btOk.setOnAction( new NoHanddleClass() );

        pane.getChildren().addAll( tf, btOk, btNo );


        primaryStage.setTitle( "HandleEvent" );
        primaryStage.setScene( new Scene( pane ) );
        primaryStage.show( );
    }

    class OkHanddleClass implements EventHandler {

        @Override
        public void handle ( Event event ) {
            System.out.println( "btOk clicked ont time ..." );
            tf.setText( "Ok button clicked" );
        }
    }
    class NoHanddleClass implements EventHandler {

        @Override
        public void handle ( Event event ) {
            System.out.println( "btNo clicked ont time ..." );
            tf.setText( "No button clicked" );
        }
    }

}

