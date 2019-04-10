/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Fernando Callata
 * @param <T>
 */
public interface IServico<T> {
    void insira(T dado);
    void atualize(T dado);
    T obenha(long id);
}
