package ExerciciosJava.Sprint2;

public class Porta {

    public String cor;
    public double dimensaoX;
    public double dimensaoY;
    public double dimensaoZ;

    public boolean aberta = false;
    public void pinta(String cor) {
        this.cor = cor;
    }

    public void abrir() {
        aberta = true;
    }

    public void fechar() {
        aberta = false;
    }

    public boolean estaAberta(){
        return aberta;
    }

    public double setDimensaoX(double dimensaoX){
        this.dimensaoX = dimensaoX;
        return dimensaoX;
    }

    public double setDimensaoY(double dimensaoY){
        this.dimensaoY = dimensaoY;
        return dimensaoY;
    }

    public double setDimensaoZ(double dimensaoZ){
        this.dimensaoZ = dimensaoZ;
        return dimensaoZ;
    }

    public void pintar(String cor){
        this.cor = cor;
    }

    public class Casa {

        public String cor;

        public boolean porta1aberta = false;

        public void abrirporta1() {
            aberta = true;
        }

        public void fecharporta1() {
            aberta = false;
        }

        public boolean isPorta1aberta(){
            return aberta;
        }
        public boolean porta2aberta = false;

        public void abrirporta2() {
            aberta = true;
        }

        public void fecharporta2() {
            aberta = false;
        }

        public boolean isPorta2aberta(){
            return aberta;
        }
        public boolean porta3aberta = false;
        public void abrirporta3() {
            aberta = true;
        }

        public void fecharporta3() {
            aberta = false;
        }

        public boolean isPorta3abertaestaAberta(){
            return aberta;
        }

        public void pinta(String cor) {
            this.cor = cor;
        }



    }




}