package pilarEncapsulamento.execucao;

import pilarEncapsulamento.base.Classe1;

public class Classe2 extends Classe1 {
    void print() {
        System.out.println(atributoPublic);
        System.out.println(metodoProtected());
    }
    
    String getAtributoProtected() {
        return this.atributoProtected;
    }
    
    String proxyMetodoProtected() {
        return metodoProtected();
    }
}
