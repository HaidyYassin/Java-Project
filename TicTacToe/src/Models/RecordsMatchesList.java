/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author yelbt
 */
public class RecordsMatchesList {
    
    public static ObservableList<HistoryTableModel> tableData = FXCollections.observableArrayList(
                new HistoryTableModel("1", "10", "Win", "Omar Mohammed"),
                new HistoryTableModel("2", "0", "Lose", "Ali Islam"),
                new HistoryTableModel("3", "5", "Draw", "Ahmed Nader"),
                new HistoryTableModel("4", "15", "Win", "Youssef Ahmed")
        );
}
