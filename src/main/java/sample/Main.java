package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.controller.ScreenController;
import sample.scene.SceneController;

public class Main extends Application {
    Scene scene1;
    Scene scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Scene sceneFtp=new Scene((Parent) FXMLLoader.load(getClass().getResource("ftp.fxml")));
;
//        ScreenController sceneMap = new ScreenController();
//        sceneMap.addScreen("ftp",FXMLLoader.load(getClass().getResource("ftp.fxml")));
//        sceneMap.addScreen("config",FXMLLoader.load(getClass().getResource("config.fxml")));
//        sceneMap.addScreen("fix",FXMLLoader.load(getClass().getResource("fix.fxml")));
//        System.out.println(sceneMap.toStringMap());
//        sceneMap.activate("ftp");
        primaryStage.setTitle("东久科技FTP服务器");
        primaryStage.setScene(sceneFtp);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.TRANSPARENT); /* 透明标题栏 */
        primaryStage.getIcons().add(new Image(
                Main.class.getResourceAsStream("/img/FTPlogo.png")));
        primaryStage.show();
//        Button button1=new Button("Go to the second scene");
//        Button buttonC=new Button("change");
//        Label label1=new Label("I am the first scene");
//        VBox layout1=new VBox();
//        layout1.getChildren().addAll(label1,button1,buttonC);
//        scene1=new Scene(layout1,400,300);
//
//        Button button2=new Button("Go to the first scene");
//        StackPane layout2=new StackPane();
//        layout2.getChildren().add(button2);
//        scene2=new Scene(layout2,400,300);
//        buttonC.setOnAction(event -> {
//            label1.setText("改变后");
//        });
//        button1.setOnAction(e->{
//            primaryStage.setScene(scene2);
//        });
//        button2.setOnAction(e->{
//            primaryStage.setScene(scene1);
//        });
//
//        //需要初始化一个stage上的scene，不要忘了QAQ
//        primaryStage.setScene(scene1);
//        primaryStage.setTitle("I have a title");
//        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
