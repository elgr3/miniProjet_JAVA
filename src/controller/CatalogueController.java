package controller;

import model.CatalogueModel;
import vue.CatalogueView;


import javax.swing.*;
import java.awt.*;

public class CatalogueController {
    private CatalogueModel model;
    private CatalogueView view;

    public CatalogueController(CatalogueModel model, CatalogueView view) {
        this.model = model;
        this.view = view;

        //this.view.getRefreshButton().addActionListener(e -> updateView());
        //updateView();
    }

    /*private void updateView() {
        view.setFilmListData(model.getFilmCatalogue());
        view.setSerieListData(model.getSerieCatalogue());
        view.setDocListData(model.getDocCatalogue());
    }*/

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CatalogueModel model = new CatalogueModel();
            CatalogueView view = new CatalogueView();
            new CatalogueController(model, view);
            view.showGUI();
        });
    }
}

