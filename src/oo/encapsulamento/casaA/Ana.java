package oo.encapsulamento.casaA;

public class Ana {

    @SuppressWarnings("unused")
    private String segredo = "PRIVADO";//privado: só a classe modifica
    String facoDentroDeCasa = "DEFAULT";//default ou capote: pacote modifica
    protected String formaDeFalar = "PROTECTED";//protected: pacote e herença acessam
    public String todosSabem = "PUBLIC";//public: todos acessam

}
