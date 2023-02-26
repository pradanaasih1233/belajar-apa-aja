class Orang {
    final boolean Hidup = true;
    private String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

class Warga extends Orang implements CanSayHello {

    public Warga(String nama) {
        super(nama);
    }

    @Override
    public void SayHello() {
        System.out.println("Saya adalah warga, nama saya adalah " + getNama());
    }
}

class Data<T extends Orang & CanSayHello>{
    private T data;

    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class data<T extends CanSayHello>{}
public class Main {
    public static void main(String[] args) {

        Warga warga = new Warga("joko");
        Data<Warga> wargaData = new Data<>(warga);

        wargaData.getData().SayHello();


    }


}