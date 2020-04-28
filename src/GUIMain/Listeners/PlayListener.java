/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIMain.Listeners;

import GUIMain.GUIMainController;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author User
 */
public class PlayListener implements EventHandler {

    GUIMainController guiMainController;

    public PlayListener(GUIMainController guiMainController) {
        this.guiMainController = guiMainController;
    }

    @Override
    public void handle(Event event) {
        guiMainController.play();
    }

}
