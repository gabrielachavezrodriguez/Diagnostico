/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico;

import javax.swing.JOptionPane;

/**
 *
 * @author Gala
 */
public class Diagnostico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (preguntar("Tiene fiebre?")) {
            if (preguntar("Tose?")) {
                if (preguntar("Le cuesta respirar, resuella o tose con flemas?")) {
                    msg("Posible diagnostico: neumonia o infeccion de las vias respiratorias");
                } else {
                    if (preguntar("le duele la cabeza?")) {
                        msg("Posible diagnostico: infeccion virica");
                    } else {
                        preguntaHuesos();
                    }
                }
            } else {
                if (preguntar("le duele la cabeza?")) {
                    if (preguntar("tiene alguno de los siguientes sintomas: "
                            + "dolor cuando inclina la cabeza hacia adelante, nauseas, "
                            + "vomitos, fuerte molestia en los ojos ante una luz brillante, "
                            + "somnolencia o confusion?")) {
                        msg("Posible diagnostico: meningitis");
                    } else {
                        if (preguntar("vomita o tiene diarrea?")) {
                            msg("Posible diagnostico: infeccion del tracto digestivo");
                        } else {
                            preguntaHuesos();
                        }
                    }
                } else {
                    preguntaHuesos();
                }
            }
        } else {
            msg("No se dispone de informacion suficiente para realizar un diagnostico");
        }
    }

    public static void preguntaHuesos() {
        if (preguntar("le duelen los huesos o articulaciones?")) {
            msg("Posible diagnostico: infeccion virica");
        } else {
            if (preguntar("presenta erupciones cutaneas?")) {
                msg("No se dispone de informacion suficiente para realizar un diagnostico");
            } else {
                if (preguntar("le duele la garganta?")) {
                    msg("Posible diagnostico: infeccion de la garganta");
                } else {
                    if (preguntar("le duele la espalda por encima de lumbares, con escalofrios o fiebre?")) {
                        msg("Posible diagnostico: infeccion renal");
                    } else {
                        if (preguntar("le duele al orinar o hace con mas frecuencia?")) {
                            msg("Posible diagnostico: infeccion del tracto urinario");
                        } else {
                            if (preguntar("ha pasado el dia al sol o con mucho calor")) {
                                msg("Posible diagnostico: golpe de calor o agotamiento por calor");
                            } else {
                                msg("No se dispone de informacion suficiente para realizar un diagnostico");
                            }
                        }
                    }
                }
            }
        }
    }

    public static void msg(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public static boolean preguntar(String texto) {
        return JOptionPane.showConfirmDialog(null, texto, "Sistema de diagnostico", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }
}
