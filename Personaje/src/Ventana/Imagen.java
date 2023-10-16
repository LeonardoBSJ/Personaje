package Ventana;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Imagen extends JFrame {

    public Imagen() {

        this.setLayout(null);
        this.setTitle("Personaje pixeleado");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void Paneles() {

        Color osc = new Color(59, 29, 8);
        Color brown = new Color(139, 69, 19);
        //parte inferir de la cara
        Panel pan1 = new Panel();
        pan1.setBounds(210, 250, 40, 10);
        pan1.setBackground(Color.BLACK);
        this.add(pan1);
        Panel pan2 = new Panel();
        pan2.setBounds(250, 250, 40, 10);
        pan2.setBackground(Color.BLACK);
        this.add(pan2);

        //lados y acabados de la cara
        Panel pan2a = new Panel();
        pan2a.setBounds(200, 240, 10, 10);
        pan2a.setBackground(Color.BLACK);
        this.add(pan2a);

        Panel pan2b = new Panel();
        pan2b.setBounds(190, 140, 10, 100);
        pan2b.setBackground(Color.BLACK);
        this.add(pan2b);

        Panel pan3ota = new Panel();
        pan3ota.setBounds(170, 100, 10, 10);
        pan3ota.setBackground(Color.black);
        this.add(pan3ota);

        Panel pan3otb = new Panel();
        pan3otb.setBounds(180, 80, 10, 10);
        pan3otb.setBackground(Color.GREEN);
        this.add(pan3otb);
        //pixel verde inferior superior derecho
        Panel pan3ott = new Panel();
        pan3ott.setBounds(180, 100, 10, 10);
        pan3ott.setBackground(Color.GREEN);
        this.add(pan3ott);

        Panel pan3otg = new Panel();
        pan3otg.setBounds(190, 90, 10, 20);
        pan3otg.setBackground(Color.black);
        this.add(pan3otg);

        Panel pan3otgg = new Panel();
        pan3otgg.setBounds(200, 100, 10, 20);
        pan3otgg.setBackground(Color.black);
        this.add(pan3otgg);

        Panel ot = new Panel();
        ot.setBounds(210, 80, 10, 10);
        ot.setBackground(Color.green);
        this.add(ot);
        //segundo punto verde centro
        Panel ot4 = new Panel();
        ot4.setBounds(220, 80, 10, 40);
        ot4.setBackground(Color.black);
        this.add(ot4);

        Panel ot5 = new Panel();
        ot5.setBounds(230, 90, 10, 10);
        ot5.setBackground(Color.green);
        this.add(ot5);

        Panel ot6 = new Panel();
        ot6.setBounds(230, 100, 10, 10);
        ot6.setBackground(Color.BLACK);
        this.add(ot6);

        Panel ot7 = new Panel();
        ot7.setBounds(230, 110, 10, 10);
        ot7.setBackground(brown);
        this.add(ot7);

        Panel ot22 = new Panel();
        ot22.setBounds(240, 80, 10, 10);
        ot22.setBackground(Color.BLACK);
        this.add(ot22);

        Panel ot11 = new Panel();
        ot11.setBounds(240, 90, 10, 10);
        ot11.setBackground(brown);
        this.add(ot11);

        Panel ot33 = new Panel();
        ot33.setBounds(240, 100, 10, 10);
        ot33.setBackground(brown);
        this.add(ot33);

        Panel ot8 = new Panel();
        ot8.setBounds(240, 110, 10, 10);
        ot8.setBackground(Color.BLACK);
        this.add(ot8);

        Panel ot9 = new Panel();
        ot9.setBounds(250, 110, 10, 10);
        ot9.setBackground(brown);
        this.add(ot9);

        Panel ot1 = new Panel();
        ot1.setBounds(210, 90, 10, 10);
        ot1.setBackground(Color.BLACK);
        this.add(ot1);

        Panel ot2 = new Panel();
        ot2.setBounds(210, 100, 10, 10);
        ot2.setBackground(brown);
        this.add(ot2);

        Panel ot3 = new Panel();
        ot3.setBounds(210, 110, 10, 10);
        ot3.setBackground(brown);
        this.add(ot3);

        Panel pan3otgg1 = new Panel();
        pan3otgg1.setBounds(210, 120, 10, 10);
        pan3otgg1.setBackground(Color.black);
        this.add(pan3otgg1);

        Panel ott = new Panel();
        ott.setBounds(220, 120, 10, 10);
        ott.setBackground(brown);
        this.add(ott);

        Panel oto = new Panel();
        oto.setBounds(230, 120, 10, 10);
        oto.setBackground(brown);
        this.add(oto);

        Panel oto1 = new Panel();
        oto1.setBounds(240, 120, 10, 10);
        oto1.setBackground(osc);
        this.add(oto1);

        Panel oto2 = new Panel();
        oto2.setBounds(250, 120, 10, 10);
        oto2.setBackground(brown);
        this.add(oto2);

        Panel oto3 = new Panel();
        oto3.setBounds(230, 130, 10, 10);
        oto3.setBackground(brown);
        this.add(oto3);

        Panel oto31 = new Panel();
        oto31.setBounds(240, 130, 10, 10);
        oto31.setBackground(brown);
        this.add(oto31);

        Panel oto32 = new Panel();
        oto32.setBounds(250, 130, 10, 10);
        oto32.setBackground(brown);
        this.add(oto32);

        Panel oto33 = new Panel();
        oto33.setBounds(260, 130, 10, 10);
        oto33.setBackground(brown);
        this.add(oto33);

        //lado derecho superior segunda barra
        Panel pan3ot = new Panel();
        pan3ot.setBounds(180, 110, 10, 30);
        pan3ot.setBackground(Color.BLACK);
        this.add(pan3ot);

        Panel pan2c = new Panel();
        pan2c.setBounds(290, 240, 10, 10);
        pan2c.setBackground(Color.BLACK);
        this.add(pan2c);

        Panel pan2d = new Panel();
        pan2d.setBounds(300, 140, 10, 100);
        pan2d.setBackground(Color.BLACK);
        this.add(pan2d);

        Panel pan2e = new Panel();
        pan2e.setBounds(220, 230, 60, 10);
        pan2e.setBackground(Color.black);
        this.add(pan2e);

        //punto de la sonrisa de lado derecho cara
        Panel pann1 = new Panel();
        pann1.setBounds(210, 220, 10, 10);
        pann1.setBackground(Color.BLACK);
        this.add(pann1);

        Panel pann1a = new Panel();
        pann1a.setBounds(220, 220, 10, 10);
        pann1a.setBackground(brown);
        this.add(pann1a);

        Panel pann1b = new Panel();
        pann1b.setBounds(230, 220, 10, 10);
        pann1b.setBackground(brown);
        this.add(pann1b);

        Panel pann1c = new Panel();
        pann1c.setBounds(240, 220, 10, 10);
        pann1c.setBackground(brown);
        this.add(pann1c);

        Panel pann1d = new Panel();
        pann1d.setBounds(250, 220, 10, 10);
        pann1d.setBackground(brown);
        this.add(pann1d);

        Panel pann1e = new Panel();
        pann1e.setBounds(260, 220, 10, 10);
        pann1e.setBackground(brown);
        this.add(pann1e);

        Panel pann1f = new Panel();
        pann1f.setBounds(270, 220, 10, 10);
        pann1f.setBackground(brown);
        this.add(pann1f);
        //linea de pixel arriba de los ojos

        Panel pann3oo3 = new Panel();
        pann3oo3.setBounds(210, 180, 10, 10);
        pann3oo3.setBackground(brown);
        this.add(pann3oo3);

        Panel pann3oo31 = new Panel();
        pann3oo31.setBounds(220, 180, 10, 10);
        pann3oo31.setBackground(brown);
        this.add(pann3oo31);

        Panel pann3oo32 = new Panel();
        pann3oo32.setBounds(230, 180, 10, 10);
        pann3oo32.setBackground(brown);
        this.add(pann3oo32);

        Panel pann3oo33 = new Panel();
        pann3oo33.setBounds(240, 180, 10, 10);
        pann3oo33.setBackground(brown);
        this.add(pann3oo33);

        Panel pann3oo34 = new Panel();
        pann3oo34.setBounds(250, 180, 10, 10);
        pann3oo34.setBackground(brown);
        this.add(pann3oo34);

        Panel pann3oo35 = new Panel();
        pann3oo35.setBounds(260, 180, 10, 10);
        pann3oo35.setBackground(brown);
        this.add(pann3oo35);

        Panel pann3oo36 = new Panel();
        pann3oo36.setBounds(270, 180, 10, 10);
        pann3oo36.setBackground(brown);
        this.add(pann3oo36);

        Panel pann3oo37 = new Panel();
        pann3oo37.setBounds(280, 180, 10, 10);
        pann3oo37.setBackground(brown);
        this.add(pann3oo37);

        Panel pann3oo38 = new Panel();
        pann3oo38.setBounds(230, 190, 10, 10);
        pann3oo38.setBackground(brown);
        this.add(pann3oo38);

        Panel pann3oo39 = new Panel();
        pann3oo39.setBounds(230, 190, 10, 10);
        pann3oo39.setBackground(brown);
        this.add(pann3oo39);

        Panel pann3oo311 = new Panel();
        pann3oo311.setBounds(240, 190, 10, 10);
        pann3oo311.setBackground(brown);
        this.add(pann3oo311);

        Panel pann3oo312 = new Panel();
        pann3oo312.setBounds(250, 190, 10, 10);
        pann3oo312.setBackground(brown);
        this.add(pann3oo312);

        Panel pann3oo313 = new Panel();
        pann3oo313.setBounds(260, 190, 10, 10);
        pann3oo313.setBackground(brown);
        this.add(pann3oo313);

        Panel pann3oo314 = new Panel();
        pann3oo314.setBounds(230, 200, 10, 10);
        pann3oo314.setBackground(brown);
        this.add(pann3oo314);

        Panel pann3oo315 = new Panel();
        pann3oo315.setBounds(240, 200, 10, 10);
        pann3oo315.setBackground(brown);
        this.add(pann3oo315);

        Panel pann3oo316 = new Panel();
        pann3oo316.setBounds(250, 200, 10, 10);
        pann3oo316.setBackground(brown);
        this.add(pann3oo316);

        Panel pann3oo317 = new Panel();
        pann3oo317.setBounds(260, 200, 10, 10);
        pann3oo317.setBackground(brown);
        this.add(pann3oo317);

        Panel pann3oo318 = new Panel();
        pann3oo318.setBounds(210, 170, 10, 10);
        pann3oo318.setBackground(brown);
        this.add(pann3oo318);

        Panel pann3oo319 = new Panel();
        pann3oo319.setBounds(220, 170, 10, 10);
        pann3oo319.setBackground(brown);
        this.add(pann3oo319);

        Panel pann3oo3191 = new Panel();
        pann3oo3191.setBounds(230, 170, 10, 10);
        pann3oo3191.setBackground(brown);
        this.add(pann3oo3191);

        Panel pann3oo3192 = new Panel();
        pann3oo3192.setBounds(240, 170, 10, 10);
        pann3oo3192.setBackground(brown);
        this.add(pann3oo3192);

        Panel pann3oo3193 = new Panel();
        pann3oo3193.setBounds(250, 170, 10, 10);
        pann3oo3193.setBackground(brown);
        this.add(pann3oo3193);

        Panel pann3oo3194 = new Panel();
        pann3oo3194.setBounds(260, 170, 10, 10);
        pann3oo3194.setBackground(brown);
        this.add(pann3oo3194);

        Panel pann3oo3195 = new Panel();
        pann3oo3195.setBounds(270, 170, 10, 10);
        pann3oo3195.setBackground(brown);
        this.add(pann3oo3195);

        Panel pann3oo3196 = new Panel();
        pann3oo3196.setBounds(280, 170, 10, 10);
        pann3oo3196.setBackground(brown);
        this.add(pann3oo3196);

        Panel pann3oo3197 = new Panel();
        pann3oo3197.setBounds(280, 160, 10, 10);
        pann3oo3197.setBackground(brown);
        this.add(pann3oo3197);

        Panel pann3oo3198 = new Panel();
        pann3oo3198.setBounds(270, 160, 10, 10);
        pann3oo3198.setBackground(brown);
        this.add(pann3oo3198);

        Panel pann3oo3199 = new Panel();
        pann3oo3199.setBounds(260, 160, 10, 10);
        pann3oo3199.setBackground(brown);
        this.add(pann3oo3199);

        Panel pann3oo319a = new Panel();
        pann3oo319a.setBounds(250, 160, 10, 10);
        pann3oo319a.setBackground(brown);
        this.add(pann3oo319a);

        Panel pann3oo319b = new Panel();
        pann3oo319b.setBounds(240, 160, 10, 10);
        pann3oo319b.setBackground(brown);
        this.add(pann3oo319b);

        Panel pann3oo319c = new Panel();
        pann3oo319c.setBounds(230, 160, 10, 10);
        pann3oo319c.setBackground(brown);
        this.add(pann3oo319c);

        Panel pann3oo319d = new Panel();
        pann3oo319d.setBounds(220, 160, 10, 10);
        pann3oo319d.setBackground(brown);
        this.add(pann3oo319d);

        Panel pann3oo319e = new Panel();
        pann3oo319e.setBounds(210, 160, 10, 10);
        pann3oo319e.setBackground(brown);
        this.add(pann3oo319e);

        Panel pann3oo31a = new Panel();
        pann3oo31a.setBounds(210, 150, 10, 10);
        pann3oo31a.setBackground(brown);
        this.add(pann3oo31a);

        Panel pann3oo31b = new Panel();
        pann3oo31b.setBounds(220, 150, 10, 10);
        pann3oo31b.setBackground(brown);
        this.add(pann3oo31b);

        Panel pann3oo31c = new Panel();
        pann3oo31c.setBounds(230, 150, 10, 10);
        pann3oo31c.setBackground(brown);
        this.add(pann3oo31c);

        Panel pann3oo31d = new Panel();
        pann3oo31d.setBounds(240, 150, 10, 10);
        pann3oo31d.setBackground(brown);
        this.add(pann3oo31d);

        Panel pann3oo31e = new Panel();
        pann3oo31e.setBounds(250, 150, 10, 10);
        pann3oo31e.setBackground(brown);
        this.add(pann3oo31e);

        Panel pann3oo31f = new Panel();
        pann3oo31f.setBounds(260, 150, 10, 10);
        pann3oo31f.setBackground(brown);
        this.add(pann3oo31f);

        Panel pann3oo31g = new Panel();
        pann3oo31g.setBounds(270, 150, 10, 10);
        pann3oo31g.setBackground(brown);
        this.add(pann3oo31g);

        Panel pann3oo31h = new Panel();
        pann3oo31h.setBounds(280, 150, 10, 10);
        pann3oo31h.setBackground(brown);
        this.add(pann3oo31h);

        Panel pann3oo31aa = new Panel();
        pann3oo31aa.setBounds(210, 140, 10, 10);
        pann3oo31aa.setBackground(osc);
        this.add(pann3oo31aa);

        Panel pann3oo31bb = new Panel();
        pann3oo31bb.setBounds(220, 130, 10, 10);
        pann3oo31bb.setBackground(osc);
        this.add(pann3oo31bb);

        Panel pann3oo31cc = new Panel();
        pann3oo31cc.setBounds(210, 130, 10, 10);
        pann3oo31cc.setBackground(brown);
        this.add(pann3oo31cc);

        Panel pann3oo31ff = new Panel();
        pann3oo31ff.setBounds(220, 140, 10, 10);
        pann3oo31ff.setBackground(brown);
        this.add(pann3oo31ff);

        Panel pann3oo31dd = new Panel();
        pann3oo31dd.setBounds(230, 140, 10, 10);
        pann3oo31dd.setBackground(brown);
        this.add(pann3oo31dd);

        Panel pann3oo31ee = new Panel();
        pann3oo31ee.setBounds(240, 140, 10, 10);
        pann3oo31ee.setBackground(brown);
        this.add(pann3oo31ee);

        Panel pann3oo31gg = new Panel();
        pann3oo31gg.setBounds(250, 140, 10, 10);
        pann3oo31gg.setBackground(brown);
        this.add(pann3oo31gg);

        Panel pann3oo31ii = new Panel();
        pann3oo31ii.setBounds(270, 130, 10, 10);
        pann3oo31ii.setBackground(osc);
        this.add(pann3oo31ii);

        Panel pann3oo31hh = new Panel();
        pann3oo31hh.setBounds(260, 140, 10, 10);
        pann3oo31hh.setBackground(osc);
        this.add(pann3oo31hh);

        Panel pann4o6 = new Panel();
        pann4o6.setBounds(280, 120, 20, 10);
        pann4o6.setBackground(osc);
        this.add(pann4o6);

        Panel pann4o7 = new Panel();
        pann4o7.setBounds(300, 120, 10, 60);
        pann4o7.setBackground(brown);
        this.add(pann4o7);

        Panel pann3oo31hh1 = new Panel();
        pann3oo31hh1.setBounds(270, 140, 10, 10);
        pann3oo31hh1.setBackground(brown);
        this.add(pann3oo31hh1);

        Panel pann3oo31hh11 = new Panel();
        pann3oo31hh11.setBounds(280, 140, 10, 10);
        pann3oo31hh11.setBackground(brown);
        this.add(pann3oo31hh11);

        Panel pann3oo31hh2 = new Panel();
        pann3oo31hh2.setBounds(260, 140, 10, 10);
        pann3oo31hh2.setBackground(brown);
        this.add(pann3oo31hh2);

        Panel pann3oo31hh3 = new Panel();
        pann3oo31hh3.setBounds(260, 130, 10, 10);
        pann3oo31hh3.setBackground(brown);
        this.add(pann3oo31hh3);

        Panel pann3oo31hh4 = new Panel();
        pann3oo31hh4.setBounds(270, 130, 10, 10);
        pann3oo31hh4.setBackground(brown);
        this.add(pann3oo31hh4);

        Panel pann3oo31hh5 = new Panel();
        pann3oo31hh5.setBounds(280, 130, 10, 10);
        pann3oo31hh5.setBackground(brown);
        this.add(pann3oo31hh5);

        Panel pann3oo31hh6 = new Panel();
        pann3oo31hh6.setBounds(290, 130, 10, 10);
        pann3oo31hh6.setBackground(brown);
        this.add(pann3oo31hh6);

        Panel pann3oo31hh7 = new Panel();
        pann3oo31hh7.setBounds(300, 130, 10, 10);
        pann3oo31hh7.setBackground(brown);
        this.add(pann3oo31hh7);

        Panel pann3oo31hh8 = new Panel();
        pann3oo31hh8.setBounds(300, 120, 10, 10);
        pann3oo31hh8.setBackground(brown);
        this.add(pann3oo31hh8);

        Panel pann4oo = new Panel();
        pann4oo.setBounds(300, 110, 10, 10);
        pann4oo.setBackground(Color.BLACK);
        this.add(pann4oo);

        Panel pann4o1 = new Panel();
        pann4o1.setBounds(300, 100, 10, 10);
        pann4o1.setBackground(Color.green);
        this.add(pann4o1);

        Panel pann4o2 = new Panel();
        pann4o2.setBounds(300, 80, 10, 20);
        pann4o2.setBackground(Color.BLACK);
        this.add(pann4o2);

        Panel pann4o3 = new Panel();
        pann4o3.setBounds(310, 90, 10, 10);
        pann4o3.setBackground(Color.GREEN);
        this.add(pann4o3);

        Panel pann4o4 = new Panel();
        pann4o4.setBounds(280, 90, 20, 10);
        pann4o4.setBackground(Color.BLACK);
        this.add(pann4o4);
        //inicio de el codigo sin consultar
        Panel pann4o5 = new Panel();
        pann4o5.setBounds(280, 70, 10, 50);
        pann4o5.setBackground(Color.black);
        this.add(pann4o5);

        Panel ca = new Panel();
        ca.setBounds(290, 100, 10, 10);
        ca.setBackground(Color.black);
        this.add(ca);

        Panel ca11 = new Panel();
        ca11.setBounds(270, 100, 10, 20);
        ca11.setBackground(Color.BLACK);
        this.add(ca11);

        Panel ca2 = new Panel();
        ca2.setBounds(260, 110, 10, 20);
        ca2.setBackground(Color.black);
        this.add(ca2);

        Panel ca3 = new Panel();
        ca3.setBounds(260, 130, 10, 10);
        ca3.setBackground(Color.black);
        this.add(ca3);

        //punto rojo
        Panel ca4 = new Panel();
        ca4.setBounds(270, 120, 10, 10);
        ca4.setBackground(brown);
        this.add(ca4);

        Panel ca5 = new Panel();
        ca5.setBounds(270, 90, 10, 10);
        ca5.setBackground(Color.green);
        this.add(ca5);

        Panel ca6 = new Panel();
        ca6.setBounds(270, 80, 10, 10);
        ca6.setBackground(Color.black);
        this.add(ca6);

        Panel ca22 = new Panel();
        ca22.setBounds(250, 90, 10, 20);
        ca22.setBackground(Color.black);
        this.add(ca22);

        Panel ca7 = new Panel();
        ca7.setBounds(260, 70, 10, 10);
        ca7.setBackground(Color.green);
        this.add(ca7);

        Panel ca9 = new Panel();
        ca9.setBounds(260, 90, 10, 10);
        ca9.setBackground(Color.black);
        this.add(ca9);

        Panel ca8 = new Panel();
        ca8.setBounds(260, 100, 10, 10);
        ca8.setBackground(brown);
        this.add(ca8);

        Panel ca1 = new Panel();
        ca1.setBounds(290, 110, 10, 10);
        ca1.setBackground(osc);
        this.add(ca1);

        Panel pann3oo31hh9 = new Panel();
        pann3oo31hh9.setBounds(310, 100, 10, 40);
        pann3oo31hh9.setBackground(Color.BLACK);
        this.add(pann3oo31hh9);

        //termino
        //ojo lado derecho
        Panel pann3o2 = new Panel();
        pann3o2.setBounds(220, 190, 10, 10);
        pann3o2.setBackground(Color.BLACK);
        this.add(pann3o2);

        Panel pann3o3 = new Panel();
        pann3o3.setBounds(210, 190, 10, 10);
        pann3o3.setBackground(Color.WHITE);
        this.add(pann3o3);

        Panel pann3o = new Panel();
        pann3o.setBounds(210, 200, 10, 10);
        pann3o.setBackground(Color.BLACK);
        this.add(pann3o);

        Panel pann3o1 = new Panel();
        pann3o1.setBounds(220, 200, 10, 10);
        pann3o1.setBackground(Color.BLACK);
        this.add(pann3o1);
        //termino
        //pixel arriba de punto derecho de la sorisa superior

        Panel pann3i = new Panel();
        pann3i.setBounds(210, 210, 10, 10);
        pann3i.setBackground(brown);
        this.add(pann3i);

        Panel pann3h = new Panel();
        pann3h.setBounds(220, 210, 10, 10);
        pann3h.setBackground(brown);
        this.add(pann3h);

        Panel pann3g = new Panel();
        pann3g.setBounds(230, 210, 10, 10);
        pann3g.setBackground(brown);
        this.add(pann3g);

        Panel pann3f = new Panel();
        pann3f.setBounds(240, 210, 10, 10);
        pann3f.setBackground(brown);
        this.add(pann3f);

        Panel pann3e = new Panel();
        pann3e.setBounds(250, 210, 10, 10);
        pann3e.setBackground(brown);
        this.add(pann3e);

        Panel pann3d = new Panel();
        pann3d.setBounds(260, 210, 10, 10);
        pann3d.setBackground(brown);
        this.add(pann3d);

        Panel pann3c = new Panel();
        pann3c.setBounds(270, 210, 10, 10);
        pann3c.setBackground(brown);
        this.add(pann3c);

        Panel pann3b = new Panel();
        pann3b.setBounds(280, 210, 10, 10);
        pann3b.setBackground(brown);
        this.add(pann3b);

        Panel pann3a = new Panel();
        pann3a.setBounds(290, 210, 10, 10);
        pann3a.setBackground(brown);
        this.add(pann3a);
        //ojo izquierdo cara
        Panel pann2o = new Panel();
        pann2o.setBounds(280, 200, 10, 10);
        pann2o.setBackground(Color.BLACK);
        this.add(pann2o);

        Panel pann2o1 = new Panel();
        pann2o1.setBounds(270, 200, 10, 10);
        pann2o1.setBackground(Color.black);
        this.add(pann2o1);

        Panel pann2o2 = new Panel();
        pann2o2.setBounds(270, 190, 10, 10);
        pann2o2.setBackground(Color.BLACK);
        this.add(pann2o2);

        Panel pann2o3 = new Panel();
        pann2o3.setBounds(280, 190, 10, 10);
        pann2o3.setBackground(Color.WHITE);
        this.add(pann2o3);
        //termino de ojo izquierda

        //punto izquierdo de lado izquiera cara
        Panel pann2 = new Panel();
        pann2.setBounds(280, 220, 10, 10);
        pann2.setBackground(Color.BLACK);
        this.add(pann2);
        //termino
        Panel pann3bb7 = new Panel();
        pann3bb7.setBounds(290, 130, 10, 10);
        pann3bb7.setBackground(brown);
        this.add(pann3bb7);

        Panel pann3bb6 = new Panel();
        pann3bb6.setBounds(290, 140, 10, 10);
        pann3bb6.setBackground(brown);
        this.add(pann3bb6);

        Panel pann3bb5 = new Panel();
        pann3bb5.setBounds(290, 150, 10, 10);
        pann3bb5.setBackground(brown);
        this.add(pann3bb5);

        Panel pann3bb4 = new Panel();
        pann3bb4.setBounds(290, 160, 10, 10);
        pann3bb4.setBackground(brown);
        this.add(pann3bb4);

        Panel pann3bb3 = new Panel();
        pann3bb3.setBounds(290, 170, 10, 10);
        pann3bb3.setBackground(brown);
        this.add(pann3bb3);

        Panel pann3bb2 = new Panel();
        pann3bb2.setBounds(290, 180, 10, 10);
        pann3bb2.setBackground(brown);
        this.add(pann3bb2);

        Panel pann3bb = new Panel();
        pann3bb.setBounds(290, 190, 10, 10);
        pann3bb.setBackground(brown);
        this.add(pann3bb);

        Panel pann3bb1 = new Panel();
        pann3bb1.setBounds(290, 200, 10, 10);
        pann3bb1.setBackground(brown);
        this.add(pann3bb1);

        Panel pann3 = new Panel();
        pann3.setBounds(290, 210, 10, 10);
        pann3.setBackground(brown);
        this.add(pann3);

        Panel pann3bb8 = new Panel();
        pann3bb8.setBounds(290, 220, 10, 10);
        pann3bb8.setBackground(brown);
        this.add(pann3bb8);

        Panel pan2f = new Panel();
        pan2f.setBounds(210, 240, 10, 10);
        pan2f.setBackground(brown);
        this.add(pan2f);

        Panel pan2g = new Panel();
        pan2g.setBounds(220, 240, 10, 10);
        pan2g.setBackground(brown);
        this.add(pan2g);

        Panel pan2h = new Panel();
        pan2h.setBounds(230, 240, 10, 10);
        pan2h.setBackground(brown);
        this.add(pan2h);

        Panel pan2i = new Panel();
        pan2i.setBounds(240, 240, 10, 10);
        pan2i.setBackground(brown);
        this.add(pan2i);

        Panel pan2j = new Panel();
        pan2j.setBounds(250, 240, 10, 10);
        pan2j.setBackground(brown);
        this.add(pan2j);

        Panel pan2k = new Panel();
        pan2k.setBounds(260, 240, 10, 10);
        pan2k.setBackground(brown);
        this.add(pan2k);

        Panel pan2l = new Panel();
        pan2l.setBounds(270, 240, 10, 10);
        pan2l.setBackground(brown);
        this.add(pan2l);

        Panel pan2m = new Panel();
        pan2m.setBounds(280, 240, 10, 10);
        pan2m.setBackground(brown);
        this.add(pan2m);
        //lado dereche cara para linea recta
        Panel pan3a = new Panel();
        pan3a.setBounds(200, 230, 10, 10);
        pan3a.setBackground(brown);
        this.add(pan3a);

        Panel pan3b = new Panel();
        pan3b.setBounds(210, 230, 10, 10);
        pan3b.setBackground(brown);
        this.add(pan3b);

        Panel pan3od = new Panel();
        pan3od.setBounds(190, 110, 10, 10);
        pan3od.setBackground(brown);
        this.add(pan3od);

        Panel pan3oc = new Panel();
        pan3oc.setBounds(190, 120, 10, 10);
        pan3oc.setBackground(osc);
        this.add(pan3oc);

        Panel pan3oe = new Panel();
        pan3oe.setBounds(190, 130, 10, 10);
        pan3oe.setBackground(brown);
        this.add(pan3oe);

        Panel pan3ob = new Panel();
        pan3ob.setBounds(200, 120, 10, 10);
        pan3ob.setBackground(brown);
        this.add(pan3ob);

        Panel pan3oa = new Panel();
        pan3oa.setBounds(200, 130, 10, 10);
        pan3oa.setBackground(brown);
        this.add(pan3oa);

        Panel pan3o = new Panel();
        pan3o.setBounds(200, 140, 10, 10);
        pan3o.setBackground(brown);
        this.add(pan3o);

        Panel pan3n = new Panel();
        pan3n.setBounds(200, 160, 10, 10);
        pan3n.setBackground(brown);
        this.add(pan3n);

        Panel pan3e = new Panel();
        pan3e.setBounds(200, 170, 10, 10);
        pan3e.setBackground(brown);
        this.add(pan3e);

        Panel pan3f = new Panel();
        pan3f.setBounds(200, 180, 10, 10);
        pan3f.setBackground(brown);
        this.add(pan3f);

        Panel pan3g = new Panel();
        pan3g.setBounds(200, 190, 10, 10);
        pan3g.setBackground(brown);
        this.add(pan3g);

        Panel pan3h = new Panel();
        pan3h.setBounds(200, 200, 10, 10);
        pan3h.setBackground(brown);
        this.add(pan3h);

        Panel pan3i = new Panel();
        pan3i.setBounds(200, 210, 10, 10);
        pan3i.setBackground(brown);
        this.add(pan3i);

        Panel pan3j = new Panel();
        pan3j.setBounds(200, 220, 10, 10);
        pan3j.setBackground(brown);
        this.add(pan3j);

        Panel pan3k = new Panel();
        pan3k.setBounds(200, 230, 10, 10);
        pan3k.setBackground(brown);
        this.add(pan3k);

        Panel pan3l = new Panel();
        pan3l.setBounds(200, 240, 10, 10);
        pan3l.setBackground(brown);
        this.add(pan3l);

        Panel pan3m = new Panel();
        pan3m.setBounds(200, 150, 10, 10);
        pan3m.setBackground(brown);
        this.add(pan3m);

        //lado izquierdo cara imagen linea recta 
        Panel pan3c = new Panel();
        pan3c.setBounds(290, 230, 10, 10);
        pan3c.setBackground(brown);
        this.add(pan3c);

        Panel pan3d = new Panel();
        pan3d.setBounds(280, 230, 10, 10);
        pan3d.setBackground(brown);
        this.add(pan3d);

        //parte del tronco y ramas
        Panel pan3 = new Panel();
        pan3.setBounds(230, 250, 10, 40);
        pan3.setBackground(Color.BLACK);
        this.add(pan3);
        Panel pan4 = new Panel();
        pan4.setBounds(260, 250, 10, 30);
        pan4.setBackground(Color.BLACK);
        this.add(pan4);
        //derrecha del dibujo
        Panel pan5 = new Panel();
        pan5.setBounds(220, 270, 10, 10);
        pan5.setBackground(Color.black);
        this.add(pan5);

        Panel pan5u = new Panel();
        pan5u.setBounds(220, 280, 10, 10);
        pan5u.setBackground(osc);
        this.add(pan5u);

        Panel pan50 = new Panel();
        pan50.setBounds(220, 290, 10, 10);
        pan50.setBackground(Color.black);
        this.add(pan50);

        Panel pan51 = new Panel();
        pan51.setBounds(210, 280, 10, 10);
        pan51.setBackground(Color.black);
        this.add(pan51);

        Panel pan52 = new Panel();
        pan52.setBounds(200, 280, 10, 10);
        pan52.setBackground(Color.green);
        this.add(pan52);

        Panel pan53 = new Panel();
        pan53.setBounds(190, 290, 20, 10);
        pan53.setBackground(Color.black);
        this.add(pan53);

        Panel pan54 = new Panel();
        pan54.setBounds(180, 290, 10, 10);
        pan54.setBackground(brown);
        this.add(pan54);

        Panel pan55 = new Panel();
        pan55.setBounds(180, 270, 10, 20);
        pan55.setBackground(Color.BLACK);
        this.add(pan55);

        Panel pan56 = new Panel();
        pan56.setBounds(180, 260, 10, 10);
        pan56.setBackground(Color.GREEN);
        this.add(pan56);

        Panel pan57 = new Panel();
        pan57.setBounds(160, 290, 20, 10);
        pan57.setBackground(Color.BLACK);
        this.add(pan57);

        Panel pan58 = new Panel();
        pan58.setBounds(180, 300, 10, 10);
        pan58.setBackground(Color.BLACK);
        this.add(pan58);

        Panel pan59 = new Panel();
        pan59.setBounds(190, 310, 20, 10);
        pan59.setBackground(Color.black);
        this.add(pan59);

        Panel pan60 = new Panel();
        pan60.setBounds(190, 300, 10, 10);
        pan60.setBackground(brown);
        this.add(pan60);

        Panel pan61 = new Panel();
        pan61.setBounds(200, 300, 10, 10);
        pan61.setBackground(brown);
        this.add(pan61);

        Panel pan62 = new Panel();
        pan62.setBounds(210, 300, 10, 10);
        pan62.setBackground(Color.BLACK);
        this.add(pan62);

        Panel pan63 = new Panel();
        pan63.setBounds(210, 310, 10, 10);
        pan63.setBackground(Color.GREEN);
        this.add(pan63);

        Panel pan64 = new Panel();
        pan64.setBounds(160, 270, 10, 10);
        pan64.setBackground(Color.GREEN);
        this.add(pan64);

        Panel pan65 = new Panel();
        pan65.setBounds(170, 280, 10, 10);
        pan65.setBackground(Color.black);
        this.add(pan65);

        Panel pan66 = new Panel();
        pan66.setBounds(210, 290, 10, 10);
        pan66.setBackground(brown);
        this.add(pan66);

        Panel pan6 = new Panel();
        pan6.setBounds(260, 270, 40, 10);
        pan6.setBackground(Color.BLACK);
        this.add(pan6);

        Panel pan7 = new Panel();
        pan7.setBounds(300, 260, 10, 10);
        pan7.setBackground(Color.BLACK);
        this.add(pan7);
        Panel pan8 = new Panel();
        pan8.setBounds(310, 250, 10, 10);
        pan8.setBackground(Color.BLACK);
        this.add(pan8);

        Panel pan9 = new Panel();
        pan9.setBounds(320, 230, 10, 20);
        pan9.setBackground(Color.BLACK);
        this.add(pan9);

        Panel pan10 = new Panel();
        pan10.setBounds(320, 220, 10, 10);
        pan10.setBackground(Color.GREEN);
        this.add(pan10);

        Panel pan11 = new Panel();
        pan11.setBounds(340, 230, 10, 10);
        pan11.setBackground(Color.green);
        this.add(pan11);

        Panel pan12 = new Panel();
        pan12.setBounds(330, 240, 10, 20);
        pan12.setBackground(Color.black);
        this.add(pan12);

        Panel pan13 = new Panel();
        pan13.setBounds(330, 250, 20, 10);
        pan13.setBackground(Color.BLACK);
        this.add(pan13);

        Panel pan14 = new Panel();
        pan14.setBounds(330, 260, 10, 10);
        pan14.setBackground(Color.green);
        this.add(pan14);

        Panel pan15 = new Panel();
        pan15.setBounds(320, 260, 10, 10);
        pan15.setBackground(Color.BLACK);
        this.add(pan15);

        Panel pan16 = new Panel();
        pan16.setBounds(320, 250, 10, 10);

        pan16.setBackground(brown);
        this.add(pan16);

        Panel pan17 = new Panel();

        pan17.setBounds(310, 260, 10, 10);
        pan17.setBackground(brown);
        this.add(pan17);

        Panel pan18 = new Panel();
        pan18.setBounds(300, 270, 10, 10);
        pan18.setBackground(brown);
        this.add(pan18);

        Panel pan19 = new Panel();
        pan19.setBounds(280, 280, 20, 10);
        pan19.setBackground(brown);
        this.add(pan19);

        Panel pan20 = new Panel();
        pan20.setBounds(300, 270, 10, 10);
        pan20.setBackground(brown);
        this.add(pan20);

        Panel pan21 = new Panel();
        pan21.setBounds(270, 280, 10, 20);
        pan21.setBackground(Color.BLACK);
        this.add(pan21);

        Panel pan22 = new Panel();
        pan22.setBounds(270, 290, 30, 10);
        pan22.setBackground(Color.BLACK);
        this.add(pan22);

        Panel pan23 = new Panel();
        pan23.setBounds(300, 280, 10, 10);
        pan23.setBackground(Color.BLACK);
        this.add(pan23);

        Panel pan24 = new Panel();
        pan24.setBounds(310, 270, 10, 10);
        pan24.setBackground(Color.BLACK);
        this.add(pan24);

        Panel pan25 = new Panel();
        pan25.setBounds(260, 300, 10, 20);
        pan25.setBackground(Color.BLACK);
        this.add(pan25);

        Panel pan26 = new Panel();
        pan26.setBounds(270, 320, 10, 10);
        pan26.setBackground(Color.BLACK);
        this.add(pan26);

        Panel pan27 = new Panel();
        pan27.setBounds(190, 330, 120, 10);
        pan27.setBackground(Color.BLACK);
        this.add(pan27);

        Panel pan28 = new Panel();
        pan28.setBounds(300, 340, 10, 30);
        pan28.setBackground(Color.BLACK);
        this.add(pan28);

        Panel pan29 = new Panel();
        pan29.setBounds(190, 330, 10, 40);
        pan29.setBackground(Color.BLACK);
        this.add(pan29);

        Panel pan30 = new Panel();
        pan30.setBounds(190, 360, 120, 10);
        pan30.setBackground(Color.BLACK);
        this.add(pan30);

        Panel pan32 = new Panel();
        pan32.setBounds(200, 360, 10, 30);
        pan32.setBackground(Color.BLACK);
        this.add(pan32);
        //para rellenar parte superior de la maseta
        Panel pan31 = new Panel();
        Color br = new Color(101, 51, 14);
        pan31.setBounds(200, 340, 100, 20);
        pan31.setBackground(br);
        this.add(pan31);

        Panel pan31a = new Panel();
        pan31a.setBounds(210, 370, 90, 20);
        pan31a.setBackground(br);
        this.add(pan31a);

        Panel pan31b = new Panel();
        pan31b.setBounds(220, 390, 70, 20);
        pan31b.setBackground(br);
        this.add(pan31b);

        Panel pan31c = new Panel();
        pan31c.setBounds(230, 410, 50, 10);
        pan31c.setBackground(br);
        this.add(pan31c);

        Panel pan33 = new Panel();
        pan33.setBounds(200, 350, 10, 10);
        pan33.setBackground(brown);
        this.add(pan33);

        Panel pan34 = new Panel();
        pan34.setBounds(210, 390, 10, 20);
        pan34.setBackground(Color.BLACK);
        this.add(pan34);

        Panel pan35 = new Panel();
        pan35.setBounds(220, 410, 10, 10);
        pan35.setBackground(Color.BLACK);
        this.add(pan35);

        Panel pan36 = new Panel();
        pan36.setBounds(230, 420, 50, 10);
        pan36.setBackground(Color.BLACK);
        this.add(pan36);

        Panel pan37 = new Panel();
        pan37.setBounds(280, 410, 10, 10);
        pan37.setBackground(Color.BLACK);
        this.add(pan37);

        Panel pan38 = new Panel();
        pan38.setBounds(290, 390, 10, 20);
        pan38.setBackground(Color.BLACK);
        this.add(pan38);

        Panel pan39 = new Panel();
        pan39.setBounds(300, 360, 10, 30);
        pan39.setBackground(Color.BLACK);
        this.add(pan39);

        //parte superior de la maceta cudrito derecho
        Panel pan40 = new Panel();
        pan40.setBounds(220, 320, 10, 10);
        pan40.setBackground(Color.BLACK);
        this.add(pan40);

        Panel pan41 = new Panel();
        pan41.setBounds(230, 300, 10, 20);
        pan41.setBackground(Color.BLACK);
        this.add(pan41);

        Panel pan42 = new Panel();
        pan42.setBounds(240, 280, 10, 20);
        pan42.setBackground(Color.black);
        this.add(pan42);
        //rellenar parte superior de la maceta cafe

        Panel pan70 = new Panel();
        pan70.setBounds(230, 320, 10, 10);
        pan70.setBackground(brown);
        this.add(pan70);

        Panel pan71 = new Panel();
        pan71.setBounds(240, 320, 10, 10);
        pan71.setBackground(osc);
        this.add(pan71);

        Panel pan72 = new Panel();
        pan72.setBounds(250, 320, 10, 10);
        pan72.setBackground(osc);
        this.add(pan72);

        Panel pan73 = new Panel();
        pan73.setBounds(250, 310, 10, 10);
        pan73.setBackground(osc);
        this.add(pan73);

        Panel pan74 = new Panel();
        pan74.setBounds(250, 300, 10, 10);
        pan74.setBackground(osc);
        this.add(pan74);

        Panel pan75 = new Panel();
        pan75.setBounds(240, 310, 10, 10);
        pan75.setBackground(brown);
        this.add(pan75);

        Panel pan76 = new Panel();
        pan76.setBounds(240, 300, 10, 10);
        pan76.setBackground(brown);
        this.add(pan76);

        Panel pan77 = new Panel();
        pan77.setBounds(260, 320, 10, 10);
        pan77.setBackground(brown);
        this.add(pan77);

        Panel pan78 = new Panel();
        pan78.setBounds(250, 290, 10, 10);
        pan78.setBackground(brown);
        this.add(pan78);

        Panel pan79 = new Panel();
        pan79.setBounds(260, 290, 10, 10);
        pan79.setBackground(brown);
        this.add(pan79);

        Panel pan80 = new Panel();
        pan80.setBounds(260, 280, 10, 10);
        pan80.setBackground(osc);
        this.add(pan80);

        Panel pan81 = new Panel();
        pan81.setBounds(250, 280, 10, 10);
        pan81.setBackground(brown);
        this.add(pan81);

        Panel pan82 = new Panel();
        pan82.setBounds(250, 270, 10, 10);
        pan82.setBackground(osc);
        this.add(pan82);

        Panel pan83 = new Panel();
        pan83.setBounds(240, 270, 10, 10);
        pan83.setBackground(brown);
        this.add(pan83);

        Panel pan84 = new Panel();
        pan84.setBounds(240, 260, 10, 10);
        pan84.setBackground(brown);
        this.add(pan84);

        Panel pan85 = new Panel();
        pan85.setBounds(250, 260, 10, 10);
        pan85.setBackground(brown);
        this.add(pan85);

    }
}
