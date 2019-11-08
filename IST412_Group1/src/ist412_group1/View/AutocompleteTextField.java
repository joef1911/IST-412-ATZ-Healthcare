
package ist412_group1.View;

import ist412_group1.Controller.IST412_Group1;
import ist412_group1.Model.PatientDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author xiaohan
 */
public class AutocompleteTextField extends TextField {
    // Word base
    private final SortedSet<String> element;
    // Popup menu
    private ContextMenu elementPopup;

    public AutocompleteTextField() {
        super();
        // Suggestions
        this.element = new TreeSet<>();
        // Suggestion menu
        this.elementPopup = new ContextMenu();
        startListen();
    } 
    
    private void initWordBase() {
        PatientDatabase p = new PatientDatabase(new IST412_Group1());
        //patientCount Method Unavailable
//        for(int i = 0; i< patientCount; i++) {
//            patient patient = p.getPatient(i);
//            element.add(patient.getPatientName());
//            element.add(patient.getPatientId());
//            
//        }
        
    }

    private void startListen() {     
        textProperty().addListener((observable, oldValue, newValue) -> {
            String input = getText();
            if ("".equals(input) || input.isEmpty()) {
                elementPopup.hide();
            } else {
                List<String> filteredEntries = element.stream()
                        .filter(word -> word.toLowerCase().contains(input.toLowerCase()))
                        .collect(Collectors.toList());
                if (!filteredEntries.isEmpty()) {
                    addSuggestion(filteredEntries, input);
                }
            }
        });
    }
    
    private void addSuggestion(List<String> searchResult, String searchReauest) {
        ArrayList<CustomMenuItem> menuItems = new ArrayList<>();
        int count = 10;
        if (searchResult.size() < count) {
            count = searchResult.size();
        }
        for (int i = 0; i < count; i++) {
          String result = searchResult.get(i);
          // Each entry is presented as a label
          Label entryLabel = new Label();
          entryLabel.setPrefHeight(10);
          CustomMenuItem entry = new CustomMenuItem(entryLabel, true);
          // Add the label to menu items
          menuItems.add(entry);
          
          // When a suggestion is selected, add it to textfield
          entry.setOnAction(e -> {
              setText(result);
              elementPopup.hide();
          });
        }
        
        elementPopup.getItems().clear();
        elementPopup.getItems().addAll(menuItems);
    }
}

